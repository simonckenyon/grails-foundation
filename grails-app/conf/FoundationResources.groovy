def jqueryPlugin = grailsApplication.mainContext.pluginManager.getGrailsPlugin('jquery')
def configDefaultBundle = 'bundle_foundation'

modules = {

    // Javascript Resources
	
	'foundation-js' {
		defaultBundle configDefaultBundle
		dependsOn 'jquery'
		resource url:[plugin: 'foundation', dir: 'js', file: 'foundation.js']
	}
	
	'foundation-vendor-fastclick-js' {
		defaultBundle configDefaultBundle
		dependsOn 'jquery'
		resource url:[plugin: 'foundation', dir: 'js/vendor', file: 'fastclick.js']
	}
	
	'foundation-vendor-jquery-autocomplete-js' {
		defaultBundle configDefaultBundle
		dependsOn 'jquery'
		resource url:[plugin: 'foundation', dir: 'js/vendor', file: 'jquery.autocomplete.js']
	}
	
	'foundation-vendor-jquery-cookie-js' {
		defaultBundle configDefaultBundle
		dependsOn 'jquery'
		resource url:[plugin: 'foundation', dir: 'js/vendor', file: 'jquery.cookie.js']
	}

    'foundation-vendor-placeholder-js' {
        defaultBundle configDefaultBundle
        dependsOn 'jquery'
        resource url:[plugin: 'foundation', dir: 'js/vendor', file: 'placeholder.js']
    }
	
	// Stylesheet SCSS Resources
	
	'foundation-scss' {
		defaultBundle configDefaultBundle
		
		resource url:[plugin: 'foundation', dir: 'scss', file: 'foundation.scss'], attrs: [type: 'css']
	}

	'foundation-normalize-scss' {
		defaultBundle configDefaultBundle
		
		resource url:[plugin: 'foundation', dir: 'scss', file: 'normalize.scss'], attrs: [type: 'css']
	}

    // Stylesheet CSS Resources
	
	'foundation-css' {
		defaultBundle configDefaultBundle
		
		resource url:[plugin: 'foundation', dir: 'css', file: 'foundation.css']
	}

    'foundation-normalize-css' {
        defaultBundle configDefaultBundle
		
		resource url:[plugin: 'foundation', dir: 'css', file: 'normalize.css']
    }

	// Bundled Resources
	
	'foundation-javascript' {
		defaultBundle configDefaultBundle
		dependsOn 'jquery'
		dependsOn 'foundation-js'
	}
	
	'foundation-scss-stylesheets' {
		defaultBundle configDefaultBundle
		dependsOn 'foundation-normalize-scss'
		dependsOn 'foundation-scss'
	}

    'foundation-css-stylesheets' {
        defaultBundle configDefaultBundle
		dependsOn 'foundation-normalize-css'
        dependsOn 'foundation-css'
    }

    foundation {
		dependsOn 'modernizr'
        dependsOn 'foundation-css-stylesheets'
        if (jqueryPlugin) {
            dependsOn 'foundation-javascript'
        }
    }
       
}

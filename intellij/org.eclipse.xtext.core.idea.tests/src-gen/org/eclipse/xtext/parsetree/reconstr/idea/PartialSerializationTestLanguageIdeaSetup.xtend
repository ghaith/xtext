package org.eclipse.xtext.parsetree.reconstr.idea

import org.eclipse.xtext.ISetup
import org.eclipse.xtext.idea.extensions.EcoreGlobalRegistries

class PartialSerializationTestLanguageIdeaSetup implements ISetup {

	override createInjectorAndDoEMFRegistration() {
		EcoreGlobalRegistries.ensureInitialized
		new PartialSerializationTestLanguageStandaloneSetupIdea().createInjector
	}

}

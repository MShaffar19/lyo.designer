/**
 *
 * $Id$
 */
package adaptorinterface.validation;

import adaptorinterface.RequiredAdaptor;
import adaptorinterface.ServiceProviderCatalog;
import adaptorinterface.Specification;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link adaptorinterface.AdaptorInterface}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AdaptorInterfaceValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateServiceProviderCatalog(ServiceProviderCatalog value);
	boolean validateSpecification(Specification value);
	boolean validateRequiredAdaptors(EList<RequiredAdaptor> value);
	boolean validateJavaClassBaseNamespace(String value);
	boolean validateJavaFilesBasePath(String value);
	boolean validateJspFilesBasePath(String value);
	boolean validateJavascriptFilesBasePath(String value);
	boolean validateBackendCodeTemplate_classImports(String value);
	boolean validateBackendCodeTemplate_classMethods(String value);
	boolean validateBackendCodeTemplate_servletListenerInitialize(String value);
	boolean validateBackendCodeTemplate_servletListenerDestroy(String value);
	boolean validateBackendCodeTemplate_getServiceProviders(String value);
	boolean validateBackendCodeTemplate_getResource(String value);
	boolean validateBackendCodeTemplate_getResources(String value);
	boolean validateBackendCodeTemplate_searchResources(String value);
	boolean validateBackendCodeTemplate_createResource(String value);
}
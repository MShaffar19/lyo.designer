/**
 *
 * $Id$
 */
package adaptorinterface.validation;

import adaptorinterface.Resource;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link adaptorinterface.QueryCapability}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface QueryCapabilityValidator {
	boolean validate();

	boolean validateTitle(String value);
	boolean validateLabel(String value);
	boolean validateQueryBaseURI(String value);
	boolean validateResourceTypes(EList<Resource> value);
	boolean validateUsages(EList<String> value);
}

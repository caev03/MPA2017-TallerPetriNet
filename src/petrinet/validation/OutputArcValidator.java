/**
 *
 * $Id$
 */
package petrinet.validation;

import petrinet.Place;
import petrinet.Transition;

/**
 * A sample validator interface for {@link petrinet.OutputArc}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface OutputArcValidator {
	boolean validate();

	boolean validateFrom(Transition value);
	boolean validateTo(Place value);
}

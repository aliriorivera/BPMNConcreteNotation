/*
 * 
 */
package third.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import third.diagram.providers.ThirdElementTypes;

/**
 * @generated
 */
public class ConditionalINOUTItemSemanticEditPolicy extends
		ThirdBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConditionalINOUTItemSemanticEditPolicy() {
		super(ThirdElementTypes.ConditionalINOUT_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}

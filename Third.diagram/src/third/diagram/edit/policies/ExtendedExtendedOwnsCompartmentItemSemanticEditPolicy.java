/*
 * 
 */
package third.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import third.diagram.edit.commands.DatainETSKCreateCommand;
import third.diagram.edit.commands.DataoutETSKCreateCommand;
import third.diagram.edit.commands.DateETSKCreateCommand;
import third.diagram.edit.commands.DescripcionCreateCommand;
import third.diagram.edit.commands.ParticipantETSKCreateCommand;
import third.diagram.providers.ThirdElementTypes;

/**
 * @generated
 */
public class ExtendedExtendedOwnsCompartmentItemSemanticEditPolicy extends
		ThirdBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ExtendedExtendedOwnsCompartmentItemSemanticEditPolicy() {
		super(ThirdElementTypes.Extended_2005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ThirdElementTypes.Descripcion_3003 == req.getElementType()) {
			return getGEFWrapper(new DescripcionCreateCommand(req));
		}
		if (ThirdElementTypes.ParticipantETSK_3004 == req.getElementType()) {
			return getGEFWrapper(new ParticipantETSKCreateCommand(req));
		}
		if (ThirdElementTypes.DatainETSK_3005 == req.getElementType()) {
			return getGEFWrapper(new DatainETSKCreateCommand(req));
		}
		if (ThirdElementTypes.DataoutETSK_3006 == req.getElementType()) {
			return getGEFWrapper(new DataoutETSKCreateCommand(req));
		}
		if (ThirdElementTypes.DateETSK_3007 == req.getElementType()) {
			return getGEFWrapper(new DateETSKCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}

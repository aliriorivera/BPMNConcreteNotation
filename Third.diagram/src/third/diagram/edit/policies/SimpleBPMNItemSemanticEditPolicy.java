/*
 * 
 */
package third.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import third.diagram.edit.commands.DateCreateCommand;
import third.diagram.edit.commands.EndCreateCommand;
import third.diagram.edit.commands.ExtendedCreateCommand;
import third.diagram.edit.commands.IntervalCreateCommand;
import third.diagram.edit.commands.MessageCreateCommand;
import third.diagram.edit.commands.NormalCreateCommand;
import third.diagram.edit.commands.StartCreateCommand;
import third.diagram.providers.ThirdElementTypes;

/**
 * @generated
 */
public class SimpleBPMNItemSemanticEditPolicy extends
		ThirdBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SimpleBPMNItemSemanticEditPolicy() {
		super(ThirdElementTypes.SimpleBPMN_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ThirdElementTypes.Message_2001 == req.getElementType()) {
			return getGEFWrapper(new MessageCreateCommand(req));
		}
		if (ThirdElementTypes.Interval_2002 == req.getElementType()) {
			return getGEFWrapper(new IntervalCreateCommand(req));
		}
		if (ThirdElementTypes.Date_2003 == req.getElementType()) {
			return getGEFWrapper(new DateCreateCommand(req));
		}
		if (ThirdElementTypes.Normal_2004 == req.getElementType()) {
			return getGEFWrapper(new NormalCreateCommand(req));
		}
		if (ThirdElementTypes.Extended_2005 == req.getElementType()) {
			return getGEFWrapper(new ExtendedCreateCommand(req));
		}
		if (ThirdElementTypes.Start_2006 == req.getElementType()) {
			return getGEFWrapper(new StartCreateCommand(req));
		}
		if (ThirdElementTypes.End_2007 == req.getElementType()) {
			return getGEFWrapper(new EndCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}

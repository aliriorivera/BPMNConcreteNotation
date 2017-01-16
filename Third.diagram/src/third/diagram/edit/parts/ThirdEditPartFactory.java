/*
 * 
 */
package third.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import third.diagram.part.ThirdVisualIDRegistry;

/**
 * @generated
 */
public class ThirdEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ThirdVisualIDRegistry.getVisualID(view)) {

			case SimpleBPMNEditPart.VISUAL_ID:
				return new SimpleBPMNEditPart(view);

			case MessageEditPart.VISUAL_ID:
				return new MessageEditPart(view);

			case MessageMessageDefaultEditPart.VISUAL_ID:
				return new MessageMessageDefaultEditPart(view);

			case IntervalEditPart.VISUAL_ID:
				return new IntervalEditPart(view);

			case IntervalNameValueTimeEditPart.VISUAL_ID:
				return new IntervalNameValueTimeEditPart(view);

			case DateEditPart.VISUAL_ID:
				return new DateEditPart(view);

			case DateNameEditPart.VISUAL_ID:
				return new DateNameEditPart(view);

			case NormalEditPart.VISUAL_ID:
				return new NormalEditPart(view);

			case NormalNameEditPart.VISUAL_ID:
				return new NormalNameEditPart(view);

			case ExtendedEditPart.VISUAL_ID:
				return new ExtendedEditPart(view);

			case ExtendedNameEditPart.VISUAL_ID:
				return new ExtendedNameEditPart(view);

			case StartEditPart.VISUAL_ID:
				return new StartEditPart(view);

			case StartNameEditPart.VISUAL_ID:
				return new StartNameEditPart(view);

			case EndEditPart.VISUAL_ID:
				return new EndEditPart(view);

			case EndNameEditPart.VISUAL_ID:
				return new EndNameEditPart(view);

			case InputEditPart.VISUAL_ID:
				return new InputEditPart(view);

			case InputNameEditPart.VISUAL_ID:
				return new InputNameEditPart(view);

			case OutputEditPart.VISUAL_ID:
				return new OutputEditPart(view);

			case OutputNameEditPart.VISUAL_ID:
				return new OutputNameEditPart(view);

			case DescripcionEditPart.VISUAL_ID:
				return new DescripcionEditPart(view);

			case DescripcionNameEditPart.VISUAL_ID:
				return new DescripcionNameEditPart(view);

			case ParticipantETSKEditPart.VISUAL_ID:
				return new ParticipantETSKEditPart(view);

			case ParticipantETSKNameEditPart.VISUAL_ID:
				return new ParticipantETSKNameEditPart(view);

			case DatainETSKEditPart.VISUAL_ID:
				return new DatainETSKEditPart(view);

			case DatainETSKNameEditPart.VISUAL_ID:
				return new DatainETSKNameEditPart(view);

			case DataoutETSKEditPart.VISUAL_ID:
				return new DataoutETSKEditPart(view);

			case DataoutETSKNameEditPart.VISUAL_ID:
				return new DataoutETSKNameEditPart(view);

			case DateETSKEditPart.VISUAL_ID:
				return new DateETSKEditPart(view);

			case DateETSKNameEditPart.VISUAL_ID:
				return new DateETSKNameEditPart(view);

			case ExtendedExtendedOwnsCompartmentEditPart.VISUAL_ID:
				return new ExtendedExtendedOwnsCompartmentEditPart(view);

			case ConditionalINEditPart.VISUAL_ID:
				return new ConditionalINEditPart(view);

			case ConditionalINNameEditPart.VISUAL_ID:
				return new ConditionalINNameEditPart(view);

			case ConditionalINOUTEditPart.VISUAL_ID:
				return new ConditionalINOUTEditPart(view);

			case ConditionalINOUTNameEditPart.VISUAL_ID:
				return new ConditionalINOUTNameEditPart(view);

			case NormalFEditPart.VISUAL_ID:
				return new NormalFEditPart(view);

			case NormalFNameEditPart.VISUAL_ID:
				return new NormalFNameEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}

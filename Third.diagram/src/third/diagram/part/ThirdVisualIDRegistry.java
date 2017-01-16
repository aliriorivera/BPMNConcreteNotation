/*
 * 
 */
package third.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import third.SimpleBPMN;
import third.ThirdPackage;
import third.diagram.edit.parts.ConditionalINEditPart;
import third.diagram.edit.parts.ConditionalINNameEditPart;
import third.diagram.edit.parts.ConditionalINOUTEditPart;
import third.diagram.edit.parts.ConditionalINOUTNameEditPart;
import third.diagram.edit.parts.DatainETSKEditPart;
import third.diagram.edit.parts.DatainETSKNameEditPart;
import third.diagram.edit.parts.DataoutETSKEditPart;
import third.diagram.edit.parts.DataoutETSKNameEditPart;
import third.diagram.edit.parts.DateETSKEditPart;
import third.diagram.edit.parts.DateETSKNameEditPart;
import third.diagram.edit.parts.DateEditPart;
import third.diagram.edit.parts.DateNameEditPart;
import third.diagram.edit.parts.DescripcionEditPart;
import third.diagram.edit.parts.DescripcionNameEditPart;
import third.diagram.edit.parts.EndEditPart;
import third.diagram.edit.parts.EndNameEditPart;
import third.diagram.edit.parts.ExtendedEditPart;
import third.diagram.edit.parts.ExtendedExtendedOwnsCompartmentEditPart;
import third.diagram.edit.parts.ExtendedNameEditPart;
import third.diagram.edit.parts.InputEditPart;
import third.diagram.edit.parts.InputNameEditPart;
import third.diagram.edit.parts.IntervalEditPart;
import third.diagram.edit.parts.IntervalNameValueTimeEditPart;
import third.diagram.edit.parts.MessageEditPart;
import third.diagram.edit.parts.MessageMessageDefaultEditPart;
import third.diagram.edit.parts.NormalEditPart;
import third.diagram.edit.parts.NormalFEditPart;
import third.diagram.edit.parts.NormalFNameEditPart;
import third.diagram.edit.parts.NormalNameEditPart;
import third.diagram.edit.parts.OutputEditPart;
import third.diagram.edit.parts.OutputNameEditPart;
import third.diagram.edit.parts.ParticipantETSKEditPart;
import third.diagram.edit.parts.ParticipantETSKNameEditPart;
import third.diagram.edit.parts.SimpleBPMNEditPart;
import third.diagram.edit.parts.StartEditPart;
import third.diagram.edit.parts.StartNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ThirdVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "Third.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (SimpleBPMNEditPart.MODEL_ID.equals(view.getType())) {
				return SimpleBPMNEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return third.diagram.part.ThirdVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				ThirdDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ThirdPackage.eINSTANCE.getSimpleBPMN().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((SimpleBPMN) domainElement)) {
			return SimpleBPMNEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = third.diagram.part.ThirdVisualIDRegistry
				.getModelID(containerView);
		if (!SimpleBPMNEditPart.MODEL_ID.equals(containerModelID)
				&& !"third".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (SimpleBPMNEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = third.diagram.part.ThirdVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SimpleBPMNEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case SimpleBPMNEditPart.VISUAL_ID:
			if (ThirdPackage.eINSTANCE.getMessage().isSuperTypeOf(
					domainElement.eClass())) {
				return MessageEditPart.VISUAL_ID;
			}
			if (ThirdPackage.eINSTANCE.getInterval().isSuperTypeOf(
					domainElement.eClass())) {
				return IntervalEditPart.VISUAL_ID;
			}
			if (ThirdPackage.eINSTANCE.getDate().isSuperTypeOf(
					domainElement.eClass())) {
				return DateEditPart.VISUAL_ID;
			}
			if (ThirdPackage.eINSTANCE.getNormal().isSuperTypeOf(
					domainElement.eClass())) {
				return NormalEditPart.VISUAL_ID;
			}
			if (ThirdPackage.eINSTANCE.getExtended().isSuperTypeOf(
					domainElement.eClass())) {
				return ExtendedEditPart.VISUAL_ID;
			}
			if (ThirdPackage.eINSTANCE.getStart().isSuperTypeOf(
					domainElement.eClass())) {
				return StartEditPart.VISUAL_ID;
			}
			if (ThirdPackage.eINSTANCE.getEnd().isSuperTypeOf(
					domainElement.eClass())) {
				return EndEditPart.VISUAL_ID;
			}
			break;
		case NormalEditPart.VISUAL_ID:
			if (ThirdPackage.eINSTANCE.getInput().isSuperTypeOf(
					domainElement.eClass())) {
				return InputEditPart.VISUAL_ID;
			}
			if (ThirdPackage.eINSTANCE.getOutput().isSuperTypeOf(
					domainElement.eClass())) {
				return OutputEditPart.VISUAL_ID;
			}
			break;
		case ExtendedEditPart.VISUAL_ID:
			if (ThirdPackage.eINSTANCE.getInput().isSuperTypeOf(
					domainElement.eClass())) {
				return InputEditPart.VISUAL_ID;
			}
			if (ThirdPackage.eINSTANCE.getOutput().isSuperTypeOf(
					domainElement.eClass())) {
				return OutputEditPart.VISUAL_ID;
			}
			break;
		case ExtendedExtendedOwnsCompartmentEditPart.VISUAL_ID:
			if (ThirdPackage.eINSTANCE.getDescripcion().isSuperTypeOf(
					domainElement.eClass())) {
				return DescripcionEditPart.VISUAL_ID;
			}
			if (ThirdPackage.eINSTANCE.getParticipantETSK().isSuperTypeOf(
					domainElement.eClass())) {
				return ParticipantETSKEditPart.VISUAL_ID;
			}
			if (ThirdPackage.eINSTANCE.getdatainETSK().isSuperTypeOf(
					domainElement.eClass())) {
				return DatainETSKEditPart.VISUAL_ID;
			}
			if (ThirdPackage.eINSTANCE.getdataoutETSK().isSuperTypeOf(
					domainElement.eClass())) {
				return DataoutETSKEditPart.VISUAL_ID;
			}
			if (ThirdPackage.eINSTANCE.getDateETSK().isSuperTypeOf(
					domainElement.eClass())) {
				return DateETSKEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = third.diagram.part.ThirdVisualIDRegistry
				.getModelID(containerView);
		if (!SimpleBPMNEditPart.MODEL_ID.equals(containerModelID)
				&& !"third".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (SimpleBPMNEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = third.diagram.part.ThirdVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SimpleBPMNEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case SimpleBPMNEditPart.VISUAL_ID:
			if (MessageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (IntervalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NormalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtendedEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StartEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EndEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MessageEditPart.VISUAL_ID:
			if (MessageMessageDefaultEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case IntervalEditPart.VISUAL_ID:
			if (IntervalNameValueTimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DateEditPart.VISUAL_ID:
			if (DateNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NormalEditPart.VISUAL_ID:
			if (NormalNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExtendedEditPart.VISUAL_ID:
			if (ExtendedNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExtendedExtendedOwnsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StartEditPart.VISUAL_ID:
			if (StartNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EndEditPart.VISUAL_ID:
			if (EndNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputEditPart.VISUAL_ID:
			if (InputNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OutputEditPart.VISUAL_ID:
			if (OutputNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DescripcionEditPart.VISUAL_ID:
			if (DescripcionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParticipantETSKEditPart.VISUAL_ID:
			if (ParticipantETSKNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DatainETSKEditPart.VISUAL_ID:
			if (DatainETSKNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataoutETSKEditPart.VISUAL_ID:
			if (DataoutETSKNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DateETSKEditPart.VISUAL_ID:
			if (DateETSKNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExtendedExtendedOwnsCompartmentEditPart.VISUAL_ID:
			if (DescripcionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParticipantETSKEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DatainETSKEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataoutETSKEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DateETSKEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalINEditPart.VISUAL_ID:
			if (ConditionalINNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalINOUTEditPart.VISUAL_ID:
			if (ConditionalINOUTNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NormalFEditPart.VISUAL_ID:
			if (NormalFNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ThirdPackage.eINSTANCE.getConditionalIN().isSuperTypeOf(
				domainElement.eClass())) {
			return ConditionalINEditPart.VISUAL_ID;
		}
		if (ThirdPackage.eINSTANCE.getConditionalINOUT().isSuperTypeOf(
				domainElement.eClass())) {
			return ConditionalINOUTEditPart.VISUAL_ID;
		}
		if (ThirdPackage.eINSTANCE.getNormalF().isSuperTypeOf(
				domainElement.eClass())) {
			return NormalFEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(SimpleBPMN element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case ExtendedExtendedOwnsCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case SimpleBPMNEditPart.VISUAL_ID:
			return false;
		case MessageEditPart.VISUAL_ID:
		case IntervalEditPart.VISUAL_ID:
		case DateEditPart.VISUAL_ID:
		case StartEditPart.VISUAL_ID:
		case EndEditPart.VISUAL_ID:
		case InputEditPart.VISUAL_ID:
		case OutputEditPart.VISUAL_ID:
		case DescripcionEditPart.VISUAL_ID:
		case ParticipantETSKEditPart.VISUAL_ID:
		case DatainETSKEditPart.VISUAL_ID:
		case DataoutETSKEditPart.VISUAL_ID:
		case DateETSKEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return third.diagram.part.ThirdVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return third.diagram.part.ThirdVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return third.diagram.part.ThirdVisualIDRegistry.getNodeVisualID(
					containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return third.diagram.part.ThirdVisualIDRegistry.checkNodeVisualID(
					containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return third.diagram.part.ThirdVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return third.diagram.part.ThirdVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}

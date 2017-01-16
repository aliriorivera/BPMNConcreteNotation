/*
 * 
 */
package third.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import third.ConditionalIN;
import third.ConditionalINOUT;
import third.Date;
import third.Elements;
import third.End;
import third.Events;
import third.Extended;
import third.Input;
import third.Interval;
import third.Message;
import third.Normal;
import third.NormalF;
import third.Output;
import third.Parameters;
import third.SimpleBPMN;
import third.Start;
import third.Task;
import third.ThirdPackage;
import third.diagram.edit.parts.ConditionalINEditPart;
import third.diagram.edit.parts.ConditionalINOUTEditPart;
import third.diagram.edit.parts.DatainETSKEditPart;
import third.diagram.edit.parts.DataoutETSKEditPart;
import third.diagram.edit.parts.DateETSKEditPart;
import third.diagram.edit.parts.DateEditPart;
import third.diagram.edit.parts.DescripcionEditPart;
import third.diagram.edit.parts.EndEditPart;
import third.diagram.edit.parts.ExtendedEditPart;
import third.diagram.edit.parts.ExtendedExtendedOwnsCompartmentEditPart;
import third.diagram.edit.parts.InputEditPart;
import third.diagram.edit.parts.IntervalEditPart;
import third.diagram.edit.parts.MessageEditPart;
import third.diagram.edit.parts.NormalEditPart;
import third.diagram.edit.parts.NormalFEditPart;
import third.diagram.edit.parts.OutputEditPart;
import third.diagram.edit.parts.ParticipantETSKEditPart;
import third.diagram.edit.parts.SimpleBPMNEditPart;
import third.diagram.edit.parts.StartEditPart;
import third.diagram.providers.ThirdElementTypes;

/**
 * @generated
 */
public class ThirdDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<ThirdNodeDescriptor> getSemanticChildren(View view) {
		switch (ThirdVisualIDRegistry.getVisualID(view)) {
		case SimpleBPMNEditPart.VISUAL_ID:
			return getSimpleBPMN_1000SemanticChildren(view);
		case NormalEditPart.VISUAL_ID:
			return getNormal_2004SemanticChildren(view);
		case ExtendedEditPart.VISUAL_ID:
			return getExtended_2005SemanticChildren(view);
		case ExtendedExtendedOwnsCompartmentEditPart.VISUAL_ID:
			return getExtendedExtendedOwnsCompartment_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdNodeDescriptor> getSimpleBPMN_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SimpleBPMN modelElement = (SimpleBPMN) view.getElement();
		LinkedList<ThirdNodeDescriptor> result = new LinkedList<ThirdNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwnedEvents().iterator(); it
				.hasNext();) {
			Events childElement = (Events) it.next();
			int visualID = ThirdVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MessageEditPart.VISUAL_ID) {
				result.add(new ThirdNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == IntervalEditPart.VISUAL_ID) {
				result.add(new ThirdNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DateEditPart.VISUAL_ID) {
				result.add(new ThirdNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOwnedTasks().iterator(); it
				.hasNext();) {
			Task childElement = (Task) it.next();
			int visualID = ThirdVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == NormalEditPart.VISUAL_ID) {
				result.add(new ThirdNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExtendedEditPart.VISUAL_ID) {
				result.add(new ThirdNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			Start childElement = modelElement.getStartNodes();
			int visualID = ThirdVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == StartEditPart.VISUAL_ID) {
				result.add(new ThirdNodeDescriptor(childElement, visualID));
			}
		}
		{
			End childElement = modelElement.getEndNodes();
			int visualID = ThirdVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EndEditPart.VISUAL_ID) {
				result.add(new ThirdNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ThirdNodeDescriptor> getNormal_2004SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Normal modelElement = (Normal) view.getElement();
		LinkedList<ThirdNodeDescriptor> result = new LinkedList<ThirdNodeDescriptor>();
		{
			Input childElement = modelElement.getValuesin();
			int visualID = ThirdVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InputEditPart.VISUAL_ID) {
				result.add(new ThirdNodeDescriptor(childElement, visualID));
			}
		}
		{
			Output childElement = modelElement.getValuesout();
			int visualID = ThirdVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OutputEditPart.VISUAL_ID) {
				result.add(new ThirdNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ThirdNodeDescriptor> getExtended_2005SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Extended modelElement = (Extended) view.getElement();
		LinkedList<ThirdNodeDescriptor> result = new LinkedList<ThirdNodeDescriptor>();
		{
			Input childElement = modelElement.getValuesin();
			int visualID = ThirdVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == InputEditPart.VISUAL_ID) {
				result.add(new ThirdNodeDescriptor(childElement, visualID));
			}
		}
		{
			Output childElement = modelElement.getValuesout();
			int visualID = ThirdVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == OutputEditPart.VISUAL_ID) {
				result.add(new ThirdNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ThirdNodeDescriptor> getExtendedExtendedOwnsCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Extended modelElement = (Extended) containerView.getElement();
		LinkedList<ThirdNodeDescriptor> result = new LinkedList<ThirdNodeDescriptor>();
		for (Iterator<?> it = modelElement.getOwns().iterator(); it.hasNext();) {
			Parameters childElement = (Parameters) it.next();
			int visualID = ThirdVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == DescripcionEditPart.VISUAL_ID) {
				result.add(new ThirdNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ParticipantETSKEditPart.VISUAL_ID) {
				result.add(new ThirdNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DatainETSKEditPart.VISUAL_ID) {
				result.add(new ThirdNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataoutETSKEditPart.VISUAL_ID) {
				result.add(new ThirdNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DateETSKEditPart.VISUAL_ID) {
				result.add(new ThirdNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getContainedLinks(View view) {
		switch (ThirdVisualIDRegistry.getVisualID(view)) {
		case SimpleBPMNEditPart.VISUAL_ID:
			return getSimpleBPMN_1000ContainedLinks(view);
		case MessageEditPart.VISUAL_ID:
			return getMessage_2001ContainedLinks(view);
		case IntervalEditPart.VISUAL_ID:
			return getInterval_2002ContainedLinks(view);
		case DateEditPart.VISUAL_ID:
			return getDate_2003ContainedLinks(view);
		case NormalEditPart.VISUAL_ID:
			return getNormal_2004ContainedLinks(view);
		case ExtendedEditPart.VISUAL_ID:
			return getExtended_2005ContainedLinks(view);
		case StartEditPart.VISUAL_ID:
			return getStart_2006ContainedLinks(view);
		case EndEditPart.VISUAL_ID:
			return getEnd_2007ContainedLinks(view);
		case InputEditPart.VISUAL_ID:
			return getInput_3001ContainedLinks(view);
		case OutputEditPart.VISUAL_ID:
			return getOutput_3002ContainedLinks(view);
		case DescripcionEditPart.VISUAL_ID:
			return getDescripcion_3003ContainedLinks(view);
		case ParticipantETSKEditPart.VISUAL_ID:
			return getParticipantETSK_3004ContainedLinks(view);
		case DatainETSKEditPart.VISUAL_ID:
			return getDatainETSK_3005ContainedLinks(view);
		case DataoutETSKEditPart.VISUAL_ID:
			return getDataoutETSK_3006ContainedLinks(view);
		case DateETSKEditPart.VISUAL_ID:
			return getDateETSK_3007ContainedLinks(view);
		case ConditionalINEditPart.VISUAL_ID:
			return getConditionalIN_4001ContainedLinks(view);
		case ConditionalINOUTEditPart.VISUAL_ID:
			return getConditionalINOUT_4002ContainedLinks(view);
		case NormalFEditPart.VISUAL_ID:
			return getNormalF_4003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getIncomingLinks(View view) {
		switch (ThirdVisualIDRegistry.getVisualID(view)) {
		case MessageEditPart.VISUAL_ID:
			return getMessage_2001IncomingLinks(view);
		case IntervalEditPart.VISUAL_ID:
			return getInterval_2002IncomingLinks(view);
		case DateEditPart.VISUAL_ID:
			return getDate_2003IncomingLinks(view);
		case NormalEditPart.VISUAL_ID:
			return getNormal_2004IncomingLinks(view);
		case ExtendedEditPart.VISUAL_ID:
			return getExtended_2005IncomingLinks(view);
		case StartEditPart.VISUAL_ID:
			return getStart_2006IncomingLinks(view);
		case EndEditPart.VISUAL_ID:
			return getEnd_2007IncomingLinks(view);
		case InputEditPart.VISUAL_ID:
			return getInput_3001IncomingLinks(view);
		case OutputEditPart.VISUAL_ID:
			return getOutput_3002IncomingLinks(view);
		case DescripcionEditPart.VISUAL_ID:
			return getDescripcion_3003IncomingLinks(view);
		case ParticipantETSKEditPart.VISUAL_ID:
			return getParticipantETSK_3004IncomingLinks(view);
		case DatainETSKEditPart.VISUAL_ID:
			return getDatainETSK_3005IncomingLinks(view);
		case DataoutETSKEditPart.VISUAL_ID:
			return getDataoutETSK_3006IncomingLinks(view);
		case DateETSKEditPart.VISUAL_ID:
			return getDateETSK_3007IncomingLinks(view);
		case ConditionalINEditPart.VISUAL_ID:
			return getConditionalIN_4001IncomingLinks(view);
		case ConditionalINOUTEditPart.VISUAL_ID:
			return getConditionalINOUT_4002IncomingLinks(view);
		case NormalFEditPart.VISUAL_ID:
			return getNormalF_4003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getOutgoingLinks(View view) {
		switch (ThirdVisualIDRegistry.getVisualID(view)) {
		case MessageEditPart.VISUAL_ID:
			return getMessage_2001OutgoingLinks(view);
		case IntervalEditPart.VISUAL_ID:
			return getInterval_2002OutgoingLinks(view);
		case DateEditPart.VISUAL_ID:
			return getDate_2003OutgoingLinks(view);
		case NormalEditPart.VISUAL_ID:
			return getNormal_2004OutgoingLinks(view);
		case ExtendedEditPart.VISUAL_ID:
			return getExtended_2005OutgoingLinks(view);
		case StartEditPart.VISUAL_ID:
			return getStart_2006OutgoingLinks(view);
		case EndEditPart.VISUAL_ID:
			return getEnd_2007OutgoingLinks(view);
		case InputEditPart.VISUAL_ID:
			return getInput_3001OutgoingLinks(view);
		case OutputEditPart.VISUAL_ID:
			return getOutput_3002OutgoingLinks(view);
		case DescripcionEditPart.VISUAL_ID:
			return getDescripcion_3003OutgoingLinks(view);
		case ParticipantETSKEditPart.VISUAL_ID:
			return getParticipantETSK_3004OutgoingLinks(view);
		case DatainETSKEditPart.VISUAL_ID:
			return getDatainETSK_3005OutgoingLinks(view);
		case DataoutETSKEditPart.VISUAL_ID:
			return getDataoutETSK_3006OutgoingLinks(view);
		case DateETSKEditPart.VISUAL_ID:
			return getDateETSK_3007OutgoingLinks(view);
		case ConditionalINEditPart.VISUAL_ID:
			return getConditionalIN_4001OutgoingLinks(view);
		case ConditionalINOUTEditPart.VISUAL_ID:
			return getConditionalINOUT_4002OutgoingLinks(view);
		case NormalFEditPart.VISUAL_ID:
			return getNormalF_4003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getSimpleBPMN_1000ContainedLinks(
			View view) {
		SimpleBPMN modelElement = (SimpleBPMN) view.getElement();
		LinkedList<ThirdLinkDescriptor> result = new LinkedList<ThirdLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_ConditionalIN_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_ConditionalINOUT_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_NormalF_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getMessage_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getInterval_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getDate_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getNormal_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getExtended_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getStart_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getEnd_2007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getInput_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getOutput_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getDescripcion_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getParticipantETSK_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getDatainETSK_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getDataoutETSK_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getDateETSK_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getConditionalIN_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getConditionalINOUT_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getNormalF_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getMessage_2001IncomingLinks(
			View view) {
		Message modelElement = (Message) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ThirdLinkDescriptor> result = new LinkedList<ThirdLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_NormalF_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getInterval_2002IncomingLinks(
			View view) {
		Interval modelElement = (Interval) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ThirdLinkDescriptor> result = new LinkedList<ThirdLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_NormalF_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getDate_2003IncomingLinks(View view) {
		Date modelElement = (Date) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ThirdLinkDescriptor> result = new LinkedList<ThirdLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_NormalF_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getNormal_2004IncomingLinks(
			View view) {
		Normal modelElement = (Normal) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ThirdLinkDescriptor> result = new LinkedList<ThirdLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ConditionalIN_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_NormalF_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getExtended_2005IncomingLinks(
			View view) {
		Extended modelElement = (Extended) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ThirdLinkDescriptor> result = new LinkedList<ThirdLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ConditionalIN_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_NormalF_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getStart_2006IncomingLinks(View view) {
		Start modelElement = (Start) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ThirdLinkDescriptor> result = new LinkedList<ThirdLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_NormalF_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getEnd_2007IncomingLinks(View view) {
		End modelElement = (End) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ThirdLinkDescriptor> result = new LinkedList<ThirdLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_NormalF_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getInput_3001IncomingLinks(View view) {
		Input modelElement = (Input) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ThirdLinkDescriptor> result = new LinkedList<ThirdLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_ConditionalINOUT_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getOutput_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getDescripcion_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getParticipantETSK_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getDatainETSK_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getDataoutETSK_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getDateETSK_3007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getConditionalIN_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getConditionalINOUT_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getNormalF_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getMessage_2001OutgoingLinks(
			View view) {
		Message modelElement = (Message) view.getElement();
		LinkedList<ThirdLinkDescriptor> result = new LinkedList<ThirdLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_NormalF_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getInterval_2002OutgoingLinks(
			View view) {
		Interval modelElement = (Interval) view.getElement();
		LinkedList<ThirdLinkDescriptor> result = new LinkedList<ThirdLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_NormalF_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getDate_2003OutgoingLinks(View view) {
		Date modelElement = (Date) view.getElement();
		LinkedList<ThirdLinkDescriptor> result = new LinkedList<ThirdLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_NormalF_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getNormal_2004OutgoingLinks(
			View view) {
		Normal modelElement = (Normal) view.getElement();
		LinkedList<ThirdLinkDescriptor> result = new LinkedList<ThirdLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_NormalF_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getExtended_2005OutgoingLinks(
			View view) {
		Extended modelElement = (Extended) view.getElement();
		LinkedList<ThirdLinkDescriptor> result = new LinkedList<ThirdLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_NormalF_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getStart_2006OutgoingLinks(View view) {
		Start modelElement = (Start) view.getElement();
		LinkedList<ThirdLinkDescriptor> result = new LinkedList<ThirdLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_NormalF_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getEnd_2007OutgoingLinks(View view) {
		End modelElement = (End) view.getElement();
		LinkedList<ThirdLinkDescriptor> result = new LinkedList<ThirdLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_NormalF_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getInput_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getOutput_3002OutgoingLinks(
			View view) {
		Output modelElement = (Output) view.getElement();
		LinkedList<ThirdLinkDescriptor> result = new LinkedList<ThirdLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_ConditionalIN_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_ConditionalINOUT_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getDescripcion_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getParticipantETSK_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getDatainETSK_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getDataoutETSK_3006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getDateETSK_3007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getConditionalIN_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getConditionalINOUT_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ThirdLinkDescriptor> getNormalF_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<ThirdLinkDescriptor> getContainedTypeModelFacetLinks_ConditionalIN_4001(
			SimpleBPMN container) {
		LinkedList<ThirdLinkDescriptor> result = new LinkedList<ThirdLinkDescriptor>();
		for (Iterator<?> links = container.getOwnedFlows().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ConditionalIN) {
				continue;
			}
			ConditionalIN link = (ConditionalIN) linkObject;
			if (ConditionalINEditPart.VISUAL_ID != ThirdVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Task dst = link.getTo();
			Output src = link.getFrom();
			result.add(new ThirdLinkDescriptor(src, dst, link,
					ThirdElementTypes.ConditionalIN_4001,
					ConditionalINEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ThirdLinkDescriptor> getContainedTypeModelFacetLinks_ConditionalINOUT_4002(
			SimpleBPMN container) {
		LinkedList<ThirdLinkDescriptor> result = new LinkedList<ThirdLinkDescriptor>();
		for (Iterator<?> links = container.getOwnedFlows().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ConditionalINOUT) {
				continue;
			}
			ConditionalINOUT link = (ConditionalINOUT) linkObject;
			if (ConditionalINOUTEditPart.VISUAL_ID != ThirdVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Input dst = link.getTo();
			Output src = link.getFrom();
			result.add(new ThirdLinkDescriptor(src, dst, link,
					ThirdElementTypes.ConditionalINOUT_4002,
					ConditionalINOUTEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ThirdLinkDescriptor> getContainedTypeModelFacetLinks_NormalF_4003(
			SimpleBPMN container) {
		LinkedList<ThirdLinkDescriptor> result = new LinkedList<ThirdLinkDescriptor>();
		for (Iterator<?> links = container.getOwnedFlows().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NormalF) {
				continue;
			}
			NormalF link = (NormalF) linkObject;
			if (NormalFEditPart.VISUAL_ID != ThirdVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Elements dst = link.getTo();
			Elements src = link.getFrom();
			result.add(new ThirdLinkDescriptor(src, dst, link,
					ThirdElementTypes.NormalF_4003, NormalFEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ThirdLinkDescriptor> getIncomingTypeModelFacetLinks_ConditionalIN_4001(
			Task target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ThirdLinkDescriptor> result = new LinkedList<ThirdLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ThirdPackage.eINSTANCE
					.getConditionalIN_To()
					|| false == setting.getEObject() instanceof ConditionalIN) {
				continue;
			}
			ConditionalIN link = (ConditionalIN) setting.getEObject();
			if (ConditionalINEditPart.VISUAL_ID != ThirdVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Output src = link.getFrom();
			result.add(new ThirdLinkDescriptor(src, target, link,
					ThirdElementTypes.ConditionalIN_4001,
					ConditionalINEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ThirdLinkDescriptor> getIncomingTypeModelFacetLinks_ConditionalINOUT_4002(
			Input target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ThirdLinkDescriptor> result = new LinkedList<ThirdLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ThirdPackage.eINSTANCE
					.getConditionalINOUT_To()
					|| false == setting.getEObject() instanceof ConditionalINOUT) {
				continue;
			}
			ConditionalINOUT link = (ConditionalINOUT) setting.getEObject();
			if (ConditionalINOUTEditPart.VISUAL_ID != ThirdVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Output src = link.getFrom();
			result.add(new ThirdLinkDescriptor(src, target, link,
					ThirdElementTypes.ConditionalINOUT_4002,
					ConditionalINOUTEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ThirdLinkDescriptor> getIncomingTypeModelFacetLinks_NormalF_4003(
			Elements target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ThirdLinkDescriptor> result = new LinkedList<ThirdLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ThirdPackage.eINSTANCE
					.getNormalF_To()
					|| false == setting.getEObject() instanceof NormalF) {
				continue;
			}
			NormalF link = (NormalF) setting.getEObject();
			if (NormalFEditPart.VISUAL_ID != ThirdVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Elements src = link.getFrom();
			result.add(new ThirdLinkDescriptor(src, target, link,
					ThirdElementTypes.NormalF_4003, NormalFEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ThirdLinkDescriptor> getOutgoingTypeModelFacetLinks_ConditionalIN_4001(
			Output source) {
		SimpleBPMN container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof SimpleBPMN) {
				container = (SimpleBPMN) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ThirdLinkDescriptor> result = new LinkedList<ThirdLinkDescriptor>();
		for (Iterator<?> links = container.getOwnedFlows().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ConditionalIN) {
				continue;
			}
			ConditionalIN link = (ConditionalIN) linkObject;
			if (ConditionalINEditPart.VISUAL_ID != ThirdVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Task dst = link.getTo();
			Output src = link.getFrom();
			if (src != source) {
				continue;
			}
			result.add(new ThirdLinkDescriptor(src, dst, link,
					ThirdElementTypes.ConditionalIN_4001,
					ConditionalINEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ThirdLinkDescriptor> getOutgoingTypeModelFacetLinks_ConditionalINOUT_4002(
			Output source) {
		SimpleBPMN container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof SimpleBPMN) {
				container = (SimpleBPMN) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ThirdLinkDescriptor> result = new LinkedList<ThirdLinkDescriptor>();
		for (Iterator<?> links = container.getOwnedFlows().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof ConditionalINOUT) {
				continue;
			}
			ConditionalINOUT link = (ConditionalINOUT) linkObject;
			if (ConditionalINOUTEditPart.VISUAL_ID != ThirdVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Input dst = link.getTo();
			Output src = link.getFrom();
			if (src != source) {
				continue;
			}
			result.add(new ThirdLinkDescriptor(src, dst, link,
					ThirdElementTypes.ConditionalINOUT_4002,
					ConditionalINOUTEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ThirdLinkDescriptor> getOutgoingTypeModelFacetLinks_NormalF_4003(
			Elements source) {
		SimpleBPMN container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof SimpleBPMN) {
				container = (SimpleBPMN) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ThirdLinkDescriptor> result = new LinkedList<ThirdLinkDescriptor>();
		for (Iterator<?> links = container.getOwnedFlows().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NormalF) {
				continue;
			}
			NormalF link = (NormalF) linkObject;
			if (NormalFEditPart.VISUAL_ID != ThirdVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Elements dst = link.getTo();
			Elements src = link.getFrom();
			if (src != source) {
				continue;
			}
			result.add(new ThirdLinkDescriptor(src, dst, link,
					ThirdElementTypes.NormalF_4003, NormalFEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<ThirdNodeDescriptor> getSemanticChildren(View view) {
			return ThirdDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ThirdLinkDescriptor> getContainedLinks(View view) {
			return ThirdDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ThirdLinkDescriptor> getIncomingLinks(View view) {
			return ThirdDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ThirdLinkDescriptor> getOutgoingLinks(View view) {
			return ThirdDiagramUpdater.getOutgoingLinks(view);
		}
	};

}

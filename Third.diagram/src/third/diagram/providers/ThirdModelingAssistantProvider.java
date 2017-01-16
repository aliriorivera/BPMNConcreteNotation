/*
 * 
 */
package third.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import third.diagram.edit.parts.DateEditPart;
import third.diagram.edit.parts.EndEditPart;
import third.diagram.edit.parts.ExtendedEditPart;
import third.diagram.edit.parts.ExtendedExtendedOwnsCompartmentEditPart;
import third.diagram.edit.parts.InputEditPart;
import third.diagram.edit.parts.IntervalEditPart;
import third.diagram.edit.parts.MessageEditPart;
import third.diagram.edit.parts.NormalEditPart;
import third.diagram.edit.parts.OutputEditPart;
import third.diagram.edit.parts.SimpleBPMNEditPart;
import third.diagram.edit.parts.StartEditPart;
import third.diagram.part.Messages;
import third.diagram.part.ThirdDiagramEditorPlugin;

/**
 * @generated
 */
public class ThirdModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof SimpleBPMNEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(7);
			types.add(ThirdElementTypes.Message_2001);
			types.add(ThirdElementTypes.Interval_2002);
			types.add(ThirdElementTypes.Date_2003);
			types.add(ThirdElementTypes.Normal_2004);
			types.add(ThirdElementTypes.Extended_2005);
			types.add(ThirdElementTypes.Start_2006);
			types.add(ThirdElementTypes.End_2007);
			return types;
		}
		if (editPart instanceof NormalEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ThirdElementTypes.Input_3001);
			types.add(ThirdElementTypes.Output_3002);
			return types;
		}
		if (editPart instanceof ExtendedEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ThirdElementTypes.Input_3001);
			types.add(ThirdElementTypes.Output_3002);
			return types;
		}
		if (editPart instanceof ExtendedExtendedOwnsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(5);
			types.add(ThirdElementTypes.Descripcion_3003);
			types.add(ThirdElementTypes.ParticipantETSK_3004);
			types.add(ThirdElementTypes.DatainETSK_3005);
			types.add(ThirdElementTypes.DataoutETSK_3006);
			types.add(ThirdElementTypes.DateETSK_3007);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof MessageEditPart) {
			return ((MessageEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof IntervalEditPart) {
			return ((IntervalEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof DateEditPart) {
			return ((DateEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof NormalEditPart) {
			return ((NormalEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ExtendedEditPart) {
			return ((ExtendedEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StartEditPart) {
			return ((StartEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof EndEditPart) {
			return ((EndEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof OutputEditPart) {
			return ((OutputEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof MessageEditPart) {
			return ((MessageEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof IntervalEditPart) {
			return ((IntervalEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof DateEditPart) {
			return ((DateEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof NormalEditPart) {
			return ((NormalEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ExtendedEditPart) {
			return ((ExtendedEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StartEditPart) {
			return ((StartEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof EndEditPart) {
			return ((EndEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof InputEditPart) {
			return ((InputEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof MessageEditPart) {
			return ((MessageEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof IntervalEditPart) {
			return ((IntervalEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof DateEditPart) {
			return ((DateEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof NormalEditPart) {
			return ((NormalEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ExtendedEditPart) {
			return ((ExtendedEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StartEditPart) {
			return ((StartEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof EndEditPart) {
			return ((EndEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof OutputEditPart) {
			return ((OutputEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof MessageEditPart) {
			return ((MessageEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof IntervalEditPart) {
			return ((IntervalEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof DateEditPart) {
			return ((DateEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof NormalEditPart) {
			return ((NormalEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ExtendedEditPart) {
			return ((ExtendedEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StartEditPart) {
			return ((StartEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof EndEditPart) {
			return ((EndEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof InputEditPart) {
			return ((InputEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof MessageEditPart) {
			return ((MessageEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof IntervalEditPart) {
			return ((IntervalEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof DateEditPart) {
			return ((DateEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof NormalEditPart) {
			return ((NormalEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ExtendedEditPart) {
			return ((ExtendedEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StartEditPart) {
			return ((StartEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof EndEditPart) {
			return ((EndEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof OutputEditPart) {
			return ((OutputEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				ThirdDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.ThirdModelingAssistantProviderMessage);
		dialog.setTitle(Messages.ThirdModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}

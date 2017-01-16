/*
 * 
 */
package third.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

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
import third.diagram.edit.parts.InputEditPart;
import third.diagram.edit.parts.IntervalEditPart;
import third.diagram.edit.parts.MessageEditPart;
import third.diagram.edit.parts.NormalEditPart;
import third.diagram.edit.parts.NormalFEditPart;
import third.diagram.edit.parts.OutputEditPart;
import third.diagram.edit.parts.ParticipantETSKEditPart;
import third.diagram.edit.parts.SimpleBPMNEditPart;
import third.diagram.edit.parts.StartEditPart;
import third.diagram.part.ThirdDiagramEditorPlugin;

/**
 * @generated
 */
public class ThirdElementTypes {

	/**
	 * @generated
	 */
	private ThirdElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType SimpleBPMN_1000 = getElementType("Third.diagram.SimpleBPMN_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Message_2001 = getElementType("Third.diagram.Message_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Interval_2002 = getElementType("Third.diagram.Interval_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Date_2003 = getElementType("Third.diagram.Date_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Normal_2004 = getElementType("Third.diagram.Normal_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Extended_2005 = getElementType("Third.diagram.Extended_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Start_2006 = getElementType("Third.diagram.Start_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType End_2007 = getElementType("Third.diagram.End_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Input_3001 = getElementType("Third.diagram.Input_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Output_3002 = getElementType("Third.diagram.Output_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Descripcion_3003 = getElementType("Third.diagram.Descripcion_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ParticipantETSK_3004 = getElementType("Third.diagram.ParticipantETSK_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DatainETSK_3005 = getElementType("Third.diagram.DatainETSK_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DataoutETSK_3006 = getElementType("Third.diagram.DataoutETSK_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DateETSK_3007 = getElementType("Third.diagram.DateETSK_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConditionalIN_4001 = getElementType("Third.diagram.ConditionalIN_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConditionalINOUT_4002 = getElementType("Third.diagram.ConditionalINOUT_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType NormalF_4003 = getElementType("Third.diagram.NormalF_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return ThirdDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(SimpleBPMN_1000,
					ThirdPackage.eINSTANCE.getSimpleBPMN());

			elements.put(Message_2001, ThirdPackage.eINSTANCE.getMessage());

			elements.put(Interval_2002, ThirdPackage.eINSTANCE.getInterval());

			elements.put(Date_2003, ThirdPackage.eINSTANCE.getDate());

			elements.put(Normal_2004, ThirdPackage.eINSTANCE.getNormal());

			elements.put(Extended_2005, ThirdPackage.eINSTANCE.getExtended());

			elements.put(Start_2006, ThirdPackage.eINSTANCE.getStart());

			elements.put(End_2007, ThirdPackage.eINSTANCE.getEnd());

			elements.put(Input_3001, ThirdPackage.eINSTANCE.getInput());

			elements.put(Output_3002, ThirdPackage.eINSTANCE.getOutput());

			elements.put(Descripcion_3003,
					ThirdPackage.eINSTANCE.getDescripcion());

			elements.put(ParticipantETSK_3004,
					ThirdPackage.eINSTANCE.getParticipantETSK());

			elements.put(DatainETSK_3005,
					ThirdPackage.eINSTANCE.getdatainETSK());

			elements.put(DataoutETSK_3006,
					ThirdPackage.eINSTANCE.getdataoutETSK());

			elements.put(DateETSK_3007, ThirdPackage.eINSTANCE.getDateETSK());

			elements.put(ConditionalIN_4001,
					ThirdPackage.eINSTANCE.getConditionalIN());

			elements.put(ConditionalINOUT_4002,
					ThirdPackage.eINSTANCE.getConditionalINOUT());

			elements.put(NormalF_4003, ThirdPackage.eINSTANCE.getNormalF());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(SimpleBPMN_1000);
			KNOWN_ELEMENT_TYPES.add(Message_2001);
			KNOWN_ELEMENT_TYPES.add(Interval_2002);
			KNOWN_ELEMENT_TYPES.add(Date_2003);
			KNOWN_ELEMENT_TYPES.add(Normal_2004);
			KNOWN_ELEMENT_TYPES.add(Extended_2005);
			KNOWN_ELEMENT_TYPES.add(Start_2006);
			KNOWN_ELEMENT_TYPES.add(End_2007);
			KNOWN_ELEMENT_TYPES.add(Input_3001);
			KNOWN_ELEMENT_TYPES.add(Output_3002);
			KNOWN_ELEMENT_TYPES.add(Descripcion_3003);
			KNOWN_ELEMENT_TYPES.add(ParticipantETSK_3004);
			KNOWN_ELEMENT_TYPES.add(DatainETSK_3005);
			KNOWN_ELEMENT_TYPES.add(DataoutETSK_3006);
			KNOWN_ELEMENT_TYPES.add(DateETSK_3007);
			KNOWN_ELEMENT_TYPES.add(ConditionalIN_4001);
			KNOWN_ELEMENT_TYPES.add(ConditionalINOUT_4002);
			KNOWN_ELEMENT_TYPES.add(NormalF_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case SimpleBPMNEditPart.VISUAL_ID:
			return SimpleBPMN_1000;
		case MessageEditPart.VISUAL_ID:
			return Message_2001;
		case IntervalEditPart.VISUAL_ID:
			return Interval_2002;
		case DateEditPart.VISUAL_ID:
			return Date_2003;
		case NormalEditPart.VISUAL_ID:
			return Normal_2004;
		case ExtendedEditPart.VISUAL_ID:
			return Extended_2005;
		case StartEditPart.VISUAL_ID:
			return Start_2006;
		case EndEditPart.VISUAL_ID:
			return End_2007;
		case InputEditPart.VISUAL_ID:
			return Input_3001;
		case OutputEditPart.VISUAL_ID:
			return Output_3002;
		case DescripcionEditPart.VISUAL_ID:
			return Descripcion_3003;
		case ParticipantETSKEditPart.VISUAL_ID:
			return ParticipantETSK_3004;
		case DatainETSKEditPart.VISUAL_ID:
			return DatainETSK_3005;
		case DataoutETSKEditPart.VISUAL_ID:
			return DataoutETSK_3006;
		case DateETSKEditPart.VISUAL_ID:
			return DateETSK_3007;
		case ConditionalINEditPart.VISUAL_ID:
			return ConditionalIN_4001;
		case ConditionalINOUTEditPart.VISUAL_ID:
			return ConditionalINOUT_4002;
		case NormalFEditPart.VISUAL_ID:
			return NormalF_4003;
		}
		return null;
	}

}

/*
 * 
 */
package third.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

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
import third.diagram.part.ThirdDiagramEditorPlugin;
import third.diagram.part.ThirdVisualIDRegistry;
import third.diagram.providers.ThirdElementTypes;
import third.diagram.providers.ThirdParserProvider;

/**
 * @generated
 */
public class ThirdNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		ThirdDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		ThirdDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ThirdNavigatorItem
				&& !isOwnView(((ThirdNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof ThirdNavigatorGroup) {
			ThirdNavigatorGroup group = (ThirdNavigatorGroup) element;
			return ThirdDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof ThirdNavigatorItem) {
			ThirdNavigatorItem navigatorItem = (ThirdNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (ThirdVisualIDRegistry.getVisualID(view)) {
		case DescripcionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?third?Descripcion", ThirdElementTypes.Descripcion_3003); //$NON-NLS-1$
		case NormalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?third?Normal", ThirdElementTypes.Normal_2004); //$NON-NLS-1$
		case DatainETSKEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?third?datainETSK", ThirdElementTypes.DatainETSK_3005); //$NON-NLS-1$
		case NormalFEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?third?NormalF", ThirdElementTypes.NormalF_4003); //$NON-NLS-1$
		case DataoutETSKEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?third?dataoutETSK", ThirdElementTypes.DataoutETSK_3006); //$NON-NLS-1$
		case DateEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?third?Date", ThirdElementTypes.Date_2003); //$NON-NLS-1$
		case IntervalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?third?Interval", ThirdElementTypes.Interval_2002); //$NON-NLS-1$
		case MessageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?third?Message", ThirdElementTypes.Message_2001); //$NON-NLS-1$
		case ConditionalINEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?third?ConditionalIN", ThirdElementTypes.ConditionalIN_4001); //$NON-NLS-1$
		case StartEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?third?Start", ThirdElementTypes.Start_2006); //$NON-NLS-1$
		case OutputEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?third?Output", ThirdElementTypes.Output_3002); //$NON-NLS-1$
		case ConditionalINOUTEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?third?ConditionalINOUT", ThirdElementTypes.ConditionalINOUT_4002); //$NON-NLS-1$
		case ParticipantETSKEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?third?ParticipantETSK", ThirdElementTypes.ParticipantETSK_3004); //$NON-NLS-1$
		case SimpleBPMNEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?third?SimpleBPMN", ThirdElementTypes.SimpleBPMN_1000); //$NON-NLS-1$
		case DateETSKEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?third?DateETSK", ThirdElementTypes.DateETSK_3007); //$NON-NLS-1$
		case InputEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?third?Input", ThirdElementTypes.Input_3001); //$NON-NLS-1$
		case ExtendedEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?third?Extended", ThirdElementTypes.Extended_2005); //$NON-NLS-1$
		case EndEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?third?End", ThirdElementTypes.End_2007); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ThirdDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& ThirdElementTypes.isKnownElementType(elementType)) {
			image = ThirdElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof ThirdNavigatorGroup) {
			ThirdNavigatorGroup group = (ThirdNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ThirdNavigatorItem) {
			ThirdNavigatorItem navigatorItem = (ThirdNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (ThirdVisualIDRegistry.getVisualID(view)) {
		case DescripcionEditPart.VISUAL_ID:
			return getDescripcion_3003Text(view);
		case NormalEditPart.VISUAL_ID:
			return getNormal_2004Text(view);
		case DatainETSKEditPart.VISUAL_ID:
			return getDatainETSK_3005Text(view);
		case NormalFEditPart.VISUAL_ID:
			return getNormalF_4003Text(view);
		case DataoutETSKEditPart.VISUAL_ID:
			return getDataoutETSK_3006Text(view);
		case DateEditPart.VISUAL_ID:
			return getDate_2003Text(view);
		case IntervalEditPart.VISUAL_ID:
			return getInterval_2002Text(view);
		case MessageEditPart.VISUAL_ID:
			return getMessage_2001Text(view);
		case ConditionalINEditPart.VISUAL_ID:
			return getConditionalIN_4001Text(view);
		case StartEditPart.VISUAL_ID:
			return getStart_2006Text(view);
		case OutputEditPart.VISUAL_ID:
			return getOutput_3002Text(view);
		case ConditionalINOUTEditPart.VISUAL_ID:
			return getConditionalINOUT_4002Text(view);
		case ParticipantETSKEditPart.VISUAL_ID:
			return getParticipantETSK_3004Text(view);
		case SimpleBPMNEditPart.VISUAL_ID:
			return getSimpleBPMN_1000Text(view);
		case DateETSKEditPart.VISUAL_ID:
			return getDateETSK_3007Text(view);
		case InputEditPart.VISUAL_ID:
			return getInput_3001Text(view);
		case ExtendedEditPart.VISUAL_ID:
			return getExtended_2005Text(view);
		case EndEditPart.VISUAL_ID:
			return getEnd_2007Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getDescripcion_3003Text(View view) {
		IParser parser = ThirdParserProvider.getParser(
				ThirdElementTypes.Descripcion_3003,
				view.getElement() != null ? view.getElement() : view,
				ThirdVisualIDRegistry
						.getType(DescripcionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ThirdDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNormal_2004Text(View view) {
		IParser parser = ThirdParserProvider.getParser(
				ThirdElementTypes.Normal_2004,
				view.getElement() != null ? view.getElement() : view,
				ThirdVisualIDRegistry.getType(NormalNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ThirdDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDatainETSK_3005Text(View view) {
		IParser parser = ThirdParserProvider
				.getParser(ThirdElementTypes.DatainETSK_3005,
						view.getElement() != null ? view.getElement() : view,
						ThirdVisualIDRegistry
								.getType(DatainETSKNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ThirdDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getNormalF_4003Text(View view) {
		IParser parser = ThirdParserProvider.getParser(
				ThirdElementTypes.NormalF_4003,
				view.getElement() != null ? view.getElement() : view,
				ThirdVisualIDRegistry.getType(NormalFNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ThirdDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDataoutETSK_3006Text(View view) {
		IParser parser = ThirdParserProvider.getParser(
				ThirdElementTypes.DataoutETSK_3006,
				view.getElement() != null ? view.getElement() : view,
				ThirdVisualIDRegistry
						.getType(DataoutETSKNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ThirdDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDate_2003Text(View view) {
		IParser parser = ThirdParserProvider.getParser(
				ThirdElementTypes.Date_2003,
				view.getElement() != null ? view.getElement() : view,
				ThirdVisualIDRegistry.getType(DateNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ThirdDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInterval_2002Text(View view) {
		IParser parser = ThirdParserProvider.getParser(
				ThirdElementTypes.Interval_2002,
				view.getElement() != null ? view.getElement() : view,
				ThirdVisualIDRegistry
						.getType(IntervalNameValueTimeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ThirdDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMessage_2001Text(View view) {
		IParser parser = ThirdParserProvider.getParser(
				ThirdElementTypes.Message_2001,
				view.getElement() != null ? view.getElement() : view,
				ThirdVisualIDRegistry
						.getType(MessageMessageDefaultEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ThirdDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConditionalIN_4001Text(View view) {
		IParser parser = ThirdParserProvider.getParser(
				ThirdElementTypes.ConditionalIN_4001,
				view.getElement() != null ? view.getElement() : view,
				ThirdVisualIDRegistry
						.getType(ConditionalINNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ThirdDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getStart_2006Text(View view) {
		IParser parser = ThirdParserProvider.getParser(
				ThirdElementTypes.Start_2006,
				view.getElement() != null ? view.getElement() : view,
				ThirdVisualIDRegistry.getType(StartNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ThirdDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getOutput_3002Text(View view) {
		IParser parser = ThirdParserProvider.getParser(
				ThirdElementTypes.Output_3002,
				view.getElement() != null ? view.getElement() : view,
				ThirdVisualIDRegistry.getType(OutputNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ThirdDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConditionalINOUT_4002Text(View view) {
		IParser parser = ThirdParserProvider.getParser(
				ThirdElementTypes.ConditionalINOUT_4002,
				view.getElement() != null ? view.getElement() : view,
				ThirdVisualIDRegistry
						.getType(ConditionalINOUTNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ThirdDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getParticipantETSK_3004Text(View view) {
		IParser parser = ThirdParserProvider.getParser(
				ThirdElementTypes.ParticipantETSK_3004,
				view.getElement() != null ? view.getElement() : view,
				ThirdVisualIDRegistry
						.getType(ParticipantETSKNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ThirdDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSimpleBPMN_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getDateETSK_3007Text(View view) {
		IParser parser = ThirdParserProvider.getParser(
				ThirdElementTypes.DateETSK_3007,
				view.getElement() != null ? view.getElement() : view,
				ThirdVisualIDRegistry.getType(DateETSKNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ThirdDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInput_3001Text(View view) {
		IParser parser = ThirdParserProvider.getParser(
				ThirdElementTypes.Input_3001,
				view.getElement() != null ? view.getElement() : view,
				ThirdVisualIDRegistry.getType(InputNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ThirdDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExtended_2005Text(View view) {
		IParser parser = ThirdParserProvider.getParser(
				ThirdElementTypes.Extended_2005,
				view.getElement() != null ? view.getElement() : view,
				ThirdVisualIDRegistry.getType(ExtendedNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ThirdDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEnd_2007Text(View view) {
		IParser parser = ThirdParserProvider.getParser(
				ThirdElementTypes.End_2007,
				view.getElement() != null ? view.getElement() : view,
				ThirdVisualIDRegistry.getType(EndNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ThirdDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return SimpleBPMNEditPart.MODEL_ID.equals(ThirdVisualIDRegistry
				.getModelID(view));
	}

}

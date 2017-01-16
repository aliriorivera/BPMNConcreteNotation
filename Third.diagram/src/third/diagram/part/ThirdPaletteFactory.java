/*
 * 
 */
package third.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import third.diagram.providers.ThirdElementTypes;

/**
 * @generated
 */
public class ThirdPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createDate1CreationTool());
		paletteContainer.add(createDateETSK2CreationTool());
		paletteContainer.add(createDescripcion3CreationTool());
		paletteContainer.add(createEnd4CreationTool());
		paletteContainer.add(createExtended5CreationTool());
		paletteContainer.add(createInput6CreationTool());
		paletteContainer.add(createInterval7CreationTool());
		paletteContainer.add(createMessage8CreationTool());
		paletteContainer.add(createNormal9CreationTool());
		paletteContainer.add(createOutput10CreationTool());
		paletteContainer.add(createParticipantETSK11CreationTool());
		paletteContainer.add(createStart12CreationTool());
		paletteContainer.add(createDatainETSK13CreationTool());
		paletteContainer.add(createDataoutETSK14CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createConditionalIN1CreationTool());
		paletteContainer.add(createConditionalINOUT2CreationTool());
		paletteContainer.add(createNormalF3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDate1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Date1CreationTool_title,
				Messages.Date1CreationTool_desc,
				Collections.singletonList(ThirdElementTypes.Date_2003));
		entry.setId("createDate1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ThirdElementTypes
				.getImageDescriptor(ThirdElementTypes.Date_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDateETSK2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DateETSK2CreationTool_title,
				Messages.DateETSK2CreationTool_desc,
				Collections.singletonList(ThirdElementTypes.DateETSK_3007));
		entry.setId("createDateETSK2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ThirdElementTypes
				.getImageDescriptor(ThirdElementTypes.DateETSK_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDescripcion3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Descripcion3CreationTool_title,
				Messages.Descripcion3CreationTool_desc,
				Collections.singletonList(ThirdElementTypes.Descripcion_3003));
		entry.setId("createDescripcion3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ThirdElementTypes
				.getImageDescriptor(ThirdElementTypes.Descripcion_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnd4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.End4CreationTool_title,
				Messages.End4CreationTool_desc,
				Collections.singletonList(ThirdElementTypes.End_2007));
		entry.setId("createEnd4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ThirdElementTypes
				.getImageDescriptor(ThirdElementTypes.End_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExtended5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Extended5CreationTool_title,
				Messages.Extended5CreationTool_desc,
				Collections.singletonList(ThirdElementTypes.Extended_2005));
		entry.setId("createExtended5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ThirdElementTypes
				.getImageDescriptor(ThirdElementTypes.Extended_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInput6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Input6CreationTool_title,
				Messages.Input6CreationTool_desc,
				Collections.singletonList(ThirdElementTypes.Input_3001));
		entry.setId("createInput6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ThirdElementTypes
				.getImageDescriptor(ThirdElementTypes.Input_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInterval7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Interval7CreationTool_title,
				Messages.Interval7CreationTool_desc,
				Collections.singletonList(ThirdElementTypes.Interval_2002));
		entry.setId("createInterval7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ThirdElementTypes
				.getImageDescriptor(ThirdElementTypes.Interval_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMessage8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Message8CreationTool_title,
				Messages.Message8CreationTool_desc,
				Collections.singletonList(ThirdElementTypes.Message_2001));
		entry.setId("createMessage8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ThirdElementTypes
				.getImageDescriptor(ThirdElementTypes.Message_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNormal9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Normal9CreationTool_title,
				Messages.Normal9CreationTool_desc,
				Collections.singletonList(ThirdElementTypes.Normal_2004));
		entry.setId("createNormal9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ThirdElementTypes
				.getImageDescriptor(ThirdElementTypes.Normal_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutput10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Output10CreationTool_title,
				Messages.Output10CreationTool_desc,
				Collections.singletonList(ThirdElementTypes.Output_3002));
		entry.setId("createOutput10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ThirdElementTypes
				.getImageDescriptor(ThirdElementTypes.Output_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createParticipantETSK11CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ParticipantETSK11CreationTool_title,
				Messages.ParticipantETSK11CreationTool_desc,
				Collections
						.singletonList(ThirdElementTypes.ParticipantETSK_3004));
		entry.setId("createParticipantETSK11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ThirdElementTypes
				.getImageDescriptor(ThirdElementTypes.ParticipantETSK_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStart12CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Start12CreationTool_title,
				Messages.Start12CreationTool_desc,
				Collections.singletonList(ThirdElementTypes.Start_2006));
		entry.setId("createStart12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ThirdElementTypes
				.getImageDescriptor(ThirdElementTypes.Start_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDatainETSK13CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DatainETSK13CreationTool_title,
				Messages.DatainETSK13CreationTool_desc,
				Collections.singletonList(ThirdElementTypes.DatainETSK_3005));
		entry.setId("createDatainETSK13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ThirdElementTypes
				.getImageDescriptor(ThirdElementTypes.DatainETSK_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDataoutETSK14CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DataoutETSK14CreationTool_title,
				Messages.DataoutETSK14CreationTool_desc,
				Collections.singletonList(ThirdElementTypes.DataoutETSK_3006));
		entry.setId("createDataoutETSK14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ThirdElementTypes
				.getImageDescriptor(ThirdElementTypes.DataoutETSK_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConditionalIN1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ConditionalIN1CreationTool_title,
				Messages.ConditionalIN1CreationTool_desc,
				Collections.singletonList(ThirdElementTypes.ConditionalIN_4001));
		entry.setId("createConditionalIN1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ThirdElementTypes
				.getImageDescriptor(ThirdElementTypes.ConditionalIN_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConditionalINOUT2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ConditionalINOUT2CreationTool_title,
				Messages.ConditionalINOUT2CreationTool_desc,
				Collections
						.singletonList(ThirdElementTypes.ConditionalINOUT_4002));
		entry.setId("createConditionalINOUT2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ThirdElementTypes
				.getImageDescriptor(ThirdElementTypes.ConditionalINOUT_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNormalF3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.NormalF3CreationTool_title,
				Messages.NormalF3CreationTool_desc,
				Collections.singletonList(ThirdElementTypes.NormalF_4003));
		entry.setId("createNormalF3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ThirdElementTypes
				.getImageDescriptor(ThirdElementTypes.NormalF_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}

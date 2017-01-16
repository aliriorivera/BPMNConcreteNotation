/*
 * 
 */
package third.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import third.ThirdPackage;
import third.diagram.edit.parts.ConditionalINNameEditPart;
import third.diagram.edit.parts.ConditionalINOUTNameEditPart;
import third.diagram.edit.parts.DatainETSKNameEditPart;
import third.diagram.edit.parts.DataoutETSKNameEditPart;
import third.diagram.edit.parts.DateETSKNameEditPart;
import third.diagram.edit.parts.DateNameEditPart;
import third.diagram.edit.parts.DescripcionNameEditPart;
import third.diagram.edit.parts.EndNameEditPart;
import third.diagram.edit.parts.ExtendedNameEditPart;
import third.diagram.edit.parts.InputNameEditPart;
import third.diagram.edit.parts.IntervalNameValueTimeEditPart;
import third.diagram.edit.parts.MessageMessageDefaultEditPart;
import third.diagram.edit.parts.NormalFNameEditPart;
import third.diagram.edit.parts.NormalNameEditPart;
import third.diagram.edit.parts.OutputNameEditPart;
import third.diagram.edit.parts.ParticipantETSKNameEditPart;
import third.diagram.edit.parts.StartNameEditPart;
import third.diagram.parsers.MessageFormatParser;
import third.diagram.part.ThirdVisualIDRegistry;

/**
 * @generated
 */
public class ThirdParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser messageMessageDefault_5001Parser;

	/**
	 * @generated
	 */
	private IParser getMessageMessageDefault_5001Parser() {
		if (messageMessageDefault_5001Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ThirdPackage.eINSTANCE.getMessage_Message(),
					ThirdPackage.eINSTANCE.getMessage_Default() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{1} {0}"); //$NON-NLS-1$
			parser.setEditorPattern("{1} {0}"); //$NON-NLS-1$
			parser.setEditPattern("{1} {0}"); //$NON-NLS-1$
			messageMessageDefault_5001Parser = parser;
		}
		return messageMessageDefault_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser intervalNameValueTime_5002Parser;

	/**
	 * @generated
	 */
	private IParser getIntervalNameValueTime_5002Parser() {
		if (intervalNameValueTime_5002Parser == null) {
			EAttribute[] features = new EAttribute[] {
					ThirdPackage.eINSTANCE.getInterval_Name(),
					ThirdPackage.eINSTANCE.getInterval_Value(),
					ThirdPackage.eINSTANCE.getInterval_Time() };
			MessageFormatParser parser = new MessageFormatParser(features);
			parser.setViewPattern("{0} {1} {2}"); //$NON-NLS-1$
			parser.setEditorPattern("{0} {1} {2}"); //$NON-NLS-1$
			parser.setEditPattern("{0} {1} {2}"); //$NON-NLS-1$
			intervalNameValueTime_5002Parser = parser;
		}
		return intervalNameValueTime_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser dateName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getDateName_5003Parser() {
		if (dateName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { ThirdPackage.eINSTANCE
					.getDate_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dateName_5003Parser = parser;
		}
		return dateName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser normalName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getNormalName_5006Parser() {
		if (normalName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { ThirdPackage.eINSTANCE
					.getNormal_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			normalName_5006Parser = parser;
		}
		return normalName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser extendedName_5012Parser;

	/**
	 * @generated
	 */
	private IParser getExtendedName_5012Parser() {
		if (extendedName_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { ThirdPackage.eINSTANCE
					.getExtended_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			extendedName_5012Parser = parser;
		}
		return extendedName_5012Parser;
	}

	/**
	 * @generated
	 */
	private IParser startName_5013Parser;

	/**
	 * @generated
	 */
	private IParser getStartName_5013Parser() {
		if (startName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { ThirdPackage.eINSTANCE
					.getStart_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			startName_5013Parser = parser;
		}
		return startName_5013Parser;
	}

	/**
	 * @generated
	 */
	private IParser endName_5014Parser;

	/**
	 * @generated
	 */
	private IParser getEndName_5014Parser() {
		if (endName_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { ThirdPackage.eINSTANCE
					.getEnd_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			endName_5014Parser = parser;
		}
		return endName_5014Parser;
	}

	/**
	 * @generated
	 */
	private IParser inputName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getInputName_5004Parser() {
		if (inputName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { ThirdPackage.eINSTANCE
					.getInput_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputName_5004Parser = parser;
		}
		return inputName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser outputName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getOutputName_5005Parser() {
		if (outputName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { ThirdPackage.eINSTANCE
					.getOutput_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			outputName_5005Parser = parser;
		}
		return outputName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser descripcionName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getDescripcionName_5007Parser() {
		if (descripcionName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { ThirdPackage.eINSTANCE
					.getDescripcion_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			descripcionName_5007Parser = parser;
		}
		return descripcionName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser participantETSKName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getParticipantETSKName_5008Parser() {
		if (participantETSKName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { ThirdPackage.eINSTANCE
					.getParticipantETSK_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			participantETSKName_5008Parser = parser;
		}
		return participantETSKName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser datainETSKName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getDatainETSKName_5009Parser() {
		if (datainETSKName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { ThirdPackage.eINSTANCE
					.getdatainETSK_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			datainETSKName_5009Parser = parser;
		}
		return datainETSKName_5009Parser;
	}

	/**
	 * @generated
	 */
	private IParser dataoutETSKName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getDataoutETSKName_5010Parser() {
		if (dataoutETSKName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { ThirdPackage.eINSTANCE
					.getdataoutETSK_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataoutETSKName_5010Parser = parser;
		}
		return dataoutETSKName_5010Parser;
	}

	/**
	 * @generated
	 */
	private IParser dateETSKName_5011Parser;

	/**
	 * @generated
	 */
	private IParser getDateETSKName_5011Parser() {
		if (dateETSKName_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { ThirdPackage.eINSTANCE
					.getDateETSK_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dateETSKName_5011Parser = parser;
		}
		return dateETSKName_5011Parser;
	}

	/**
	 * @generated
	 */
	private IParser conditionalINName_6001Parser;

	/**
	 * @generated
	 */
	private IParser getConditionalINName_6001Parser() {
		if (conditionalINName_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { ThirdPackage.eINSTANCE
					.getConditional_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			conditionalINName_6001Parser = parser;
		}
		return conditionalINName_6001Parser;
	}

	/**
	 * @generated
	 */
	private IParser conditionalINOUTName_6002Parser;

	/**
	 * @generated
	 */
	private IParser getConditionalINOUTName_6002Parser() {
		if (conditionalINOUTName_6002Parser == null) {
			EAttribute[] features = new EAttribute[] { ThirdPackage.eINSTANCE
					.getConditional_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			conditionalINOUTName_6002Parser = parser;
		}
		return conditionalINOUTName_6002Parser;
	}

	/**
	 * @generated
	 */
	private IParser normalFName_6003Parser;

	/**
	 * @generated
	 */
	private IParser getNormalFName_6003Parser() {
		if (normalFName_6003Parser == null) {
			EAttribute[] features = new EAttribute[] { ThirdPackage.eINSTANCE
					.getNormalF_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			normalFName_6003Parser = parser;
		}
		return normalFName_6003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case MessageMessageDefaultEditPart.VISUAL_ID:
			return getMessageMessageDefault_5001Parser();
		case IntervalNameValueTimeEditPart.VISUAL_ID:
			return getIntervalNameValueTime_5002Parser();
		case DateNameEditPart.VISUAL_ID:
			return getDateName_5003Parser();
		case NormalNameEditPart.VISUAL_ID:
			return getNormalName_5006Parser();
		case ExtendedNameEditPart.VISUAL_ID:
			return getExtendedName_5012Parser();
		case StartNameEditPart.VISUAL_ID:
			return getStartName_5013Parser();
		case EndNameEditPart.VISUAL_ID:
			return getEndName_5014Parser();
		case InputNameEditPart.VISUAL_ID:
			return getInputName_5004Parser();
		case OutputNameEditPart.VISUAL_ID:
			return getOutputName_5005Parser();
		case DescripcionNameEditPart.VISUAL_ID:
			return getDescripcionName_5007Parser();
		case ParticipantETSKNameEditPart.VISUAL_ID:
			return getParticipantETSKName_5008Parser();
		case DatainETSKNameEditPart.VISUAL_ID:
			return getDatainETSKName_5009Parser();
		case DataoutETSKNameEditPart.VISUAL_ID:
			return getDataoutETSKName_5010Parser();
		case DateETSKNameEditPart.VISUAL_ID:
			return getDateETSKName_5011Parser();
		case ConditionalINNameEditPart.VISUAL_ID:
			return getConditionalINName_6001Parser();
		case ConditionalINOUTNameEditPart.VISUAL_ID:
			return getConditionalINOUTName_6002Parser();
		case NormalFNameEditPart.VISUAL_ID:
			return getNormalFName_6003Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(ThirdVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(ThirdVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (ThirdElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}

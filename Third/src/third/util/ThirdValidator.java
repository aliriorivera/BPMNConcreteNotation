/**
 */
package third.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import third.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see third.ThirdPackage
 * @generated
 */
public class ThirdValidator extends EObjectValidator
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final ThirdValidator INSTANCE = new ThirdValidator();

  /**
   * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.Diagnostic#getSource()
   * @see org.eclipse.emf.common.util.Diagnostic#getCode()
   * @generated
   */
  public static final String DIAGNOSTIC_SOURCE = "third";

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ThirdValidator()
  {
    super();
  }

  /**
   * Returns the package of this validator switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EPackage getEPackage()
  {
    return ThirdPackage.eINSTANCE;
  }

  /**
   * Calls <code>validateXXX</code> for the corresponding classifier of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    switch (classifierID)
    {
      case ThirdPackage.SIMPLE_BPMN:
        return validateSimpleBPMN((SimpleBPMN)value, diagnostics, context);
      case ThirdPackage.EVENTS:
        return validateEvents((Events)value, diagnostics, context);
      case ThirdPackage.TASK:
        return validateTask((Task)value, diagnostics, context);
      case ThirdPackage.FLOW:
        return validateFlow((Flow)value, diagnostics, context);
      case ThirdPackage.START:
        return validateStart((Start)value, diagnostics, context);
      case ThirdPackage.END:
        return validateEnd((End)value, diagnostics, context);
      case ThirdPackage.MESSAGE:
        return validateMessage((Message)value, diagnostics, context);
      case ThirdPackage.NORMAL:
        return validateNormal((Normal)value, diagnostics, context);
      case ThirdPackage.EXTENDED:
        return validateExtended((Extended)value, diagnostics, context);
      case ThirdPackage.NORMAL_F:
        return validateNormalF((NormalF)value, diagnostics, context);
      case ThirdPackage.CONDITIONAL:
        return validateConditional((Conditional)value, diagnostics, context);
      case ThirdPackage.VALUES:
        return validateValues((Values)value, diagnostics, context);
      case ThirdPackage.INPUT:
        return validateInput((Input)value, diagnostics, context);
      case ThirdPackage.OUTPUT:
        return validateOutput((Output)value, diagnostics, context);
      case ThirdPackage.CONDITIONAL_IN:
        return validateConditionalIN((ConditionalIN)value, diagnostics, context);
      case ThirdPackage.CONDITIONAL_INOUT:
        return validateConditionalINOUT((ConditionalINOUT)value, diagnostics, context);
      case ThirdPackage.INTERVAL:
        return validateInterval((Interval)value, diagnostics, context);
      case ThirdPackage.DATE:
        return validateDate((Date)value, diagnostics, context);
      case ThirdPackage.PARAMETERS:
        return validateParameters((Parameters)value, diagnostics, context);
      case ThirdPackage.DESCRIPCION:
        return validateDescripcion((Descripcion)value, diagnostics, context);
      case ThirdPackage.PARTICIPANT_ETSK:
        return validateParticipantETSK((ParticipantETSK)value, diagnostics, context);
      case ThirdPackage.DATAIN_ETSK:
        return validatedatainETSK((datainETSK)value, diagnostics, context);
      case ThirdPackage.DATAOUT_ETSK:
        return validatedataoutETSK((dataoutETSK)value, diagnostics, context);
      case ThirdPackage.DATE_ETSK:
        return validateDateETSK((DateETSK)value, diagnostics, context);
      case ThirdPackage.NODES:
        return validateNodes((Nodes)value, diagnostics, context);
      case ThirdPackage.ELEMENTS:
        return validateElements((Elements)value, diagnostics, context);
      case ThirdPackage.TIME_SELECTION:
        return validateTimeSelection((TimeSelection)value, diagnostics, context);
      default:
        return true;
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSimpleBPMN(SimpleBPMN simpleBPMN, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(simpleBPMN, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(simpleBPMN, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(simpleBPMN, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(simpleBPMN, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(simpleBPMN, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(simpleBPMN, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(simpleBPMN, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(simpleBPMN, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(simpleBPMN, diagnostics, context);
    if (result || diagnostics != null) result &= validateSimpleBPMN_NumberOfStartNode(simpleBPMN, diagnostics, context);
    if (result || diagnostics != null) result &= validateSimpleBPMN_NumberOfEndNode(simpleBPMN, diagnostics, context);
    return result;
  }

  /**
   * The cached validation expression for the NumberOfStartNode constraint of '<em>Simple BPMN</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String SIMPLE_BPMN__NUMBER_OF_START_NODE__EEXPRESSION = "self.StartNodes->select(m : SimpleBPMN | m.oclIsTypeOf(Start))->size() < 2";

  /**
   * Validates the NumberOfStartNode constraint of '<em>Simple BPMN</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSimpleBPMN_NumberOfStartNode(SimpleBPMN simpleBPMN, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (ThirdPackage.Literals.SIMPLE_BPMN,
         simpleBPMN,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "NumberOfStartNode",
         SIMPLE_BPMN__NUMBER_OF_START_NODE__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * The cached validation expression for the NumberOfEndNode constraint of '<em>Simple BPMN</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String SIMPLE_BPMN__NUMBER_OF_END_NODE__EEXPRESSION = "self.EndNodes->select(m : SimpleBPMN | m.oclIsTypeOf(End))->size() < 2";

  /**
   * Validates the NumberOfEndNode constraint of '<em>Simple BPMN</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateSimpleBPMN_NumberOfEndNode(SimpleBPMN simpleBPMN, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (ThirdPackage.Literals.SIMPLE_BPMN,
         simpleBPMN,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "NumberOfEndNode",
         SIMPLE_BPMN__NUMBER_OF_END_NODE__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEvents(Events events, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(events, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTask(Task task, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(task, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFlow(Flow flow, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(flow, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStart(Start start, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(start, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEnd(End end, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(end, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMessage(Message message, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(message, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNormal(Normal normal, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(normal, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateExtended(Extended extended, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(extended, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNormalF(NormalF normalF, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(normalF, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(normalF, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(normalF, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(normalF, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(normalF, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(normalF, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(normalF, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(normalF, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(normalF, diagnostics, context);
    if (result || diagnostics != null) result &= validateNormalF_NoLoopsFromNormalFlow(normalF, diagnostics, context);
    return result;
  }

  /**
   * The cached validation expression for the NoLoopsFromNormalFlow constraint of '<em>Normal F</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String NORMAL_F__NO_LOOPS_FROM_NORMAL_FLOW__EEXPRESSION = "self.from <> self.to";

  /**
   * Validates the NoLoopsFromNormalFlow constraint of '<em>Normal F</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNormalF_NoLoopsFromNormalFlow(NormalF normalF, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (ThirdPackage.Literals.NORMAL_F,
         normalF,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "NoLoopsFromNormalFlow",
         NORMAL_F__NO_LOOPS_FROM_NORMAL_FLOW__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConditional(Conditional conditional, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(conditional, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateValues(Values values, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(values, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInput(Input input, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(input, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateOutput(Output output, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(output, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConditionalIN(ConditionalIN conditionalIN, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(conditionalIN, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(conditionalIN, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(conditionalIN, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(conditionalIN, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(conditionalIN, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(conditionalIN, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(conditionalIN, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(conditionalIN, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(conditionalIN, diagnostics, context);
    if (result || diagnostics != null) result &= validateConditionalIN_ConditionalINnorvoid(conditionalIN, diagnostics, context);
    return result;
  }

  /**
   * The cached validation expression for the ConditionalINnorvoid constraint of '<em>Conditional IN</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String CONDITIONAL_IN__CONDITIONAL_INNORVOID__EEXPRESSION = "self.cond.size() > 0";

  /**
   * Validates the ConditionalINnorvoid constraint of '<em>Conditional IN</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConditionalIN_ConditionalINnorvoid(ConditionalIN conditionalIN, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (ThirdPackage.Literals.CONDITIONAL_IN,
         conditionalIN,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "ConditionalINnorvoid",
         CONDITIONAL_IN__CONDITIONAL_INNORVOID__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConditionalINOUT(ConditionalINOUT conditionalINOUT, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(conditionalINOUT, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(conditionalINOUT, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(conditionalINOUT, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(conditionalINOUT, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(conditionalINOUT, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(conditionalINOUT, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(conditionalINOUT, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(conditionalINOUT, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(conditionalINOUT, diagnostics, context);
    if (result || diagnostics != null) result &= validateConditionalINOUT_ConditionalINOUTnorvoid(conditionalINOUT, diagnostics, context);
    return result;
  }

  /**
   * The cached validation expression for the ConditionalINOUTnorvoid constraint of '<em>Conditional INOUT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String CONDITIONAL_INOUT__CONDITIONAL_INOU_TNORVOID__EEXPRESSION = "self.cond.size() > 0";

  /**
   * Validates the ConditionalINOUTnorvoid constraint of '<em>Conditional INOUT</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateConditionalINOUT_ConditionalINOUTnorvoid(ConditionalINOUT conditionalINOUT, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (ThirdPackage.Literals.CONDITIONAL_INOUT,
         conditionalINOUT,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "ConditionalINOUTnorvoid",
         CONDITIONAL_INOUT__CONDITIONAL_INOU_TNORVOID__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInterval(Interval interval, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(interval, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(interval, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(interval, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(interval, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(interval, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(interval, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(interval, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(interval, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(interval, diagnostics, context);
    if (result || diagnostics != null) result &= validateInterval_IntervalPositive(interval, diagnostics, context);
    return result;
  }

  /**
   * The cached validation expression for the IntervalPositive constraint of '<em>Interval</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String INTERVAL__INTERVAL_POSITIVE__EEXPRESSION = "self.name.size() >= 0";

  /**
   * Validates the IntervalPositive constraint of '<em>Interval</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInterval_IntervalPositive(Interval interval, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (ThirdPackage.Literals.INTERVAL,
         interval,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "IntervalPositive",
         INTERVAL__INTERVAL_POSITIVE__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDate(Date date, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(date, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateParameters(Parameters parameters, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(parameters, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDescripcion(Descripcion descripcion, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(descripcion, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(descripcion, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(descripcion, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(descripcion, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(descripcion, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(descripcion, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(descripcion, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(descripcion, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(descripcion, diagnostics, context);
    if (result || diagnostics != null) result &= validateDescripcion_PDescriptionNOTvoid(descripcion, diagnostics, context);
    return result;
  }

  /**
   * The cached validation expression for the PDescriptionNOTvoid constraint of '<em>Descripcion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String DESCRIPCION__PDESCRIPTION_NO_TVOID__EEXPRESSION = "self.name.size() > 0";

  /**
   * Validates the PDescriptionNOTvoid constraint of '<em>Descripcion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDescripcion_PDescriptionNOTvoid(Descripcion descripcion, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (ThirdPackage.Literals.DESCRIPCION,
         descripcion,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "PDescriptionNOTvoid",
         DESCRIPCION__PDESCRIPTION_NO_TVOID__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateParticipantETSK(ParticipantETSK participantETSK, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(participantETSK, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(participantETSK, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(participantETSK, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(participantETSK, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(participantETSK, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(participantETSK, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(participantETSK, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(participantETSK, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(participantETSK, diagnostics, context);
    if (result || diagnostics != null) result &= validateParticipantETSK_ParticipantETSKNOTvoid(participantETSK, diagnostics, context);
    return result;
  }

  /**
   * The cached validation expression for the ParticipantETSKNOTvoid constraint of '<em>Participant ETSK</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String PARTICIPANT_ETSK__PARTICIPANT_ETSKNO_TVOID__EEXPRESSION = "self.name.size() > 0";

  /**
   * Validates the ParticipantETSKNOTvoid constraint of '<em>Participant ETSK</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateParticipantETSK_ParticipantETSKNOTvoid(ParticipantETSK participantETSK, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (ThirdPackage.Literals.PARTICIPANT_ETSK,
         participantETSK,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "ParticipantETSKNOTvoid",
         PARTICIPANT_ETSK__PARTICIPANT_ETSKNO_TVOID__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatedatainETSK(datainETSK datainETSK, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(datainETSK, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(datainETSK, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(datainETSK, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(datainETSK, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(datainETSK, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(datainETSK, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(datainETSK, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(datainETSK, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(datainETSK, diagnostics, context);
    if (result || diagnostics != null) result &= validatedatainETSK_DatainETSKNOTvoid(datainETSK, diagnostics, context);
    return result;
  }

  /**
   * The cached validation expression for the DatainETSKNOTvoid constraint of '<em>datain ETSK</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String DATAIN_ETSK__DATAIN_ETSKNO_TVOID__EEXPRESSION = "self.name.size() > 0";

  /**
   * Validates the DatainETSKNOTvoid constraint of '<em>datain ETSK</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatedatainETSK_DatainETSKNOTvoid(datainETSK datainETSK, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (ThirdPackage.Literals.DATAIN_ETSK,
         datainETSK,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "DatainETSKNOTvoid",
         DATAIN_ETSK__DATAIN_ETSKNO_TVOID__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatedataoutETSK(dataoutETSK dataoutETSK, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(dataoutETSK, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(dataoutETSK, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataoutETSK, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataoutETSK, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataoutETSK, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataoutETSK, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(dataoutETSK, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataoutETSK, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataoutETSK, diagnostics, context);
    if (result || diagnostics != null) result &= validatedataoutETSK_dataoutETSKNOTvoid(dataoutETSK, diagnostics, context);
    return result;
  }

  /**
   * The cached validation expression for the dataoutETSKNOTvoid constraint of '<em>dataout ETSK</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String DATAOUT_ETSK__DATAOUT_ETSKNO_TVOID__EEXPRESSION = "self.name.size() > 0";

  /**
   * Validates the dataoutETSKNOTvoid constraint of '<em>dataout ETSK</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatedataoutETSK_dataoutETSKNOTvoid(dataoutETSK dataoutETSK, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (ThirdPackage.Literals.DATAOUT_ETSK,
         dataoutETSK,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "dataoutETSKNOTvoid",
         DATAOUT_ETSK__DATAOUT_ETSKNO_TVOID__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDateETSK(DateETSK dateETSK, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(dateETSK, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(dateETSK, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dateETSK, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dateETSK, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dateETSK, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(dateETSK, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(dateETSK, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(dateETSK, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dateETSK, diagnostics, context);
    if (result || diagnostics != null) result &= validateDateETSK_DateETSKNOTvoid(dateETSK, diagnostics, context);
    return result;
  }

  /**
   * The cached validation expression for the DateETSKNOTvoid constraint of '<em>Date ETSK</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final String DATE_ETSK__DATE_ETSKNO_TVOID__EEXPRESSION = "self.name.size() > 0";

  /**
   * Validates the DateETSKNOTvoid constraint of '<em>Date ETSK</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDateETSK_DateETSKNOTvoid(DateETSK dateETSK, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return
      validate
        (ThirdPackage.Literals.DATE_ETSK,
         dateETSK,
         diagnostics,
         context,
         "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
         "DateETSKNOTvoid",
         DATE_ETSK__DATE_ETSKNO_TVOID__EEXPRESSION,
         Diagnostic.ERROR,
         DIAGNOSTIC_SOURCE,
         0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNodes(Nodes nodes, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(nodes, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateElements(Elements elements, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(elements, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateTimeSelection(TimeSelection timeSelection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return true;
  }

  /**
   * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator()
  {
    // TODO
    // Specialize this to return a resource locator for messages specific to this validator.
    // Ensure that you remove @generated or mark it @generated NOT
    return super.getResourceLocator();
  }

} //ThirdValidator

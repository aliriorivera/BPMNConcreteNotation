/**
 */
package third;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see third.ThirdFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface ThirdPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "third";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "third";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "third";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ThirdPackage eINSTANCE = third.impl.ThirdPackageImpl.init();

  /**
   * The meta object id for the '{@link third.impl.SimpleBPMNImpl <em>Simple BPMN</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see third.impl.SimpleBPMNImpl
   * @see third.impl.ThirdPackageImpl#getSimpleBPMN()
   * @generated
   */
  int SIMPLE_BPMN = 0;

  /**
   * The feature id for the '<em><b>Owned Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_BPMN__OWNED_EVENTS = 0;

  /**
   * The feature id for the '<em><b>Owned Tasks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_BPMN__OWNED_TASKS = 1;

  /**
   * The feature id for the '<em><b>Owned Flows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_BPMN__OWNED_FLOWS = 2;

  /**
   * The feature id for the '<em><b>Start Nodes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_BPMN__START_NODES = 3;

  /**
   * The feature id for the '<em><b>End Nodes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_BPMN__END_NODES = 4;

  /**
   * The number of structural features of the '<em>Simple BPMN</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_BPMN_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link third.impl.ElementsImpl <em>Elements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see third.impl.ElementsImpl
   * @see third.impl.ThirdPackageImpl#getElements()
   * @generated
   */
  int ELEMENTS = 25;

  /**
   * The number of structural features of the '<em>Elements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENTS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link third.impl.EventsImpl <em>Events</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see third.impl.EventsImpl
   * @see third.impl.ThirdPackageImpl#getEvents()
   * @generated
   */
  int EVENTS = 1;

  /**
   * The number of structural features of the '<em>Events</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENTS_FEATURE_COUNT = ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link third.impl.TaskImpl <em>Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see third.impl.TaskImpl
   * @see third.impl.ThirdPackageImpl#getTask()
   * @generated
   */
  int TASK = 2;

  /**
   * The feature id for the '<em><b>Valuesin</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__VALUESIN = ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>EReference0</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__EREFERENCE0 = ELEMENTS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Valuesout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK__VALUESOUT = ELEMENTS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_FEATURE_COUNT = ELEMENTS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link third.impl.FlowImpl <em>Flow</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see third.impl.FlowImpl
   * @see third.impl.ThirdPackageImpl#getFlow()
   * @generated
   */
  int FLOW = 3;

  /**
   * The number of structural features of the '<em>Flow</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link third.impl.NodesImpl <em>Nodes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see third.impl.NodesImpl
   * @see third.impl.ThirdPackageImpl#getNodes()
   * @generated
   */
  int NODES = 24;

  /**
   * The number of structural features of the '<em>Nodes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODES_FEATURE_COUNT = ELEMENTS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link third.impl.StartImpl <em>Start</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see third.impl.StartImpl
   * @see third.impl.ThirdPackageImpl#getStart()
   * @generated
   */
  int START = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START__NAME = NODES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Start</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_FEATURE_COUNT = NODES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link third.impl.EndImpl <em>End</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see third.impl.EndImpl
   * @see third.impl.ThirdPackageImpl#getEnd()
   * @generated
   */
  int END = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int END__NAME = NODES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>End</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int END_FEATURE_COUNT = NODES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link third.impl.MessageImpl <em>Message</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see third.impl.MessageImpl
   * @see third.impl.ThirdPackageImpl#getMessage()
   * @generated
   */
  int MESSAGE = 6;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE__MESSAGE = EVENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE__DEFAULT = EVENTS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_FEATURE_COUNT = EVENTS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link third.impl.NormalImpl <em>Normal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see third.impl.NormalImpl
   * @see third.impl.ThirdPackageImpl#getNormal()
   * @generated
   */
  int NORMAL = 7;

  /**
   * The feature id for the '<em><b>Valuesin</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL__VALUESIN = TASK__VALUESIN;

  /**
   * The feature id for the '<em><b>EReference0</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL__EREFERENCE0 = TASK__EREFERENCE0;

  /**
   * The feature id for the '<em><b>Valuesout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL__VALUESOUT = TASK__VALUESOUT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL__NAME = TASK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Normal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link third.impl.ExtendedImpl <em>Extended</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see third.impl.ExtendedImpl
   * @see third.impl.ThirdPackageImpl#getExtended()
   * @generated
   */
  int EXTENDED = 8;

  /**
   * The feature id for the '<em><b>Valuesin</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDED__VALUESIN = TASK__VALUESIN;

  /**
   * The feature id for the '<em><b>EReference0</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDED__EREFERENCE0 = TASK__EREFERENCE0;

  /**
   * The feature id for the '<em><b>Valuesout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDED__VALUESOUT = TASK__VALUESOUT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDED__NAME = TASK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Owns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDED__OWNS = TASK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Extended</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDED_FEATURE_COUNT = TASK_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link third.impl.NormalFImpl <em>Normal F</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see third.impl.NormalFImpl
   * @see third.impl.ThirdPackageImpl#getNormalF()
   * @generated
   */
  int NORMAL_F = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_F__NAME = FLOW_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_F__FROM = FLOW_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_F__TO = FLOW_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Normal F</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NORMAL_F_FEATURE_COUNT = FLOW_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link third.impl.ConditionalImpl <em>Conditional</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see third.impl.ConditionalImpl
   * @see third.impl.ThirdPackageImpl#getConditional()
   * @generated
   */
  int CONDITIONAL = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__NAME = FLOW_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Conditional</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_FEATURE_COUNT = FLOW_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link third.impl.ValuesImpl <em>Values</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see third.impl.ValuesImpl
   * @see third.impl.ThirdPackageImpl#getValues()
   * @generated
   */
  int VALUES = 11;

  /**
   * The number of structural features of the '<em>Values</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUES_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link third.impl.InputImpl <em>Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see third.impl.InputImpl
   * @see third.impl.ThirdPackageImpl#getInput()
   * @generated
   */
  int INPUT = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT__NAME = VALUES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_FEATURE_COUNT = VALUES_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link third.impl.OutputImpl <em>Output</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see third.impl.OutputImpl
   * @see third.impl.ThirdPackageImpl#getOutput()
   * @generated
   */
  int OUTPUT = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT__NAME = VALUES_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Output</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_FEATURE_COUNT = VALUES_FEATURE_COUNT + 1;


  /**
   * The meta object id for the '{@link third.impl.ConditionalINImpl <em>Conditional IN</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see third.impl.ConditionalINImpl
   * @see third.impl.ThirdPackageImpl#getConditionalIN()
   * @generated
   */
  int CONDITIONAL_IN = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_IN__NAME = CONDITIONAL__NAME;

  /**
   * The feature id for the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_IN__TO = CONDITIONAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_IN__FROM = CONDITIONAL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Cond</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_IN__COND = CONDITIONAL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Conditional IN</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_IN_FEATURE_COUNT = CONDITIONAL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link third.impl.ConditionalINOUTImpl <em>Conditional INOUT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see third.impl.ConditionalINOUTImpl
   * @see third.impl.ThirdPackageImpl#getConditionalINOUT()
   * @generated
   */
  int CONDITIONAL_INOUT = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_INOUT__NAME = CONDITIONAL__NAME;

  /**
   * The feature id for the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_INOUT__TO = CONDITIONAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_INOUT__FROM = CONDITIONAL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Cond</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_INOUT__COND = CONDITIONAL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Conditional INOUT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_INOUT_FEATURE_COUNT = CONDITIONAL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link third.impl.IntervalImpl <em>Interval</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see third.impl.IntervalImpl
   * @see third.impl.ThirdPackageImpl#getInterval()
   * @generated
   */
  int INTERVAL = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL__NAME = EVENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL__VALUE = EVENTS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL__TIME = EVENTS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Interval</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERVAL_FEATURE_COUNT = EVENTS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link third.impl.DateImpl <em>Date</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see third.impl.DateImpl
   * @see third.impl.ThirdPackageImpl#getDate()
   * @generated
   */
  int DATE = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE__NAME = EVENTS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Date</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_FEATURE_COUNT = EVENTS_FEATURE_COUNT + 1;


  /**
   * The meta object id for the '{@link third.impl.ParametersImpl <em>Parameters</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see third.impl.ParametersImpl
   * @see third.impl.ThirdPackageImpl#getParameters()
   * @generated
   */
  int PARAMETERS = 18;

  /**
   * The number of structural features of the '<em>Parameters</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link third.impl.DescripcionImpl <em>Descripcion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see third.impl.DescripcionImpl
   * @see third.impl.ThirdPackageImpl#getDescripcion()
   * @generated
   */
  int DESCRIPCION = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPCION__NAME = PARAMETERS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Descripcion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPCION_FEATURE_COUNT = PARAMETERS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link third.impl.ParticipantETSKImpl <em>Participant ETSK</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see third.impl.ParticipantETSKImpl
   * @see third.impl.ThirdPackageImpl#getParticipantETSK()
   * @generated
   */
  int PARTICIPANT_ETSK = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT_ETSK__NAME = PARAMETERS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Participant ETSK</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT_ETSK_FEATURE_COUNT = PARAMETERS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link third.impl.datainETSKImpl <em>datain ETSK</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see third.impl.datainETSKImpl
   * @see third.impl.ThirdPackageImpl#getdatainETSK()
   * @generated
   */
  int DATAIN_ETSK = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATAIN_ETSK__NAME = PARAMETERS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>datain ETSK</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATAIN_ETSK_FEATURE_COUNT = PARAMETERS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link third.impl.dataoutETSKImpl <em>dataout ETSK</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see third.impl.dataoutETSKImpl
   * @see third.impl.ThirdPackageImpl#getdataoutETSK()
   * @generated
   */
  int DATAOUT_ETSK = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATAOUT_ETSK__NAME = PARAMETERS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>dataout ETSK</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATAOUT_ETSK_FEATURE_COUNT = PARAMETERS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link third.impl.DateETSKImpl <em>Date ETSK</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see third.impl.DateETSKImpl
   * @see third.impl.ThirdPackageImpl#getDateETSK()
   * @generated
   */
  int DATE_ETSK = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_ETSK__NAME = PARAMETERS_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Date ETSK</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_ETSK_FEATURE_COUNT = PARAMETERS_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link third.TimeSelection <em>Time Selection</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see third.TimeSelection
   * @see third.impl.ThirdPackageImpl#getTimeSelection()
   * @generated
   */
  int TIME_SELECTION = 26;


  /**
   * Returns the meta object for class '{@link third.SimpleBPMN <em>Simple BPMN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple BPMN</em>'.
   * @see third.SimpleBPMN
   * @generated
   */
  EClass getSimpleBPMN();

  /**
   * Returns the meta object for the containment reference list '{@link third.SimpleBPMN#getOwnedEvents <em>Owned Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Events</em>'.
   * @see third.SimpleBPMN#getOwnedEvents()
   * @see #getSimpleBPMN()
   * @generated
   */
  EReference getSimpleBPMN_OwnedEvents();

  /**
   * Returns the meta object for the containment reference list '{@link third.SimpleBPMN#getOwnedTasks <em>Owned Tasks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Tasks</em>'.
   * @see third.SimpleBPMN#getOwnedTasks()
   * @see #getSimpleBPMN()
   * @generated
   */
  EReference getSimpleBPMN_OwnedTasks();

  /**
   * Returns the meta object for the containment reference list '{@link third.SimpleBPMN#getOwnedFlows <em>Owned Flows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Flows</em>'.
   * @see third.SimpleBPMN#getOwnedFlows()
   * @see #getSimpleBPMN()
   * @generated
   */
  EReference getSimpleBPMN_OwnedFlows();

  /**
   * Returns the meta object for the containment reference '{@link third.SimpleBPMN#getStartNodes <em>Start Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Start Nodes</em>'.
   * @see third.SimpleBPMN#getStartNodes()
   * @see #getSimpleBPMN()
   * @generated
   */
  EReference getSimpleBPMN_StartNodes();

  /**
   * Returns the meta object for the containment reference '{@link third.SimpleBPMN#getEndNodes <em>End Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End Nodes</em>'.
   * @see third.SimpleBPMN#getEndNodes()
   * @see #getSimpleBPMN()
   * @generated
   */
  EReference getSimpleBPMN_EndNodes();

  /**
   * Returns the meta object for class '{@link third.Events <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Events</em>'.
   * @see third.Events
   * @generated
   */
  EClass getEvents();

  /**
   * Returns the meta object for class '{@link third.Task <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task</em>'.
   * @see third.Task
   * @generated
   */
  EClass getTask();

  /**
   * Returns the meta object for the containment reference '{@link third.Task#getValuesin <em>Valuesin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Valuesin</em>'.
   * @see third.Task#getValuesin()
   * @see #getTask()
   * @generated
   */
  EReference getTask_Valuesin();

  /**
   * Returns the meta object for the reference '{@link third.Task#getEReference0 <em>EReference0</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>EReference0</em>'.
   * @see third.Task#getEReference0()
   * @see #getTask()
   * @generated
   */
  EReference getTask_EReference0();

  /**
   * Returns the meta object for the containment reference '{@link third.Task#getValuesout <em>Valuesout</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Valuesout</em>'.
   * @see third.Task#getValuesout()
   * @see #getTask()
   * @generated
   */
  EReference getTask_Valuesout();

  /**
   * Returns the meta object for class '{@link third.Flow <em>Flow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flow</em>'.
   * @see third.Flow
   * @generated
   */
  EClass getFlow();

  /**
   * Returns the meta object for class '{@link third.Start <em>Start</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Start</em>'.
   * @see third.Start
   * @generated
   */
  EClass getStart();

  /**
   * Returns the meta object for the attribute '{@link third.Start#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see third.Start#getName()
   * @see #getStart()
   * @generated
   */
  EAttribute getStart_Name();

  /**
   * Returns the meta object for class '{@link third.End <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>End</em>'.
   * @see third.End
   * @generated
   */
  EClass getEnd();

  /**
   * Returns the meta object for the attribute '{@link third.End#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see third.End#getName()
   * @see #getEnd()
   * @generated
   */
  EAttribute getEnd_Name();

  /**
   * Returns the meta object for class '{@link third.Message <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message</em>'.
   * @see third.Message
   * @generated
   */
  EClass getMessage();

  /**
   * Returns the meta object for the attribute '{@link third.Message#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Message</em>'.
   * @see third.Message#getMessage()
   * @see #getMessage()
   * @generated
   */
  EAttribute getMessage_Message();

  /**
   * Returns the meta object for the attribute '{@link third.Message#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default</em>'.
   * @see third.Message#getDefault()
   * @see #getMessage()
   * @generated
   */
  EAttribute getMessage_Default();

  /**
   * Returns the meta object for class '{@link third.Normal <em>Normal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Normal</em>'.
   * @see third.Normal
   * @generated
   */
  EClass getNormal();

  /**
   * Returns the meta object for the attribute '{@link third.Normal#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see third.Normal#getName()
   * @see #getNormal()
   * @generated
   */
  EAttribute getNormal_Name();

  /**
   * Returns the meta object for class '{@link third.Extended <em>Extended</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extended</em>'.
   * @see third.Extended
   * @generated
   */
  EClass getExtended();

  /**
   * Returns the meta object for the attribute '{@link third.Extended#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see third.Extended#getName()
   * @see #getExtended()
   * @generated
   */
  EAttribute getExtended_Name();

  /**
   * Returns the meta object for the containment reference list '{@link third.Extended#getOwns <em>Owns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owns</em>'.
   * @see third.Extended#getOwns()
   * @see #getExtended()
   * @generated
   */
  EReference getExtended_Owns();

  /**
   * Returns the meta object for class '{@link third.NormalF <em>Normal F</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Normal F</em>'.
   * @see third.NormalF
   * @generated
   */
  EClass getNormalF();

  /**
   * Returns the meta object for the attribute '{@link third.NormalF#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see third.NormalF#getName()
   * @see #getNormalF()
   * @generated
   */
  EAttribute getNormalF_Name();

  /**
   * Returns the meta object for the reference '{@link third.NormalF#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From</em>'.
   * @see third.NormalF#getFrom()
   * @see #getNormalF()
   * @generated
   */
  EReference getNormalF_From();

  /**
   * Returns the meta object for the reference '{@link third.NormalF#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To</em>'.
   * @see third.NormalF#getTo()
   * @see #getNormalF()
   * @generated
   */
  EReference getNormalF_To();

  /**
   * Returns the meta object for class '{@link third.Conditional <em>Conditional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional</em>'.
   * @see third.Conditional
   * @generated
   */
  EClass getConditional();

  /**
   * Returns the meta object for the attribute '{@link third.Conditional#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see third.Conditional#getName()
   * @see #getConditional()
   * @generated
   */
  EAttribute getConditional_Name();

  /**
   * Returns the meta object for class '{@link third.Values <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Values</em>'.
   * @see third.Values
   * @generated
   */
  EClass getValues();

  /**
   * Returns the meta object for class '{@link third.Input <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input</em>'.
   * @see third.Input
   * @generated
   */
  EClass getInput();

  /**
   * Returns the meta object for the attribute '{@link third.Input#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see third.Input#getName()
   * @see #getInput()
   * @generated
   */
  EAttribute getInput_Name();

  /**
   * Returns the meta object for class '{@link third.Output <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output</em>'.
   * @see third.Output
   * @generated
   */
  EClass getOutput();

  /**
   * Returns the meta object for the attribute '{@link third.Output#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see third.Output#getName()
   * @see #getOutput()
   * @generated
   */
  EAttribute getOutput_Name();

  /**
   * Returns the meta object for class '{@link third.ConditionalIN <em>Conditional IN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional IN</em>'.
   * @see third.ConditionalIN
   * @generated
   */
  EClass getConditionalIN();

  /**
   * Returns the meta object for the reference '{@link third.ConditionalIN#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From</em>'.
   * @see third.ConditionalIN#getFrom()
   * @see #getConditionalIN()
   * @generated
   */
  EReference getConditionalIN_From();

  /**
   * Returns the meta object for the attribute '{@link third.ConditionalIN#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cond</em>'.
   * @see third.ConditionalIN#getCond()
   * @see #getConditionalIN()
   * @generated
   */
  EAttribute getConditionalIN_Cond();

  /**
   * Returns the meta object for the reference '{@link third.ConditionalIN#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To</em>'.
   * @see third.ConditionalIN#getTo()
   * @see #getConditionalIN()
   * @generated
   */
  EReference getConditionalIN_To();

  /**
   * Returns the meta object for class '{@link third.ConditionalINOUT <em>Conditional INOUT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional INOUT</em>'.
   * @see third.ConditionalINOUT
   * @generated
   */
  EClass getConditionalINOUT();

  /**
   * Returns the meta object for the reference '{@link third.ConditionalINOUT#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From</em>'.
   * @see third.ConditionalINOUT#getFrom()
   * @see #getConditionalINOUT()
   * @generated
   */
  EReference getConditionalINOUT_From();

  /**
   * Returns the meta object for the attribute '{@link third.ConditionalINOUT#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cond</em>'.
   * @see third.ConditionalINOUT#getCond()
   * @see #getConditionalINOUT()
   * @generated
   */
  EAttribute getConditionalINOUT_Cond();

  /**
   * Returns the meta object for the reference '{@link third.ConditionalINOUT#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To</em>'.
   * @see third.ConditionalINOUT#getTo()
   * @see #getConditionalINOUT()
   * @generated
   */
  EReference getConditionalINOUT_To();

  /**
   * Returns the meta object for class '{@link third.Interval <em>Interval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interval</em>'.
   * @see third.Interval
   * @generated
   */
  EClass getInterval();

  /**
   * Returns the meta object for the attribute '{@link third.Interval#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see third.Interval#getName()
   * @see #getInterval()
   * @generated
   */
  EAttribute getInterval_Name();

  /**
   * Returns the meta object for the attribute '{@link third.Interval#getTime <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Time</em>'.
   * @see third.Interval#getTime()
   * @see #getInterval()
   * @generated
   */
  EAttribute getInterval_Time();

  /**
   * Returns the meta object for the attribute '{@link third.Interval#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see third.Interval#getValue()
   * @see #getInterval()
   * @generated
   */
  EAttribute getInterval_Value();

  /**
   * Returns the meta object for class '{@link third.Date <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Date</em>'.
   * @see third.Date
   * @generated
   */
  EClass getDate();

  /**
   * Returns the meta object for the attribute '{@link third.Date#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see third.Date#getName()
   * @see #getDate()
   * @generated
   */
  EAttribute getDate_Name();

  /**
   * Returns the meta object for class '{@link third.Parameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameters</em>'.
   * @see third.Parameters
   * @generated
   */
  EClass getParameters();

  /**
   * Returns the meta object for class '{@link third.Descripcion <em>Descripcion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Descripcion</em>'.
   * @see third.Descripcion
   * @generated
   */
  EClass getDescripcion();

  /**
   * Returns the meta object for the attribute '{@link third.Descripcion#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see third.Descripcion#getName()
   * @see #getDescripcion()
   * @generated
   */
  EAttribute getDescripcion_Name();

  /**
   * Returns the meta object for class '{@link third.ParticipantETSK <em>Participant ETSK</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Participant ETSK</em>'.
   * @see third.ParticipantETSK
   * @generated
   */
  EClass getParticipantETSK();

  /**
   * Returns the meta object for the attribute '{@link third.ParticipantETSK#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see third.ParticipantETSK#getName()
   * @see #getParticipantETSK()
   * @generated
   */
  EAttribute getParticipantETSK_Name();

  /**
   * Returns the meta object for class '{@link third.datainETSK <em>datain ETSK</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>datain ETSK</em>'.
   * @see third.datainETSK
   * @generated
   */
  EClass getdatainETSK();

  /**
   * Returns the meta object for the attribute '{@link third.datainETSK#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see third.datainETSK#getName()
   * @see #getdatainETSK()
   * @generated
   */
  EAttribute getdatainETSK_Name();

  /**
   * Returns the meta object for class '{@link third.dataoutETSK <em>dataout ETSK</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>dataout ETSK</em>'.
   * @see third.dataoutETSK
   * @generated
   */
  EClass getdataoutETSK();

  /**
   * Returns the meta object for the attribute '{@link third.dataoutETSK#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see third.dataoutETSK#getName()
   * @see #getdataoutETSK()
   * @generated
   */
  EAttribute getdataoutETSK_Name();

  /**
   * Returns the meta object for class '{@link third.DateETSK <em>Date ETSK</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Date ETSK</em>'.
   * @see third.DateETSK
   * @generated
   */
  EClass getDateETSK();

  /**
   * Returns the meta object for the attribute '{@link third.DateETSK#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see third.DateETSK#getName()
   * @see #getDateETSK()
   * @generated
   */
  EAttribute getDateETSK_Name();

  /**
   * Returns the meta object for class '{@link third.Nodes <em>Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nodes</em>'.
   * @see third.Nodes
   * @generated
   */
  EClass getNodes();

  /**
   * Returns the meta object for class '{@link third.Elements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Elements</em>'.
   * @see third.Elements
   * @generated
   */
  EClass getElements();

  /**
   * Returns the meta object for enum '{@link third.TimeSelection <em>Time Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Time Selection</em>'.
   * @see third.TimeSelection
   * @generated
   */
  EEnum getTimeSelection();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ThirdFactory getThirdFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link third.impl.SimpleBPMNImpl <em>Simple BPMN</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see third.impl.SimpleBPMNImpl
     * @see third.impl.ThirdPackageImpl#getSimpleBPMN()
     * @generated
     */
    EClass SIMPLE_BPMN = eINSTANCE.getSimpleBPMN();

    /**
     * The meta object literal for the '<em><b>Owned Events</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_BPMN__OWNED_EVENTS = eINSTANCE.getSimpleBPMN_OwnedEvents();

    /**
     * The meta object literal for the '<em><b>Owned Tasks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_BPMN__OWNED_TASKS = eINSTANCE.getSimpleBPMN_OwnedTasks();

    /**
     * The meta object literal for the '<em><b>Owned Flows</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_BPMN__OWNED_FLOWS = eINSTANCE.getSimpleBPMN_OwnedFlows();

    /**
     * The meta object literal for the '<em><b>Start Nodes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_BPMN__START_NODES = eINSTANCE.getSimpleBPMN_StartNodes();

    /**
     * The meta object literal for the '<em><b>End Nodes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_BPMN__END_NODES = eINSTANCE.getSimpleBPMN_EndNodes();

    /**
     * The meta object literal for the '{@link third.impl.EventsImpl <em>Events</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see third.impl.EventsImpl
     * @see third.impl.ThirdPackageImpl#getEvents()
     * @generated
     */
    EClass EVENTS = eINSTANCE.getEvents();

    /**
     * The meta object literal for the '{@link third.impl.TaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see third.impl.TaskImpl
     * @see third.impl.ThirdPackageImpl#getTask()
     * @generated
     */
    EClass TASK = eINSTANCE.getTask();

    /**
     * The meta object literal for the '<em><b>Valuesin</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__VALUESIN = eINSTANCE.getTask_Valuesin();

    /**
     * The meta object literal for the '<em><b>EReference0</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__EREFERENCE0 = eINSTANCE.getTask_EReference0();

    /**
     * The meta object literal for the '<em><b>Valuesout</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TASK__VALUESOUT = eINSTANCE.getTask_Valuesout();

    /**
     * The meta object literal for the '{@link third.impl.FlowImpl <em>Flow</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see third.impl.FlowImpl
     * @see third.impl.ThirdPackageImpl#getFlow()
     * @generated
     */
    EClass FLOW = eINSTANCE.getFlow();

    /**
     * The meta object literal for the '{@link third.impl.StartImpl <em>Start</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see third.impl.StartImpl
     * @see third.impl.ThirdPackageImpl#getStart()
     * @generated
     */
    EClass START = eINSTANCE.getStart();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute START__NAME = eINSTANCE.getStart_Name();

    /**
     * The meta object literal for the '{@link third.impl.EndImpl <em>End</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see third.impl.EndImpl
     * @see third.impl.ThirdPackageImpl#getEnd()
     * @generated
     */
    EClass END = eINSTANCE.getEnd();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute END__NAME = eINSTANCE.getEnd_Name();

    /**
     * The meta object literal for the '{@link third.impl.MessageImpl <em>Message</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see third.impl.MessageImpl
     * @see third.impl.ThirdPackageImpl#getMessage()
     * @generated
     */
    EClass MESSAGE = eINSTANCE.getMessage();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MESSAGE__MESSAGE = eINSTANCE.getMessage_Message();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MESSAGE__DEFAULT = eINSTANCE.getMessage_Default();

    /**
     * The meta object literal for the '{@link third.impl.NormalImpl <em>Normal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see third.impl.NormalImpl
     * @see third.impl.ThirdPackageImpl#getNormal()
     * @generated
     */
    EClass NORMAL = eINSTANCE.getNormal();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NORMAL__NAME = eINSTANCE.getNormal_Name();

    /**
     * The meta object literal for the '{@link third.impl.ExtendedImpl <em>Extended</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see third.impl.ExtendedImpl
     * @see third.impl.ThirdPackageImpl#getExtended()
     * @generated
     */
    EClass EXTENDED = eINSTANCE.getExtended();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTENDED__NAME = eINSTANCE.getExtended_Name();

    /**
     * The meta object literal for the '<em><b>Owns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTENDED__OWNS = eINSTANCE.getExtended_Owns();

    /**
     * The meta object literal for the '{@link third.impl.NormalFImpl <em>Normal F</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see third.impl.NormalFImpl
     * @see third.impl.ThirdPackageImpl#getNormalF()
     * @generated
     */
    EClass NORMAL_F = eINSTANCE.getNormalF();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NORMAL_F__NAME = eINSTANCE.getNormalF_Name();

    /**
     * The meta object literal for the '<em><b>From</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NORMAL_F__FROM = eINSTANCE.getNormalF_From();

    /**
     * The meta object literal for the '<em><b>To</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NORMAL_F__TO = eINSTANCE.getNormalF_To();

    /**
     * The meta object literal for the '{@link third.impl.ConditionalImpl <em>Conditional</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see third.impl.ConditionalImpl
     * @see third.impl.ThirdPackageImpl#getConditional()
     * @generated
     */
    EClass CONDITIONAL = eINSTANCE.getConditional();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITIONAL__NAME = eINSTANCE.getConditional_Name();

    /**
     * The meta object literal for the '{@link third.impl.ValuesImpl <em>Values</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see third.impl.ValuesImpl
     * @see third.impl.ThirdPackageImpl#getValues()
     * @generated
     */
    EClass VALUES = eINSTANCE.getValues();

    /**
     * The meta object literal for the '{@link third.impl.InputImpl <em>Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see third.impl.InputImpl
     * @see third.impl.ThirdPackageImpl#getInput()
     * @generated
     */
    EClass INPUT = eINSTANCE.getInput();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT__NAME = eINSTANCE.getInput_Name();

    /**
     * The meta object literal for the '{@link third.impl.OutputImpl <em>Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see third.impl.OutputImpl
     * @see third.impl.ThirdPackageImpl#getOutput()
     * @generated
     */
    EClass OUTPUT = eINSTANCE.getOutput();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT__NAME = eINSTANCE.getOutput_Name();

    /**
     * The meta object literal for the '{@link third.impl.ConditionalINImpl <em>Conditional IN</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see third.impl.ConditionalINImpl
     * @see third.impl.ThirdPackageImpl#getConditionalIN()
     * @generated
     */
    EClass CONDITIONAL_IN = eINSTANCE.getConditionalIN();

    /**
     * The meta object literal for the '<em><b>From</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_IN__FROM = eINSTANCE.getConditionalIN_From();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITIONAL_IN__COND = eINSTANCE.getConditionalIN_Cond();

    /**
     * The meta object literal for the '<em><b>To</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_IN__TO = eINSTANCE.getConditionalIN_To();

    /**
     * The meta object literal for the '{@link third.impl.ConditionalINOUTImpl <em>Conditional INOUT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see third.impl.ConditionalINOUTImpl
     * @see third.impl.ThirdPackageImpl#getConditionalINOUT()
     * @generated
     */
    EClass CONDITIONAL_INOUT = eINSTANCE.getConditionalINOUT();

    /**
     * The meta object literal for the '<em><b>From</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_INOUT__FROM = eINSTANCE.getConditionalINOUT_From();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITIONAL_INOUT__COND = eINSTANCE.getConditionalINOUT_Cond();

    /**
     * The meta object literal for the '<em><b>To</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_INOUT__TO = eINSTANCE.getConditionalINOUT_To();

    /**
     * The meta object literal for the '{@link third.impl.IntervalImpl <em>Interval</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see third.impl.IntervalImpl
     * @see third.impl.ThirdPackageImpl#getInterval()
     * @generated
     */
    EClass INTERVAL = eINSTANCE.getInterval();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERVAL__NAME = eINSTANCE.getInterval_Name();

    /**
     * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERVAL__TIME = eINSTANCE.getInterval_Time();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERVAL__VALUE = eINSTANCE.getInterval_Value();

    /**
     * The meta object literal for the '{@link third.impl.DateImpl <em>Date</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see third.impl.DateImpl
     * @see third.impl.ThirdPackageImpl#getDate()
     * @generated
     */
    EClass DATE = eINSTANCE.getDate();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATE__NAME = eINSTANCE.getDate_Name();

    /**
     * The meta object literal for the '{@link third.impl.ParametersImpl <em>Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see third.impl.ParametersImpl
     * @see third.impl.ThirdPackageImpl#getParameters()
     * @generated
     */
    EClass PARAMETERS = eINSTANCE.getParameters();

    /**
     * The meta object literal for the '{@link third.impl.DescripcionImpl <em>Descripcion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see third.impl.DescripcionImpl
     * @see third.impl.ThirdPackageImpl#getDescripcion()
     * @generated
     */
    EClass DESCRIPCION = eINSTANCE.getDescripcion();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESCRIPCION__NAME = eINSTANCE.getDescripcion_Name();

    /**
     * The meta object literal for the '{@link third.impl.ParticipantETSKImpl <em>Participant ETSK</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see third.impl.ParticipantETSKImpl
     * @see third.impl.ThirdPackageImpl#getParticipantETSK()
     * @generated
     */
    EClass PARTICIPANT_ETSK = eINSTANCE.getParticipantETSK();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARTICIPANT_ETSK__NAME = eINSTANCE.getParticipantETSK_Name();

    /**
     * The meta object literal for the '{@link third.impl.datainETSKImpl <em>datain ETSK</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see third.impl.datainETSKImpl
     * @see third.impl.ThirdPackageImpl#getdatainETSK()
     * @generated
     */
    EClass DATAIN_ETSK = eINSTANCE.getdatainETSK();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATAIN_ETSK__NAME = eINSTANCE.getdatainETSK_Name();

    /**
     * The meta object literal for the '{@link third.impl.dataoutETSKImpl <em>dataout ETSK</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see third.impl.dataoutETSKImpl
     * @see third.impl.ThirdPackageImpl#getdataoutETSK()
     * @generated
     */
    EClass DATAOUT_ETSK = eINSTANCE.getdataoutETSK();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATAOUT_ETSK__NAME = eINSTANCE.getdataoutETSK_Name();

    /**
     * The meta object literal for the '{@link third.impl.DateETSKImpl <em>Date ETSK</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see third.impl.DateETSKImpl
     * @see third.impl.ThirdPackageImpl#getDateETSK()
     * @generated
     */
    EClass DATE_ETSK = eINSTANCE.getDateETSK();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATE_ETSK__NAME = eINSTANCE.getDateETSK_Name();

    /**
     * The meta object literal for the '{@link third.impl.NodesImpl <em>Nodes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see third.impl.NodesImpl
     * @see third.impl.ThirdPackageImpl#getNodes()
     * @generated
     */
    EClass NODES = eINSTANCE.getNodes();

    /**
     * The meta object literal for the '{@link third.impl.ElementsImpl <em>Elements</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see third.impl.ElementsImpl
     * @see third.impl.ThirdPackageImpl#getElements()
     * @generated
     */
    EClass ELEMENTS = eINSTANCE.getElements();

    /**
     * The meta object literal for the '{@link third.TimeSelection <em>Time Selection</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see third.TimeSelection
     * @see third.impl.ThirdPackageImpl#getTimeSelection()
     * @generated
     */
    EEnum TIME_SELECTION = eINSTANCE.getTimeSelection();

  }

} //ThirdPackage

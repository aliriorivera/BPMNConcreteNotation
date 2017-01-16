/**
 */
package third.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import third.Conditional;
import third.ConditionalIN;
import third.ConditionalINOUT;
import third.Date;
import third.DateETSK;
import third.Descripcion;
import third.Elements;
import third.Element;
import third.End;
import third.Events;
import third.Extended;
import third.Flow;
import third.Input;
import third.Interval;
import third.Message;
import third.Nodes;
import third.Normal;
import third.NormalF;
import third.Output;
import third.Parameters;
import third.ParticipantETSK;
import third.Participant;
import third.SimpleBPMN;
import third.Start;
import third.Task;
import third.ThirdFactory;
import third.ThirdPackage;
import third.TimeSelection;
import third.Values;
import third.datainETSK;
import third.dataoutETSK;
import third.util.ThirdValidator;
import third.datain;
import third.dataout;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ThirdPackageImpl extends EPackageImpl implements ThirdPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleBPMNEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass flowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass startEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass endEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass messageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass normalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass extendedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass normalFEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valuesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionalINEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionalINOUTEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intervalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parametersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass descripcionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass participantETSKEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass datainETSKEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataoutETSKEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dateETSKEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum timeSelectionEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see third.ThirdPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ThirdPackageImpl()
  {
    super(eNS_URI, ThirdFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ThirdPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ThirdPackage init()
  {
    if (isInited) return (ThirdPackage)EPackage.Registry.INSTANCE.getEPackage(ThirdPackage.eNS_URI);

    // Obtain or create and register package
    ThirdPackageImpl theThirdPackage = (ThirdPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ThirdPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ThirdPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theThirdPackage.createPackageContents();

    // Initialize created meta-data
    theThirdPackage.initializePackageContents();

    // Register package validator
    EValidator.Registry.INSTANCE.put
      (theThirdPackage, 
       new EValidator.Descriptor()
       {
         public EValidator getEValidator()
         {
           return ThirdValidator.INSTANCE;
         }
       });

    // Mark meta-data to indicate it can't be changed
    theThirdPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ThirdPackage.eNS_URI, theThirdPackage);
    return theThirdPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleBPMN()
  {
    return simpleBPMNEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleBPMN_OwnedEvents()
  {
    return (EReference)simpleBPMNEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleBPMN_OwnedTasks()
  {
    return (EReference)simpleBPMNEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleBPMN_OwnedFlows()
  {
    return (EReference)simpleBPMNEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleBPMN_StartNodes()
  {
    return (EReference)simpleBPMNEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleBPMN_EndNodes()
  {
    return (EReference)simpleBPMNEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEvents()
  {
    return eventsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTask()
  {
    return taskEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTask_Valuesin()
  {
    return (EReference)taskEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTask_EReference0()
  {
    return (EReference)taskEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTask_Valuesout()
  {
    return (EReference)taskEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFlow()
  {
    return flowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStart()
  {
    return startEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStart_Name()
  {
    return (EAttribute)startEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnd()
  {
    return endEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnd_Name()
  {
    return (EAttribute)endEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMessage()
  {
    return messageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessage_Message()
  {
    return (EAttribute)messageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessage_Default()
  {
    return (EAttribute)messageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNormal()
  {
    return normalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNormal_Name()
  {
    return (EAttribute)normalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExtended()
  {
    return extendedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExtended_Name()
  {
    return (EAttribute)extendedEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtended_Owns()
  {
    return (EReference)extendedEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNormalF()
  {
    return normalFEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNormalF_Name()
  {
    return (EAttribute)normalFEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNormalF_From()
  {
    return (EReference)normalFEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNormalF_To()
  {
    return (EReference)normalFEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditional()
  {
    return conditionalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConditional_Name()
  {
    return (EAttribute)conditionalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValues()
  {
    return valuesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInput()
  {
    return inputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInput_Name()
  {
    return (EAttribute)inputEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutput()
  {
    return outputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutput_Name()
  {
    return (EAttribute)outputEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditionalIN()
  {
    return conditionalINEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionalIN_From()
  {
    return (EReference)conditionalINEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConditionalIN_Cond()
  {
    return (EAttribute)conditionalINEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionalIN_To()
  {
    return (EReference)conditionalINEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditionalINOUT()
  {
    return conditionalINOUTEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionalINOUT_From()
  {
    return (EReference)conditionalINOUTEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConditionalINOUT_Cond()
  {
    return (EAttribute)conditionalINOUTEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionalINOUT_To()
  {
    return (EReference)conditionalINOUTEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterval()
  {
    return intervalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterval_Name()
  {
    return (EAttribute)intervalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterval_Time()
  {
    return (EAttribute)intervalEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterval_Value()
  {
    return (EAttribute)intervalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDate()
  {
    return dateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDate_Name()
  {
    return (EAttribute)dateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameters()
  {
    return parametersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDescripcion()
  {
    return descripcionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDescripcion_Name()
  {
    return (EAttribute)descripcionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParticipantETSK()
  {
    return participantETSKEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParticipantETSK_Name()
  {
    return (EAttribute)participantETSKEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getdatainETSK()
  {
    return datainETSKEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getdatainETSK_Name()
  {
    return (EAttribute)datainETSKEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getdataoutETSK()
  {
    return dataoutETSKEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getdataoutETSK_Name()
  {
    return (EAttribute)dataoutETSKEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDateETSK()
  {
    return dateETSKEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDateETSK_Name()
  {
    return (EAttribute)dateETSKEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodes()
  {
    return nodesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElements()
  {
    return elementsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTimeSelection()
  {
    return timeSelectionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ThirdFactory getThirdFactory()
  {
    return (ThirdFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    simpleBPMNEClass = createEClass(SIMPLE_BPMN);
    createEReference(simpleBPMNEClass, SIMPLE_BPMN__OWNED_EVENTS);
    createEReference(simpleBPMNEClass, SIMPLE_BPMN__OWNED_TASKS);
    createEReference(simpleBPMNEClass, SIMPLE_BPMN__OWNED_FLOWS);
    createEReference(simpleBPMNEClass, SIMPLE_BPMN__START_NODES);
    createEReference(simpleBPMNEClass, SIMPLE_BPMN__END_NODES);

    eventsEClass = createEClass(EVENTS);

    taskEClass = createEClass(TASK);
    createEReference(taskEClass, TASK__VALUESIN);
    createEReference(taskEClass, TASK__EREFERENCE0);
    createEReference(taskEClass, TASK__VALUESOUT);

    flowEClass = createEClass(FLOW);

    startEClass = createEClass(START);
    createEAttribute(startEClass, START__NAME);

    endEClass = createEClass(END);
    createEAttribute(endEClass, END__NAME);

    messageEClass = createEClass(MESSAGE);
    createEAttribute(messageEClass, MESSAGE__MESSAGE);
    createEAttribute(messageEClass, MESSAGE__DEFAULT);

    normalEClass = createEClass(NORMAL);
    createEAttribute(normalEClass, NORMAL__NAME);

    extendedEClass = createEClass(EXTENDED);
    createEAttribute(extendedEClass, EXTENDED__NAME);
    createEReference(extendedEClass, EXTENDED__OWNS);

    normalFEClass = createEClass(NORMAL_F);
    createEAttribute(normalFEClass, NORMAL_F__NAME);
    createEReference(normalFEClass, NORMAL_F__FROM);
    createEReference(normalFEClass, NORMAL_F__TO);

    conditionalEClass = createEClass(CONDITIONAL);
    createEAttribute(conditionalEClass, CONDITIONAL__NAME);

    valuesEClass = createEClass(VALUES);

    inputEClass = createEClass(INPUT);
    createEAttribute(inputEClass, INPUT__NAME);

    outputEClass = createEClass(OUTPUT);
    createEAttribute(outputEClass, OUTPUT__NAME);

    conditionalINEClass = createEClass(CONDITIONAL_IN);
    createEReference(conditionalINEClass, CONDITIONAL_IN__TO);
    createEReference(conditionalINEClass, CONDITIONAL_IN__FROM);
    createEAttribute(conditionalINEClass, CONDITIONAL_IN__COND);

    conditionalINOUTEClass = createEClass(CONDITIONAL_INOUT);
    createEReference(conditionalINOUTEClass, CONDITIONAL_INOUT__TO);
    createEReference(conditionalINOUTEClass, CONDITIONAL_INOUT__FROM);
    createEAttribute(conditionalINOUTEClass, CONDITIONAL_INOUT__COND);

    intervalEClass = createEClass(INTERVAL);
    createEAttribute(intervalEClass, INTERVAL__NAME);
    createEAttribute(intervalEClass, INTERVAL__VALUE);
    createEAttribute(intervalEClass, INTERVAL__TIME);

    dateEClass = createEClass(DATE);
    createEAttribute(dateEClass, DATE__NAME);

    parametersEClass = createEClass(PARAMETERS);

    descripcionEClass = createEClass(DESCRIPCION);
    createEAttribute(descripcionEClass, DESCRIPCION__NAME);

    participantETSKEClass = createEClass(PARTICIPANT_ETSK);
    createEAttribute(participantETSKEClass, PARTICIPANT_ETSK__NAME);

    datainETSKEClass = createEClass(DATAIN_ETSK);
    createEAttribute(datainETSKEClass, DATAIN_ETSK__NAME);

    dataoutETSKEClass = createEClass(DATAOUT_ETSK);
    createEAttribute(dataoutETSKEClass, DATAOUT_ETSK__NAME);

    dateETSKEClass = createEClass(DATE_ETSK);
    createEAttribute(dateETSKEClass, DATE_ETSK__NAME);

    nodesEClass = createEClass(NODES);

    elementsEClass = createEClass(ELEMENTS);

    // Create enums
    timeSelectionEEnum = createEEnum(TIME_SELECTION);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    eventsEClass.getESuperTypes().add(this.getElements());
    taskEClass.getESuperTypes().add(this.getElements());
    startEClass.getESuperTypes().add(this.getNodes());
    endEClass.getESuperTypes().add(this.getNodes());
    messageEClass.getESuperTypes().add(this.getEvents());
    normalEClass.getESuperTypes().add(this.getTask());
    extendedEClass.getESuperTypes().add(this.getTask());
    normalFEClass.getESuperTypes().add(this.getFlow());
    conditionalEClass.getESuperTypes().add(this.getFlow());
    inputEClass.getESuperTypes().add(this.getValues());
    outputEClass.getESuperTypes().add(this.getValues());
    conditionalINEClass.getESuperTypes().add(this.getConditional());
    conditionalINOUTEClass.getESuperTypes().add(this.getConditional());
    intervalEClass.getESuperTypes().add(this.getEvents());
    dateEClass.getESuperTypes().add(this.getEvents());
    descripcionEClass.getESuperTypes().add(this.getParameters());
    participantETSKEClass.getESuperTypes().add(this.getParameters());
    datainETSKEClass.getESuperTypes().add(this.getParameters());
    dataoutETSKEClass.getESuperTypes().add(this.getParameters());
    dateETSKEClass.getESuperTypes().add(this.getParameters());
    nodesEClass.getESuperTypes().add(this.getElements());

    // Initialize classes and features; add operations and parameters
    initEClass(simpleBPMNEClass, SimpleBPMN.class, "SimpleBPMN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSimpleBPMN_OwnedEvents(), this.getEvents(), null, "OwnedEvents", null, 0, -1, SimpleBPMN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimpleBPMN_OwnedTasks(), this.getTask(), null, "OwnedTasks", null, 0, -1, SimpleBPMN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimpleBPMN_OwnedFlows(), this.getFlow(), null, "OwnedFlows", null, 0, -1, SimpleBPMN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimpleBPMN_StartNodes(), this.getStart(), null, "StartNodes", null, 1, 1, SimpleBPMN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimpleBPMN_EndNodes(), this.getEnd(), null, "EndNodes", null, 1, 1, SimpleBPMN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventsEClass, Events.class, "Events", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(taskEClass, Task.class, "Task", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTask_Valuesin(), this.getInput(), null, "valuesin", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTask_EReference0(), this.getParameters(), null, "EReference0", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTask_Valuesout(), this.getOutput(), null, "valuesout", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(flowEClass, Flow.class, "Flow", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(startEClass, Start.class, "Start", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStart_Name(), ecorePackage.getEString(), "name", null, 0, 1, Start.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(endEClass, End.class, "End", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnd_Name(), ecorePackage.getEString(), "name", null, 0, 1, End.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMessage_Message(), ecorePackage.getEString(), "message", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMessage_Default(), ecorePackage.getEString(), "Default", "Wait For", 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(normalEClass, Normal.class, "Normal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNormal_Name(), ecorePackage.getEString(), "name", "Task Description Here", 0, 1, Normal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(extendedEClass, Extended.class, "Extended", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExtended_Name(), ecorePackage.getEString(), "name", "Task Description Here", 0, 1, Extended.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExtended_Owns(), this.getParameters(), null, "owns", null, 0, -1, Extended.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(normalFEClass, NormalF.class, "NormalF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNormalF_Name(), ecorePackage.getEString(), "name", null, 0, 1, NormalF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNormalF_From(), this.getElements(), null, "from", null, 1, 1, NormalF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNormalF_To(), this.getElements(), null, "to", null, 1, 1, NormalF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionalEClass, Conditional.class, "Conditional", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConditional_Name(), ecorePackage.getEString(), "name", null, 0, 1, Conditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valuesEClass, Values.class, "Values", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInput_Name(), ecorePackage.getEString(), "name", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOutput_Name(), ecorePackage.getEString(), "name", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionalINEClass, ConditionalIN.class, "ConditionalIN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConditionalIN_To(), this.getTask(), null, "to", null, 0, 1, ConditionalIN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConditionalIN_From(), this.getOutput(), null, "from", null, 0, 1, ConditionalIN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConditionalIN_Cond(), ecorePackage.getEString(), "cond", null, 0, 1, ConditionalIN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conditionalINOUTEClass, ConditionalINOUT.class, "ConditionalINOUT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConditionalINOUT_To(), this.getInput(), null, "to", null, 0, 1, ConditionalINOUT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConditionalINOUT_From(), this.getOutput(), null, "from", null, 0, 1, ConditionalINOUT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConditionalINOUT_Cond(), ecorePackage.getEString(), "cond", null, 0, 1, ConditionalINOUT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intervalEClass, Interval.class, "Interval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInterval_Name(), ecorePackage.getEString(), "name", "Wait", 0, 1, Interval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInterval_Value(), ecorePackage.getEInt(), "Value", null, 0, 1, Interval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInterval_Time(), this.getTimeSelection(), "Time", null, 0, 1, Interval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dateEClass, Date.class, "Date", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDate_Name(), ecorePackage.getEString(), "name", "Date", 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parametersEClass, Parameters.class, "Parameters", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(descripcionEClass, Descripcion.class, "Descripcion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDescripcion_Name(), ecorePackage.getEString(), "name", null, 0, 1, Descripcion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(participantETSKEClass, ParticipantETSK.class, "ParticipantETSK", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParticipantETSK_Name(), ecorePackage.getEString(), "name", null, 0, 1, ParticipantETSK.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(datainETSKEClass, datainETSK.class, "datainETSK", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getdatainETSK_Name(), ecorePackage.getEString(), "name", null, 0, 1, datainETSK.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataoutETSKEClass, dataoutETSK.class, "dataoutETSK", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getdataoutETSK_Name(), ecorePackage.getEString(), "name", null, 0, 1, dataoutETSK.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dateETSKEClass, DateETSK.class, "DateETSK", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDateETSK_Name(), ecorePackage.getEString(), "name", null, 0, 1, DateETSK.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodesEClass, Nodes.class, "Nodes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(elementsEClass, Elements.class, "Elements", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Initialize enums and add enum literals
    initEEnum(timeSelectionEEnum, TimeSelection.class, "TimeSelection");
    addEEnumLiteral(timeSelectionEEnum, TimeSelection.SECONDS);
    addEEnumLiteral(timeSelectionEEnum, TimeSelection.MINUTES);
    addEEnumLiteral(timeSelectionEEnum, TimeSelection.HOURS);
    addEEnumLiteral(timeSelectionEEnum, TimeSelection.DAYS);
    addEEnumLiteral(timeSelectionEEnum, TimeSelection.YEARS);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http://www.eclipse.org/emf/2002/Ecore
    createEcoreAnnotations();
    // gmf.diagram
    createGmfAnnotations();
    // http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
    createPivotAnnotations();
    // gmf.affixed
    createGmf_1Annotations();
    // gmf.node
    createGmf_2Annotations();
    // gmf.compartment
    createGmf_3Annotations();
    // gmf.link
    createGmf_4Annotations();
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEcoreAnnotations()
  {
    String source = "http://www.eclipse.org/emf/2002/Ecore";		
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
       "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
       "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
       });		
    addAnnotation
      (simpleBPMNEClass, 
       source, 
       new String[] 
       {
       "constraints", "NumberOfStartNode NumberOfEndNode"
       });												
    addAnnotation
      (normalFEClass, 
       source, 
       new String[] 
       {
       "constraints", "NoLoopsFromNormalFlow"
       });						
    addAnnotation
      (conditionalINEClass, 
       source, 
       new String[] 
       {
       "constraints", "ConditionalINnorvoid"
       });				
    addAnnotation
      (conditionalINOUTEClass, 
       source, 
       new String[] 
       {
       "constraints", "ConditionalINOUTnorvoid"
       });				
    addAnnotation
      (intervalEClass, 
       source, 
       new String[] 
       {
       "constraints", "IntervalPositive"
       });					
    addAnnotation
      (descripcionEClass, 
       source, 
       new String[] 
       {
       "constraints", "PDescriptionNOTvoid"
       });				
    addAnnotation
      (participantETSKEClass, 
       source, 
       new String[] 
       {
       "constraints", "ParticipantETSKNOTvoid"
       });				
    addAnnotation
      (datainETSKEClass, 
       source, 
       new String[] 
       {
       "constraints", "DatainETSKNOTvoid"
       });				
    addAnnotation
      (dataoutETSKEClass, 
       source, 
       new String[] 
       {
       "constraints", "dataoutETSKNOTvoid"
       });				
    addAnnotation
      (dateETSKEClass, 
       source, 
       new String[] 
       {
       "constraints", "DateETSKNOTvoid"
       });		
  }

  /**
   * Initializes the annotations for <b>gmf.diagram</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmfAnnotations()
  {
    String source = "gmf.diagram";				
    addAnnotation
      (simpleBPMNEClass, 
       source, 
       new String[] 
       {
       "foo", "bar"
       });																																							
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createPivotAnnotations()
  {
    String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";					
    addAnnotation
      (simpleBPMNEClass, 
       source, 
       new String[] 
       {
       "NumberOfStartNode", "self.StartNodes->select(m : SimpleBPMN | m.oclIsTypeOf(Start))->size() < 2",
       "NumberOfEndNode", "self.EndNodes->select(m : SimpleBPMN | m.oclIsTypeOf(End))->size() < 2"
       });												
    addAnnotation
      (normalFEClass, 
       source, 
       new String[] 
       {
       "NoLoopsFromNormalFlow", "self.from <> self.to"
       });						
    addAnnotation
      (conditionalINEClass, 
       source, 
       new String[] 
       {
       "ConditionalINnorvoid", "self.cond.size() > 0"
       });				
    addAnnotation
      (conditionalINOUTEClass, 
       source, 
       new String[] 
       {
       "ConditionalINOUTnorvoid", "self.cond.size() > 0"
       });				
    addAnnotation
      (intervalEClass, 
       source, 
       new String[] 
       {
       "IntervalPositive", "self.name.size() >= 0"
       });					
    addAnnotation
      (descripcionEClass, 
       source, 
       new String[] 
       {
       "PDescriptionNOTvoid", "self.name.size() > 0"
       });				
    addAnnotation
      (participantETSKEClass, 
       source, 
       new String[] 
       {
       "ParticipantETSKNOTvoid", "self.name.size() > 0"
       });				
    addAnnotation
      (datainETSKEClass, 
       source, 
       new String[] 
       {
       "DatainETSKNOTvoid", "self.name.size() > 0"
       });				
    addAnnotation
      (dataoutETSKEClass, 
       source, 
       new String[] 
       {
       "dataoutETSKNOTvoid", "self.name.size() > 0"
       });				
    addAnnotation
      (dateETSKEClass, 
       source, 
       new String[] 
       {
       "DateETSKNOTvoid", "self.name.size() > 0"
       });
  }

  /**
   * Initializes the annotations for <b>gmf.affixed</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_1Annotations()
  {
    String source = "gmf.affixed";						
    addAnnotation
      (getTask_Valuesin(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });		
    addAnnotation
      (getTask_Valuesout(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });																																				
  }

  /**
   * Initializes the annotations for <b>gmf.node</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_2Annotations()
  {
    String source = "gmf.node";								
    addAnnotation
      (startEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "figure", "ellipse",
       "border.width", "2",
       "border.style", "solid",
       "label.placement", "external",
       "size", "40,40"
       });		
    addAnnotation
      (endEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "figure", "ellipse",
       "border.width", "2",
       "border.style", "solid",
       "color", "0,0,0",
       "label.placement", "external",
       "size", "40,40"
       });		
    addAnnotation
      (messageEClass, 
       source, 
       new String[] 
       {
       "label", "Default,message",
       "label.pattern", "{1} {0}",
       "figure", "ellipse",
       "border.width", "2",
       "border.style", "solid",
       "color", "0,0,255",
       "label.placement", "external",
       "size", "40,40"
       });		
    addAnnotation
      (normalEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "figure", "rectangle",
       "label.placement", "internal",
       "size", "110,70"
       });		
    addAnnotation
      (extendedEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "figure", "rectangle",
       "label.placement", "internal",
       "size", "110,100"
       });						
    addAnnotation
      (inputEClass, 
       source, 
       new String[] 
       {
       "figure", "rectangle",
       "size", "20,20",
       "label", "name",
       "label.placement", "external",
       "label.icon", "false"
       });		
    addAnnotation
      (outputEClass, 
       source, 
       new String[] 
       {
       "figure", "rectangle",
       "size", "20,20",
       "label", "name",
       "label.placement", "external",
       "label.icon", "false"
       });									
    addAnnotation
      (intervalEClass, 
       source, 
       new String[] 
       {
       "label", "name,Value,Time",
       "label.pattern", "{0} {1} {2}",
       "figure", "ellipse",
       "border.width", "2",
       "border.style", "solid",
       "color", "0,139,0",
       "label.placement", "external",
       "size", "40,40"
       });			
    addAnnotation
      (dateEClass, 
       source, 
       new String[] 
       {
       "label", "name",
       "figure", "ellipse",
       "border.width", "2",
       "border.style", "solid",
       "color", "255,165,0",
       "label.placement", "external",
       "size", "40,40"
       });			
    addAnnotation
      (descripcionEClass, 
       source, 
       new String[] 
       {
       "figure", "rectangle",
       "size", "90,20",
       "label", "name",
       "label.placement", "internal",
       "label.icon", "false"
       });				
    addAnnotation
      (participantETSKEClass, 
       source, 
       new String[] 
       {
       "figure", "rectangle",
       "size", "90,20",
       "label", "name",
       "label.placement", "internal",
       "label.icon", "false"
       });				
    addAnnotation
      (datainETSKEClass, 
       source, 
       new String[] 
       {
       "figure", "rectangle",
       "size", "90,20",
       "label", "name",
       "label.placement", "internal",
       "label.icon", "false"
       });				
    addAnnotation
      (dataoutETSKEClass, 
       source, 
       new String[] 
       {
       "figure", "rectangle",
       "size", "90,20",
       "label", "name",
       "label.placement", "internal",
       "label.icon", "false"
       });				
    addAnnotation
      (dateETSKEClass, 
       source, 
       new String[] 
       {
       "figure", "rectangle",
       "size", "90,20",
       "label", "name",
       "label.placement", "internal",
       "label.icon", "false"
       });	
  }

  /**
   * Initializes the annotations for <b>gmf.compartment</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_3Annotations()
  {
    String source = "gmf.compartment";													
    addAnnotation
      (getExtended_Owns(), 
       source, 
       new String[] 
       {
       "foo", "bar"
       });																														
  }

  /**
   * Initializes the annotations for <b>gmf.link</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createGmf_4Annotations()
  {
    String source = "gmf.link";															
    addAnnotation
      (normalFEClass, 
       source, 
       new String[] 
       {
       "target.decoration", "arrow",
       "source", "from",
       "target", "to",
       "incoming", "false",
       "label", "name"
       });						
    addAnnotation
      (conditionalINEClass, 
       source, 
       new String[] 
       {
       "target.decoration", "arrow",
       "source", "from",
       "target", "to",
       "incoming", "false",
       "label", "name"
       });				
    addAnnotation
      (conditionalINOUTEClass, 
       source, 
       new String[] 
       {
       "target.decoration", "arrow",
       "source", "from",
       "target", "to",
       "incoming", "false",
       "label", "name"
       });																				
  }

} //ThirdPackageImpl

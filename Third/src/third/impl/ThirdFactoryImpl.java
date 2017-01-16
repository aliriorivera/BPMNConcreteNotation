/**
 */
package third.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import third.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ThirdFactoryImpl extends EFactoryImpl implements ThirdFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ThirdFactory init()
  {
    try
    {
      ThirdFactory theThirdFactory = (ThirdFactory)EPackage.Registry.INSTANCE.getEFactory("third"); 
      if (theThirdFactory != null)
      {
        return theThirdFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ThirdFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ThirdFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ThirdPackage.SIMPLE_BPMN: return createSimpleBPMN();
      case ThirdPackage.START: return createStart();
      case ThirdPackage.END: return createEnd();
      case ThirdPackage.MESSAGE: return createMessage();
      case ThirdPackage.NORMAL: return createNormal();
      case ThirdPackage.EXTENDED: return createExtended();
      case ThirdPackage.NORMAL_F: return createNormalF();
      case ThirdPackage.INPUT: return createInput();
      case ThirdPackage.OUTPUT: return createOutput();
      case ThirdPackage.CONDITIONAL_IN: return createConditionalIN();
      case ThirdPackage.CONDITIONAL_INOUT: return createConditionalINOUT();
      case ThirdPackage.INTERVAL: return createInterval();
      case ThirdPackage.DATE: return createDate();
      case ThirdPackage.DESCRIPCION: return createDescripcion();
      case ThirdPackage.PARTICIPANT_ETSK: return createParticipantETSK();
      case ThirdPackage.DATAIN_ETSK: return createdatainETSK();
      case ThirdPackage.DATAOUT_ETSK: return createdataoutETSK();
      case ThirdPackage.DATE_ETSK: return createDateETSK();
      case ThirdPackage.NODES: return createNodes();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ThirdPackage.TIME_SELECTION:
        return createTimeSelectionFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case ThirdPackage.TIME_SELECTION:
        return convertTimeSelectionToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleBPMN createSimpleBPMN()
  {
    SimpleBPMNImpl simpleBPMN = new SimpleBPMNImpl();
    return simpleBPMN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Start createStart()
  {
    StartImpl start = new StartImpl();
    return start;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public End createEnd()
  {
    EndImpl end = new EndImpl();
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Message createMessage()
  {
    MessageImpl message = new MessageImpl();
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Normal createNormal()
  {
    NormalImpl normal = new NormalImpl();
    return normal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Extended createExtended()
  {
    ExtendedImpl extended = new ExtendedImpl();
    return extended;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NormalF createNormalF()
  {
    NormalFImpl normalF = new NormalFImpl();
    return normalF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Input createInput()
  {
    InputImpl input = new InputImpl();
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Output createOutput()
  {
    OutputImpl output = new OutputImpl();
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalIN createConditionalIN()
  {
    ConditionalINImpl conditionalIN = new ConditionalINImpl();
    return conditionalIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalINOUT createConditionalINOUT()
  {
    ConditionalINOUTImpl conditionalINOUT = new ConditionalINOUTImpl();
    return conditionalINOUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interval createInterval()
  {
    IntervalImpl interval = new IntervalImpl();
    return interval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Date createDate()
  {
    DateImpl date = new DateImpl();
    return date;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Descripcion createDescripcion()
  {
    DescripcionImpl descripcion = new DescripcionImpl();
    return descripcion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParticipantETSK createParticipantETSK()
  {
    ParticipantETSKImpl participantETSK = new ParticipantETSKImpl();
    return participantETSK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public datainETSK createdatainETSK()
  {
    datainETSKImpl datainETSK = new datainETSKImpl();
    return datainETSK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public dataoutETSK createdataoutETSK()
  {
    dataoutETSKImpl dataoutETSK = new dataoutETSKImpl();
    return dataoutETSK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DateETSK createDateETSK()
  {
    DateETSKImpl dateETSK = new DateETSKImpl();
    return dateETSK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Nodes createNodes()
  {
    NodesImpl nodes = new NodesImpl();
    return nodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeSelection createTimeSelectionFromString(EDataType eDataType, String initialValue)
  {
    TimeSelection result = TimeSelection.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTimeSelectionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ThirdPackage getThirdPackage()
  {
    return (ThirdPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ThirdPackage getPackage()
  {
    return ThirdPackage.eINSTANCE;
  }

} //ThirdFactoryImpl

/**
 */
package third.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import third.SimpleBPMN;
import third.ThirdFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simple BPMN</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleBPMNTest extends TestCase
{

  /**
   * The fixture for this Simple BPMN test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleBPMN fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(SimpleBPMNTest.class);
  }

  /**
   * Constructs a new Simple BPMN test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleBPMNTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Simple BPMN test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(SimpleBPMN fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Simple BPMN test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleBPMN getFixture()
  {
    return fixture;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#setUp()
   * @generated
   */
  @Override
  protected void setUp() throws Exception
  {
    setFixture(ThirdFactory.eINSTANCE.createSimpleBPMN());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see junit.framework.TestCase#tearDown()
   * @generated
   */
  @Override
  protected void tearDown() throws Exception
  {
    setFixture(null);
  }

} //SimpleBPMNTest

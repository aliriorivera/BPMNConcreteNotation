/**
 */
package third.tests;

import junit.textui.TestRunner;

import third.ConditionalINOUT;
import third.ThirdFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Conditional INOUT</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConditionalINOUTTest extends ConditionalTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(ConditionalINOUTTest.class);
  }

  /**
   * Constructs a new Conditional INOUT test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalINOUTTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Conditional INOUT test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected ConditionalINOUT getFixture()
  {
    return (ConditionalINOUT)fixture;
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
    setFixture(ThirdFactory.eINSTANCE.createConditionalINOUT());
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

} //ConditionalINOUTTest

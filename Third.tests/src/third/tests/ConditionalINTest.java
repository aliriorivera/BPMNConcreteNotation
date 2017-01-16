/**
 */
package third.tests;

import junit.textui.TestRunner;

import third.ConditionalIN;
import third.ThirdFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Conditional IN</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConditionalINTest extends ConditionalTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(ConditionalINTest.class);
  }

  /**
   * Constructs a new Conditional IN test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalINTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Conditional IN test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected ConditionalIN getFixture()
  {
    return (ConditionalIN)fixture;
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
    setFixture(ThirdFactory.eINSTANCE.createConditionalIN());
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

} //ConditionalINTest

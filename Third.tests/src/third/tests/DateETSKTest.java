/**
 */
package third.tests;

import junit.textui.TestRunner;

import third.DateETSK;
import third.ThirdFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Date ETSK</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DateETSKTest extends ParametersTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(DateETSKTest.class);
  }

  /**
   * Constructs a new Date ETSK test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DateETSKTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Date ETSK test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected DateETSK getFixture()
  {
    return (DateETSK)fixture;
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
    setFixture(ThirdFactory.eINSTANCE.createDateETSK());
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

} //DateETSKTest

/**
 */
package third.tests;

import junit.textui.TestRunner;

import third.Start;
import third.ThirdFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Start</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StartTest extends NodesTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(StartTest.class);
  }

  /**
   * Constructs a new Start test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StartTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Start test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Start getFixture()
  {
    return (Start)fixture;
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
    setFixture(ThirdFactory.eINSTANCE.createStart());
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

} //StartTest

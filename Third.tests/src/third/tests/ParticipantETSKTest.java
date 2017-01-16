/**
 */
package third.tests;

import junit.textui.TestRunner;

import third.ParticipantETSK;
import third.ThirdFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Participant ETSK</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParticipantETSKTest extends ParametersTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(ParticipantETSKTest.class);
  }

  /**
   * Constructs a new Participant ETSK test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParticipantETSKTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this Participant ETSK test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected ParticipantETSK getFixture()
  {
    return (ParticipantETSK)fixture;
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
    setFixture(ThirdFactory.eINSTANCE.createParticipantETSK());
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

} //ParticipantETSKTest

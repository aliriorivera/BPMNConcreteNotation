/**
 */
package third;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link third.Task#getValuesin <em>Valuesin</em>}</li>
 *   <li>{@link third.Task#getEReference0 <em>EReference0</em>}</li>
 *   <li>{@link third.Task#getValuesout <em>Valuesout</em>}</li>
 * </ul>
 * </p>
 *
 * @see third.ThirdPackage#getTask()
 * @model abstract="true"
 * @generated
 */
public interface Task extends Elements
{

  /**
   * Returns the value of the '<em><b>Valuesin</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valuesin</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valuesin</em>' containment reference.
   * @see #setValuesin(Input)
   * @see third.ThirdPackage#getTask_Valuesin()
   * @model containment="true"
   *        annotation="gmf.affixed foo='bar'"
   * @generated
   */
  Input getValuesin();

  /**
   * Sets the value of the '{@link third.Task#getValuesin <em>Valuesin</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valuesin</em>' containment reference.
   * @see #getValuesin()
   * @generated
   */
  void setValuesin(Input value);

  /**
   * Returns the value of the '<em><b>EReference0</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EReference0</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>EReference0</em>' reference.
   * @see #setEReference0(Parameters)
   * @see third.ThirdPackage#getTask_EReference0()
   * @model
   * @generated
   */
  Parameters getEReference0();

  /**
   * Sets the value of the '{@link third.Task#getEReference0 <em>EReference0</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>EReference0</em>' reference.
   * @see #getEReference0()
   * @generated
   */
  void setEReference0(Parameters value);

  /**
   * Returns the value of the '<em><b>Valuesout</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valuesout</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valuesout</em>' containment reference.
   * @see #setValuesout(Output)
   * @see third.ThirdPackage#getTask_Valuesout()
   * @model containment="true"
   *        annotation="gmf.affixed foo='bar'"
   * @generated
   */
  Output getValuesout();

  /**
   * Sets the value of the '{@link third.Task#getValuesout <em>Valuesout</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Valuesout</em>' containment reference.
   * @see #getValuesout()
   * @generated
   */
  void setValuesout(Output value);
} // Task

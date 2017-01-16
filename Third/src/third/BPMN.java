/**
 */
package third;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPMN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link third.BPMN#getStartnode <em>Startnode</em>}</li>
 *   <li>{@link third.BPMN#getAsdasdasda <em>Asdasdasda</em>}</li>
 *   <li>{@link third.BPMN#getQeqwe <em>Qeqwe</em>}</li>
 *   <li>{@link third.BPMN#getQweqwe <em>Qweqwe</em>}</li>
 * </ul>
 * </p>
 *
 * @see third.ThirdPackage#getBPMN()
 * @model annotation="gmf.diagram foo='bar'"
 * @generated
 */
public interface BPMN extends EObject
{
  /**
   * Returns the value of the '<em><b>Startnode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Startnode</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Startnode</em>' containment reference.
   * @see #setStartnode(Start)
   * @see third.ThirdPackage#getBPMN_Startnode()
   * @model containment="true" required="true"
   * @generated
   */
  Start getStartnode();

  /**
   * Sets the value of the '{@link third.BPMN#getStartnode <em>Startnode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Startnode</em>' containment reference.
   * @see #getStartnode()
   * @generated
   */
  void setStartnode(Start value);

  /**
   * Returns the value of the '<em><b>Asdasdasda</b></em>' containment reference list.
   * The list contents are of type {@link third.Events}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Asdasdasda</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Asdasdasda</em>' containment reference list.
   * @see third.ThirdPackage#getBPMN_Asdasdasda()
   * @model containment="true"
   * @generated
   */
  EList<Events> getAsdasdasda();

  /**
   * Returns the value of the '<em><b>Qeqwe</b></em>' containment reference list.
   * The list contents are of type {@link third.Task}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qeqwe</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qeqwe</em>' containment reference list.
   * @see third.ThirdPackage#getBPMN_Qeqwe()
   * @model containment="true"
   * @generated
   */
  EList<Task> getQeqwe();

  /**
   * Returns the value of the '<em><b>Qweqwe</b></em>' containment reference list.
   * The list contents are of type {@link third.Flow}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qweqwe</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qweqwe</em>' containment reference list.
   * @see third.ThirdPackage#getBPMN_Qweqwe()
   * @model containment="true"
   * @generated
   */
  EList<Flow> getQweqwe();

} // BPMN

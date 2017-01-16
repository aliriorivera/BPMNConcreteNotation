/**
 */
package third;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple BPMN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link third.SimpleBPMN#getOwnedEvents <em>Owned Events</em>}</li>
 *   <li>{@link third.SimpleBPMN#getOwnedTasks <em>Owned Tasks</em>}</li>
 *   <li>{@link third.SimpleBPMN#getOwnedFlows <em>Owned Flows</em>}</li>
 *   <li>{@link third.SimpleBPMN#getStartNodes <em>Start Nodes</em>}</li>
 *   <li>{@link third.SimpleBPMN#getEndNodes <em>End Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see third.ThirdPackage#getSimpleBPMN()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NumberOfStartNode NumberOfEndNode'"
 *        annotation="gmf.diagram foo='bar'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot NumberOfStartNode='self.StartNodes->select(m : SimpleBPMN | m.oclIsTypeOf(Start))->size() < 2' NumberOfEndNode='self.EndNodes->select(m : SimpleBPMN | m.oclIsTypeOf(End))->size() < 2'"
 * @generated
 */
public interface SimpleBPMN extends EObject
{
  /**
   * Returns the value of the '<em><b>Owned Events</b></em>' containment reference list.
   * The list contents are of type {@link third.Events}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Events</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Events</em>' containment reference list.
   * @see third.ThirdPackage#getSimpleBPMN_OwnedEvents()
   * @model containment="true"
   * @generated
   */
  EList<Events> getOwnedEvents();

  /**
   * Returns the value of the '<em><b>Owned Tasks</b></em>' containment reference list.
   * The list contents are of type {@link third.Task}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Tasks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Tasks</em>' containment reference list.
   * @see third.ThirdPackage#getSimpleBPMN_OwnedTasks()
   * @model containment="true"
   * @generated
   */
  EList<Task> getOwnedTasks();

  /**
   * Returns the value of the '<em><b>Owned Flows</b></em>' containment reference list.
   * The list contents are of type {@link third.Flow}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Flows</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Flows</em>' containment reference list.
   * @see third.ThirdPackage#getSimpleBPMN_OwnedFlows()
   * @model containment="true"
   * @generated
   */
  EList<Flow> getOwnedFlows();

  /**
   * Returns the value of the '<em><b>Start Nodes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start Nodes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start Nodes</em>' containment reference.
   * @see #setStartNodes(Start)
   * @see third.ThirdPackage#getSimpleBPMN_StartNodes()
   * @model containment="true" required="true"
   * @generated
   */
  Start getStartNodes();

  /**
   * Sets the value of the '{@link third.SimpleBPMN#getStartNodes <em>Start Nodes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start Nodes</em>' containment reference.
   * @see #getStartNodes()
   * @generated
   */
  void setStartNodes(Start value);

  /**
   * Returns the value of the '<em><b>End Nodes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End Nodes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End Nodes</em>' containment reference.
   * @see #setEndNodes(End)
   * @see third.ThirdPackage#getSimpleBPMN_EndNodes()
   * @model containment="true" required="true"
   * @generated
   */
  End getEndNodes();

  /**
   * Sets the value of the '{@link third.SimpleBPMN#getEndNodes <em>End Nodes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Nodes</em>' containment reference.
   * @see #getEndNodes()
   * @generated
   */
  void setEndNodes(End value);

} // SimpleBPMN

/**
 */
package third;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link third.Extended#getName <em>Name</em>}</li>
 *   <li>{@link third.Extended#getOwns <em>Owns</em>}</li>
 * </ul>
 * </p>
 *
 * @see third.ThirdPackage#getExtended()
 * @model annotation="gmf.node label='name' figure='rectangle' label.placement='internal' size='110,100'"
 * @generated
 */
public interface Extended extends Task
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The default value is <code>"Task Description Here"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see third.ThirdPackage#getExtended_Name()
   * @model default="Task Description Here"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link third.Extended#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Owns</b></em>' containment reference list.
   * The list contents are of type {@link third.Parameters}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owns</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owns</em>' containment reference list.
   * @see third.ThirdPackage#getExtended_Owns()
   * @model containment="true"
   *        annotation="gmf.compartment foo='bar'"
   * @generated
   */
  EList<Parameters> getOwns();

} // Extended

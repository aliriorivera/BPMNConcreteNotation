/**
 */
package third;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link third.Normal#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see third.ThirdPackage#getNormal()
 * @model annotation="gmf.node label='name' figure='rectangle' label.placement='internal' size='110,70'"
 * @generated
 */
public interface Normal extends Task
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
   * @see third.ThirdPackage#getNormal_Name()
   * @model default="Task Description Here"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link third.Normal#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Normal

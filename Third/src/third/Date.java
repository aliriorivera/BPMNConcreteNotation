/**
 */
package third;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link third.Date#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see third.ThirdPackage#getDate()
 * @model annotation="gmf.node label='name' figure='ellipse' border.width='2' border.style='solid' color='255,165,0' label.placement='external' size='40,40'"
 * @generated
 */
public interface Date extends Events
{

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The default value is <code>"Date"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see third.ThirdPackage#getDate_Name()
   * @model default="Date"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link third.Date#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);
} // Date

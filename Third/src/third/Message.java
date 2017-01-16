/**
 */
package third;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link third.Message#getMessage <em>Message</em>}</li>
 *   <li>{@link third.Message#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see third.ThirdPackage#getMessage()
 * @model annotation="gmf.node label='Default,message' label.pattern='{1} {0}' figure='ellipse' border.width='2' border.style='solid' color='0,0,255' label.placement='external' size='40,40'"
 * @generated
 */
public interface Message extends Events
{
  /**
   * Returns the value of the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message</em>' attribute.
   * @see #setMessage(String)
   * @see third.ThirdPackage#getMessage_Message()
   * @model
   * @generated
   */
  String getMessage();

  /**
   * Sets the value of the '{@link third.Message#getMessage <em>Message</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Message</em>' attribute.
   * @see #getMessage()
   * @generated
   */
  void setMessage(String value);

  /**
   * Returns the value of the '<em><b>Default</b></em>' attribute.
   * The default value is <code>"Wait For"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default</em>' attribute.
   * @see #setDefault(String)
   * @see third.ThirdPackage#getMessage_Default()
   * @model default="Wait For"
   * @generated
   */
  String getDefault();

  /**
   * Sets the value of the '{@link third.Message#getDefault <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default</em>' attribute.
   * @see #getDefault()
   * @generated
   */
  void setDefault(String value);

} // Message

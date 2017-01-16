/**
 */
package third;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional INOUT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link third.ConditionalINOUT#getTo <em>To</em>}</li>
 *   <li>{@link third.ConditionalINOUT#getFrom <em>From</em>}</li>
 *   <li>{@link third.ConditionalINOUT#getCond <em>Cond</em>}</li>
 * </ul>
 * </p>
 *
 * @see third.ThirdPackage#getConditionalINOUT()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ConditionalINOUTnorvoid'"
 *        annotation="gmf.link target.decoration='arrow' source='from' target='to' incoming='false' label='name'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ConditionalINOUTnorvoid='self.cond.size() > 0'"
 * @generated
 */
public interface ConditionalINOUT extends Conditional
{
  /**
   * Returns the value of the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' reference.
   * @see #setFrom(Output)
   * @see third.ThirdPackage#getConditionalINOUT_From()
   * @model
   * @generated
   */
  Output getFrom();

  /**
   * Sets the value of the '{@link third.ConditionalINOUT#getFrom <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(Output value);

  /**
   * Returns the value of the '<em><b>Cond</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond</em>' attribute.
   * @see #setCond(String)
   * @see third.ThirdPackage#getConditionalINOUT_Cond()
   * @model
   * @generated
   */
  String getCond();

  /**
   * Sets the value of the '{@link third.ConditionalINOUT#getCond <em>Cond</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond</em>' attribute.
   * @see #getCond()
   * @generated
   */
  void setCond(String value);

  /**
   * Returns the value of the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' reference.
   * @see #setTo(Input)
   * @see third.ThirdPackage#getConditionalINOUT_To()
   * @model
   * @generated
   */
  Input getTo();

  /**
   * Sets the value of the '{@link third.ConditionalINOUT#getTo <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' reference.
   * @see #getTo()
   * @generated
   */
  void setTo(Input value);

} // ConditionalINOUT

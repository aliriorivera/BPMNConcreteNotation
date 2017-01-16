/**
 */
package third;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal F</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link third.NormalF#getName <em>Name</em>}</li>
 *   <li>{@link third.NormalF#getFrom <em>From</em>}</li>
 *   <li>{@link third.NormalF#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see third.ThirdPackage#getNormalF()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NoLoopsFromNormalFlow'"
 *        annotation="gmf.link target.decoration='arrow' source='from' target='to' incoming='false' label='name'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot NoLoopsFromNormalFlow='self.from <> self.to'"
 * @generated
 */
public interface NormalF extends Flow
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see third.ThirdPackage#getNormalF_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link third.NormalF#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' reference.
   * @see #setFrom(Elements)
   * @see third.ThirdPackage#getNormalF_From()
   * @model required="true"
   * @generated
   */
  Elements getFrom();

  /**
   * Sets the value of the '{@link third.NormalF#getFrom <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(Elements value);

  /**
   * Returns the value of the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' reference.
   * @see #setTo(Elements)
   * @see third.ThirdPackage#getNormalF_To()
   * @model required="true"
   * @generated
   */
  Elements getTo();

  /**
   * Sets the value of the '{@link third.NormalF#getTo <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' reference.
   * @see #getTo()
   * @generated
   */
  void setTo(Elements value);

} // NormalF

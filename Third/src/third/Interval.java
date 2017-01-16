/**
 */
package third;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link third.Interval#getName <em>Name</em>}</li>
 *   <li>{@link third.Interval#getValue <em>Value</em>}</li>
 *   <li>{@link third.Interval#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see third.ThirdPackage#getInterval()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='IntervalPositive'"
 *        annotation="gmf.node label='name,Value,Time' label.pattern='{0} {1} {2}' figure='ellipse' border.width='2' border.style='solid' color='0,139,0' label.placement='external' size='40,40'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot IntervalPositive='self.name.size() >= 0'"
 * @generated
 */
public interface Interval extends Events
{

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * The default value is <code>"Wait"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see third.ThirdPackage#getInterval_Name()
   * @model default="Wait"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link third.Interval#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Time</b></em>' attribute.
   * The literals are from the enumeration {@link third.TimeSelection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' attribute.
   * @see third.TimeSelection
   * @see #setTime(TimeSelection)
   * @see third.ThirdPackage#getInterval_Time()
   * @model
   * @generated
   */
  TimeSelection getTime();

  /**
   * Sets the value of the '{@link third.Interval#getTime <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' attribute.
   * @see third.TimeSelection
   * @see #getTime()
   * @generated
   */
  void setTime(TimeSelection value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see third.ThirdPackage#getInterval_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link third.Interval#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);
} // Interval

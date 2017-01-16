/**
 */
package third.impl;

import org.eclipse.emf.common.notify.Notification;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import third.Parameters;
import third.Flow;
import third.Input;
import third.NormalF;
import third.Output;
import third.Task;
import third.ThirdPackage;
import third.Values;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link third.impl.TaskImpl#getValuesin <em>Valuesin</em>}</li>
 *   <li>{@link third.impl.TaskImpl#getEReference0 <em>EReference0</em>}</li>
 *   <li>{@link third.impl.TaskImpl#getValuesout <em>Valuesout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TaskImpl extends ElementsImpl implements Task
{
  /**
   * The cached value of the '{@link #getValuesin() <em>Valuesin</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValuesin()
   * @generated
   * @ordered
   */
  protected Input valuesin;
  /**
   * The cached value of the '{@link #getEReference0() <em>EReference0</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEReference0()
   * @generated
   * @ordered
   */
  protected Parameters eReference0;
  /**
   * The cached value of the '{@link #getValuesout() <em>Valuesout</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValuesout()
   * @generated
   * @ordered
   */
  protected Output valuesout;
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TaskImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ThirdPackage.Literals.TASK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Input getValuesin()
  {
    return valuesin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValuesin(Input newValuesin, NotificationChain msgs)
  {
    Input oldValuesin = valuesin;
    valuesin = newValuesin;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThirdPackage.TASK__VALUESIN, oldValuesin, newValuesin);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValuesin(Input newValuesin)
  {
    if (newValuesin != valuesin)
    {
      NotificationChain msgs = null;
      if (valuesin != null)
        msgs = ((InternalEObject)valuesin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThirdPackage.TASK__VALUESIN, null, msgs);
      if (newValuesin != null)
        msgs = ((InternalEObject)newValuesin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThirdPackage.TASK__VALUESIN, null, msgs);
      msgs = basicSetValuesin(newValuesin, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThirdPackage.TASK__VALUESIN, newValuesin, newValuesin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameters getEReference0()
  {
    if (eReference0 != null && eReference0.eIsProxy())
    {
      InternalEObject oldEReference0 = (InternalEObject)eReference0;
      eReference0 = (Parameters)eResolveProxy(oldEReference0);
      if (eReference0 != oldEReference0)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ThirdPackage.TASK__EREFERENCE0, oldEReference0, eReference0));
      }
    }
    return eReference0;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameters basicGetEReference0()
  {
    return eReference0;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEReference0(Parameters newEReference0)
  {
    Parameters oldEReference0 = eReference0;
    eReference0 = newEReference0;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThirdPackage.TASK__EREFERENCE0, oldEReference0, eReference0));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Output getValuesout()
  {
    return valuesout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValuesout(Output newValuesout, NotificationChain msgs)
  {
    Output oldValuesout = valuesout;
    valuesout = newValuesout;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThirdPackage.TASK__VALUESOUT, oldValuesout, newValuesout);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValuesout(Output newValuesout)
  {
    if (newValuesout != valuesout)
    {
      NotificationChain msgs = null;
      if (valuesout != null)
        msgs = ((InternalEObject)valuesout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThirdPackage.TASK__VALUESOUT, null, msgs);
      if (newValuesout != null)
        msgs = ((InternalEObject)newValuesout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThirdPackage.TASK__VALUESOUT, null, msgs);
      msgs = basicSetValuesout(newValuesout, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThirdPackage.TASK__VALUESOUT, newValuesout, newValuesout));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ThirdPackage.TASK__VALUESIN:
        return basicSetValuesin(null, msgs);
      case ThirdPackage.TASK__VALUESOUT:
        return basicSetValuesout(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ThirdPackage.TASK__VALUESIN:
        return getValuesin();
      case ThirdPackage.TASK__EREFERENCE0:
        if (resolve) return getEReference0();
        return basicGetEReference0();
      case ThirdPackage.TASK__VALUESOUT:
        return getValuesout();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ThirdPackage.TASK__VALUESIN:
        setValuesin((Input)newValue);
        return;
      case ThirdPackage.TASK__EREFERENCE0:
        setEReference0((Parameters)newValue);
        return;
      case ThirdPackage.TASK__VALUESOUT:
        setValuesout((Output)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ThirdPackage.TASK__VALUESIN:
        setValuesin((Input)null);
        return;
      case ThirdPackage.TASK__EREFERENCE0:
        setEReference0((Parameters)null);
        return;
      case ThirdPackage.TASK__VALUESOUT:
        setValuesout((Output)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ThirdPackage.TASK__VALUESIN:
        return valuesin != null;
      case ThirdPackage.TASK__EREFERENCE0:
        return eReference0 != null;
      case ThirdPackage.TASK__VALUESOUT:
        return valuesout != null;
    }
    return super.eIsSet(featureID);
  }

} //TaskImpl

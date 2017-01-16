/**
 */
package third.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import third.End;
import third.Events;
import third.Flow;
import third.SimpleBPMN;
import third.Start;
import third.Task;
import third.ThirdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple BPMN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link third.impl.SimpleBPMNImpl#getOwnedEvents <em>Owned Events</em>}</li>
 *   <li>{@link third.impl.SimpleBPMNImpl#getOwnedTasks <em>Owned Tasks</em>}</li>
 *   <li>{@link third.impl.SimpleBPMNImpl#getOwnedFlows <em>Owned Flows</em>}</li>
 *   <li>{@link third.impl.SimpleBPMNImpl#getStartNodes <em>Start Nodes</em>}</li>
 *   <li>{@link third.impl.SimpleBPMNImpl#getEndNodes <em>End Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleBPMNImpl extends EObjectImpl implements SimpleBPMN
{
  /**
   * The cached value of the '{@link #getOwnedEvents() <em>Owned Events</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedEvents()
   * @generated
   * @ordered
   */
  protected EList<Events> ownedEvents;

  /**
   * The cached value of the '{@link #getOwnedTasks() <em>Owned Tasks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedTasks()
   * @generated
   * @ordered
   */
  protected EList<Task> ownedTasks;

  /**
   * The cached value of the '{@link #getOwnedFlows() <em>Owned Flows</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedFlows()
   * @generated
   * @ordered
   */
  protected EList<Flow> ownedFlows;

  /**
   * The cached value of the '{@link #getStartNodes() <em>Start Nodes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartNodes()
   * @generated
   * @ordered
   */
  protected Start startNodes;

  /**
   * The cached value of the '{@link #getEndNodes() <em>End Nodes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndNodes()
   * @generated
   * @ordered
   */
  protected End endNodes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleBPMNImpl()
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
    return ThirdPackage.Literals.SIMPLE_BPMN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Events> getOwnedEvents()
  {
    if (ownedEvents == null)
    {
      ownedEvents = new EObjectContainmentEList<Events>(Events.class, this, ThirdPackage.SIMPLE_BPMN__OWNED_EVENTS);
    }
    return ownedEvents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Task> getOwnedTasks()
  {
    if (ownedTasks == null)
    {
      ownedTasks = new EObjectContainmentEList<Task>(Task.class, this, ThirdPackage.SIMPLE_BPMN__OWNED_TASKS);
    }
    return ownedTasks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Flow> getOwnedFlows()
  {
    if (ownedFlows == null)
    {
      ownedFlows = new EObjectContainmentEList<Flow>(Flow.class, this, ThirdPackage.SIMPLE_BPMN__OWNED_FLOWS);
    }
    return ownedFlows;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Start getStartNodes()
  {
    return startNodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStartNodes(Start newStartNodes, NotificationChain msgs)
  {
    Start oldStartNodes = startNodes;
    startNodes = newStartNodes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThirdPackage.SIMPLE_BPMN__START_NODES, oldStartNodes, newStartNodes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStartNodes(Start newStartNodes)
  {
    if (newStartNodes != startNodes)
    {
      NotificationChain msgs = null;
      if (startNodes != null)
        msgs = ((InternalEObject)startNodes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThirdPackage.SIMPLE_BPMN__START_NODES, null, msgs);
      if (newStartNodes != null)
        msgs = ((InternalEObject)newStartNodes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThirdPackage.SIMPLE_BPMN__START_NODES, null, msgs);
      msgs = basicSetStartNodes(newStartNodes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThirdPackage.SIMPLE_BPMN__START_NODES, newStartNodes, newStartNodes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public End getEndNodes()
  {
    return endNodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEndNodes(End newEndNodes, NotificationChain msgs)
  {
    End oldEndNodes = endNodes;
    endNodes = newEndNodes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThirdPackage.SIMPLE_BPMN__END_NODES, oldEndNodes, newEndNodes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndNodes(End newEndNodes)
  {
    if (newEndNodes != endNodes)
    {
      NotificationChain msgs = null;
      if (endNodes != null)
        msgs = ((InternalEObject)endNodes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThirdPackage.SIMPLE_BPMN__END_NODES, null, msgs);
      if (newEndNodes != null)
        msgs = ((InternalEObject)newEndNodes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThirdPackage.SIMPLE_BPMN__END_NODES, null, msgs);
      msgs = basicSetEndNodes(newEndNodes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThirdPackage.SIMPLE_BPMN__END_NODES, newEndNodes, newEndNodes));
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
      case ThirdPackage.SIMPLE_BPMN__OWNED_EVENTS:
        return ((InternalEList<?>)getOwnedEvents()).basicRemove(otherEnd, msgs);
      case ThirdPackage.SIMPLE_BPMN__OWNED_TASKS:
        return ((InternalEList<?>)getOwnedTasks()).basicRemove(otherEnd, msgs);
      case ThirdPackage.SIMPLE_BPMN__OWNED_FLOWS:
        return ((InternalEList<?>)getOwnedFlows()).basicRemove(otherEnd, msgs);
      case ThirdPackage.SIMPLE_BPMN__START_NODES:
        return basicSetStartNodes(null, msgs);
      case ThirdPackage.SIMPLE_BPMN__END_NODES:
        return basicSetEndNodes(null, msgs);
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
      case ThirdPackage.SIMPLE_BPMN__OWNED_EVENTS:
        return getOwnedEvents();
      case ThirdPackage.SIMPLE_BPMN__OWNED_TASKS:
        return getOwnedTasks();
      case ThirdPackage.SIMPLE_BPMN__OWNED_FLOWS:
        return getOwnedFlows();
      case ThirdPackage.SIMPLE_BPMN__START_NODES:
        return getStartNodes();
      case ThirdPackage.SIMPLE_BPMN__END_NODES:
        return getEndNodes();
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
      case ThirdPackage.SIMPLE_BPMN__OWNED_EVENTS:
        getOwnedEvents().clear();
        getOwnedEvents().addAll((Collection<? extends Events>)newValue);
        return;
      case ThirdPackage.SIMPLE_BPMN__OWNED_TASKS:
        getOwnedTasks().clear();
        getOwnedTasks().addAll((Collection<? extends Task>)newValue);
        return;
      case ThirdPackage.SIMPLE_BPMN__OWNED_FLOWS:
        getOwnedFlows().clear();
        getOwnedFlows().addAll((Collection<? extends Flow>)newValue);
        return;
      case ThirdPackage.SIMPLE_BPMN__START_NODES:
        setStartNodes((Start)newValue);
        return;
      case ThirdPackage.SIMPLE_BPMN__END_NODES:
        setEndNodes((End)newValue);
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
      case ThirdPackage.SIMPLE_BPMN__OWNED_EVENTS:
        getOwnedEvents().clear();
        return;
      case ThirdPackage.SIMPLE_BPMN__OWNED_TASKS:
        getOwnedTasks().clear();
        return;
      case ThirdPackage.SIMPLE_BPMN__OWNED_FLOWS:
        getOwnedFlows().clear();
        return;
      case ThirdPackage.SIMPLE_BPMN__START_NODES:
        setStartNodes((Start)null);
        return;
      case ThirdPackage.SIMPLE_BPMN__END_NODES:
        setEndNodes((End)null);
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
      case ThirdPackage.SIMPLE_BPMN__OWNED_EVENTS:
        return ownedEvents != null && !ownedEvents.isEmpty();
      case ThirdPackage.SIMPLE_BPMN__OWNED_TASKS:
        return ownedTasks != null && !ownedTasks.isEmpty();
      case ThirdPackage.SIMPLE_BPMN__OWNED_FLOWS:
        return ownedFlows != null && !ownedFlows.isEmpty();
      case ThirdPackage.SIMPLE_BPMN__START_NODES:
        return startNodes != null;
      case ThirdPackage.SIMPLE_BPMN__END_NODES:
        return endNodes != null;
    }
    return super.eIsSet(featureID);
  }

} //SimpleBPMNImpl

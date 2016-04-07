/**
 * generated by Xtext 2.9.1
 */
package org.xtuml.bp.ui.xtext.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtuml.bp.ui.xtext.myDsl.MyDslPackage;
import org.xtuml.bp.ui.xtext.myDsl.expression;
import org.xtuml.bp.ui.xtext.myDsl.findName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>find Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.ui.xtext.myDsl.impl.findNameImpl#getI1 <em>I1</em>}</li>
 *   <li>{@link org.xtuml.bp.ui.xtext.myDsl.impl.findNameImpl#getI2 <em>I2</em>}</li>
 *   <li>{@link org.xtuml.bp.ui.xtext.myDsl.impl.findNameImpl#getE <em>E</em>}</li>
 * </ul>
 *
 * @generated
 */
public class findNameImpl extends MinimalEObjectImpl.Container implements findName
{
  /**
   * The default value of the '{@link #getI1() <em>I1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI1()
   * @generated
   * @ordered
   */
  protected static final String I1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getI1() <em>I1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI1()
   * @generated
   * @ordered
   */
  protected String i1 = I1_EDEFAULT;

  /**
   * The cached value of the '{@link #getI2() <em>I2</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getI2()
   * @generated
   * @ordered
   */
  protected EList<String> i2;

  /**
   * The cached value of the '{@link #getE() <em>E</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getE()
   * @generated
   * @ordered
   */
  protected EList<expression> e;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected findNameImpl()
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
    return MyDslPackage.Literals.FIND_NAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getI1()
  {
    return i1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setI1(String newI1)
  {
    String oldI1 = i1;
    i1 = newI1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FIND_NAME__I1, oldI1, i1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getI2()
  {
    if (i2 == null)
    {
      i2 = new EDataTypeEList<String>(String.class, this, MyDslPackage.FIND_NAME__I2);
    }
    return i2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<expression> getE()
  {
    if (e == null)
    {
      e = new EObjectContainmentEList<expression>(expression.class, this, MyDslPackage.FIND_NAME__E);
    }
    return e;
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
      case MyDslPackage.FIND_NAME__E:
        return ((InternalEList<?>)getE()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.FIND_NAME__I1:
        return getI1();
      case MyDslPackage.FIND_NAME__I2:
        return getI2();
      case MyDslPackage.FIND_NAME__E:
        return getE();
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
      case MyDslPackage.FIND_NAME__I1:
        setI1((String)newValue);
        return;
      case MyDslPackage.FIND_NAME__I2:
        getI2().clear();
        getI2().addAll((Collection<? extends String>)newValue);
        return;
      case MyDslPackage.FIND_NAME__E:
        getE().clear();
        getE().addAll((Collection<? extends expression>)newValue);
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
      case MyDslPackage.FIND_NAME__I1:
        setI1(I1_EDEFAULT);
        return;
      case MyDslPackage.FIND_NAME__I2:
        getI2().clear();
        return;
      case MyDslPackage.FIND_NAME__E:
        getE().clear();
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
      case MyDslPackage.FIND_NAME__I1:
        return I1_EDEFAULT == null ? i1 != null : !I1_EDEFAULT.equals(i1);
      case MyDslPackage.FIND_NAME__I2:
        return i2 != null && !i2.isEmpty();
      case MyDslPackage.FIND_NAME__E:
        return e != null && !e.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (i1: ");
    result.append(i1);
    result.append(", i2: ");
    result.append(i2);
    result.append(')');
    return result.toString();
  }

} //findNameImpl

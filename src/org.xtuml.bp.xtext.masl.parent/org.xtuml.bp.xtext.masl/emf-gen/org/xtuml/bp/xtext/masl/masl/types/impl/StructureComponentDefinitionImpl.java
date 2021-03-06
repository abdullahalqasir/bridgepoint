/**
 * generated by Xtext 2.9.2
 */
package org.xtuml.bp.xtext.masl.masl.types.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtuml.bp.xtext.masl.masl.behavior.ConstExpression;

import org.xtuml.bp.xtext.masl.masl.structure.Pragma;
import org.xtuml.bp.xtext.masl.masl.structure.Pragmatized;
import org.xtuml.bp.xtext.masl.masl.structure.StructurePackage;

import org.xtuml.bp.xtext.masl.masl.structure.impl.AbstractFeatureImpl;

import org.xtuml.bp.xtext.masl.masl.types.AbstractTypeReference;
import org.xtuml.bp.xtext.masl.masl.types.StructureComponentDefinition;
import org.xtuml.bp.xtext.masl.masl.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure Component Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.types.impl.StructureComponentDefinitionImpl#getPragmas <em>Pragmas</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.types.impl.StructureComponentDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.types.impl.StructureComponentDefinitionImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructureComponentDefinitionImpl extends AbstractFeatureImpl implements StructureComponentDefinition {
	/**
	 * The cached value of the '{@link #getPragmas() <em>Pragmas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPragmas()
	 * @generated
	 * @ordered
	 */
	protected EList<Pragma> pragmas;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected AbstractTypeReference type;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected ConstExpression defaultValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureComponentDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.STRUCTURE_COMPONENT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pragma> getPragmas() {
		if (pragmas == null) {
			pragmas = new EObjectContainmentEList<Pragma>(Pragma.class, this, TypesPackage.STRUCTURE_COMPONENT_DEFINITION__PRAGMAS);
		}
		return pragmas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTypeReference getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(AbstractTypeReference newType, NotificationChain msgs) {
		AbstractTypeReference oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.STRUCTURE_COMPONENT_DEFINITION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(AbstractTypeReference newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.STRUCTURE_COMPONENT_DEFINITION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.STRUCTURE_COMPONENT_DEFINITION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.STRUCTURE_COMPONENT_DEFINITION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstExpression getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValue(ConstExpression newDefaultValue, NotificationChain msgs) {
		ConstExpression oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypesPackage.STRUCTURE_COMPONENT_DEFINITION__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(ConstExpression newDefaultValue) {
		if (newDefaultValue != defaultValue) {
			NotificationChain msgs = null;
			if (defaultValue != null)
				msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypesPackage.STRUCTURE_COMPONENT_DEFINITION__DEFAULT_VALUE, null, msgs);
			if (newDefaultValue != null)
				msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypesPackage.STRUCTURE_COMPONENT_DEFINITION__DEFAULT_VALUE, null, msgs);
			msgs = basicSetDefaultValue(newDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.STRUCTURE_COMPONENT_DEFINITION__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.STRUCTURE_COMPONENT_DEFINITION__PRAGMAS:
				return ((InternalEList<?>)getPragmas()).basicRemove(otherEnd, msgs);
			case TypesPackage.STRUCTURE_COMPONENT_DEFINITION__TYPE:
				return basicSetType(null, msgs);
			case TypesPackage.STRUCTURE_COMPONENT_DEFINITION__DEFAULT_VALUE:
				return basicSetDefaultValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.STRUCTURE_COMPONENT_DEFINITION__PRAGMAS:
				return getPragmas();
			case TypesPackage.STRUCTURE_COMPONENT_DEFINITION__TYPE:
				return getType();
			case TypesPackage.STRUCTURE_COMPONENT_DEFINITION__DEFAULT_VALUE:
				return getDefaultValue();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TypesPackage.STRUCTURE_COMPONENT_DEFINITION__PRAGMAS:
				getPragmas().clear();
				getPragmas().addAll((Collection<? extends Pragma>)newValue);
				return;
			case TypesPackage.STRUCTURE_COMPONENT_DEFINITION__TYPE:
				setType((AbstractTypeReference)newValue);
				return;
			case TypesPackage.STRUCTURE_COMPONENT_DEFINITION__DEFAULT_VALUE:
				setDefaultValue((ConstExpression)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case TypesPackage.STRUCTURE_COMPONENT_DEFINITION__PRAGMAS:
				getPragmas().clear();
				return;
			case TypesPackage.STRUCTURE_COMPONENT_DEFINITION__TYPE:
				setType((AbstractTypeReference)null);
				return;
			case TypesPackage.STRUCTURE_COMPONENT_DEFINITION__DEFAULT_VALUE:
				setDefaultValue((ConstExpression)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TypesPackage.STRUCTURE_COMPONENT_DEFINITION__PRAGMAS:
				return pragmas != null && !pragmas.isEmpty();
			case TypesPackage.STRUCTURE_COMPONENT_DEFINITION__TYPE:
				return type != null;
			case TypesPackage.STRUCTURE_COMPONENT_DEFINITION__DEFAULT_VALUE:
				return defaultValue != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Pragmatized.class) {
			switch (derivedFeatureID) {
				case TypesPackage.STRUCTURE_COMPONENT_DEFINITION__PRAGMAS: return StructurePackage.PRAGMATIZED__PRAGMAS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Pragmatized.class) {
			switch (baseFeatureID) {
				case StructurePackage.PRAGMATIZED__PRAGMAS: return TypesPackage.STRUCTURE_COMPONENT_DEFINITION__PRAGMAS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //StructureComponentDefinitionImpl

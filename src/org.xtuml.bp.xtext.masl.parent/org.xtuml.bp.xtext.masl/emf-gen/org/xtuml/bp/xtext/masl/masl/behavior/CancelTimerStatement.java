/**
 * generated by Xtext 2.9.2
 */
package org.xtuml.bp.xtext.masl.masl.behavior;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cancel Timer Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.behavior.CancelTimerStatement#getTimerId <em>Timer Id</em>}</li>
 * </ul>
 *
 * @see org.xtuml.bp.xtext.masl.masl.behavior.BehaviorPackage#getCancelTimerStatement()
 * @model
 * @generated
 */
public interface CancelTimerStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Timer Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timer Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timer Id</em>' containment reference.
	 * @see #setTimerId(Expression)
	 * @see org.xtuml.bp.xtext.masl.masl.behavior.BehaviorPackage#getCancelTimerStatement_TimerId()
	 * @model containment="true"
	 * @generated
	 */
	Expression getTimerId();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.behavior.CancelTimerStatement#getTimerId <em>Timer Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timer Id</em>' containment reference.
	 * @see #getTimerId()
	 * @generated
	 */
	void setTimerId(Expression value);

} // CancelTimerStatement

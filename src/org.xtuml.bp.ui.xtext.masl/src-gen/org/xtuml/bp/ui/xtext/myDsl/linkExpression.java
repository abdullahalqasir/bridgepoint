/**
 * generated by Xtext 2.9.1
 */
package org.xtuml.bp.ui.xtext.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>link Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.ui.xtext.myDsl.linkExpression#getN1 <em>N1</em>}</li>
 *   <li>{@link org.xtuml.bp.ui.xtext.myDsl.linkExpression#getN2 <em>N2</em>}</li>
 *   <li>{@link org.xtuml.bp.ui.xtext.myDsl.linkExpression#getR <em>R</em>}</li>
 *   <li>{@link org.xtuml.bp.ui.xtext.myDsl.linkExpression#getN3 <em>N3</em>}</li>
 * </ul>
 *
 * @see org.xtuml.bp.ui.xtext.myDsl.MyDslPackage#getlinkExpression()
 * @model
 * @generated
 */
public interface linkExpression extends unaryExp
{
  /**
   * Returns the value of the '<em><b>N1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>N1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>N1</em>' containment reference.
   * @see #setN1(navigateExpression)
   * @see org.xtuml.bp.ui.xtext.myDsl.MyDslPackage#getlinkExpression_N1()
   * @model containment="true"
   * @generated
   */
  navigateExpression getN1();

  /**
   * Sets the value of the '{@link org.xtuml.bp.ui.xtext.myDsl.linkExpression#getN1 <em>N1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>N1</em>' containment reference.
   * @see #getN1()
   * @generated
   */
  void setN1(navigateExpression value);

  /**
   * Returns the value of the '<em><b>N2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>N2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>N2</em>' containment reference.
   * @see #setN2(navigateExpression)
   * @see org.xtuml.bp.ui.xtext.myDsl.MyDslPackage#getlinkExpression_N2()
   * @model containment="true"
   * @generated
   */
  navigateExpression getN2();

  /**
   * Sets the value of the '{@link org.xtuml.bp.ui.xtext.myDsl.linkExpression#getN2 <em>N2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>N2</em>' containment reference.
   * @see #getN2()
   * @generated
   */
  void setN2(navigateExpression value);

  /**
   * Returns the value of the '<em><b>R</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>R</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>R</em>' containment reference.
   * @see #setR(relationshipSpec)
   * @see org.xtuml.bp.ui.xtext.myDsl.MyDslPackage#getlinkExpression_R()
   * @model containment="true"
   * @generated
   */
  relationshipSpec getR();

  /**
   * Sets the value of the '{@link org.xtuml.bp.ui.xtext.myDsl.linkExpression#getR <em>R</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>R</em>' containment reference.
   * @see #getR()
   * @generated
   */
  void setR(relationshipSpec value);

  /**
   * Returns the value of the '<em><b>N3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>N3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>N3</em>' containment reference.
   * @see #setN3(navigateExpression)
   * @see org.xtuml.bp.ui.xtext.myDsl.MyDslPackage#getlinkExpression_N3()
   * @model containment="true"
   * @generated
   */
  navigateExpression getN3();

  /**
   * Sets the value of the '{@link org.xtuml.bp.ui.xtext.myDsl.linkExpression#getN3 <em>N3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>N3</em>' containment reference.
   * @see #getN3()
   * @generated
   */
  void setN3(navigateExpression value);

} // linkExpression

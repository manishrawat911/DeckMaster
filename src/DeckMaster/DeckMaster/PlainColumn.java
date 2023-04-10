/**
 */
package DeckMaster.DeckMaster;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plain Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DeckMaster.DeckMaster.PlainColumn#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see DeckMaster.DeckMaster.DeckMasterPackage#getPlainColumn()
 * @model
 * @generated
 */
public interface PlainColumn extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see DeckMaster.DeckMaster.DeckMasterPackage#getPlainColumn_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link DeckMaster.DeckMaster.PlainColumn#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // PlainColumn
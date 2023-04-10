/**
 */
package DeckMaster.DeckMaster;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plain Images</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DeckMaster.DeckMaster.PlainImages#getUri <em>Uri</em>}</li>
 *   <li>{@link DeckMaster.DeckMaster.PlainImages#getImageTitle <em>Image Title</em>}</li>
 * </ul>
 *
 * @see DeckMaster.DeckMaster.DeckMasterPackage#getPlainImages()
 * @model
 * @generated
 */
public interface PlainImages extends EObject {
	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see DeckMaster.DeckMaster.DeckMasterPackage#getPlainImages_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link DeckMaster.DeckMaster.PlainImages#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Image Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Title</em>' attribute.
	 * @see #setImageTitle(String)
	 * @see DeckMaster.DeckMaster.DeckMasterPackage#getPlainImages_ImageTitle()
	 * @model
	 * @generated
	 */
	String getImageTitle();

	/**
	 * Sets the value of the '{@link DeckMaster.DeckMaster.PlainImages#getImageTitle <em>Image Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Title</em>' attribute.
	 * @see #getImageTitle()
	 * @generated
	 */
	void setImageTitle(String value);

} // PlainImages

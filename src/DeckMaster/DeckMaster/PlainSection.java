/**
 */
package DeckMaster.DeckMaster;

import DeckMaster.PlainImages;
import DeckMaster.PlainReport;
import DeckMaster.PlainTable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plain Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DeckMaster.DeckMaster.PlainSection#getName <em>Name</em>}</li>
 *   <li>{@link DeckMaster.DeckMaster.PlainSection#getBody <em>Body</em>}</li>
 *   <li>{@link DeckMaster.DeckMaster.PlainSection#getSubSection <em>Sub Section</em>}</li>
 *   <li>{@link DeckMaster.DeckMaster.PlainSection#getImages <em>Images</em>}</li>
 *   <li>{@link DeckMaster.DeckMaster.PlainSection#getTables <em>Tables</em>}</li>
 *   <li>{@link DeckMaster.DeckMaster.PlainSection#getPartOf <em>Part Of</em>}</li>
 * </ul>
 *
 * @see DeckMaster.DeckMaster.DeckMasterPackage#getPlainSection()
 * @model
 * @generated
 */
public interface PlainSection extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see DeckMaster.DeckMaster.DeckMasterPackage#getPlainSection_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link DeckMaster.DeckMaster.PlainSection#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see DeckMaster.DeckMaster.DeckMasterPackage#getPlainSection_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link DeckMaster.DeckMaster.PlainSection#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Sub Section</b></em>' containment reference list.
	 * The list contents are of type {@link DeckMaster.PlainSection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Section</em>' containment reference list.
	 * @see DeckMaster.DeckMaster.DeckMasterPackage#getPlainSection_SubSection()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeckMaster.PlainSection> getSubSection();

	/**
	 * Returns the value of the '<em><b>Images</b></em>' containment reference list.
	 * The list contents are of type {@link DeckMaster.PlainImages}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Images</em>' containment reference list.
	 * @see DeckMaster.DeckMaster.DeckMasterPackage#getPlainSection_Images()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlainImages> getImages();

	/**
	 * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
	 * The list contents are of type {@link DeckMaster.PlainTable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference list.
	 * @see DeckMaster.DeckMaster.DeckMasterPackage#getPlainSection_Tables()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlainTable> getTables();

	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link DeckMaster.PlainReport#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of</em>' reference.
	 * @see #setPartOf(PlainReport)
	 * @see DeckMaster.DeckMaster.DeckMasterPackage#getPlainSection_PartOf()
	 * @see DeckMaster.PlainReport#getSections
	 * @model opposite="sections"
	 * @generated
	 */
	PlainReport getPartOf();

	/**
	 * Sets the value of the '{@link DeckMaster.DeckMaster.PlainSection#getPartOf <em>Part Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Of</em>' reference.
	 * @see #getPartOf()
	 * @generated
	 */
	void setPartOf(PlainReport value);

} // PlainSection

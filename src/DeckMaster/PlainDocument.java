/**
 */
package DeckMaster;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plain Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DeckMaster.PlainDocument#getName <em>Name</em>}</li>
 *   <li>{@link DeckMaster.PlainDocument#getAuthor <em>Author</em>}</li>
 *   <li>{@link DeckMaster.PlainDocument#getReport <em>Report</em>}</li>
 *   <li>{@link DeckMaster.PlainDocument#getSection <em>Section</em>}</li>
 * </ul>
 *
 * @see DeckMaster.DeckMasterPackage#getPlainDocument()
 * @model
 * @generated
 */
public interface PlainDocument extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see DeckMaster.DeckMasterPackage#getPlainDocument_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link DeckMaster.PlainDocument#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see DeckMaster.DeckMasterPackage#getPlainDocument_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link DeckMaster.PlainDocument#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Report</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report</em>' containment reference.
	 * @see #setReport(PlainReport)
	 * @see DeckMaster.DeckMasterPackage#getPlainDocument_Report()
	 * @model containment="true"
	 * @generated
	 */
	PlainReport getReport();

	/**
	 * Sets the value of the '{@link DeckMaster.PlainDocument#getReport <em>Report</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report</em>' containment reference.
	 * @see #getReport()
	 * @generated
	 */
	void setReport(PlainReport value);

	/**
	 * Returns the value of the '<em><b>Section</b></em>' containment reference list.
	 * The list contents are of type {@link DeckMaster.PlainSection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section</em>' containment reference list.
	 * @see DeckMaster.DeckMasterPackage#getPlainDocument_Section()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlainSection> getSection();

} // PlainDocument

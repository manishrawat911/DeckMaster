/**
 */
package DeckMaster.DeckMaster;

import DeckMaster.PlainColumn;
import DeckMaster.PlainRow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plain Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DeckMaster.DeckMaster.PlainTable#getCaption <em>Caption</em>}</li>
 *   <li>{@link DeckMaster.DeckMaster.PlainTable#getColumns <em>Columns</em>}</li>
 *   <li>{@link DeckMaster.DeckMaster.PlainTable#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @see DeckMaster.DeckMaster.DeckMasterPackage#getPlainTable()
 * @model
 * @generated
 */
public interface PlainTable extends EObject {
	/**
	 * Returns the value of the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption</em>' attribute.
	 * @see #setCaption(String)
	 * @see DeckMaster.DeckMaster.DeckMasterPackage#getPlainTable_Caption()
	 * @model
	 * @generated
	 */
	String getCaption();

	/**
	 * Sets the value of the '{@link DeckMaster.DeckMaster.PlainTable#getCaption <em>Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption</em>' attribute.
	 * @see #getCaption()
	 * @generated
	 */
	void setCaption(String value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link DeckMaster.PlainColumn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see DeckMaster.DeckMaster.DeckMasterPackage#getPlainTable_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlainColumn> getColumns();

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link DeckMaster.PlainRow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see DeckMaster.DeckMaster.DeckMasterPackage#getPlainTable_Rows()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlainRow> getRows();

} // PlainTable

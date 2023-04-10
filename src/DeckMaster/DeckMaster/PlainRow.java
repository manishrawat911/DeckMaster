/**
 */
package DeckMaster.DeckMaster;

import DeckMaster.PlainCell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plain Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DeckMaster.DeckMaster.PlainRow#getCells <em>Cells</em>}</li>
 * </ul>
 *
 * @see DeckMaster.DeckMaster.DeckMasterPackage#getPlainRow()
 * @model
 * @generated
 */
public interface PlainRow extends EObject {
	/**
	 * Returns the value of the '<em><b>Cells</b></em>' containment reference list.
	 * The list contents are of type {@link DeckMaster.PlainCell}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cells</em>' containment reference list.
	 * @see DeckMaster.DeckMaster.DeckMasterPackage#getPlainRow_Cells()
	 * @model containment="true"
	 * @generated
	 */
	EList<PlainCell> getCells();

} // PlainRow

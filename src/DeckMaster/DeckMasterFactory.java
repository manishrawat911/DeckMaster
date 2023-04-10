/**
 */
package DeckMaster;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see DeckMaster.DeckMasterPackage
 * @generated
 */
public interface DeckMasterFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeckMasterFactory eINSTANCE = DeckMaster.impl.DeckMasterFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Plain Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plain Document</em>'.
	 * @generated
	 */
	PlainDocument createPlainDocument();

	/**
	 * Returns a new object of class '<em>Plain Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plain Report</em>'.
	 * @generated
	 */
	PlainReport createPlainReport();

	/**
	 * Returns a new object of class '<em>Plain Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plain Section</em>'.
	 * @generated
	 */
	PlainSection createPlainSection();

	/**
	 * Returns a new object of class '<em>Plain Images</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plain Images</em>'.
	 * @generated
	 */
	PlainImages createPlainImages();

	/**
	 * Returns a new object of class '<em>Plain Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plain Table</em>'.
	 * @generated
	 */
	PlainTable createPlainTable();

	/**
	 * Returns a new object of class '<em>Plain Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plain Column</em>'.
	 * @generated
	 */
	PlainColumn createPlainColumn();

	/**
	 * Returns a new object of class '<em>Plain Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plain Row</em>'.
	 * @generated
	 */
	PlainRow createPlainRow();

	/**
	 * Returns a new object of class '<em>Plain Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plain Cell</em>'.
	 * @generated
	 */
	PlainCell createPlainCell();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DeckMasterPackage getDeckMasterPackage();

} //DeckMasterFactory

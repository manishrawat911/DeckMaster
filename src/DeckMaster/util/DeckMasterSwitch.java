/**
 */
package DeckMaster.util;

import DeckMaster.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see DeckMaster.DeckMasterPackage
 * @generated
 */
public class DeckMasterSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DeckMasterPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeckMasterSwitch() {
		if (modelPackage == null) {
			modelPackage = DeckMasterPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DeckMasterPackage.PLAIN_DOCUMENT: {
				PlainDocument plainDocument = (PlainDocument)theEObject;
				T result = casePlainDocument(plainDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeckMasterPackage.PLAIN_REPORT: {
				PlainReport plainReport = (PlainReport)theEObject;
				T result = casePlainReport(plainReport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeckMasterPackage.PLAIN_SECTION: {
				PlainSection plainSection = (PlainSection)theEObject;
				T result = casePlainSection(plainSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeckMasterPackage.PLAIN_IMAGES: {
				PlainImages plainImages = (PlainImages)theEObject;
				T result = casePlainImages(plainImages);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeckMasterPackage.PLAIN_TABLE: {
				PlainTable plainTable = (PlainTable)theEObject;
				T result = casePlainTable(plainTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeckMasterPackage.PLAIN_COLUMN: {
				PlainColumn plainColumn = (PlainColumn)theEObject;
				T result = casePlainColumn(plainColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeckMasterPackage.PLAIN_ROW: {
				PlainRow plainRow = (PlainRow)theEObject;
				T result = casePlainRow(plainRow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeckMasterPackage.PLAIN_CELL: {
				PlainCell plainCell = (PlainCell)theEObject;
				T result = casePlainCell(plainCell);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plain Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plain Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlainDocument(PlainDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plain Report</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plain Report</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlainReport(PlainReport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plain Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plain Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlainSection(PlainSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plain Images</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plain Images</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlainImages(PlainImages object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plain Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plain Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlainTable(PlainTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plain Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plain Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlainColumn(PlainColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plain Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plain Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlainRow(PlainRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plain Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plain Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlainCell(PlainCell object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DeckMasterSwitch

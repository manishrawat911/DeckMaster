/**
 */
package DeckMaster.DeckMaster.impl;

import DeckMaster.DeckMaster.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeckMasterFactoryImpl extends EFactoryImpl implements DeckMasterFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeckMasterFactory init() {
		try {
			DeckMasterFactory theDeckMasterFactory = (DeckMasterFactory)EPackage.Registry.INSTANCE.getEFactory(DeckMasterPackage.eNS_URI);
			if (theDeckMasterFactory != null) {
				return theDeckMasterFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DeckMasterFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeckMasterFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DeckMasterPackage.PLAIN_DOCUMENT: return createPlainDocument();
			case DeckMasterPackage.PLAIN_REPORT: return createPlainReport();
			case DeckMasterPackage.PLAIN_SECTION: return createPlainSection();
			case DeckMasterPackage.PLAIN_IMAGES: return createPlainImages();
			case DeckMasterPackage.PLAIN_TABLE: return createPlainTable();
			case DeckMasterPackage.PLAIN_COLUMN: return createPlainColumn();
			case DeckMasterPackage.PLAIN_ROW: return createPlainRow();
			case DeckMasterPackage.PLAIN_CELL: return createPlainCell();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainDocument createPlainDocument() {
		PlainDocumentImpl plainDocument = new PlainDocumentImpl();
		return plainDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainReport createPlainReport() {
		PlainReportImpl plainReport = new PlainReportImpl();
		return plainReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainSection createPlainSection() {
		PlainSectionImpl plainSection = new PlainSectionImpl();
		return plainSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainImages createPlainImages() {
		PlainImagesImpl plainImages = new PlainImagesImpl();
		return plainImages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainTable createPlainTable() {
		PlainTableImpl plainTable = new PlainTableImpl();
		return plainTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainColumn createPlainColumn() {
		PlainColumnImpl plainColumn = new PlainColumnImpl();
		return plainColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainRow createPlainRow() {
		PlainRowImpl plainRow = new PlainRowImpl();
		return plainRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainCell createPlainCell() {
		PlainCellImpl plainCell = new PlainCellImpl();
		return plainCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeckMasterPackage getDeckMasterPackage() {
		return (DeckMasterPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DeckMasterPackage getPackage() {
		return DeckMasterPackage.eINSTANCE;
	}

} //DeckMasterFactoryImpl

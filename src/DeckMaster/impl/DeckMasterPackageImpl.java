/**
 */
package DeckMaster.impl;

import DeckMaster.DeckMasterFactory;
import DeckMaster.DeckMasterPackage;
import DeckMaster.PlainCell;
import DeckMaster.PlainColumn;
import DeckMaster.PlainDocument;
import DeckMaster.PlainImages;
import DeckMaster.PlainReport;
import DeckMaster.PlainRow;
import DeckMaster.PlainSection;
import DeckMaster.PlainTable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeckMasterPackageImpl extends EPackageImpl implements DeckMasterPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plainDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plainReportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plainSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plainImagesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plainTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plainColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plainRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plainCellEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see DeckMaster.DeckMasterPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DeckMasterPackageImpl() {
		super(eNS_URI, DeckMasterFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DeckMasterPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DeckMasterPackage init() {
		if (isInited) return (DeckMasterPackage)EPackage.Registry.INSTANCE.getEPackage(DeckMasterPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDeckMasterPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DeckMasterPackageImpl theDeckMasterPackage = registeredDeckMasterPackage instanceof DeckMasterPackageImpl ? (DeckMasterPackageImpl)registeredDeckMasterPackage : new DeckMasterPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DeckMaster.DeckMaster.DeckMasterPackage.eNS_URI);
		DeckMaster.DeckMaster.impl.DeckMasterPackageImpl theDeckMasterPackage_1 = (DeckMaster.DeckMaster.impl.DeckMasterPackageImpl)(registeredPackage instanceof DeckMaster.DeckMaster.impl.DeckMasterPackageImpl ? registeredPackage : DeckMaster.DeckMaster.DeckMasterPackage.eINSTANCE);

		// Create package meta-data objects
		theDeckMasterPackage.createPackageContents();
		theDeckMasterPackage_1.createPackageContents();

		// Initialize created meta-data
		theDeckMasterPackage.initializePackageContents();
		theDeckMasterPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDeckMasterPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DeckMasterPackage.eNS_URI, theDeckMasterPackage);
		return theDeckMasterPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlainDocument() {
		return plainDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainDocument_Name() {
		return (EAttribute)plainDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainDocument_Author() {
		return (EAttribute)plainDocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlainDocument_Report() {
		return (EReference)plainDocumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlainDocument_Section() {
		return (EReference)plainDocumentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlainReport() {
		return plainReportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainReport_Name() {
		return (EAttribute)plainReportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainReport_Summary() {
		return (EAttribute)plainReportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainReport_Introduction() {
		return (EAttribute)plainReportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainReport_Conclusion() {
		return (EAttribute)plainReportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlainReport_Sections() {
		return (EReference)plainReportEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlainSection() {
		return plainSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainSection_Name() {
		return (EAttribute)plainSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainSection_Body() {
		return (EAttribute)plainSectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlainSection_SubSection() {
		return (EReference)plainSectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlainSection_Images() {
		return (EReference)plainSectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlainSection_Tables() {
		return (EReference)plainSectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlainSection_PartOf() {
		return (EReference)plainSectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlainImages() {
		return plainImagesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainImages_Uri() {
		return (EAttribute)plainImagesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainImages_ImageTitle() {
		return (EAttribute)plainImagesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlainTable() {
		return plainTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainTable_Caption() {
		return (EAttribute)plainTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlainTable_Columns() {
		return (EReference)plainTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlainTable_Rows() {
		return (EReference)plainTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlainColumn() {
		return plainColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainColumn_Name() {
		return (EAttribute)plainColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlainRow() {
		return plainRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlainRow_Cells() {
		return (EReference)plainRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlainCell() {
		return plainCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlainCell_Value() {
		return (EAttribute)plainCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeckMasterFactory getDeckMasterFactory() {
		return (DeckMasterFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		plainDocumentEClass = createEClass(PLAIN_DOCUMENT);
		createEAttribute(plainDocumentEClass, PLAIN_DOCUMENT__NAME);
		createEAttribute(plainDocumentEClass, PLAIN_DOCUMENT__AUTHOR);
		createEReference(plainDocumentEClass, PLAIN_DOCUMENT__REPORT);
		createEReference(plainDocumentEClass, PLAIN_DOCUMENT__SECTION);

		plainReportEClass = createEClass(PLAIN_REPORT);
		createEAttribute(plainReportEClass, PLAIN_REPORT__NAME);
		createEAttribute(plainReportEClass, PLAIN_REPORT__SUMMARY);
		createEAttribute(plainReportEClass, PLAIN_REPORT__INTRODUCTION);
		createEAttribute(plainReportEClass, PLAIN_REPORT__CONCLUSION);
		createEReference(plainReportEClass, PLAIN_REPORT__SECTIONS);

		plainSectionEClass = createEClass(PLAIN_SECTION);
		createEAttribute(plainSectionEClass, PLAIN_SECTION__NAME);
		createEAttribute(plainSectionEClass, PLAIN_SECTION__BODY);
		createEReference(plainSectionEClass, PLAIN_SECTION__SUB_SECTION);
		createEReference(plainSectionEClass, PLAIN_SECTION__IMAGES);
		createEReference(plainSectionEClass, PLAIN_SECTION__TABLES);
		createEReference(plainSectionEClass, PLAIN_SECTION__PART_OF);

		plainImagesEClass = createEClass(PLAIN_IMAGES);
		createEAttribute(plainImagesEClass, PLAIN_IMAGES__URI);
		createEAttribute(plainImagesEClass, PLAIN_IMAGES__IMAGE_TITLE);

		plainTableEClass = createEClass(PLAIN_TABLE);
		createEAttribute(plainTableEClass, PLAIN_TABLE__CAPTION);
		createEReference(plainTableEClass, PLAIN_TABLE__COLUMNS);
		createEReference(plainTableEClass, PLAIN_TABLE__ROWS);

		plainColumnEClass = createEClass(PLAIN_COLUMN);
		createEAttribute(plainColumnEClass, PLAIN_COLUMN__NAME);

		plainRowEClass = createEClass(PLAIN_ROW);
		createEReference(plainRowEClass, PLAIN_ROW__CELLS);

		plainCellEClass = createEClass(PLAIN_CELL);
		createEAttribute(plainCellEClass, PLAIN_CELL__VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DeckMaster.DeckMaster.DeckMasterPackage theDeckMasterPackage_1 = (DeckMaster.DeckMaster.DeckMasterPackage)EPackage.Registry.INSTANCE.getEPackage(DeckMaster.DeckMaster.DeckMasterPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theDeckMasterPackage_1);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(plainDocumentEClass, PlainDocument.class, "PlainDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlainDocument_Name(), ecorePackage.getEString(), "name", null, 0, 1, PlainDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlainDocument_Author(), ecorePackage.getEString(), "author", null, 0, 1, PlainDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlainDocument_Report(), this.getPlainReport(), null, "report", null, 0, 1, PlainDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlainDocument_Section(), this.getPlainSection(), null, "section", null, 0, -1, PlainDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plainReportEClass, PlainReport.class, "PlainReport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlainReport_Name(), ecorePackage.getEString(), "name", null, 0, 1, PlainReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlainReport_Summary(), ecorePackage.getEString(), "summary", null, 0, 1, PlainReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlainReport_Introduction(), ecorePackage.getEString(), "introduction", null, 0, 1, PlainReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlainReport_Conclusion(), ecorePackage.getEString(), "conclusion", null, 0, 1, PlainReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlainReport_Sections(), this.getPlainSection(), this.getPlainSection_PartOf(), "sections", null, 0, -1, PlainReport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plainSectionEClass, PlainSection.class, "PlainSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlainSection_Name(), ecorePackage.getEString(), "name", null, 0, 1, PlainSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlainSection_Body(), ecorePackage.getEString(), "body", null, 0, 1, PlainSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlainSection_SubSection(), this.getPlainSection(), null, "subSection", null, 0, -1, PlainSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlainSection_Images(), this.getPlainImages(), null, "images", null, 0, -1, PlainSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlainSection_Tables(), this.getPlainTable(), null, "tables", null, 0, -1, PlainSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlainSection_PartOf(), this.getPlainReport(), this.getPlainReport_Sections(), "partOf", null, 0, 1, PlainSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plainImagesEClass, PlainImages.class, "PlainImages", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlainImages_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, PlainImages.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlainImages_ImageTitle(), ecorePackage.getEString(), "imageTitle", null, 0, 1, PlainImages.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plainTableEClass, PlainTable.class, "PlainTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlainTable_Caption(), ecorePackage.getEString(), "caption", null, 0, 1, PlainTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlainTable_Columns(), this.getPlainColumn(), null, "columns", null, 0, -1, PlainTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlainTable_Rows(), this.getPlainRow(), null, "rows", null, 0, -1, PlainTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plainColumnEClass, PlainColumn.class, "PlainColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlainColumn_Name(), ecorePackage.getEString(), "name", null, 0, 1, PlainColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plainRowEClass, PlainRow.class, "PlainRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlainRow_Cells(), this.getPlainCell(), null, "cells", null, 0, -1, PlainRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plainCellEClass, PlainCell.class, "PlainCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlainCell_Value(), ecorePackage.getEString(), "value", null, 0, 1, PlainCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DeckMasterPackageImpl

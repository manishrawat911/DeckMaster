/**
 */
package DeckMaster;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see DeckMaster.DeckMasterFactory
 * @model kind="package"
 * @generated
 */
public interface DeckMasterPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DeckMaster";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://deckmaster.base";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "p";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeckMasterPackage eINSTANCE = DeckMaster.impl.DeckMasterPackageImpl.init();

	/**
	 * The meta object id for the '{@link DeckMaster.impl.PlainDocumentImpl <em>Plain Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DeckMaster.impl.PlainDocumentImpl
	 * @see DeckMaster.impl.DeckMasterPackageImpl#getPlainDocument()
	 * @generated
	 */
	int PLAIN_DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_DOCUMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_DOCUMENT__AUTHOR = 1;

	/**
	 * The feature id for the '<em><b>Report</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_DOCUMENT__REPORT = 2;

	/**
	 * The feature id for the '<em><b>Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_DOCUMENT__SECTION = 3;

	/**
	 * The number of structural features of the '<em>Plain Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_DOCUMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Plain Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_DOCUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DeckMaster.impl.PlainReportImpl <em>Plain Report</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DeckMaster.impl.PlainReportImpl
	 * @see DeckMaster.impl.DeckMasterPackageImpl#getPlainReport()
	 * @generated
	 */
	int PLAIN_REPORT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_REPORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_REPORT__SUMMARY = 1;

	/**
	 * The feature id for the '<em><b>Introduction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_REPORT__INTRODUCTION = 2;

	/**
	 * The feature id for the '<em><b>Conclusion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_REPORT__CONCLUSION = 3;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_REPORT__SECTIONS = 4;

	/**
	 * The number of structural features of the '<em>Plain Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_REPORT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Plain Report</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_REPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DeckMaster.impl.PlainSectionImpl <em>Plain Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DeckMaster.impl.PlainSectionImpl
	 * @see DeckMaster.impl.DeckMasterPackageImpl#getPlainSection()
	 * @generated
	 */
	int PLAIN_SECTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_SECTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_SECTION__BODY = 1;

	/**
	 * The feature id for the '<em><b>Sub Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_SECTION__SUB_SECTION = 2;

	/**
	 * The feature id for the '<em><b>Images</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_SECTION__IMAGES = 3;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_SECTION__TABLES = 4;

	/**
	 * The feature id for the '<em><b>Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_SECTION__PART_OF = 5;

	/**
	 * The number of structural features of the '<em>Plain Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_SECTION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Plain Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_SECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DeckMaster.impl.PlainImagesImpl <em>Plain Images</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DeckMaster.impl.PlainImagesImpl
	 * @see DeckMaster.impl.DeckMasterPackageImpl#getPlainImages()
	 * @generated
	 */
	int PLAIN_IMAGES = 3;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_IMAGES__URI = 0;

	/**
	 * The feature id for the '<em><b>Image Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_IMAGES__IMAGE_TITLE = 1;

	/**
	 * The number of structural features of the '<em>Plain Images</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_IMAGES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Plain Images</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_IMAGES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DeckMaster.impl.PlainTableImpl <em>Plain Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DeckMaster.impl.PlainTableImpl
	 * @see DeckMaster.impl.DeckMasterPackageImpl#getPlainTable()
	 * @generated
	 */
	int PLAIN_TABLE = 4;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TABLE__CAPTION = 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TABLE__COLUMNS = 1;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TABLE__ROWS = 2;

	/**
	 * The number of structural features of the '<em>Plain Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Plain Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DeckMaster.impl.PlainColumnImpl <em>Plain Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DeckMaster.impl.PlainColumnImpl
	 * @see DeckMaster.impl.DeckMasterPackageImpl#getPlainColumn()
	 * @generated
	 */
	int PLAIN_COLUMN = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_COLUMN__NAME = 0;

	/**
	 * The number of structural features of the '<em>Plain Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_COLUMN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Plain Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DeckMaster.impl.PlainRowImpl <em>Plain Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DeckMaster.impl.PlainRowImpl
	 * @see DeckMaster.impl.DeckMasterPackageImpl#getPlainRow()
	 * @generated
	 */
	int PLAIN_ROW = 6;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_ROW__CELLS = 0;

	/**
	 * The number of structural features of the '<em>Plain Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_ROW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Plain Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_ROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link DeckMaster.impl.PlainCellImpl <em>Plain Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see DeckMaster.impl.PlainCellImpl
	 * @see DeckMaster.impl.DeckMasterPackageImpl#getPlainCell()
	 * @generated
	 */
	int PLAIN_CELL = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_CELL__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Plain Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_CELL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Plain Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_CELL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link DeckMaster.PlainDocument <em>Plain Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plain Document</em>'.
	 * @see DeckMaster.PlainDocument
	 * @generated
	 */
	EClass getPlainDocument();

	/**
	 * Returns the meta object for the attribute '{@link DeckMaster.PlainDocument#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DeckMaster.PlainDocument#getName()
	 * @see #getPlainDocument()
	 * @generated
	 */
	EAttribute getPlainDocument_Name();

	/**
	 * Returns the meta object for the attribute '{@link DeckMaster.PlainDocument#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see DeckMaster.PlainDocument#getAuthor()
	 * @see #getPlainDocument()
	 * @generated
	 */
	EAttribute getPlainDocument_Author();

	/**
	 * Returns the meta object for the containment reference '{@link DeckMaster.PlainDocument#getReport <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Report</em>'.
	 * @see DeckMaster.PlainDocument#getReport()
	 * @see #getPlainDocument()
	 * @generated
	 */
	EReference getPlainDocument_Report();

	/**
	 * Returns the meta object for the containment reference list '{@link DeckMaster.PlainDocument#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Section</em>'.
	 * @see DeckMaster.PlainDocument#getSection()
	 * @see #getPlainDocument()
	 * @generated
	 */
	EReference getPlainDocument_Section();

	/**
	 * Returns the meta object for class '{@link DeckMaster.PlainReport <em>Plain Report</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plain Report</em>'.
	 * @see DeckMaster.PlainReport
	 * @generated
	 */
	EClass getPlainReport();

	/**
	 * Returns the meta object for the attribute '{@link DeckMaster.PlainReport#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DeckMaster.PlainReport#getName()
	 * @see #getPlainReport()
	 * @generated
	 */
	EAttribute getPlainReport_Name();

	/**
	 * Returns the meta object for the attribute '{@link DeckMaster.PlainReport#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see DeckMaster.PlainReport#getSummary()
	 * @see #getPlainReport()
	 * @generated
	 */
	EAttribute getPlainReport_Summary();

	/**
	 * Returns the meta object for the attribute '{@link DeckMaster.PlainReport#getIntroduction <em>Introduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Introduction</em>'.
	 * @see DeckMaster.PlainReport#getIntroduction()
	 * @see #getPlainReport()
	 * @generated
	 */
	EAttribute getPlainReport_Introduction();

	/**
	 * Returns the meta object for the attribute '{@link DeckMaster.PlainReport#getConclusion <em>Conclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conclusion</em>'.
	 * @see DeckMaster.PlainReport#getConclusion()
	 * @see #getPlainReport()
	 * @generated
	 */
	EAttribute getPlainReport_Conclusion();

	/**
	 * Returns the meta object for the reference list '{@link DeckMaster.PlainReport#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sections</em>'.
	 * @see DeckMaster.PlainReport#getSections()
	 * @see #getPlainReport()
	 * @generated
	 */
	EReference getPlainReport_Sections();

	/**
	 * Returns the meta object for class '{@link DeckMaster.PlainSection <em>Plain Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plain Section</em>'.
	 * @see DeckMaster.PlainSection
	 * @generated
	 */
	EClass getPlainSection();

	/**
	 * Returns the meta object for the attribute '{@link DeckMaster.PlainSection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DeckMaster.PlainSection#getName()
	 * @see #getPlainSection()
	 * @generated
	 */
	EAttribute getPlainSection_Name();

	/**
	 * Returns the meta object for the attribute '{@link DeckMaster.PlainSection#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see DeckMaster.PlainSection#getBody()
	 * @see #getPlainSection()
	 * @generated
	 */
	EAttribute getPlainSection_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link DeckMaster.PlainSection#getSubSection <em>Sub Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Section</em>'.
	 * @see DeckMaster.PlainSection#getSubSection()
	 * @see #getPlainSection()
	 * @generated
	 */
	EReference getPlainSection_SubSection();

	/**
	 * Returns the meta object for the containment reference list '{@link DeckMaster.PlainSection#getImages <em>Images</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Images</em>'.
	 * @see DeckMaster.PlainSection#getImages()
	 * @see #getPlainSection()
	 * @generated
	 */
	EReference getPlainSection_Images();

	/**
	 * Returns the meta object for the containment reference list '{@link DeckMaster.PlainSection#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see DeckMaster.PlainSection#getTables()
	 * @see #getPlainSection()
	 * @generated
	 */
	EReference getPlainSection_Tables();

	/**
	 * Returns the meta object for the reference '{@link DeckMaster.PlainSection#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Part Of</em>'.
	 * @see DeckMaster.PlainSection#getPartOf()
	 * @see #getPlainSection()
	 * @generated
	 */
	EReference getPlainSection_PartOf();

	/**
	 * Returns the meta object for class '{@link DeckMaster.PlainImages <em>Plain Images</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plain Images</em>'.
	 * @see DeckMaster.PlainImages
	 * @generated
	 */
	EClass getPlainImages();

	/**
	 * Returns the meta object for the attribute '{@link DeckMaster.PlainImages#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see DeckMaster.PlainImages#getUri()
	 * @see #getPlainImages()
	 * @generated
	 */
	EAttribute getPlainImages_Uri();

	/**
	 * Returns the meta object for the attribute '{@link DeckMaster.PlainImages#getImageTitle <em>Image Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Title</em>'.
	 * @see DeckMaster.PlainImages#getImageTitle()
	 * @see #getPlainImages()
	 * @generated
	 */
	EAttribute getPlainImages_ImageTitle();

	/**
	 * Returns the meta object for class '{@link DeckMaster.PlainTable <em>Plain Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plain Table</em>'.
	 * @see DeckMaster.PlainTable
	 * @generated
	 */
	EClass getPlainTable();

	/**
	 * Returns the meta object for the attribute '{@link DeckMaster.PlainTable#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption</em>'.
	 * @see DeckMaster.PlainTable#getCaption()
	 * @see #getPlainTable()
	 * @generated
	 */
	EAttribute getPlainTable_Caption();

	/**
	 * Returns the meta object for the containment reference list '{@link DeckMaster.PlainTable#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see DeckMaster.PlainTable#getColumns()
	 * @see #getPlainTable()
	 * @generated
	 */
	EReference getPlainTable_Columns();

	/**
	 * Returns the meta object for the containment reference list '{@link DeckMaster.PlainTable#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see DeckMaster.PlainTable#getRows()
	 * @see #getPlainTable()
	 * @generated
	 */
	EReference getPlainTable_Rows();

	/**
	 * Returns the meta object for class '{@link DeckMaster.PlainColumn <em>Plain Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plain Column</em>'.
	 * @see DeckMaster.PlainColumn
	 * @generated
	 */
	EClass getPlainColumn();

	/**
	 * Returns the meta object for the attribute '{@link DeckMaster.PlainColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see DeckMaster.PlainColumn#getName()
	 * @see #getPlainColumn()
	 * @generated
	 */
	EAttribute getPlainColumn_Name();

	/**
	 * Returns the meta object for class '{@link DeckMaster.PlainRow <em>Plain Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plain Row</em>'.
	 * @see DeckMaster.PlainRow
	 * @generated
	 */
	EClass getPlainRow();

	/**
	 * Returns the meta object for the containment reference list '{@link DeckMaster.PlainRow#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see DeckMaster.PlainRow#getCells()
	 * @see #getPlainRow()
	 * @generated
	 */
	EReference getPlainRow_Cells();

	/**
	 * Returns the meta object for class '{@link DeckMaster.PlainCell <em>Plain Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plain Cell</em>'.
	 * @see DeckMaster.PlainCell
	 * @generated
	 */
	EClass getPlainCell();

	/**
	 * Returns the meta object for the attribute '{@link DeckMaster.PlainCell#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see DeckMaster.PlainCell#getValue()
	 * @see #getPlainCell()
	 * @generated
	 */
	EAttribute getPlainCell_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DeckMasterFactory getDeckMasterFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link DeckMaster.impl.PlainDocumentImpl <em>Plain Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DeckMaster.impl.PlainDocumentImpl
		 * @see DeckMaster.impl.DeckMasterPackageImpl#getPlainDocument()
		 * @generated
		 */
		EClass PLAIN_DOCUMENT = eINSTANCE.getPlainDocument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_DOCUMENT__NAME = eINSTANCE.getPlainDocument_Name();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_DOCUMENT__AUTHOR = eINSTANCE.getPlainDocument_Author();

		/**
		 * The meta object literal for the '<em><b>Report</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAIN_DOCUMENT__REPORT = eINSTANCE.getPlainDocument_Report();

		/**
		 * The meta object literal for the '<em><b>Section</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAIN_DOCUMENT__SECTION = eINSTANCE.getPlainDocument_Section();

		/**
		 * The meta object literal for the '{@link DeckMaster.impl.PlainReportImpl <em>Plain Report</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DeckMaster.impl.PlainReportImpl
		 * @see DeckMaster.impl.DeckMasterPackageImpl#getPlainReport()
		 * @generated
		 */
		EClass PLAIN_REPORT = eINSTANCE.getPlainReport();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_REPORT__NAME = eINSTANCE.getPlainReport_Name();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_REPORT__SUMMARY = eINSTANCE.getPlainReport_Summary();

		/**
		 * The meta object literal for the '<em><b>Introduction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_REPORT__INTRODUCTION = eINSTANCE.getPlainReport_Introduction();

		/**
		 * The meta object literal for the '<em><b>Conclusion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_REPORT__CONCLUSION = eINSTANCE.getPlainReport_Conclusion();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAIN_REPORT__SECTIONS = eINSTANCE.getPlainReport_Sections();

		/**
		 * The meta object literal for the '{@link DeckMaster.impl.PlainSectionImpl <em>Plain Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DeckMaster.impl.PlainSectionImpl
		 * @see DeckMaster.impl.DeckMasterPackageImpl#getPlainSection()
		 * @generated
		 */
		EClass PLAIN_SECTION = eINSTANCE.getPlainSection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_SECTION__NAME = eINSTANCE.getPlainSection_Name();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_SECTION__BODY = eINSTANCE.getPlainSection_Body();

		/**
		 * The meta object literal for the '<em><b>Sub Section</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAIN_SECTION__SUB_SECTION = eINSTANCE.getPlainSection_SubSection();

		/**
		 * The meta object literal for the '<em><b>Images</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAIN_SECTION__IMAGES = eINSTANCE.getPlainSection_Images();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAIN_SECTION__TABLES = eINSTANCE.getPlainSection_Tables();

		/**
		 * The meta object literal for the '<em><b>Part Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAIN_SECTION__PART_OF = eINSTANCE.getPlainSection_PartOf();

		/**
		 * The meta object literal for the '{@link DeckMaster.impl.PlainImagesImpl <em>Plain Images</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DeckMaster.impl.PlainImagesImpl
		 * @see DeckMaster.impl.DeckMasterPackageImpl#getPlainImages()
		 * @generated
		 */
		EClass PLAIN_IMAGES = eINSTANCE.getPlainImages();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_IMAGES__URI = eINSTANCE.getPlainImages_Uri();

		/**
		 * The meta object literal for the '<em><b>Image Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_IMAGES__IMAGE_TITLE = eINSTANCE.getPlainImages_ImageTitle();

		/**
		 * The meta object literal for the '{@link DeckMaster.impl.PlainTableImpl <em>Plain Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DeckMaster.impl.PlainTableImpl
		 * @see DeckMaster.impl.DeckMasterPackageImpl#getPlainTable()
		 * @generated
		 */
		EClass PLAIN_TABLE = eINSTANCE.getPlainTable();

		/**
		 * The meta object literal for the '<em><b>Caption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_TABLE__CAPTION = eINSTANCE.getPlainTable_Caption();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAIN_TABLE__COLUMNS = eINSTANCE.getPlainTable_Columns();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAIN_TABLE__ROWS = eINSTANCE.getPlainTable_Rows();

		/**
		 * The meta object literal for the '{@link DeckMaster.impl.PlainColumnImpl <em>Plain Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DeckMaster.impl.PlainColumnImpl
		 * @see DeckMaster.impl.DeckMasterPackageImpl#getPlainColumn()
		 * @generated
		 */
		EClass PLAIN_COLUMN = eINSTANCE.getPlainColumn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_COLUMN__NAME = eINSTANCE.getPlainColumn_Name();

		/**
		 * The meta object literal for the '{@link DeckMaster.impl.PlainRowImpl <em>Plain Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DeckMaster.impl.PlainRowImpl
		 * @see DeckMaster.impl.DeckMasterPackageImpl#getPlainRow()
		 * @generated
		 */
		EClass PLAIN_ROW = eINSTANCE.getPlainRow();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAIN_ROW__CELLS = eINSTANCE.getPlainRow_Cells();

		/**
		 * The meta object literal for the '{@link DeckMaster.impl.PlainCellImpl <em>Plain Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see DeckMaster.impl.PlainCellImpl
		 * @see DeckMaster.impl.DeckMasterPackageImpl#getPlainCell()
		 * @generated
		 */
		EClass PLAIN_CELL = eINSTANCE.getPlainCell();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAIN_CELL__VALUE = eINSTANCE.getPlainCell_Value();

	}

} //DeckMasterPackage

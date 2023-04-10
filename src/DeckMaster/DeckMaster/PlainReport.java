/**
 */
package DeckMaster.DeckMaster;

import DeckMaster.PlainSection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plain Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link DeckMaster.DeckMaster.PlainReport#getName <em>Name</em>}</li>
 *   <li>{@link DeckMaster.DeckMaster.PlainReport#getSummary <em>Summary</em>}</li>
 *   <li>{@link DeckMaster.DeckMaster.PlainReport#getIntroduction <em>Introduction</em>}</li>
 *   <li>{@link DeckMaster.DeckMaster.PlainReport#getConclusion <em>Conclusion</em>}</li>
 *   <li>{@link DeckMaster.DeckMaster.PlainReport#getSections <em>Sections</em>}</li>
 * </ul>
 *
 * @see DeckMaster.DeckMaster.DeckMasterPackage#getPlainReport()
 * @model
 * @generated
 */
public interface PlainReport extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see DeckMaster.DeckMaster.DeckMasterPackage#getPlainReport_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link DeckMaster.DeckMaster.PlainReport#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see DeckMaster.DeckMaster.DeckMasterPackage#getPlainReport_Summary()
	 * @model
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link DeckMaster.DeckMaster.PlainReport#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

	/**
	 * Returns the value of the '<em><b>Introduction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Introduction</em>' attribute.
	 * @see #setIntroduction(String)
	 * @see DeckMaster.DeckMaster.DeckMasterPackage#getPlainReport_Introduction()
	 * @model
	 * @generated
	 */
	String getIntroduction();

	/**
	 * Sets the value of the '{@link DeckMaster.DeckMaster.PlainReport#getIntroduction <em>Introduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Introduction</em>' attribute.
	 * @see #getIntroduction()
	 * @generated
	 */
	void setIntroduction(String value);

	/**
	 * Returns the value of the '<em><b>Conclusion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conclusion</em>' attribute.
	 * @see #setConclusion(String)
	 * @see DeckMaster.DeckMaster.DeckMasterPackage#getPlainReport_Conclusion()
	 * @model
	 * @generated
	 */
	String getConclusion();

	/**
	 * Sets the value of the '{@link DeckMaster.DeckMaster.PlainReport#getConclusion <em>Conclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conclusion</em>' attribute.
	 * @see #getConclusion()
	 * @generated
	 */
	void setConclusion(String value);

	/**
	 * Returns the value of the '<em><b>Sections</b></em>' reference list.
	 * The list contents are of type {@link DeckMaster.PlainSection}.
	 * It is bidirectional and its opposite is '{@link DeckMaster.PlainSection#getPartOf <em>Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' reference list.
	 * @see DeckMaster.DeckMaster.DeckMasterPackage#getPlainReport_Sections()
	 * @see DeckMaster.PlainSection#getPartOf
	 * @model opposite="partOf"
	 * @generated
	 */
	EList<PlainSection> getSections();

} // PlainReport

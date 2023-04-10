/**
 */
package DeckMaster.DeckMaster.impl;

import DeckMaster.DeckMaster.DeckMasterPackage;
import DeckMaster.DeckMaster.PlainReport;

import DeckMaster.PlainSection;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plain Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DeckMaster.DeckMaster.impl.PlainReportImpl#getName <em>Name</em>}</li>
 *   <li>{@link DeckMaster.DeckMaster.impl.PlainReportImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link DeckMaster.DeckMaster.impl.PlainReportImpl#getIntroduction <em>Introduction</em>}</li>
 *   <li>{@link DeckMaster.DeckMaster.impl.PlainReportImpl#getConclusion <em>Conclusion</em>}</li>
 *   <li>{@link DeckMaster.DeckMaster.impl.PlainReportImpl#getSections <em>Sections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlainReportImpl extends MinimalEObjectImpl.Container implements PlainReport {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected String summary = SUMMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntroduction() <em>Introduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntroduction()
	 * @generated
	 * @ordered
	 */
	protected static final String INTRODUCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntroduction() <em>Introduction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntroduction()
	 * @generated
	 * @ordered
	 */
	protected String introduction = INTRODUCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getConclusion() <em>Conclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConclusion()
	 * @generated
	 * @ordered
	 */
	protected static final String CONCLUSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConclusion() <em>Conclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConclusion()
	 * @generated
	 * @ordered
	 */
	protected String conclusion = CONCLUSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSections() <em>Sections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSections()
	 * @generated
	 * @ordered
	 */
	protected EList<PlainSection> sections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlainReportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeckMasterPackage.Literals.PLAIN_REPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeckMasterPackage.PLAIN_REPORT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSummary(String newSummary) {
		String oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeckMasterPackage.PLAIN_REPORT__SUMMARY, oldSummary, summary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIntroduction() {
		return introduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntroduction(String newIntroduction) {
		String oldIntroduction = introduction;
		introduction = newIntroduction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeckMasterPackage.PLAIN_REPORT__INTRODUCTION, oldIntroduction, introduction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConclusion() {
		return conclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConclusion(String newConclusion) {
		String oldConclusion = conclusion;
		conclusion = newConclusion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeckMasterPackage.PLAIN_REPORT__CONCLUSION, oldConclusion, conclusion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlainSection> getSections() {
		if (sections == null) {
			sections = new EObjectWithInverseResolvingEList<PlainSection>(PlainSection.class, this, DeckMasterPackage.PLAIN_REPORT__SECTIONS, DeckMaster.DeckMasterPackage.PLAIN_SECTION__PART_OF);
		}
		return sections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeckMasterPackage.PLAIN_REPORT__SECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSections()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeckMasterPackage.PLAIN_REPORT__SECTIONS:
				return ((InternalEList<?>)getSections()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeckMasterPackage.PLAIN_REPORT__NAME:
				return getName();
			case DeckMasterPackage.PLAIN_REPORT__SUMMARY:
				return getSummary();
			case DeckMasterPackage.PLAIN_REPORT__INTRODUCTION:
				return getIntroduction();
			case DeckMasterPackage.PLAIN_REPORT__CONCLUSION:
				return getConclusion();
			case DeckMasterPackage.PLAIN_REPORT__SECTIONS:
				return getSections();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DeckMasterPackage.PLAIN_REPORT__NAME:
				setName((String)newValue);
				return;
			case DeckMasterPackage.PLAIN_REPORT__SUMMARY:
				setSummary((String)newValue);
				return;
			case DeckMasterPackage.PLAIN_REPORT__INTRODUCTION:
				setIntroduction((String)newValue);
				return;
			case DeckMasterPackage.PLAIN_REPORT__CONCLUSION:
				setConclusion((String)newValue);
				return;
			case DeckMasterPackage.PLAIN_REPORT__SECTIONS:
				getSections().clear();
				getSections().addAll((Collection<? extends PlainSection>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DeckMasterPackage.PLAIN_REPORT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DeckMasterPackage.PLAIN_REPORT__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case DeckMasterPackage.PLAIN_REPORT__INTRODUCTION:
				setIntroduction(INTRODUCTION_EDEFAULT);
				return;
			case DeckMasterPackage.PLAIN_REPORT__CONCLUSION:
				setConclusion(CONCLUSION_EDEFAULT);
				return;
			case DeckMasterPackage.PLAIN_REPORT__SECTIONS:
				getSections().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DeckMasterPackage.PLAIN_REPORT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DeckMasterPackage.PLAIN_REPORT__SUMMARY:
				return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
			case DeckMasterPackage.PLAIN_REPORT__INTRODUCTION:
				return INTRODUCTION_EDEFAULT == null ? introduction != null : !INTRODUCTION_EDEFAULT.equals(introduction);
			case DeckMasterPackage.PLAIN_REPORT__CONCLUSION:
				return CONCLUSION_EDEFAULT == null ? conclusion != null : !CONCLUSION_EDEFAULT.equals(conclusion);
			case DeckMasterPackage.PLAIN_REPORT__SECTIONS:
				return sections != null && !sections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", summary: ");
		result.append(summary);
		result.append(", introduction: ");
		result.append(introduction);
		result.append(", conclusion: ");
		result.append(conclusion);
		result.append(')');
		return result.toString();
	}

} //PlainReportImpl

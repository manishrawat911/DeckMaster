/**
 */
package DeckMaster.DeckMaster.impl;

import DeckMaster.DeckMaster.DeckMasterPackage;
import DeckMaster.DeckMaster.PlainSection;

import DeckMaster.PlainImages;
import DeckMaster.PlainReport;
import DeckMaster.PlainTable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plain Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DeckMaster.DeckMaster.impl.PlainSectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link DeckMaster.DeckMaster.impl.PlainSectionImpl#getBody <em>Body</em>}</li>
 *   <li>{@link DeckMaster.DeckMaster.impl.PlainSectionImpl#getSubSection <em>Sub Section</em>}</li>
 *   <li>{@link DeckMaster.DeckMaster.impl.PlainSectionImpl#getImages <em>Images</em>}</li>
 *   <li>{@link DeckMaster.DeckMaster.impl.PlainSectionImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link DeckMaster.DeckMaster.impl.PlainSectionImpl#getPartOf <em>Part Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlainSectionImpl extends MinimalEObjectImpl.Container implements PlainSection {
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
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubSection() <em>Sub Section</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSection()
	 * @generated
	 * @ordered
	 */
	protected EList<DeckMaster.PlainSection> subSection;

	/**
	 * The cached value of the '{@link #getImages() <em>Images</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImages()
	 * @generated
	 * @ordered
	 */
	protected EList<PlainImages> images;

	/**
	 * The cached value of the '{@link #getTables() <em>Tables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTables()
	 * @generated
	 * @ordered
	 */
	protected EList<PlainTable> tables;

	/**
	 * The cached value of the '{@link #getPartOf() <em>Part Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOf()
	 * @generated
	 * @ordered
	 */
	protected PlainReport partOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlainSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeckMasterPackage.Literals.PLAIN_SECTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeckMasterPackage.PLAIN_SECTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeckMasterPackage.PLAIN_SECTION__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeckMaster.PlainSection> getSubSection() {
		if (subSection == null) {
			subSection = new EObjectContainmentEList<DeckMaster.PlainSection>(DeckMaster.PlainSection.class, this, DeckMasterPackage.PLAIN_SECTION__SUB_SECTION);
		}
		return subSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlainImages> getImages() {
		if (images == null) {
			images = new EObjectContainmentEList<PlainImages>(PlainImages.class, this, DeckMasterPackage.PLAIN_SECTION__IMAGES);
		}
		return images;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlainTable> getTables() {
		if (tables == null) {
			tables = new EObjectContainmentEList<PlainTable>(PlainTable.class, this, DeckMasterPackage.PLAIN_SECTION__TABLES);
		}
		return tables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainReport getPartOf() {
		if (partOf != null && partOf.eIsProxy()) {
			InternalEObject oldPartOf = (InternalEObject)partOf;
			partOf = (PlainReport)eResolveProxy(oldPartOf);
			if (partOf != oldPartOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeckMasterPackage.PLAIN_SECTION__PART_OF, oldPartOf, partOf));
			}
		}
		return partOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainReport basicGetPartOf() {
		return partOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartOf(PlainReport newPartOf, NotificationChain msgs) {
		PlainReport oldPartOf = partOf;
		partOf = newPartOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeckMasterPackage.PLAIN_SECTION__PART_OF, oldPartOf, newPartOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartOf(PlainReport newPartOf) {
		if (newPartOf != partOf) {
			NotificationChain msgs = null;
			if (partOf != null)
				msgs = ((InternalEObject)partOf).eInverseRemove(this, DeckMaster.DeckMasterPackage.PLAIN_REPORT__SECTIONS, PlainReport.class, msgs);
			if (newPartOf != null)
				msgs = ((InternalEObject)newPartOf).eInverseAdd(this, DeckMaster.DeckMasterPackage.PLAIN_REPORT__SECTIONS, PlainReport.class, msgs);
			msgs = basicSetPartOf(newPartOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeckMasterPackage.PLAIN_SECTION__PART_OF, newPartOf, newPartOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeckMasterPackage.PLAIN_SECTION__PART_OF:
				if (partOf != null)
					msgs = ((InternalEObject)partOf).eInverseRemove(this, DeckMaster.DeckMasterPackage.PLAIN_REPORT__SECTIONS, PlainReport.class, msgs);
				return basicSetPartOf((PlainReport)otherEnd, msgs);
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
			case DeckMasterPackage.PLAIN_SECTION__SUB_SECTION:
				return ((InternalEList<?>)getSubSection()).basicRemove(otherEnd, msgs);
			case DeckMasterPackage.PLAIN_SECTION__IMAGES:
				return ((InternalEList<?>)getImages()).basicRemove(otherEnd, msgs);
			case DeckMasterPackage.PLAIN_SECTION__TABLES:
				return ((InternalEList<?>)getTables()).basicRemove(otherEnd, msgs);
			case DeckMasterPackage.PLAIN_SECTION__PART_OF:
				return basicSetPartOf(null, msgs);
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
			case DeckMasterPackage.PLAIN_SECTION__NAME:
				return getName();
			case DeckMasterPackage.PLAIN_SECTION__BODY:
				return getBody();
			case DeckMasterPackage.PLAIN_SECTION__SUB_SECTION:
				return getSubSection();
			case DeckMasterPackage.PLAIN_SECTION__IMAGES:
				return getImages();
			case DeckMasterPackage.PLAIN_SECTION__TABLES:
				return getTables();
			case DeckMasterPackage.PLAIN_SECTION__PART_OF:
				if (resolve) return getPartOf();
				return basicGetPartOf();
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
			case DeckMasterPackage.PLAIN_SECTION__NAME:
				setName((String)newValue);
				return;
			case DeckMasterPackage.PLAIN_SECTION__BODY:
				setBody((String)newValue);
				return;
			case DeckMasterPackage.PLAIN_SECTION__SUB_SECTION:
				getSubSection().clear();
				getSubSection().addAll((Collection<? extends DeckMaster.PlainSection>)newValue);
				return;
			case DeckMasterPackage.PLAIN_SECTION__IMAGES:
				getImages().clear();
				getImages().addAll((Collection<? extends PlainImages>)newValue);
				return;
			case DeckMasterPackage.PLAIN_SECTION__TABLES:
				getTables().clear();
				getTables().addAll((Collection<? extends PlainTable>)newValue);
				return;
			case DeckMasterPackage.PLAIN_SECTION__PART_OF:
				setPartOf((PlainReport)newValue);
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
			case DeckMasterPackage.PLAIN_SECTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DeckMasterPackage.PLAIN_SECTION__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case DeckMasterPackage.PLAIN_SECTION__SUB_SECTION:
				getSubSection().clear();
				return;
			case DeckMasterPackage.PLAIN_SECTION__IMAGES:
				getImages().clear();
				return;
			case DeckMasterPackage.PLAIN_SECTION__TABLES:
				getTables().clear();
				return;
			case DeckMasterPackage.PLAIN_SECTION__PART_OF:
				setPartOf((PlainReport)null);
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
			case DeckMasterPackage.PLAIN_SECTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DeckMasterPackage.PLAIN_SECTION__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case DeckMasterPackage.PLAIN_SECTION__SUB_SECTION:
				return subSection != null && !subSection.isEmpty();
			case DeckMasterPackage.PLAIN_SECTION__IMAGES:
				return images != null && !images.isEmpty();
			case DeckMasterPackage.PLAIN_SECTION__TABLES:
				return tables != null && !tables.isEmpty();
			case DeckMasterPackage.PLAIN_SECTION__PART_OF:
				return partOf != null;
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
		result.append(", body: ");
		result.append(body);
		result.append(')');
		return result.toString();
	}

} //PlainSectionImpl

/**
 */
package DeckMaster.DeckMaster.impl;

import DeckMaster.DeckMaster.DeckMasterPackage;
import DeckMaster.DeckMaster.PlainTable;

import DeckMaster.PlainColumn;
import DeckMaster.PlainRow;

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
 * An implementation of the model object '<em><b>Plain Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DeckMaster.DeckMaster.impl.PlainTableImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link DeckMaster.DeckMaster.impl.PlainTableImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link DeckMaster.DeckMaster.impl.PlainTableImpl#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlainTableImpl extends MinimalEObjectImpl.Container implements PlainTable {
	/**
	 * The default value of the '{@link #getCaption() <em>Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaption()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaption() <em>Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaption()
	 * @generated
	 * @ordered
	 */
	protected String caption = CAPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<PlainColumn> columns;

	/**
	 * The cached value of the '{@link #getRows() <em>Rows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected EList<PlainRow> rows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlainTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeckMasterPackage.Literals.PLAIN_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCaption() {
		return caption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaption(String newCaption) {
		String oldCaption = caption;
		caption = newCaption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeckMasterPackage.PLAIN_TABLE__CAPTION, oldCaption, caption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlainColumn> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentEList<PlainColumn>(PlainColumn.class, this, DeckMasterPackage.PLAIN_TABLE__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlainRow> getRows() {
		if (rows == null) {
			rows = new EObjectContainmentEList<PlainRow>(PlainRow.class, this, DeckMasterPackage.PLAIN_TABLE__ROWS);
		}
		return rows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeckMasterPackage.PLAIN_TABLE__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
			case DeckMasterPackage.PLAIN_TABLE__ROWS:
				return ((InternalEList<?>)getRows()).basicRemove(otherEnd, msgs);
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
			case DeckMasterPackage.PLAIN_TABLE__CAPTION:
				return getCaption();
			case DeckMasterPackage.PLAIN_TABLE__COLUMNS:
				return getColumns();
			case DeckMasterPackage.PLAIN_TABLE__ROWS:
				return getRows();
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
			case DeckMasterPackage.PLAIN_TABLE__CAPTION:
				setCaption((String)newValue);
				return;
			case DeckMasterPackage.PLAIN_TABLE__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends PlainColumn>)newValue);
				return;
			case DeckMasterPackage.PLAIN_TABLE__ROWS:
				getRows().clear();
				getRows().addAll((Collection<? extends PlainRow>)newValue);
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
			case DeckMasterPackage.PLAIN_TABLE__CAPTION:
				setCaption(CAPTION_EDEFAULT);
				return;
			case DeckMasterPackage.PLAIN_TABLE__COLUMNS:
				getColumns().clear();
				return;
			case DeckMasterPackage.PLAIN_TABLE__ROWS:
				getRows().clear();
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
			case DeckMasterPackage.PLAIN_TABLE__CAPTION:
				return CAPTION_EDEFAULT == null ? caption != null : !CAPTION_EDEFAULT.equals(caption);
			case DeckMasterPackage.PLAIN_TABLE__COLUMNS:
				return columns != null && !columns.isEmpty();
			case DeckMasterPackage.PLAIN_TABLE__ROWS:
				return rows != null && !rows.isEmpty();
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
		result.append(" (caption: ");
		result.append(caption);
		result.append(')');
		return result.toString();
	}

} //PlainTableImpl

/**
 */
package DeckMaster.DeckMaster.impl;

import DeckMaster.DeckMaster.DeckMasterPackage;
import DeckMaster.DeckMaster.PlainImages;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plain Images</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link DeckMaster.DeckMaster.impl.PlainImagesImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link DeckMaster.DeckMaster.impl.PlainImagesImpl#getImageTitle <em>Image Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlainImagesImpl extends MinimalEObjectImpl.Container implements PlainImages {
	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageTitle() <em>Image Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageTitle() <em>Image Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageTitle()
	 * @generated
	 * @ordered
	 */
	protected String imageTitle = IMAGE_TITLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlainImagesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeckMasterPackage.Literals.PLAIN_IMAGES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeckMasterPackage.PLAIN_IMAGES__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageTitle() {
		return imageTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageTitle(String newImageTitle) {
		String oldImageTitle = imageTitle;
		imageTitle = newImageTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeckMasterPackage.PLAIN_IMAGES__IMAGE_TITLE, oldImageTitle, imageTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeckMasterPackage.PLAIN_IMAGES__URI:
				return getUri();
			case DeckMasterPackage.PLAIN_IMAGES__IMAGE_TITLE:
				return getImageTitle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DeckMasterPackage.PLAIN_IMAGES__URI:
				setUri((String)newValue);
				return;
			case DeckMasterPackage.PLAIN_IMAGES__IMAGE_TITLE:
				setImageTitle((String)newValue);
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
			case DeckMasterPackage.PLAIN_IMAGES__URI:
				setUri(URI_EDEFAULT);
				return;
			case DeckMasterPackage.PLAIN_IMAGES__IMAGE_TITLE:
				setImageTitle(IMAGE_TITLE_EDEFAULT);
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
			case DeckMasterPackage.PLAIN_IMAGES__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case DeckMasterPackage.PLAIN_IMAGES__IMAGE_TITLE:
				return IMAGE_TITLE_EDEFAULT == null ? imageTitle != null : !IMAGE_TITLE_EDEFAULT.equals(imageTitle);
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
		result.append(" (uri: ");
		result.append(uri);
		result.append(", imageTitle: ");
		result.append(imageTitle);
		result.append(')');
		return result.toString();
	}

} //PlainImagesImpl

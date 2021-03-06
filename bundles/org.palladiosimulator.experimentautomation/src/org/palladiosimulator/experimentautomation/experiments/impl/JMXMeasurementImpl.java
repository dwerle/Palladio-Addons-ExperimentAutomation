/**
 */
package org.palladiosimulator.experimentautomation.experiments.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.experimentautomation.experiments.ExperimentsPackage;
import org.palladiosimulator.experimentautomation.experiments.JMXMeasurement;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>JMX Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.experimentautomation.experiments.impl.JMXMeasurementImpl#getPollingPeriod
 * <em>Polling Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JMXMeasurementImpl extends ResponseMeasurementImpl implements JMXMeasurement {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Palladiosimulator.org 2008-2017";
    /**
     * The default value of the '{@link #getPollingPeriod() <em>Polling Period</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPollingPeriod()
     * @generated
     * @ordered
     */
    protected static final Integer POLLING_PERIOD_EDEFAULT = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected JMXMeasurementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExperimentsPackage.Literals.JMX_MEASUREMENT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Integer getPollingPeriod() {
        return (Integer) this.eDynamicGet(ExperimentsPackage.JMX_MEASUREMENT__POLLING_PERIOD,
                ExperimentsPackage.Literals.JMX_MEASUREMENT__POLLING_PERIOD, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPollingPeriod(final Integer newPollingPeriod) {
        this.eDynamicSet(ExperimentsPackage.JMX_MEASUREMENT__POLLING_PERIOD,
                ExperimentsPackage.Literals.JMX_MEASUREMENT__POLLING_PERIOD, newPollingPeriod);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case ExperimentsPackage.JMX_MEASUREMENT__POLLING_PERIOD:
            return this.getPollingPeriod();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case ExperimentsPackage.JMX_MEASUREMENT__POLLING_PERIOD:
            this.setPollingPeriod((Integer) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case ExperimentsPackage.JMX_MEASUREMENT__POLLING_PERIOD:
            this.setPollingPeriod(POLLING_PERIOD_EDEFAULT);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case ExperimentsPackage.JMX_MEASUREMENT__POLLING_PERIOD:
            return POLLING_PERIOD_EDEFAULT == null ? this.getPollingPeriod() != null
                    : !POLLING_PERIOD_EDEFAULT.equals(this.getPollingPeriod());
        }
        return super.eIsSet(featureID);
    }

} // JMXMeasurementImpl

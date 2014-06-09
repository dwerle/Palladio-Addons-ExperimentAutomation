/**
 */
package de.uka.ipd.sdq.experimentautomation.abstractsimulation.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import de.uka.ipd.sdq.experimentautomation.abstractsimulation.AbstractsimulationPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * @generated
 */
public class AbstractsimulationXMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public AbstractsimulationXMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        AbstractsimulationPackage.eINSTANCE.eClass();
    }

    /**
     * Register for "*" and "xml" file extensions the AbstractsimulationResourceFactoryImpl factory.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new AbstractsimulationResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new AbstractsimulationResourceFactoryImpl());
        }
        return registrations;
    }

} // AbstractsimulationXMLProcessor
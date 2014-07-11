/**
 */
package de.uka.ipd.sdq.experimentautomation.experiments.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;

import de.uka.ipd.sdq.experimentautomation.experiments.ExperimentsPackage;
import de.uka.ipd.sdq.experimentautomation.variation.provider.ExperimentAutomationEditPlugin;

/**
 * This is the item provider adapter for a
 * {@link de.uka.ipd.sdq.experimentautomation.experiments.InitialModel} object. <!-- begin-user-doc
 * --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class InitialModelItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
        IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    public InitialModelItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addUsageModelPropertyDescriptor(object);
            addAllocationPropertyDescriptor(object);
            addMiddlewareRepositoryPropertyDescriptor(object);
            addEventMiddleWareRepositoryPropertyDescriptor(object);
            addReconfigurationRulesPropertyDescriptor(object);
            addPlatformMonitoringSpecificationPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Usage Model feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected void addUsageModelPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_InitialModel_usageModel_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_InitialModel_usageModel_feature",
                        "_UI_InitialModel_type"), ExperimentsPackage.Literals.INITIAL_MODEL__USAGE_MODEL, true, false,
                true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Allocation feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected void addAllocationPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_InitialModel_allocation_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_InitialModel_allocation_feature",
                        "_UI_InitialModel_type"), ExperimentsPackage.Literals.INITIAL_MODEL__ALLOCATION, true, false,
                true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Middleware Repository feature. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addMiddlewareRepositoryPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_InitialModel_middlewareRepository_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_InitialModel_middlewareRepository_feature",
                        "_UI_InitialModel_type"), ExperimentsPackage.Literals.INITIAL_MODEL__MIDDLEWARE_REPOSITORY,
                true, false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Event Middle Ware Repository feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addEventMiddleWareRepositoryPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_InitialModel_eventMiddleWareRepository_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_InitialModel_eventMiddleWareRepository_feature",
                        "_UI_InitialModel_type"),
                ExperimentsPackage.Literals.INITIAL_MODEL__EVENT_MIDDLE_WARE_REPOSITORY, true, false, true, null, null,
                null));
    }

    /**
     * This adds a property descriptor for the Reconfiguration Rules feature. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addReconfigurationRulesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_InitialModel_reconfigurationRules_feature"),
                getString("_UI_PropertyDescriptor_description", "_UI_InitialModel_reconfigurationRules_feature",
                        "_UI_InitialModel_type"), ExperimentsPackage.Literals.INITIAL_MODEL__RECONFIGURATION_RULES,
                true, false, true, null, null, null));
    }

    /**
     * This adds a property descriptor for the Platform Monitoring Specification feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void addPlatformMonitoringSpecificationPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add(createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                getResourceLocator(),
                getString("_UI_InitialModel_platformMonitoringSpecification_feature"),
                getString("_UI_PropertyDescriptor_description",
                        "_UI_InitialModel_platformMonitoringSpecification_feature", "_UI_InitialModel_type"),
                ExperimentsPackage.Literals.INITIAL_MODEL__PLATFORM_MONITORING_SPECIFICATION, true, false, true, null,
                null, null));
    }

    /**
     * This returns InitialModel.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/InitialModel"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     */
    @Override
    public String getText(Object object) {
        return getString("_UI_InitialModel_type");
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}
     * . <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that
     * can be created under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

    /**
     * Return the resource locator for this item provider's resources. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return ExperimentAutomationEditPlugin.INSTANCE;
    }

}
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.servicefabricmanagedclusters.fluent.models.ApplicationResourceInner;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ApplicationResource;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ApplicationUpdateParameters;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ApplicationUpgradePolicy;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ApplicationUserAssignedIdentity;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.ManagedIdentity;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.RuntimeResumeApplicationUpgradeParameters;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ApplicationResourceImpl
    implements ApplicationResource, ApplicationResource.Definition, ApplicationResource.Update {
    private ApplicationResourceInner innerObject;

    private final com.azure.resourcemanager.servicefabricmanagedclusters.ServiceFabricManagedClustersManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ManagedIdentity identity() {
        return this.innerModel().identity();
    }

    public String location() {
        return this.innerModel().location();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public List<ApplicationUserAssignedIdentity> managedIdentities() {
        List<ApplicationUserAssignedIdentity> inner = this.innerModel().managedIdentities();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String version() {
        return this.innerModel().version();
    }

    public Map<String, String> parameters() {
        Map<String, String> inner = this.innerModel().parameters();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ApplicationUpgradePolicy upgradePolicy() {
        return this.innerModel().upgradePolicy();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ApplicationResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.servicefabricmanagedclusters.ServiceFabricManagedClustersManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String clusterName;

    private String applicationName;

    private ApplicationUpdateParameters updateParameters;

    public ApplicationResourceImpl withExistingManagedCluster(String resourceGroupName, String clusterName) {
        this.resourceGroupName = resourceGroupName;
        this.clusterName = clusterName;
        return this;
    }

    public ApplicationResource create() {
        this.innerObject = serviceManager.serviceClient()
            .getApplications()
            .createOrUpdate(resourceGroupName, clusterName, applicationName, this.innerModel(), Context.NONE);
        return this;
    }

    public ApplicationResource create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getApplications()
            .createOrUpdate(resourceGroupName, clusterName, applicationName, this.innerModel(), context);
        return this;
    }

    ApplicationResourceImpl(String name,
        com.azure.resourcemanager.servicefabricmanagedclusters.ServiceFabricManagedClustersManager serviceManager) {
        this.innerObject = new ApplicationResourceInner();
        this.serviceManager = serviceManager;
        this.applicationName = name;
    }

    public ApplicationResourceImpl update() {
        this.updateParameters = new ApplicationUpdateParameters();
        return this;
    }

    public ApplicationResource apply() {
        this.innerObject = serviceManager.serviceClient()
            .getApplications()
            .updateWithResponse(resourceGroupName, clusterName, applicationName, updateParameters, Context.NONE)
            .getValue();
        return this;
    }

    public ApplicationResource apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getApplications()
            .updateWithResponse(resourceGroupName, clusterName, applicationName, updateParameters, context)
            .getValue();
        return this;
    }

    ApplicationResourceImpl(ApplicationResourceInner innerObject,
        com.azure.resourcemanager.servicefabricmanagedclusters.ServiceFabricManagedClustersManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.clusterName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "managedClusters");
        this.applicationName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "applications");
    }

    public ApplicationResource refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getApplications()
            .getWithResponse(resourceGroupName, clusterName, applicationName, Context.NONE)
            .getValue();
        return this;
    }

    public ApplicationResource refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getApplications()
            .getWithResponse(resourceGroupName, clusterName, applicationName, context)
            .getValue();
        return this;
    }

    public void readUpgrade() {
        serviceManager.applications().readUpgrade(resourceGroupName, clusterName, applicationName);
    }

    public void readUpgrade(Context context) {
        serviceManager.applications().readUpgrade(resourceGroupName, clusterName, applicationName, context);
    }

    public void resumeUpgrade(RuntimeResumeApplicationUpgradeParameters parameters) {
        serviceManager.applications().resumeUpgrade(resourceGroupName, clusterName, applicationName, parameters);
    }

    public void resumeUpgrade(RuntimeResumeApplicationUpgradeParameters parameters, Context context) {
        serviceManager.applications()
            .resumeUpgrade(resourceGroupName, clusterName, applicationName, parameters, context);
    }

    public void startRollback() {
        serviceManager.applications().startRollback(resourceGroupName, clusterName, applicationName);
    }

    public void startRollback(Context context) {
        serviceManager.applications().startRollback(resourceGroupName, clusterName, applicationName, context);
    }

    public ApplicationResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ApplicationResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ApplicationResourceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public ApplicationResourceImpl withIdentity(ManagedIdentity identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }

    public ApplicationResourceImpl withManagedIdentities(List<ApplicationUserAssignedIdentity> managedIdentities) {
        this.innerModel().withManagedIdentities(managedIdentities);
        return this;
    }

    public ApplicationResourceImpl withVersion(String version) {
        this.innerModel().withVersion(version);
        return this;
    }

    public ApplicationResourceImpl withParameters(Map<String, String> parameters) {
        this.innerModel().withParameters(parameters);
        return this;
    }

    public ApplicationResourceImpl withUpgradePolicy(ApplicationUpgradePolicy upgradePolicy) {
        this.innerModel().withUpgradePolicy(upgradePolicy);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel() == null || this.innerModel().id() == null;
    }
}

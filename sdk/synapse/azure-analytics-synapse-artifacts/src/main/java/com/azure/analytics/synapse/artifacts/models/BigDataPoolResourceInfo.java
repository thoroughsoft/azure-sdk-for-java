// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

/**
 * Big Data pool
 * 
 * A Big Data pool.
 */
@Fluent
public class BigDataPoolResourceInfo extends TrackedResource {
    /*
     * The state of the Big Data pool.
     */
    @Generated
    private String provisioningState;

    /*
     * Auto-scaling properties
     */
    @Generated
    private AutoScaleProperties autoScale;

    /*
     * The time when the Big Data pool was created.
     */
    @Generated
    private OffsetDateTime creationDate;

    /*
     * Auto-pausing properties
     */
    @Generated
    private AutoPauseProperties autoPause;

    /*
     * Whether compute isolation is required or not.
     */
    @Generated
    private Boolean isComputeIsolationEnabled;

    /*
     * Whether session level packages enabled.
     */
    @Generated
    private Boolean sessionLevelPackagesEnabled;

    /*
     * The cache size
     */
    @Generated
    private Integer cacheSize;

    /*
     * Dynamic Executor Allocation
     */
    @Generated
    private DynamicExecutorAllocation dynamicExecutorAllocation;

    /*
     * The Spark events folder
     */
    @Generated
    private String sparkEventsFolder;

    /*
     * The number of nodes in the Big Data pool.
     */
    @Generated
    private Integer nodeCount;

    /*
     * Library version requirements
     */
    @Generated
    private LibraryRequirements libraryRequirements;

    /*
     * List of custom libraries/packages associated with the spark pool.
     */
    @Generated
    private List<LibraryInfo> customLibraries;

    /*
     * Spark configuration file to specify additional properties
     */
    @Generated
    private LibraryRequirements sparkConfigProperties;

    /*
     * The Apache Spark version.
     */
    @Generated
    private String sparkVersion;

    /*
     * The default folder where Spark logs will be written.
     */
    @Generated
    private String defaultSparkLogFolder;

    /*
     * The level of compute power that each node in the Big Data pool has.
     */
    @Generated
    private NodeSize nodeSize;

    /*
     * The kind of nodes that the Big Data pool provides.
     */
    @Generated
    private NodeSizeFamily nodeSizeFamily;

    /*
     * The time when the Big Data pool was updated successfully.
     */
    @Generated
    private OffsetDateTime lastSucceededTimestamp;

    /*
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     */
    @Generated
    private String type;

    /*
     * The name of the resource
     */
    @Generated
    private String name;

    /*
     * Fully qualified resource ID for the resource. Ex -
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{
     * resourceType}/{resourceName}
     */
    @Generated
    private String id;

    /**
     * Creates an instance of BigDataPoolResourceInfo class.
     */
    @Generated
    public BigDataPoolResourceInfo() {
    }

    /**
     * Get the provisioningState property: The state of the Big Data pool.
     * 
     * @return the provisioningState value.
     */
    @Generated
    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The state of the Big Data pool.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the BigDataPoolResourceInfo object itself.
     */
    @Generated
    public BigDataPoolResourceInfo setProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the autoScale property: Auto-scaling properties.
     * 
     * @return the autoScale value.
     */
    @Generated
    public AutoScaleProperties getAutoScale() {
        return this.autoScale;
    }

    /**
     * Set the autoScale property: Auto-scaling properties.
     * 
     * @param autoScale the autoScale value to set.
     * @return the BigDataPoolResourceInfo object itself.
     */
    @Generated
    public BigDataPoolResourceInfo setAutoScale(AutoScaleProperties autoScale) {
        this.autoScale = autoScale;
        return this;
    }

    /**
     * Get the creationDate property: The time when the Big Data pool was created.
     * 
     * @return the creationDate value.
     */
    @Generated
    public OffsetDateTime getCreationDate() {
        return this.creationDate;
    }

    /**
     * Set the creationDate property: The time when the Big Data pool was created.
     * 
     * @param creationDate the creationDate value to set.
     * @return the BigDataPoolResourceInfo object itself.
     */
    @Generated
    public BigDataPoolResourceInfo setCreationDate(OffsetDateTime creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * Get the autoPause property: Auto-pausing properties.
     * 
     * @return the autoPause value.
     */
    @Generated
    public AutoPauseProperties getAutoPause() {
        return this.autoPause;
    }

    /**
     * Set the autoPause property: Auto-pausing properties.
     * 
     * @param autoPause the autoPause value to set.
     * @return the BigDataPoolResourceInfo object itself.
     */
    @Generated
    public BigDataPoolResourceInfo setAutoPause(AutoPauseProperties autoPause) {
        this.autoPause = autoPause;
        return this;
    }

    /**
     * Get the isComputeIsolationEnabled property: Whether compute isolation is required or not.
     * 
     * @return the isComputeIsolationEnabled value.
     */
    @Generated
    public Boolean isComputeIsolationEnabled() {
        return this.isComputeIsolationEnabled;
    }

    /**
     * Set the isComputeIsolationEnabled property: Whether compute isolation is required or not.
     * 
     * @param isComputeIsolationEnabled the isComputeIsolationEnabled value to set.
     * @return the BigDataPoolResourceInfo object itself.
     */
    @Generated
    public BigDataPoolResourceInfo setIsComputeIsolationEnabled(Boolean isComputeIsolationEnabled) {
        this.isComputeIsolationEnabled = isComputeIsolationEnabled;
        return this;
    }

    /**
     * Get the sessionLevelPackagesEnabled property: Whether session level packages enabled.
     * 
     * @return the sessionLevelPackagesEnabled value.
     */
    @Generated
    public Boolean isSessionLevelPackagesEnabled() {
        return this.sessionLevelPackagesEnabled;
    }

    /**
     * Set the sessionLevelPackagesEnabled property: Whether session level packages enabled.
     * 
     * @param sessionLevelPackagesEnabled the sessionLevelPackagesEnabled value to set.
     * @return the BigDataPoolResourceInfo object itself.
     */
    @Generated
    public BigDataPoolResourceInfo setSessionLevelPackagesEnabled(Boolean sessionLevelPackagesEnabled) {
        this.sessionLevelPackagesEnabled = sessionLevelPackagesEnabled;
        return this;
    }

    /**
     * Get the cacheSize property: The cache size.
     * 
     * @return the cacheSize value.
     */
    @Generated
    public Integer getCacheSize() {
        return this.cacheSize;
    }

    /**
     * Set the cacheSize property: The cache size.
     * 
     * @param cacheSize the cacheSize value to set.
     * @return the BigDataPoolResourceInfo object itself.
     */
    @Generated
    public BigDataPoolResourceInfo setCacheSize(Integer cacheSize) {
        this.cacheSize = cacheSize;
        return this;
    }

    /**
     * Get the dynamicExecutorAllocation property: Dynamic Executor Allocation.
     * 
     * @return the dynamicExecutorAllocation value.
     */
    @Generated
    public DynamicExecutorAllocation getDynamicExecutorAllocation() {
        return this.dynamicExecutorAllocation;
    }

    /**
     * Set the dynamicExecutorAllocation property: Dynamic Executor Allocation.
     * 
     * @param dynamicExecutorAllocation the dynamicExecutorAllocation value to set.
     * @return the BigDataPoolResourceInfo object itself.
     */
    @Generated
    public BigDataPoolResourceInfo setDynamicExecutorAllocation(DynamicExecutorAllocation dynamicExecutorAllocation) {
        this.dynamicExecutorAllocation = dynamicExecutorAllocation;
        return this;
    }

    /**
     * Get the sparkEventsFolder property: The Spark events folder.
     * 
     * @return the sparkEventsFolder value.
     */
    @Generated
    public String getSparkEventsFolder() {
        return this.sparkEventsFolder;
    }

    /**
     * Set the sparkEventsFolder property: The Spark events folder.
     * 
     * @param sparkEventsFolder the sparkEventsFolder value to set.
     * @return the BigDataPoolResourceInfo object itself.
     */
    @Generated
    public BigDataPoolResourceInfo setSparkEventsFolder(String sparkEventsFolder) {
        this.sparkEventsFolder = sparkEventsFolder;
        return this;
    }

    /**
     * Get the nodeCount property: The number of nodes in the Big Data pool.
     * 
     * @return the nodeCount value.
     */
    @Generated
    public Integer getNodeCount() {
        return this.nodeCount;
    }

    /**
     * Set the nodeCount property: The number of nodes in the Big Data pool.
     * 
     * @param nodeCount the nodeCount value to set.
     * @return the BigDataPoolResourceInfo object itself.
     */
    @Generated
    public BigDataPoolResourceInfo setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }

    /**
     * Get the libraryRequirements property: Library version requirements.
     * 
     * @return the libraryRequirements value.
     */
    @Generated
    public LibraryRequirements getLibraryRequirements() {
        return this.libraryRequirements;
    }

    /**
     * Set the libraryRequirements property: Library version requirements.
     * 
     * @param libraryRequirements the libraryRequirements value to set.
     * @return the BigDataPoolResourceInfo object itself.
     */
    @Generated
    public BigDataPoolResourceInfo setLibraryRequirements(LibraryRequirements libraryRequirements) {
        this.libraryRequirements = libraryRequirements;
        return this;
    }

    /**
     * Get the customLibraries property: List of custom libraries/packages associated with the spark pool.
     * 
     * @return the customLibraries value.
     */
    @Generated
    public List<LibraryInfo> getCustomLibraries() {
        return this.customLibraries;
    }

    /**
     * Set the customLibraries property: List of custom libraries/packages associated with the spark pool.
     * 
     * @param customLibraries the customLibraries value to set.
     * @return the BigDataPoolResourceInfo object itself.
     */
    @Generated
    public BigDataPoolResourceInfo setCustomLibraries(List<LibraryInfo> customLibraries) {
        this.customLibraries = customLibraries;
        return this;
    }

    /**
     * Get the sparkConfigProperties property: Spark configuration file to specify additional properties.
     * 
     * @return the sparkConfigProperties value.
     */
    @Generated
    public LibraryRequirements getSparkConfigProperties() {
        return this.sparkConfigProperties;
    }

    /**
     * Set the sparkConfigProperties property: Spark configuration file to specify additional properties.
     * 
     * @param sparkConfigProperties the sparkConfigProperties value to set.
     * @return the BigDataPoolResourceInfo object itself.
     */
    @Generated
    public BigDataPoolResourceInfo setSparkConfigProperties(LibraryRequirements sparkConfigProperties) {
        this.sparkConfigProperties = sparkConfigProperties;
        return this;
    }

    /**
     * Get the sparkVersion property: The Apache Spark version.
     * 
     * @return the sparkVersion value.
     */
    @Generated
    public String getSparkVersion() {
        return this.sparkVersion;
    }

    /**
     * Set the sparkVersion property: The Apache Spark version.
     * 
     * @param sparkVersion the sparkVersion value to set.
     * @return the BigDataPoolResourceInfo object itself.
     */
    @Generated
    public BigDataPoolResourceInfo setSparkVersion(String sparkVersion) {
        this.sparkVersion = sparkVersion;
        return this;
    }

    /**
     * Get the defaultSparkLogFolder property: The default folder where Spark logs will be written.
     * 
     * @return the defaultSparkLogFolder value.
     */
    @Generated
    public String getDefaultSparkLogFolder() {
        return this.defaultSparkLogFolder;
    }

    /**
     * Set the defaultSparkLogFolder property: The default folder where Spark logs will be written.
     * 
     * @param defaultSparkLogFolder the defaultSparkLogFolder value to set.
     * @return the BigDataPoolResourceInfo object itself.
     */
    @Generated
    public BigDataPoolResourceInfo setDefaultSparkLogFolder(String defaultSparkLogFolder) {
        this.defaultSparkLogFolder = defaultSparkLogFolder;
        return this;
    }

    /**
     * Get the nodeSize property: The level of compute power that each node in the Big Data pool has.
     * 
     * @return the nodeSize value.
     */
    @Generated
    public NodeSize getNodeSize() {
        return this.nodeSize;
    }

    /**
     * Set the nodeSize property: The level of compute power that each node in the Big Data pool has.
     * 
     * @param nodeSize the nodeSize value to set.
     * @return the BigDataPoolResourceInfo object itself.
     */
    @Generated
    public BigDataPoolResourceInfo setNodeSize(NodeSize nodeSize) {
        this.nodeSize = nodeSize;
        return this;
    }

    /**
     * Get the nodeSizeFamily property: The kind of nodes that the Big Data pool provides.
     * 
     * @return the nodeSizeFamily value.
     */
    @Generated
    public NodeSizeFamily getNodeSizeFamily() {
        return this.nodeSizeFamily;
    }

    /**
     * Set the nodeSizeFamily property: The kind of nodes that the Big Data pool provides.
     * 
     * @param nodeSizeFamily the nodeSizeFamily value to set.
     * @return the BigDataPoolResourceInfo object itself.
     */
    @Generated
    public BigDataPoolResourceInfo setNodeSizeFamily(NodeSizeFamily nodeSizeFamily) {
        this.nodeSizeFamily = nodeSizeFamily;
        return this;
    }

    /**
     * Get the lastSucceededTimestamp property: The time when the Big Data pool was updated successfully.
     * 
     * @return the lastSucceededTimestamp value.
     */
    @Generated
    public OffsetDateTime getLastSucceededTimestamp() {
        return this.lastSucceededTimestamp;
    }

    /**
     * Get the type property: The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or
     * "Microsoft.Storage/storageAccounts".
     * 
     * @return the type value.
     */
    @Generated
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Generated
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource ID for the resource. Ex -
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}.
     * 
     * @return the id value.
     */
    @Generated
    @Override
    public String getId() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public BigDataPoolResourceInfo setTags(Map<String, String> tags) {
        super.setTags(tags);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public BigDataPoolResourceInfo setLocation(String location) {
        super.setLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", getLocation());
        jsonWriter.writeMapField("tags", getTags(), (writer, element) -> writer.writeString(element));
        if (provisioningState != null
            || autoScale != null
            || creationDate != null
            || autoPause != null
            || isComputeIsolationEnabled != null
            || sessionLevelPackagesEnabled != null
            || cacheSize != null
            || dynamicExecutorAllocation != null
            || sparkEventsFolder != null
            || nodeCount != null
            || libraryRequirements != null
            || customLibraries != null
            || sparkConfigProperties != null
            || sparkVersion != null
            || defaultSparkLogFolder != null
            || nodeSize != null
            || nodeSizeFamily != null
            || lastSucceededTimestamp != null) {
            jsonWriter.writeStartObject("properties");
            jsonWriter.writeStringField("provisioningState", this.provisioningState);
            jsonWriter.writeJsonField("autoScale", this.autoScale);
            jsonWriter.writeStringField("creationDate",
                this.creationDate == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.creationDate));
            jsonWriter.writeJsonField("autoPause", this.autoPause);
            jsonWriter.writeBooleanField("isComputeIsolationEnabled", this.isComputeIsolationEnabled);
            jsonWriter.writeBooleanField("sessionLevelPackagesEnabled", this.sessionLevelPackagesEnabled);
            jsonWriter.writeNumberField("cacheSize", this.cacheSize);
            jsonWriter.writeJsonField("dynamicExecutorAllocation", this.dynamicExecutorAllocation);
            jsonWriter.writeStringField("sparkEventsFolder", this.sparkEventsFolder);
            jsonWriter.writeNumberField("nodeCount", this.nodeCount);
            jsonWriter.writeJsonField("libraryRequirements", this.libraryRequirements);
            jsonWriter.writeArrayField("customLibraries", this.customLibraries,
                (writer, element) -> writer.writeJson(element));
            jsonWriter.writeJsonField("sparkConfigProperties", this.sparkConfigProperties);
            jsonWriter.writeStringField("sparkVersion", this.sparkVersion);
            jsonWriter.writeStringField("defaultSparkLogFolder", this.defaultSparkLogFolder);
            jsonWriter.writeStringField("nodeSize", this.nodeSize == null ? null : this.nodeSize.toString());
            jsonWriter.writeStringField("nodeSizeFamily",
                this.nodeSizeFamily == null ? null : this.nodeSizeFamily.toString());
            jsonWriter.writeEndObject();
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BigDataPoolResourceInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BigDataPoolResourceInfo if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BigDataPoolResourceInfo.
     */
    @Generated
    public static BigDataPoolResourceInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BigDataPoolResourceInfo deserializedBigDataPoolResourceInfo = new BigDataPoolResourceInfo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("location".equals(fieldName)) {
                    deserializedBigDataPoolResourceInfo.setLocation(reader.getString());
                } else if ("id".equals(fieldName)) {
                    deserializedBigDataPoolResourceInfo.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedBigDataPoolResourceInfo.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedBigDataPoolResourceInfo.type = reader.getString();
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedBigDataPoolResourceInfo.setTags(tags);
                } else if ("properties".equals(fieldName) && reader.currentToken() == JsonToken.START_OBJECT) {
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("provisioningState".equals(fieldName)) {
                            deserializedBigDataPoolResourceInfo.provisioningState = reader.getString();
                        } else if ("autoScale".equals(fieldName)) {
                            deserializedBigDataPoolResourceInfo.autoScale = AutoScaleProperties.fromJson(reader);
                        } else if ("creationDate".equals(fieldName)) {
                            deserializedBigDataPoolResourceInfo.creationDate = reader.getNullable(
                                nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                        } else if ("autoPause".equals(fieldName)) {
                            deserializedBigDataPoolResourceInfo.autoPause = AutoPauseProperties.fromJson(reader);
                        } else if ("isComputeIsolationEnabled".equals(fieldName)) {
                            deserializedBigDataPoolResourceInfo.isComputeIsolationEnabled
                                = reader.getNullable(JsonReader::getBoolean);
                        } else if ("sessionLevelPackagesEnabled".equals(fieldName)) {
                            deserializedBigDataPoolResourceInfo.sessionLevelPackagesEnabled
                                = reader.getNullable(JsonReader::getBoolean);
                        } else if ("cacheSize".equals(fieldName)) {
                            deserializedBigDataPoolResourceInfo.cacheSize = reader.getNullable(JsonReader::getInt);
                        } else if ("dynamicExecutorAllocation".equals(fieldName)) {
                            deserializedBigDataPoolResourceInfo.dynamicExecutorAllocation
                                = DynamicExecutorAllocation.fromJson(reader);
                        } else if ("sparkEventsFolder".equals(fieldName)) {
                            deserializedBigDataPoolResourceInfo.sparkEventsFolder = reader.getString();
                        } else if ("nodeCount".equals(fieldName)) {
                            deserializedBigDataPoolResourceInfo.nodeCount = reader.getNullable(JsonReader::getInt);
                        } else if ("libraryRequirements".equals(fieldName)) {
                            deserializedBigDataPoolResourceInfo.libraryRequirements
                                = LibraryRequirements.fromJson(reader);
                        } else if ("customLibraries".equals(fieldName)) {
                            List<LibraryInfo> customLibraries
                                = reader.readArray(reader1 -> LibraryInfo.fromJson(reader1));
                            deserializedBigDataPoolResourceInfo.customLibraries = customLibraries;
                        } else if ("sparkConfigProperties".equals(fieldName)) {
                            deserializedBigDataPoolResourceInfo.sparkConfigProperties
                                = LibraryRequirements.fromJson(reader);
                        } else if ("sparkVersion".equals(fieldName)) {
                            deserializedBigDataPoolResourceInfo.sparkVersion = reader.getString();
                        } else if ("defaultSparkLogFolder".equals(fieldName)) {
                            deserializedBigDataPoolResourceInfo.defaultSparkLogFolder = reader.getString();
                        } else if ("nodeSize".equals(fieldName)) {
                            deserializedBigDataPoolResourceInfo.nodeSize = NodeSize.fromString(reader.getString());
                        } else if ("nodeSizeFamily".equals(fieldName)) {
                            deserializedBigDataPoolResourceInfo.nodeSizeFamily
                                = NodeSizeFamily.fromString(reader.getString());
                        } else if ("lastSucceededTimestamp".equals(fieldName)) {
                            deserializedBigDataPoolResourceInfo.lastSucceededTimestamp = reader.getNullable(
                                nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                        } else {
                            reader.skipChildren();
                        }
                    }
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBigDataPoolResourceInfo;
        });
    }
}

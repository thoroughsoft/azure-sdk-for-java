// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.UUID;

/**
 * The AnomalyResult model.
 */
@Fluent
public final class AnomalyResult implements JsonSerializable<AnomalyResult> {
    /*
     * data feed unique id
     * 
     * only return for alerting anomaly result
     */
    @Generated
    private UUID dataFeedId;

    /*
     * metric unique id
     * 
     * only return for alerting anomaly result
     */
    @Generated
    private UUID metricId;

    /*
     * anomaly detection configuration unique id
     * 
     * only return for alerting anomaly result
     */
    @Generated
    private UUID anomalyDetectionConfigurationId;

    /*
     * anomaly time
     */
    @Generated
    private OffsetDateTime timestamp;

    /*
     * created time
     * 
     * only return for alerting result
     */
    @Generated
    private OffsetDateTime createdTime;

    /*
     * modified time
     * 
     * only return for alerting result
     */
    @Generated
    private OffsetDateTime modifiedTime;

    /*
     * dimension specified for series
     */
    @Generated
    private Map<String, String> dimension;

    /*
     * The property property.
     */
    @Generated
    private AnomalyProperty property;

    /**
     * Creates an instance of AnomalyResult class.
     */
    @Generated
    public AnomalyResult() {
    }

    /**
     * Get the dataFeedId property: data feed unique id
     * 
     * only return for alerting anomaly result.
     * 
     * @return the dataFeedId value.
     */
    @Generated
    public UUID getDataFeedId() {
        return this.dataFeedId;
    }

    /**
     * Get the metricId property: metric unique id
     * 
     * only return for alerting anomaly result.
     * 
     * @return the metricId value.
     */
    @Generated
    public UUID getMetricId() {
        return this.metricId;
    }

    /**
     * Get the anomalyDetectionConfigurationId property: anomaly detection configuration unique id
     * 
     * only return for alerting anomaly result.
     * 
     * @return the anomalyDetectionConfigurationId value.
     */
    @Generated
    public UUID getAnomalyDetectionConfigurationId() {
        return this.anomalyDetectionConfigurationId;
    }

    /**
     * Get the timestamp property: anomaly time.
     * 
     * @return the timestamp value.
     */
    @Generated
    public OffsetDateTime getTimestamp() {
        return this.timestamp;
    }

    /**
     * Set the timestamp property: anomaly time.
     * 
     * @param timestamp the timestamp value to set.
     * @return the AnomalyResult object itself.
     */
    @Generated
    public AnomalyResult setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get the createdTime property: created time
     * 
     * only return for alerting result.
     * 
     * @return the createdTime value.
     */
    @Generated
    public OffsetDateTime getCreatedTime() {
        return this.createdTime;
    }

    /**
     * Get the modifiedTime property: modified time
     * 
     * only return for alerting result.
     * 
     * @return the modifiedTime value.
     */
    @Generated
    public OffsetDateTime getModifiedTime() {
        return this.modifiedTime;
    }

    /**
     * Get the dimension property: dimension specified for series.
     * 
     * @return the dimension value.
     */
    @Generated
    public Map<String, String> getDimension() {
        return this.dimension;
    }

    /**
     * Set the dimension property: dimension specified for series.
     * 
     * @param dimension the dimension value to set.
     * @return the AnomalyResult object itself.
     */
    @Generated
    public AnomalyResult setDimension(Map<String, String> dimension) {
        this.dimension = dimension;
        return this;
    }

    /**
     * Get the property property: The property property.
     * 
     * @return the property value.
     */
    @Generated
    public AnomalyProperty getProperty() {
        return this.property;
    }

    /**
     * Set the property property: The property property.
     * 
     * @param property the property value to set.
     * @return the AnomalyResult object itself.
     */
    @Generated
    public AnomalyResult setProperty(AnomalyProperty property) {
        this.property = property;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("timestamp",
            this.timestamp == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.timestamp));
        jsonWriter.writeMapField("dimension", this.dimension, (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("property", this.property);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AnomalyResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AnomalyResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AnomalyResult.
     */
    @Generated
    public static AnomalyResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AnomalyResult deserializedAnomalyResult = new AnomalyResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("timestamp".equals(fieldName)) {
                    deserializedAnomalyResult.timestamp = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("dimension".equals(fieldName)) {
                    Map<String, String> dimension = reader.readMap(reader1 -> reader1.getString());
                    deserializedAnomalyResult.dimension = dimension;
                } else if ("property".equals(fieldName)) {
                    deserializedAnomalyResult.property = AnomalyProperty.fromJson(reader);
                } else if ("dataFeedId".equals(fieldName)) {
                    deserializedAnomalyResult.dataFeedId
                        = reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString()));
                } else if ("metricId".equals(fieldName)) {
                    deserializedAnomalyResult.metricId
                        = reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString()));
                } else if ("anomalyDetectionConfigurationId".equals(fieldName)) {
                    deserializedAnomalyResult.anomalyDetectionConfigurationId
                        = reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString()));
                } else if ("createdTime".equals(fieldName)) {
                    deserializedAnomalyResult.createdTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("modifiedTime".equals(fieldName)) {
                    deserializedAnomalyResult.modifiedTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAnomalyResult;
        });
    }
}

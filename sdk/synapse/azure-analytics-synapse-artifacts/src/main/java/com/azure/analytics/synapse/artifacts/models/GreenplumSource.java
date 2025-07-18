// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * A copy activity Greenplum Database source.
 */
@Fluent
public final class GreenplumSource extends TabularSource {
    /*
     * Copy source type.
     */
    @Generated
    private String type = "GreenplumSource";

    /*
     * A query to retrieve data from source. Type: string (or Expression with resultType string).
     */
    @Generated
    private Object query;

    /**
     * Creates an instance of GreenplumSource class.
     */
    @Generated
    public GreenplumSource() {
    }

    /**
     * Get the type property: Copy source type.
     * 
     * @return the type value.
     */
    @Generated
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the query property: A query to retrieve data from source. Type: string (or Expression with resultType
     * string).
     * 
     * @return the query value.
     */
    @Generated
    public Object getQuery() {
        return this.query;
    }

    /**
     * Set the query property: A query to retrieve data from source. Type: string (or Expression with resultType
     * string).
     * 
     * @param query the query value to set.
     * @return the GreenplumSource object itself.
     */
    @Generated
    public GreenplumSource setQuery(Object query) {
        this.query = query;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public GreenplumSource setQueryTimeout(Object queryTimeout) {
        super.setQueryTimeout(queryTimeout);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public GreenplumSource setAdditionalColumns(Object additionalColumns) {
        super.setAdditionalColumns(additionalColumns);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public GreenplumSource setSourceRetryCount(Object sourceRetryCount) {
        super.setSourceRetryCount(sourceRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public GreenplumSource setSourceRetryWait(Object sourceRetryWait) {
        super.setSourceRetryWait(sourceRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public GreenplumSource setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (getSourceRetryCount() != null) {
            jsonWriter.writeUntypedField("sourceRetryCount", getSourceRetryCount());
        }
        if (getSourceRetryWait() != null) {
            jsonWriter.writeUntypedField("sourceRetryWait", getSourceRetryWait());
        }
        if (getMaxConcurrentConnections() != null) {
            jsonWriter.writeUntypedField("maxConcurrentConnections", getMaxConcurrentConnections());
        }
        if (getQueryTimeout() != null) {
            jsonWriter.writeUntypedField("queryTimeout", getQueryTimeout());
        }
        if (getAdditionalColumns() != null) {
            jsonWriter.writeUntypedField("additionalColumns", getAdditionalColumns());
        }
        jsonWriter.writeStringField("type", this.type);
        if (this.query != null) {
            jsonWriter.writeUntypedField("query", this.query);
        }
        if (getAdditionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : getAdditionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GreenplumSource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GreenplumSource if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the GreenplumSource.
     */
    @Generated
    public static GreenplumSource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GreenplumSource deserializedGreenplumSource = new GreenplumSource();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sourceRetryCount".equals(fieldName)) {
                    deserializedGreenplumSource.setSourceRetryCount(reader.readUntyped());
                } else if ("sourceRetryWait".equals(fieldName)) {
                    deserializedGreenplumSource.setSourceRetryWait(reader.readUntyped());
                } else if ("maxConcurrentConnections".equals(fieldName)) {
                    deserializedGreenplumSource.setMaxConcurrentConnections(reader.readUntyped());
                } else if ("queryTimeout".equals(fieldName)) {
                    deserializedGreenplumSource.setQueryTimeout(reader.readUntyped());
                } else if ("additionalColumns".equals(fieldName)) {
                    deserializedGreenplumSource.setAdditionalColumns(reader.readUntyped());
                } else if ("type".equals(fieldName)) {
                    deserializedGreenplumSource.type = reader.getString();
                } else if ("query".equals(fieldName)) {
                    deserializedGreenplumSource.query = reader.readUntyped();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedGreenplumSource.setAdditionalProperties(additionalProperties);

            return deserializedGreenplumSource;
        });
    }
}

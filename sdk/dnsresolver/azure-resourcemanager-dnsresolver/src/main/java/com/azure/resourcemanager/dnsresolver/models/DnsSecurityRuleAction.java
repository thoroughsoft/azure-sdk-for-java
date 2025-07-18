// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dnsresolver.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The action to take on DNS requests that match the DNS security rule.
 */
@Fluent
public final class DnsSecurityRuleAction implements JsonSerializable<DnsSecurityRuleAction> {
    /*
     * The type of action to take.
     */
    private ActionType actionType;

    /**
     * Creates an instance of DnsSecurityRuleAction class.
     */
    public DnsSecurityRuleAction() {
    }

    /**
     * Get the actionType property: The type of action to take.
     * 
     * @return the actionType value.
     */
    public ActionType actionType() {
        return this.actionType;
    }

    /**
     * Set the actionType property: The type of action to take.
     * 
     * @param actionType the actionType value to set.
     * @return the DnsSecurityRuleAction object itself.
     */
    public DnsSecurityRuleAction withActionType(ActionType actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("actionType", this.actionType == null ? null : this.actionType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DnsSecurityRuleAction from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DnsSecurityRuleAction if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DnsSecurityRuleAction.
     */
    public static DnsSecurityRuleAction fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DnsSecurityRuleAction deserializedDnsSecurityRuleAction = new DnsSecurityRuleAction();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("actionType".equals(fieldName)) {
                    deserializedDnsSecurityRuleAction.actionType = ActionType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDnsSecurityRuleAction;
        });
    }
}

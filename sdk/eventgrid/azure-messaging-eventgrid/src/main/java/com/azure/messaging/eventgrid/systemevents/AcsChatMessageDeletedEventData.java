// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Schema of the Data property of an EventGridEvent for a Microsoft.Communication.ChatMessageDeleted event.
 * 
 * @deprecated This class is deprecated and may be removed in future releases. System events are now available in the
 * azure-messaging-eventgrid-systemevents package.
 */
@Fluent
@Deprecated
public final class AcsChatMessageDeletedEventData extends AcsChatMessageEventBaseProperties {

    /*
     * The time at which the message was deleted
     */
    @Generated
    private OffsetDateTime deleteTime;

    /**
     * Creates an instance of AcsChatMessageDeletedEventData class.
     */
    @Generated
    public AcsChatMessageDeletedEventData() {
    }

    /**
     * Get the deleteTime property: The time at which the message was deleted.
     *
     * @return the deleteTime value.
     */
    @Generated
    public OffsetDateTime getDeleteTime() {
        return this.deleteTime;
    }

    /**
     * Set the deleteTime property: The time at which the message was deleted.
     *
     * @param deleteTime the deleteTime value to set.
     * @return the AcsChatMessageDeletedEventData object itself.
     */
    @Generated
    public AcsChatMessageDeletedEventData setDeleteTime(OffsetDateTime deleteTime) {
        this.deleteTime = deleteTime;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AcsChatMessageDeletedEventData setMessageId(String messageId) {
        super.setMessageId(messageId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AcsChatMessageDeletedEventData
        setSenderCommunicationIdentifier(CommunicationIdentifierModel senderCommunicationIdentifier) {
        super.setSenderCommunicationIdentifier(senderCommunicationIdentifier);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AcsChatMessageDeletedEventData setSenderDisplayName(String senderDisplayName) {
        super.setSenderDisplayName(senderDisplayName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AcsChatMessageDeletedEventData setComposeTime(OffsetDateTime composeTime) {
        super.setComposeTime(composeTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AcsChatMessageDeletedEventData setType(String type) {
        super.setType(type);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AcsChatMessageDeletedEventData setVersion(Long version) {
        super.setVersion(version);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AcsChatMessageDeletedEventData
        setRecipientCommunicationIdentifier(CommunicationIdentifierModel recipientCommunicationIdentifier) {
        super.setRecipientCommunicationIdentifier(recipientCommunicationIdentifier);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AcsChatMessageDeletedEventData setTransactionId(String transactionId) {
        super.setTransactionId(transactionId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AcsChatMessageDeletedEventData setThreadId(String threadId) {
        super.setThreadId(threadId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("messageId", getMessageId());
        jsonWriter.writeJsonField("senderCommunicationIdentifier", getSenderCommunicationIdentifier());
        jsonWriter.writeStringField("type", getType());
        jsonWriter.writeJsonField("recipientCommunicationIdentifier", getRecipientCommunicationIdentifier());
        jsonWriter.writeStringField("transactionId", getTransactionId());
        jsonWriter.writeStringField("threadId", getThreadId());
        jsonWriter.writeStringField("senderDisplayName", getSenderDisplayName());
        jsonWriter.writeStringField("composeTime",
            getComposeTime() == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(getComposeTime()));
        jsonWriter.writeNumberField("version", getVersion());
        jsonWriter.writeStringField("deleteTime",
            this.deleteTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.deleteTime));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AcsChatMessageDeletedEventData from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of AcsChatMessageDeletedEventData if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AcsChatMessageDeletedEventData.
     */
    @Generated
    public static AcsChatMessageDeletedEventData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AcsChatMessageDeletedEventData deserializedAcsChatMessageDeletedEventData
                = new AcsChatMessageDeletedEventData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("messageId".equals(fieldName)) {
                    deserializedAcsChatMessageDeletedEventData.setMessageId(reader.getString());
                } else if ("senderCommunicationIdentifier".equals(fieldName)) {
                    deserializedAcsChatMessageDeletedEventData
                        .setSenderCommunicationIdentifier(CommunicationIdentifierModel.fromJson(reader));
                } else if ("type".equals(fieldName)) {
                    deserializedAcsChatMessageDeletedEventData.setType(reader.getString());
                } else if ("recipientCommunicationIdentifier".equals(fieldName)) {
                    deserializedAcsChatMessageDeletedEventData
                        .setRecipientCommunicationIdentifier(CommunicationIdentifierModel.fromJson(reader));
                } else if ("transactionId".equals(fieldName)) {
                    deserializedAcsChatMessageDeletedEventData.setTransactionId(reader.getString());
                } else if ("threadId".equals(fieldName)) {
                    deserializedAcsChatMessageDeletedEventData.setThreadId(reader.getString());
                } else if ("senderDisplayName".equals(fieldName)) {
                    deserializedAcsChatMessageDeletedEventData.setSenderDisplayName(reader.getString());
                } else if ("composeTime".equals(fieldName)) {
                    deserializedAcsChatMessageDeletedEventData.setComposeTime(reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString())));
                } else if ("version".equals(fieldName)) {
                    deserializedAcsChatMessageDeletedEventData.setVersion(reader.getNullable(JsonReader::getLong));
                } else if ("deleteTime".equals(fieldName)) {
                    deserializedAcsChatMessageDeletedEventData.deleteTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedAcsChatMessageDeletedEventData;
        });
    }
}

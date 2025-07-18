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

/**
 * Azure SQL Database linked service properties.
 */
@Fluent
public final class AzureSqlDatabaseLinkedServiceTypeProperties extends SqlServerBaseLinkedServiceTypeProperties {
    /*
     * The connection string. Type: string, SecureString or AzureKeyVaultSecretReference.
     */
    @Generated
    private Object connectionString;

    /*
     * The type used for authentication. Type: string.
     */
    @Generated
    private AzureSqlDatabaseAuthenticationType authenticationType;

    /*
     * The user name to be used when connecting to server. Type: string (or Expression with resultType string).
     */
    @Generated
    private Object userName;

    /*
     * The Azure key vault secret reference of password in connection string.
     */
    @Generated
    private AzureKeyVaultSecretReference password;

    /*
     * The ID of the service principal used to authenticate against Azure SQL Database. Type: string (or Expression with
     * resultType string).
     */
    @Generated
    private Object servicePrincipalId;

    /*
     * The key of the service principal used to authenticate against Azure SQL Database.
     */
    @Generated
    private SecretBase servicePrincipalKey;

    /*
     * The service principal credential type to use in Server-To-Server authentication. 'ServicePrincipalKey' for
     * key/secret, 'ServicePrincipalCert' for certificate. Type: string (or Expression with resultType string).
     */
    @Generated
    private Object servicePrincipalCredentialType;

    /*
     * The credential of the service principal object in Azure Active Directory. If servicePrincipalCredentialType is
     * 'ServicePrincipalKey', servicePrincipalCredential can be SecureString or AzureKeyVaultSecretReference. If
     * servicePrincipalCredentialType is 'ServicePrincipalCert', servicePrincipalCredential can only be
     * AzureKeyVaultSecretReference.
     */
    @Generated
    private SecretBase servicePrincipalCredential;

    /*
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType
     * string).
     */
    @Generated
    private Object tenant;

    /*
     * Indicates the azure cloud type of the service principle auth. Allowed values are AzurePublic, AzureChina,
     * AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type. Type: string (or
     * Expression with resultType string).
     */
    @Generated
    private Object azureCloudType;

    /*
     * Sql always encrypted properties.
     */
    @Generated
    private SqlAlwaysEncryptedProperties alwaysEncryptedSettings;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string (or Expression with resultType string).
     */
    @Generated
    private Object encryptedCredential;

    /*
     * The credential reference containing authentication information.
     */
    @Generated
    private CredentialReference credential;

    /**
     * Creates an instance of AzureSqlDatabaseLinkedServiceTypeProperties class.
     */
    @Generated
    public AzureSqlDatabaseLinkedServiceTypeProperties() {
    }

    /**
     * Get the connectionString property: The connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     * 
     * @return the connectionString value.
     */
    @Generated
    public Object getConnectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     * 
     * @param connectionString the connectionString value to set.
     * @return the AzureSqlDatabaseLinkedServiceTypeProperties object itself.
     */
    @Generated
    public AzureSqlDatabaseLinkedServiceTypeProperties setConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the authenticationType property: The type used for authentication. Type: string.
     * 
     * @return the authenticationType value.
     */
    @Generated
    public AzureSqlDatabaseAuthenticationType getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: The type used for authentication. Type: string.
     * 
     * @param authenticationType the authenticationType value to set.
     * @return the AzureSqlDatabaseLinkedServiceTypeProperties object itself.
     */
    @Generated
    public AzureSqlDatabaseLinkedServiceTypeProperties
        setAuthenticationType(AzureSqlDatabaseAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the userName property: The user name to be used when connecting to server. Type: string (or Expression with
     * resultType string).
     * 
     * @return the userName value.
     */
    @Generated
    public Object getUserName() {
        return this.userName;
    }

    /**
     * Set the userName property: The user name to be used when connecting to server. Type: string (or Expression with
     * resultType string).
     * 
     * @param userName the userName value to set.
     * @return the AzureSqlDatabaseLinkedServiceTypeProperties object itself.
     */
    @Generated
    public AzureSqlDatabaseLinkedServiceTypeProperties setUserName(Object userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get the password property: The Azure key vault secret reference of password in connection string.
     * 
     * @return the password value.
     */
    @Generated
    public AzureKeyVaultSecretReference getPassword() {
        return this.password;
    }

    /**
     * Set the password property: The Azure key vault secret reference of password in connection string.
     * 
     * @param password the password value to set.
     * @return the AzureSqlDatabaseLinkedServiceTypeProperties object itself.
     */
    @Generated
    public AzureSqlDatabaseLinkedServiceTypeProperties setPassword(AzureKeyVaultSecretReference password) {
        this.password = password;
        return this;
    }

    /**
     * Get the servicePrincipalId property: The ID of the service principal used to authenticate against Azure SQL
     * Database. Type: string (or Expression with resultType string).
     * 
     * @return the servicePrincipalId value.
     */
    @Generated
    public Object getServicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the servicePrincipalId property: The ID of the service principal used to authenticate against Azure SQL
     * Database. Type: string (or Expression with resultType string).
     * 
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the AzureSqlDatabaseLinkedServiceTypeProperties object itself.
     */
    @Generated
    public AzureSqlDatabaseLinkedServiceTypeProperties setServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the servicePrincipalKey property: The key of the service principal used to authenticate against Azure SQL
     * Database.
     * 
     * @return the servicePrincipalKey value.
     */
    @Generated
    public SecretBase getServicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the servicePrincipalKey property: The key of the service principal used to authenticate against Azure SQL
     * Database.
     * 
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the AzureSqlDatabaseLinkedServiceTypeProperties object itself.
     */
    @Generated
    public AzureSqlDatabaseLinkedServiceTypeProperties setServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
        return this;
    }

    /**
     * Get the servicePrincipalCredentialType property: The service principal credential type to use in Server-To-Server
     * authentication. 'ServicePrincipalKey' for key/secret, 'ServicePrincipalCert' for certificate. Type: string (or
     * Expression with resultType string).
     * 
     * @return the servicePrincipalCredentialType value.
     */
    @Generated
    public Object getServicePrincipalCredentialType() {
        return this.servicePrincipalCredentialType;
    }

    /**
     * Set the servicePrincipalCredentialType property: The service principal credential type to use in Server-To-Server
     * authentication. 'ServicePrincipalKey' for key/secret, 'ServicePrincipalCert' for certificate. Type: string (or
     * Expression with resultType string).
     * 
     * @param servicePrincipalCredentialType the servicePrincipalCredentialType value to set.
     * @return the AzureSqlDatabaseLinkedServiceTypeProperties object itself.
     */
    @Generated
    public AzureSqlDatabaseLinkedServiceTypeProperties
        setServicePrincipalCredentialType(Object servicePrincipalCredentialType) {
        this.servicePrincipalCredentialType = servicePrincipalCredentialType;
        return this;
    }

    /**
     * Get the servicePrincipalCredential property: The credential of the service principal object in Azure Active
     * Directory. If servicePrincipalCredentialType is 'ServicePrincipalKey', servicePrincipalCredential can be
     * SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is 'ServicePrincipalCert',
     * servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     * 
     * @return the servicePrincipalCredential value.
     */
    @Generated
    public SecretBase getServicePrincipalCredential() {
        return this.servicePrincipalCredential;
    }

    /**
     * Set the servicePrincipalCredential property: The credential of the service principal object in Azure Active
     * Directory. If servicePrincipalCredentialType is 'ServicePrincipalKey', servicePrincipalCredential can be
     * SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is 'ServicePrincipalCert',
     * servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     * 
     * @param servicePrincipalCredential the servicePrincipalCredential value to set.
     * @return the AzureSqlDatabaseLinkedServiceTypeProperties object itself.
     */
    @Generated
    public AzureSqlDatabaseLinkedServiceTypeProperties
        setServicePrincipalCredential(SecretBase servicePrincipalCredential) {
        this.servicePrincipalCredential = servicePrincipalCredential;
        return this;
    }

    /**
     * Get the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     * 
     * @return the tenant value.
     */
    @Generated
    public Object getTenant() {
        return this.tenant;
    }

    /**
     * Set the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     * 
     * @param tenant the tenant value to set.
     * @return the AzureSqlDatabaseLinkedServiceTypeProperties object itself.
     */
    @Generated
    public AzureSqlDatabaseLinkedServiceTypeProperties setTenant(Object tenant) {
        this.tenant = tenant;
        return this;
    }

    /**
     * Get the azureCloudType property: Indicates the azure cloud type of the service principle auth. Allowed values are
     * AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type.
     * Type: string (or Expression with resultType string).
     * 
     * @return the azureCloudType value.
     */
    @Generated
    public Object getAzureCloudType() {
        return this.azureCloudType;
    }

    /**
     * Set the azureCloudType property: Indicates the azure cloud type of the service principle auth. Allowed values are
     * AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type.
     * Type: string (or Expression with resultType string).
     * 
     * @param azureCloudType the azureCloudType value to set.
     * @return the AzureSqlDatabaseLinkedServiceTypeProperties object itself.
     */
    @Generated
    public AzureSqlDatabaseLinkedServiceTypeProperties setAzureCloudType(Object azureCloudType) {
        this.azureCloudType = azureCloudType;
        return this;
    }

    /**
     * Get the alwaysEncryptedSettings property: Sql always encrypted properties.
     * 
     * @return the alwaysEncryptedSettings value.
     */
    @Generated
    public SqlAlwaysEncryptedProperties getAlwaysEncryptedSettings() {
        return this.alwaysEncryptedSettings;
    }

    /**
     * Set the alwaysEncryptedSettings property: Sql always encrypted properties.
     * 
     * @param alwaysEncryptedSettings the alwaysEncryptedSettings value to set.
     * @return the AzureSqlDatabaseLinkedServiceTypeProperties object itself.
     */
    @Generated
    public AzureSqlDatabaseLinkedServiceTypeProperties
        setAlwaysEncryptedSettings(SqlAlwaysEncryptedProperties alwaysEncryptedSettings) {
        this.alwaysEncryptedSettings = alwaysEncryptedSettings;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     * @return the encryptedCredential value.
     */
    @Generated
    public Object getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AzureSqlDatabaseLinkedServiceTypeProperties object itself.
     */
    @Generated
    public AzureSqlDatabaseLinkedServiceTypeProperties setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Get the credential property: The credential reference containing authentication information.
     * 
     * @return the credential value.
     */
    @Generated
    public CredentialReference getCredential() {
        return this.credential;
    }

    /**
     * Set the credential property: The credential reference containing authentication information.
     * 
     * @param credential the credential value to set.
     * @return the AzureSqlDatabaseLinkedServiceTypeProperties object itself.
     */
    @Generated
    public AzureSqlDatabaseLinkedServiceTypeProperties setCredential(CredentialReference credential) {
        this.credential = credential;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AzureSqlDatabaseLinkedServiceTypeProperties setServer(Object server) {
        super.setServer(server);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AzureSqlDatabaseLinkedServiceTypeProperties setDatabase(Object database) {
        super.setDatabase(database);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AzureSqlDatabaseLinkedServiceTypeProperties setEncrypt(Object encrypt) {
        super.setEncrypt(encrypt);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AzureSqlDatabaseLinkedServiceTypeProperties setTrustServerCertificate(Object trustServerCertificate) {
        super.setTrustServerCertificate(trustServerCertificate);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AzureSqlDatabaseLinkedServiceTypeProperties setHostNameInCertificate(Object hostNameInCertificate) {
        super.setHostNameInCertificate(hostNameInCertificate);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AzureSqlDatabaseLinkedServiceTypeProperties setApplicationIntent(Object applicationIntent) {
        super.setApplicationIntent(applicationIntent);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AzureSqlDatabaseLinkedServiceTypeProperties setConnectTimeout(Object connectTimeout) {
        super.setConnectTimeout(connectTimeout);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AzureSqlDatabaseLinkedServiceTypeProperties setConnectRetryCount(Object connectRetryCount) {
        super.setConnectRetryCount(connectRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AzureSqlDatabaseLinkedServiceTypeProperties setConnectRetryInterval(Object connectRetryInterval) {
        super.setConnectRetryInterval(connectRetryInterval);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AzureSqlDatabaseLinkedServiceTypeProperties setLoadBalanceTimeout(Object loadBalanceTimeout) {
        super.setLoadBalanceTimeout(loadBalanceTimeout);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AzureSqlDatabaseLinkedServiceTypeProperties setCommandTimeout(Object commandTimeout) {
        super.setCommandTimeout(commandTimeout);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AzureSqlDatabaseLinkedServiceTypeProperties setIntegratedSecurity(Object integratedSecurity) {
        super.setIntegratedSecurity(integratedSecurity);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AzureSqlDatabaseLinkedServiceTypeProperties setFailoverPartner(Object failoverPartner) {
        super.setFailoverPartner(failoverPartner);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AzureSqlDatabaseLinkedServiceTypeProperties setMaxPoolSize(Object maxPoolSize) {
        super.setMaxPoolSize(maxPoolSize);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AzureSqlDatabaseLinkedServiceTypeProperties setMinPoolSize(Object minPoolSize) {
        super.setMinPoolSize(minPoolSize);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AzureSqlDatabaseLinkedServiceTypeProperties setMultipleActiveResultSets(Object multipleActiveResultSets) {
        super.setMultipleActiveResultSets(multipleActiveResultSets);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AzureSqlDatabaseLinkedServiceTypeProperties setMultiSubnetFailover(Object multiSubnetFailover) {
        super.setMultiSubnetFailover(multiSubnetFailover);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AzureSqlDatabaseLinkedServiceTypeProperties setPacketSize(Object packetSize) {
        super.setPacketSize(packetSize);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AzureSqlDatabaseLinkedServiceTypeProperties setPooling(Object pooling) {
        super.setPooling(pooling);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (getServer() != null) {
            jsonWriter.writeUntypedField("server", getServer());
        }
        if (getDatabase() != null) {
            jsonWriter.writeUntypedField("database", getDatabase());
        }
        if (getEncrypt() != null) {
            jsonWriter.writeUntypedField("encrypt", getEncrypt());
        }
        if (getTrustServerCertificate() != null) {
            jsonWriter.writeUntypedField("trustServerCertificate", getTrustServerCertificate());
        }
        if (getHostNameInCertificate() != null) {
            jsonWriter.writeUntypedField("hostNameInCertificate", getHostNameInCertificate());
        }
        if (getApplicationIntent() != null) {
            jsonWriter.writeUntypedField("applicationIntent", getApplicationIntent());
        }
        if (getConnectTimeout() != null) {
            jsonWriter.writeUntypedField("connectTimeout", getConnectTimeout());
        }
        if (getConnectRetryCount() != null) {
            jsonWriter.writeUntypedField("connectRetryCount", getConnectRetryCount());
        }
        if (getConnectRetryInterval() != null) {
            jsonWriter.writeUntypedField("connectRetryInterval", getConnectRetryInterval());
        }
        if (getLoadBalanceTimeout() != null) {
            jsonWriter.writeUntypedField("loadBalanceTimeout", getLoadBalanceTimeout());
        }
        if (getCommandTimeout() != null) {
            jsonWriter.writeUntypedField("commandTimeout", getCommandTimeout());
        }
        if (getIntegratedSecurity() != null) {
            jsonWriter.writeUntypedField("integratedSecurity", getIntegratedSecurity());
        }
        if (getFailoverPartner() != null) {
            jsonWriter.writeUntypedField("failoverPartner", getFailoverPartner());
        }
        if (getMaxPoolSize() != null) {
            jsonWriter.writeUntypedField("maxPoolSize", getMaxPoolSize());
        }
        if (getMinPoolSize() != null) {
            jsonWriter.writeUntypedField("minPoolSize", getMinPoolSize());
        }
        if (getMultipleActiveResultSets() != null) {
            jsonWriter.writeUntypedField("multipleActiveResultSets", getMultipleActiveResultSets());
        }
        if (getMultiSubnetFailover() != null) {
            jsonWriter.writeUntypedField("multiSubnetFailover", getMultiSubnetFailover());
        }
        if (getPacketSize() != null) {
            jsonWriter.writeUntypedField("packetSize", getPacketSize());
        }
        if (getPooling() != null) {
            jsonWriter.writeUntypedField("pooling", getPooling());
        }
        if (this.connectionString != null) {
            jsonWriter.writeUntypedField("connectionString", this.connectionString);
        }
        jsonWriter.writeStringField("authenticationType",
            this.authenticationType == null ? null : this.authenticationType.toString());
        if (this.userName != null) {
            jsonWriter.writeUntypedField("userName", this.userName);
        }
        jsonWriter.writeJsonField("password", this.password);
        if (this.servicePrincipalId != null) {
            jsonWriter.writeUntypedField("servicePrincipalId", this.servicePrincipalId);
        }
        jsonWriter.writeJsonField("servicePrincipalKey", this.servicePrincipalKey);
        if (this.servicePrincipalCredentialType != null) {
            jsonWriter.writeUntypedField("servicePrincipalCredentialType", this.servicePrincipalCredentialType);
        }
        jsonWriter.writeJsonField("servicePrincipalCredential", this.servicePrincipalCredential);
        if (this.tenant != null) {
            jsonWriter.writeUntypedField("tenant", this.tenant);
        }
        if (this.azureCloudType != null) {
            jsonWriter.writeUntypedField("azureCloudType", this.azureCloudType);
        }
        jsonWriter.writeJsonField("alwaysEncryptedSettings", this.alwaysEncryptedSettings);
        if (this.encryptedCredential != null) {
            jsonWriter.writeUntypedField("encryptedCredential", this.encryptedCredential);
        }
        jsonWriter.writeJsonField("credential", this.credential);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureSqlDatabaseLinkedServiceTypeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureSqlDatabaseLinkedServiceTypeProperties if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureSqlDatabaseLinkedServiceTypeProperties.
     */
    @Generated
    public static AzureSqlDatabaseLinkedServiceTypeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureSqlDatabaseLinkedServiceTypeProperties deserializedAzureSqlDatabaseLinkedServiceTypeProperties
                = new AzureSqlDatabaseLinkedServiceTypeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("server".equals(fieldName)) {
                    deserializedAzureSqlDatabaseLinkedServiceTypeProperties.setServer(reader.readUntyped());
                } else if ("database".equals(fieldName)) {
                    deserializedAzureSqlDatabaseLinkedServiceTypeProperties.setDatabase(reader.readUntyped());
                } else if ("encrypt".equals(fieldName)) {
                    deserializedAzureSqlDatabaseLinkedServiceTypeProperties.setEncrypt(reader.readUntyped());
                } else if ("trustServerCertificate".equals(fieldName)) {
                    deserializedAzureSqlDatabaseLinkedServiceTypeProperties
                        .setTrustServerCertificate(reader.readUntyped());
                } else if ("hostNameInCertificate".equals(fieldName)) {
                    deserializedAzureSqlDatabaseLinkedServiceTypeProperties
                        .setHostNameInCertificate(reader.readUntyped());
                } else if ("applicationIntent".equals(fieldName)) {
                    deserializedAzureSqlDatabaseLinkedServiceTypeProperties.setApplicationIntent(reader.readUntyped());
                } else if ("connectTimeout".equals(fieldName)) {
                    deserializedAzureSqlDatabaseLinkedServiceTypeProperties.setConnectTimeout(reader.readUntyped());
                } else if ("connectRetryCount".equals(fieldName)) {
                    deserializedAzureSqlDatabaseLinkedServiceTypeProperties.setConnectRetryCount(reader.readUntyped());
                } else if ("connectRetryInterval".equals(fieldName)) {
                    deserializedAzureSqlDatabaseLinkedServiceTypeProperties
                        .setConnectRetryInterval(reader.readUntyped());
                } else if ("loadBalanceTimeout".equals(fieldName)) {
                    deserializedAzureSqlDatabaseLinkedServiceTypeProperties.setLoadBalanceTimeout(reader.readUntyped());
                } else if ("commandTimeout".equals(fieldName)) {
                    deserializedAzureSqlDatabaseLinkedServiceTypeProperties.setCommandTimeout(reader.readUntyped());
                } else if ("integratedSecurity".equals(fieldName)) {
                    deserializedAzureSqlDatabaseLinkedServiceTypeProperties.setIntegratedSecurity(reader.readUntyped());
                } else if ("failoverPartner".equals(fieldName)) {
                    deserializedAzureSqlDatabaseLinkedServiceTypeProperties.setFailoverPartner(reader.readUntyped());
                } else if ("maxPoolSize".equals(fieldName)) {
                    deserializedAzureSqlDatabaseLinkedServiceTypeProperties.setMaxPoolSize(reader.readUntyped());
                } else if ("minPoolSize".equals(fieldName)) {
                    deserializedAzureSqlDatabaseLinkedServiceTypeProperties.setMinPoolSize(reader.readUntyped());
                } else if ("multipleActiveResultSets".equals(fieldName)) {
                    deserializedAzureSqlDatabaseLinkedServiceTypeProperties
                        .setMultipleActiveResultSets(reader.readUntyped());
                } else if ("multiSubnetFailover".equals(fieldName)) {
                    deserializedAzureSqlDatabaseLinkedServiceTypeProperties
                        .setMultiSubnetFailover(reader.readUntyped());
                } else if ("packetSize".equals(fieldName)) {
                    deserializedAzureSqlDatabaseLinkedServiceTypeProperties.setPacketSize(reader.readUntyped());
                } else if ("pooling".equals(fieldName)) {
                    deserializedAzureSqlDatabaseLinkedServiceTypeProperties.setPooling(reader.readUntyped());
                } else if ("connectionString".equals(fieldName)) {
                    deserializedAzureSqlDatabaseLinkedServiceTypeProperties.connectionString = reader.readUntyped();
                } else if ("authenticationType".equals(fieldName)) {
                    deserializedAzureSqlDatabaseLinkedServiceTypeProperties.authenticationType
                        = AzureSqlDatabaseAuthenticationType.fromString(reader.getString());
                } else if ("userName".equals(fieldName)) {
                    deserializedAzureSqlDatabaseLinkedServiceTypeProperties.userName = reader.readUntyped();
                } else if ("password".equals(fieldName)) {
                    deserializedAzureSqlDatabaseLinkedServiceTypeProperties.password
                        = AzureKeyVaultSecretReference.fromJson(reader);
                } else if ("servicePrincipalId".equals(fieldName)) {
                    deserializedAzureSqlDatabaseLinkedServiceTypeProperties.servicePrincipalId = reader.readUntyped();
                } else if ("servicePrincipalKey".equals(fieldName)) {
                    deserializedAzureSqlDatabaseLinkedServiceTypeProperties.servicePrincipalKey
                        = SecretBase.fromJson(reader);
                } else if ("servicePrincipalCredentialType".equals(fieldName)) {
                    deserializedAzureSqlDatabaseLinkedServiceTypeProperties.servicePrincipalCredentialType
                        = reader.readUntyped();
                } else if ("servicePrincipalCredential".equals(fieldName)) {
                    deserializedAzureSqlDatabaseLinkedServiceTypeProperties.servicePrincipalCredential
                        = SecretBase.fromJson(reader);
                } else if ("tenant".equals(fieldName)) {
                    deserializedAzureSqlDatabaseLinkedServiceTypeProperties.tenant = reader.readUntyped();
                } else if ("azureCloudType".equals(fieldName)) {
                    deserializedAzureSqlDatabaseLinkedServiceTypeProperties.azureCloudType = reader.readUntyped();
                } else if ("alwaysEncryptedSettings".equals(fieldName)) {
                    deserializedAzureSqlDatabaseLinkedServiceTypeProperties.alwaysEncryptedSettings
                        = SqlAlwaysEncryptedProperties.fromJson(reader);
                } else if ("encryptedCredential".equals(fieldName)) {
                    deserializedAzureSqlDatabaseLinkedServiceTypeProperties.encryptedCredential = reader.readUntyped();
                } else if ("credential".equals(fieldName)) {
                    deserializedAzureSqlDatabaseLinkedServiceTypeProperties.credential
                        = CredentialReference.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureSqlDatabaseLinkedServiceTypeProperties;
        });
    }
}

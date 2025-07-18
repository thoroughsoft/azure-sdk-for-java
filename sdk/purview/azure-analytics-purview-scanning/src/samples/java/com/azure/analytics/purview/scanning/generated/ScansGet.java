// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.scanning.generated;

import com.azure.analytics.purview.scanning.PurviewScanningClientBuilder;
import com.azure.analytics.purview.scanning.ScansClient;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class ScansGet {
    public static void main(String[] args) {
        ScansClient scansClient
            = new PurviewScanningClientBuilder().credential(new DefaultAzureCredentialBuilder().build())
                .endpoint("{Endpoint}")
                .buildScansClient();
        // BEGIN:com.azure.analytics.purview.scanning.generated.scans-get.scans-get
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response = scansClient.getWithResponse("myDataSource", "myScanName", requestOptions);
        // END:com.azure.analytics.purview.scanning.generated.scans-get.scans-get
    }
}

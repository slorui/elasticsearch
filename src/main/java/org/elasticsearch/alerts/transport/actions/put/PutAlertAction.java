/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */
package org.elasticsearch.alerts.transport.actions.put;

import org.elasticsearch.alerts.client.AlertsClientAction;
import org.elasticsearch.alerts.client.AlertsClient;

/**
 */
public class PutAlertAction extends AlertsClientAction<PutAlertRequest, PutAlertResponse, PutAlertRequestBuilder> {

    public static final PutAlertAction INSTANCE = new PutAlertAction();
    public static final String NAME = "indices:data/write/alert/put";

    private PutAlertAction() {
        super(NAME);
    }


    @Override
    public PutAlertRequestBuilder newRequestBuilder(AlertsClient client) {
        return new PutAlertRequestBuilder(client);
    }

    @Override
    public PutAlertResponse newResponse() {
        return new PutAlertResponse();
    }
}

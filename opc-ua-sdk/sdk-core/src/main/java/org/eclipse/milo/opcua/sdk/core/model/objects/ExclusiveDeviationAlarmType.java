/*
 * Copyright (c) 2016 Kevin Herron
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 *
 * The Eclipse Public License is available at
 * 	http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * 	http://www.eclipse.org/org/documents/edl-v10.html.
 */

package org.eclipse.milo.opcua.sdk.core.model.objects;

import org.eclipse.milo.opcua.sdk.core.model.BasicProperty;
import org.eclipse.milo.opcua.sdk.core.model.Property;
import org.eclipse.milo.opcua.sdk.core.model.variables.PropertyType;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.QualifiedName;

public interface ExclusiveDeviationAlarmType extends ExclusiveLimitAlarmType {

    Property<NodeId> SETPOINT_NODE = new BasicProperty<>(
        QualifiedName.parse("0:SetpointNode"),
        NodeId.parse("ns=0;i=17"),
        -1,
        NodeId.class
    );

    NodeId getSetpointNode();

    PropertyType getSetpointNodeNode();

    void setSetpointNode(NodeId value);
}
/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.workshop.proxy.frontend.mysql.command.admin.initdb;

import lombok.RequiredArgsConstructor;
import org.apache.shardingsphere.workshop.proxy.frontend.core.api.CommandExecutor;
import org.apache.shardingsphere.workshop.proxy.transport.core.packet.DatabasePacket;
import org.apache.shardingsphere.workshop.proxy.transport.mysql.packet.command.admin.initdb.MySQLComInitDbPacket;
import org.apache.shardingsphere.workshop.proxy.transport.mysql.packet.generic.MySQLOKPacket;

import java.util.Collection;
import java.util.Collections;

/**
 * COM_INIT_DB command executor for MySQL.
 */
@RequiredArgsConstructor
public final class MySQLComInitDbExecutor implements CommandExecutor {
    
    private final MySQLComInitDbPacket packet;
    
    @Override
    public Collection<DatabasePacket> execute() {
        return Collections.singletonList(new MySQLOKPacket(1));
    }
    
}

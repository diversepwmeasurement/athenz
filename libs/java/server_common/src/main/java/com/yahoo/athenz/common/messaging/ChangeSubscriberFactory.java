/*
 * Copyright The Athenz Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.yahoo.athenz.common.messaging;

import com.yahoo.athenz.auth.PrivateKeyStore;

public interface ChangeSubscriberFactory<T> {
    /**
     * creates a ChangeSubscriber
     * @param keyStore private keystore object for fetching any secrets if needed
     * @param topicName of the topic to subscribe to
     * @param subscriptionName of the individual subscriber
     * @param subscriptionType subscription mode as recognized by the underlying pub/sub system
     * @return ChangeSubscriber that was just created
     */
    ChangeSubscriber<T> create(PrivateKeyStore keyStore, String topicName, String subscriptionName, String subscriptionType);
}

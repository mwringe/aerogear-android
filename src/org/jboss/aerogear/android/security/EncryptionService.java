/**
 * JBoss, Home of Professional Open Source
 * Copyright Red Hat, Inc., and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.aerogear.android.security;

/**
 * Classes which implement this interface are responsible for providing encryption 
 * services to AeroGear.
 */
public interface EncryptionService {

    /**
     * 
     * Encrypt the message with an application scoped IV
     * 
     * @param message
     * @return 
     */
    public byte[] encrypt(byte[] message);

    /**
     * 
     * Encrypt the message with
     * 
     * @param message
     * @param iv The IV to encrypted the message with
     * @return 
     */
    public byte[] encrypt(byte[] iv, byte[] message);

    /**
     * 
     * Decrypt the message with an application scoped IV
     * 
     * @param message
     * @return 
     */
    public byte[] decrypt(byte[] message);

    /**
     * 
     * Decrypt the message with
     * 
     * @param message
     * @param iv The IV to encrypted the message with
     * @return 
     */
    public byte[] decrypt(byte[] iv, byte[] message);

}
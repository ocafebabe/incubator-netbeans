/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.tax.spec;

import org.netbeans.tax.TreeDocument;
import org.netbeans.tax.TreeException;
import org.netbeans.tax.InvalidArgumentException;

/**
 *
 * @author  Libor Kramolis
 * @version 0.1
 */
public interface Document {

    //
    // Constraints
    //

    /**
     * Local constarins
     */
    public static interface Constraints {

        public void checkDocumentVersion (String version) throws InvalidArgumentException;

        public boolean isValidDocumentVersion (String version);

        
        public void checkDocumentEncoding (String encoding) throws InvalidArgumentException;
        
        public boolean isValidDocumentEncoding (String encoding);
        
        
        public void checkDocumentStandalone (String standalone) throws InvalidArgumentException;
        
        public boolean isValidDocumentStandalone (String standalone);
        
    } // end: interface Constraints
    
    
    //
    // Creator
    //
    
    /**
     *
     */
    public static interface Creator {
        
        /**
         * @throws InvalidArgumentException
         */
        public TreeDocument createDocument (String version, String encoding, String standalone);
        
    } // end: interface Creator
    
    
    //
    // Writer
    //
    
    /**
     *
     */
    public static interface Writer {
        
        public void writeDocument (TreeDocument document) throws TreeException;
        
    } // end: interface Writer
    
    
    //
    // Child
    //
    
    /**
     *
     */
    public static interface Child {
        
    } // end: intereface Child
    
}

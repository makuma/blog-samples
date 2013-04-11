/*
 * Copyright 2004,2005 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.simplefrontend;

import org.wso2.simplefrontend.constants.SampleConstants;
import org.wso2.simplefrontend.core.AuthenticationAdminServiceClient;

public class LogInToServer {

    public static void main(String[] args) throws Exception {

        String adminCookie;
        String authenticationAdminURL = SampleConstants.SERVICE_URL + "AuthenticationAdmin";
        
        // setting the system properties for javax.net.ssl
        AuthenticationAdminServiceClient.setSystemProperties(SampleConstants.CLIENT_TRUST_STORE_PATH,
                SampleConstants.KEY_STORE_TYPE, SampleConstants.KEY_STORE_PASSWORD );
        AuthenticationAdminServiceClient.init(authenticationAdminURL);
        System.out.println("retrieving the admin cookie from the logged in session....");
        adminCookie = AuthenticationAdminServiceClient.login(SampleConstants.HOST_NAME,
                SampleConstants.USER_NAME, SampleConstants.PASSWORD);
        if(adminCookie != null){
        System.out.println("logged in to the back-end server successfully....");
        }

        

    }

}

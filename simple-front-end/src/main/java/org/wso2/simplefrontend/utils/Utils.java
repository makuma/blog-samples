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
package org.wso2.simplefrontend.utils;

import org.wso2.carbon.component.mgt.services.prov.data.xsd.Feature;
import org.wso2.simplefrontend.core.FeatureWrapper;

public class Utils {


    public static FeatureWrapper[] processFeatureTree(Feature[] features, int height) {
        FeatureWrapper[] featureWrappers = new FeatureWrapper[features.length];
        for (int i = 0; i < features.length; i++) {
            featureWrappers[i] = new FeatureWrapper();
            featureWrappers[i].setWrappedFeature(features[i]);
            featureWrappers[i].setHeight(height);
            featureWrappers[i].setHiddenRow(true);
            if (features[i].getRequiredFeatures() != null && features[i].getRequiredFeatures().length > 0) {
                featureWrappers[i].setHasChildren(true);
                FeatureWrapper[] requiredFeatureWrappers = processFeatureTree(features[i].getRequiredFeatures(), height + 1);
                featureWrappers[i].setRequiredFeatures(requiredFeatureWrappers);
            } else {
                featureWrappers[i].setHasChildren(false);
            }
        }
        return featureWrappers;
    }



    
}

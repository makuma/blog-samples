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
package org.wso2.simplefrontend.core;


import org.wso2.carbon.component.mgt.services.prov.data.xsd.Feature;

public class FeatureWrapper {
    private int height;
    private boolean hasChildren;
    private Feature wrappedFeature;
    private String parentElementID;
    private boolean hiddenRow;
    private FeatureWrapper[] requiredFeatures;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean hasChildren() {
        return hasChildren;
    }

    public void setHasChildren(boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    public boolean isHiddenRow() {
        return hiddenRow;
    }

    public void setHiddenRow(boolean hideRow) {
        this.hiddenRow = hideRow;
    }

    public FeatureWrapper[] getRequiredFeatures() {
        return requiredFeatures;
    }

    public void setRequiredFeatures(FeatureWrapper[] requiredFeatures) {
        this.requiredFeatures = requiredFeatures;
    }

    public Feature getWrappedFeature() {
        return wrappedFeature;
    }

    public void setWrappedFeature(Feature wrappedFeature) {
        this.wrappedFeature = wrappedFeature;
    }

    public String getParentElementID() {
        return parentElementID;
    }

    public void setParentElementID(String parentElementID) {
        this.parentElementID = parentElementID;
    }

    public String toString() {
        String str;
        str = wrappedFeature.getFeatureName() + " : " + wrappedFeature.getFeatureID();
        return str;
    }


}

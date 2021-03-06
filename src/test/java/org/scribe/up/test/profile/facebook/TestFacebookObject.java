/*
  Copyright 2012 Jerome Leleu

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.scribe.up.test.profile.facebook;

import junit.framework.TestCase;

import org.scribe.up.profile.facebook.FacebookObject;

/**
 * This class tests the {@link org.scribe.up.profile.facebook.FacebookObject} class.
 * 
 * @author Jerome Leleu
 * @since 1.0.0
 */
public final class TestFacebookObject extends TestCase {
    
    private static final String ID = "12123112";
    
    private static final String NAME = "value";
    
    private static final String GOOD_JSON = "{\"id\" : \"" + ID + "\", \"name\" : \"" + NAME + "\"}";
    
    private static final String BAD_JSON = "{ }";
    
    public void testNull() {
        FacebookObject facebookObject = new FacebookObject(null);
        assertNull(facebookObject.getId());
        assertNull(facebookObject.getName());
    }
    
    public void testBadJson() {
        FacebookObject facebookObject = new FacebookObject(BAD_JSON);
        assertNull(facebookObject.getId());
        assertNull(facebookObject.getName());
    }
    
    public void testGoodJson() {
        FacebookObject facebookObject = new FacebookObject(GOOD_JSON);
        assertEquals(ID, facebookObject.getId());
        assertEquals(NAME, facebookObject.getName());
    }
}

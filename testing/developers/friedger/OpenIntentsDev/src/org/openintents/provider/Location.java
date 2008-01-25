/* 
 * Copyright (C) 2007-2008 OpenIntents.org
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

package org.openintents.provider;

import android.net.ContentURI;
import android.provider.BaseColumns;

/**
 * Definition for content provider related to location.
 *
 */
public abstract class Location {
	
	public static final class Locations implements BaseColumns {
		/**
         * The content:// style URL for this table
         */
        public static final ContentURI CONTENT_URI
                = ContentURI.create("content://org.openintents.locations/locations");

        /**
         * The default sort order for this table
         */
        public static final String DEFAULT_SORT_ORDER = "modified DESC";
        
       
        /**
         * The latitude of the location
         * <P>Type: TEXT</P>
         */
        public static final String LATITUDE = "latitude";

        /**
         * The longitude of the location
         * <P>Type: TEXT</P>
         */
        public static final String LONGITUDE = "longitude";

        /**
         * The timestamp for when the note was created
         * <P>Type: INTEGER (long)</P>
         */
        public static final String CREATED_DATE = "created";

        /**
         * The timestamp for when the note was last modified
         * <P>Type: INTEGER (long)</P>
         */
        public static final String MODIFIED_DATE = "modified";
    }
}

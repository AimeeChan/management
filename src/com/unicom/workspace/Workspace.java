/*
       Licensed to the Apache Software Foundation (ASF) under one
       or more contributor license agreements.  See the NOTICE file
       distributed with this work for additional information
       regarding copyright ownership.  The ASF licenses this file
       to you under the Apache License, Version 2.0 (the
       "License"); you may not use this file except in compliance
       with the License.  You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing,
       software distributed under the License is distributed on an
       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
       KIND, either express or implied.  See the License for the
       specific language governing permissions and limitations
       under the License.
 */

package com.unicom.workspace;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import org.apache.cordova.*;

import com.unicom.workspace.R;

public class Workspace extends DroidGap
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        // Set by <content src="index.html" /> in config.xml
        super.setIntegerProperty("splashscreen", R.drawable.splash2);
        super.loadUrl(Config.getStartUrl(),3000);
        //super.loadUrl("file:///android_asset/www/index.html")
    }
    public boolean onCreateOptionsMenu(Menu menu) {
   	 
		menu.add(0, 1, 1, R.string.exit);
	 
		// TODO Auto-generated method stub
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (item.getItemId() == 1) {
			finish();
		}
		 
		return super.onOptionsItemSelected(item);
	}
}


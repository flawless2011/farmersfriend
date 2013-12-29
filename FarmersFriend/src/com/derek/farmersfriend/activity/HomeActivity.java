/**
 * Copyright Derek Lawless 2013
 */
package com.derek.farmersfriend.activity;

import com.derek.farmersfriend.R;

import android.os.Bundle;

/**
 * Purpose: The Activity for the Home landing screen in Farmer's Friend
 *
 */
public class HomeActivity extends BaseFarmerActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);
	}

}

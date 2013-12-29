/**
 * Copyright Derek Lawless 2013
 */
package com.derek.farmersfriend.activity;

import com.derek.farmersfriend.R;

import android.os.Bundle;

/**
 * Purpose: This Activity contains the UI for viewing farm features
 *
 */
public class ViewFeaturesActivity extends BaseFarmerActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view_features);
	}

	
}

/**
 * Copyright Derek Lawless 2013
 */
package com.derek.farmersfriend.fragment;

import com.derek.farmersfriend.R;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Purpose: This Fragment contains the UI controls for capturing a farm feature
 *
 */
public class CaptureFeatureControlFragment extends BaseFarmerFragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.capture_control_fragment, container, false);
	}

	
}

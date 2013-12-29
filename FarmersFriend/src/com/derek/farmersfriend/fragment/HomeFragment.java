/**
 * Copyright Derek Lawless 2013
 */
package com.derek.farmersfriend.fragment;

import com.derek.farmersfriend.R;
import com.derek.farmersfriend.activity.CaptureFeaturesActivity;
import com.derek.farmersfriend.activity.ViewFeaturesActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Purpose: This Fragment contains UI elements for the Home landing screen
 *
 */
public class HomeFragment extends BaseFarmerFragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View root = inflater.inflate(R.layout.home_fragment, container, false);
		Button captureBtn = (Button)root.findViewById(R.id.capture_farm_btn);
		Button viewBtn = (Button)root.findViewById(R.id.view_farm_btn);
		captureBtn.setOnClickListener(new CaptureButtonClickListener());
		viewBtn.setOnClickListener(new ViewButtonClickListener());
		return root;
	}

	/******************* Inner Classes ************************/
	
	/**
	 * 
	 * Purpose: This class provides a click listener for the Capture Features Button
	 *
	 */
	private class CaptureButtonClickListener implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			// Navigate to the CaptureFeaturesActivity
			Intent captureIntent = new Intent();
			captureIntent.setClass(getActivity(), CaptureFeaturesActivity.class);
			startActivity(captureIntent);
		}
		
	}
	
	/**
	 * 
	 * Purpose: This class provides a click listener for the View Features Button
	 *
	 */
	private class ViewButtonClickListener implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			// Navigate to the ViewFeaturesActivity
			Intent viewIntent = new Intent();
			viewIntent.setClass(getActivity(), ViewFeaturesActivity.class);
			startActivity(viewIntent);
		}
		
	}
	
}

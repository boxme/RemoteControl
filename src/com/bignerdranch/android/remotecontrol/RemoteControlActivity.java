package com.bignerdranch.android.remotecontrol;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Window;

public class RemoteControlActivity extends SingleFragmentActivity {
	@Override
	public Fragment getFragment() {
		return new RemoteControlFragment();
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);				//Hide activity's action or title bar
		super.onCreate(savedInstanceState);
	}
}

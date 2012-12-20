package de.aiag.mobile.search;

import com.phonegap.*;
import android.os.Bundle;

/**
 * @author pkotlov
 *
 */
public class MyPhoneGapActivity extends DroidGap {

	/* (non-Javadoc)
	 * @see com.phonegap.DroidGap#onCreate(android.os.Bundle)
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.loadUrl("file:///android_asset/www/index.html");
	}

}

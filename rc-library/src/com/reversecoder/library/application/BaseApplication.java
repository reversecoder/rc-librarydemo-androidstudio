package com.reversecoder.library.application;

import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;

/**
 * @author Md. Rashadul Alam
 */
public class BaseApplication extends Application {

	private static Context mContext;
	private static final String CANARO_EXTRA_BOLD_PATH = "fonts/canaro_extra_bold.otf";
	public static Typeface canaroExtraBold;

	@Override
	public void onCreate() {
		super.onCreate();
		mContext = this;
		initTypeface();
	}

	private void initTypeface() {
		canaroExtraBold = Typeface.createFromAsset(getAssets(), CANARO_EXTRA_BOLD_PATH);
	}

	public static Context getGlobalContext() {
		return mContext;
	}
}

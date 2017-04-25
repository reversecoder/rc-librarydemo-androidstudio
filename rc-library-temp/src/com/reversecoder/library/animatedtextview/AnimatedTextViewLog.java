package com.reversecoder.library.animatedtextview;

import com.reversecoder.library.BuildConfig;

import android.util.Log;

public class AnimatedTextViewLog {
	public static void i(Object s) {
		if (BuildConfig.DEBUG) {
			Log.i("AnimatedTextViewLog", s.toString());
		}
	}
}

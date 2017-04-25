package com.reversecoder.library.activity;

import com.reversecoder.library.application.BaseApplication;
import com.reversecoder.library.memoryleakhandler.ViewDestroyer;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;

/**
 * @author Md. Rashadul Alam
 *
 *         This abstract class force any activity for garbage collection and
 *         also destroy all views from memory whilie finishing any activity.
 *
 * @see http://code.google.com/p/android/issues/detail?id=8488
 */
public abstract class ParentActivity extends AppCompatActivity {

	// The top level content view.
	private ViewGroup m_contentView = null;

	public Context getParentContext() {
		return BaseApplication.getGlobalContext();
	}

	@Override
	public void onResume() {
		System.gc();
		super.onResume();
	}

	@Override
	public void onPause() {
		super.onPause();
		System.gc();
	}

	@Override
	public void setContentView(int layoutResID) {
		ViewGroup mainView = (ViewGroup) LayoutInflater.from(this).inflate(layoutResID, null);
		setContentView(mainView);
	}

	@Override
	public void setContentView(View view) {
		super.setContentView(view);
		m_contentView = (ViewGroup) view;
	}

	@Override
	public void setContentView(View view, LayoutParams params) {
		super.setContentView(view, params);
		m_contentView = (ViewGroup) view;
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		ViewDestroyer.unbindReferences(m_contentView);
		m_contentView = null;
		System.gc();
	}
}
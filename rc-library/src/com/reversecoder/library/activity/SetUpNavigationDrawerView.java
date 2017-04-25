package com.reversecoder.library.activity;

import android.support.design.widget.NavigationView;

/**
 * @author Md. Rashadul Alam
 */
public interface SetUpNavigationDrawerView {
     public void setUpNavigationDrawerHeader(int navigationHeader);
     public void setupNavigationDrawerMenu(int navigationMenu);
     public void setupNavigationDrawerMenuListener(NavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener);
}

package com.reversecoder.library.application;

import android.support.design.widget.NavigationView;

import com.reversecoder.library.memoryleakhandler.ParentActivity;

public abstract class NavigationDrawerHandler extends ParentActivity {

    public abstract void setNavigationDrawerHeaderView(int navigationDrawerHeaderView);

    public abstract void setNavigationDrawerMenuView(int navigationDrawerMenuView);

    public abstract void setNavigationDrawerMenuListener(NavigationView.OnNavigationItemSelectedListener navigationDrawerMenuListener);

}

package com.reversecoder.library.activity;

import android.support.design.widget.NavigationView;

/**
 * @author Md. Rashadul Alam
 */
public abstract class NavigationDrawerHandler extends ParentActivity {

    public abstract void setNavigationDrawerHeaderView(int navigationDrawerHeaderView);

    public abstract void setNavigationDrawerMenuView(int navigationDrawerMenuView);

    public abstract void setNavigationDrawerMenuListener(NavigationView.OnNavigationItemSelectedListener navigationDrawerMenuListener);

}

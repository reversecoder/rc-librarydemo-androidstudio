package com.reversecoder.library.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.reversecoder.library.activity.BaseNavigationDrawerActivity;

/**
 * @author Md. Rashadul Alam
 */
public class BaseFragment extends Fragment {

    public static BaseFragment newInstance() {
        return new BaseFragment();
    }

    public BaseFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (getActivity() instanceof BaseNavigationDrawerActivity) {
            ((BaseNavigationDrawerActivity) getActivity()).removeAppBarLayout();
        }

        return null;
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

}

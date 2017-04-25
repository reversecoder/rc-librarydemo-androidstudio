package com.reversecoder.library.progressdialog;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import com.reversecoder.library.R;

/**
 * @author Md. Rashsadul Alam
 */
public class ProgressFragmentDialog {
    private static ProgressDialog mDialog;
    private static String text;
    private static String tag;
    private static boolean isShow = false;

    public static class ProgressDialog extends DialogFragment implements View.OnClickListener {
        @NonNull
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            return super.onCreateDialog(savedInstanceState);
        }

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
            getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            View v = inflater.inflate(R.layout.view_progress_fragment_dialog, container, true);
            TextView textView = (TextView) v.findViewById(R.id.textView_msg);
            //textView.setText(text);
            Button button_cancel = (Button) v.findViewById(R.id.button_cancel);
            button_cancel.setOnClickListener(this);
            return v;
        }

        @Override
        public void onClick(View v) {
            new ProgressFragmentDialog().hide(tag);
        }
    }

    public void show(Activity activity, String text, String tag) {
        if (isShow)
            return;
        if (mDialog == null) {
            mDialog = new ProgressDialog();
            mDialog.setCancelable(false);
        }
        this.text = text;
        this.tag = tag;
        mDialog.show(activity.getFragmentManager(), null);
        isShow = true;
    }

    public void show(FragmentManager manager, String text, String tag) {
        if (isShow)
            return;
        if (mDialog == null) {
            mDialog = new ProgressDialog();
            mDialog.setCancelable(false);
        }
        this.text = text;
        this.tag = tag;
        mDialog.show(manager, null);
        isShow = true;
    }

    public void hide(String tag) {
        if (mDialog == null) {
            isShow = false;
            return;
        }
        if (isShow && (this.tag.length() == 0 || this.tag.equals(tag))) {
            mDialog.dismiss();
            isShow = false;
        }
    }

}

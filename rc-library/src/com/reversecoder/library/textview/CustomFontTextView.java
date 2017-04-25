package com.reversecoder.library.textview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.reversecoder.library.application.BaseApplication;

/**
 * @author Md. Rashsadul Alam
 */
public class CustomFontTextView extends TextView {
    public CustomFontTextView(Context context) {
        this(context, null);
    }

    public CustomFontTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomFontTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(BaseApplication.canaroExtraBold);
    }

}

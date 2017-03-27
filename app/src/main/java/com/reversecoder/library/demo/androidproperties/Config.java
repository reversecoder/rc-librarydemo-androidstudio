package com.reversecoder.library.demo.androidproperties;

import android.content.Context;

import com.reversecoder.library.androidproperties.AssetsProperties;
import com.reversecoder.library.androidproperties.Property;

public class Config extends AssetsProperties {

    private static String fileName = "Config";

    @Property int max;
    @Property("rate_value") float rateValue;
    @Property double temperature;
    @Property String message;
    @Property boolean condition;

    public Config(Context context) {
        super(context, fileName);
    }
}

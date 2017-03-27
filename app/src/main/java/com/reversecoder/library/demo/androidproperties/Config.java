package com.reversecoder.library.demo.androidproperties;

import android.content.Context;

import com.reversecoder.library.androidproperties.AssetsProperties;
import com.reversecoder.library.androidproperties.Property;

public class Config extends AssetsProperties {

    private static String fileName = "Config";

    @Property
    public int max;
    @Property("rate_value")
    public float rateValue;
    @Property
    public double temperature;
    @Property
    public String message;
    @Property
    public boolean condition;

    public Config(Context context) {
        super(context, fileName);
    }
}

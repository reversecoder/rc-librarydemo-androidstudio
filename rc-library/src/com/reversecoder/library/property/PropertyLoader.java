package com.reversecoder.library.property;

import android.content.Context;
import android.content.res.AssetManager;

import com.reversecoder.library.util.AllSettingsManager;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Md. Rashsadul Alam
 */
public class PropertyLoader {

    Context mContext;
    String mPropertyFileName;
    Properties mProperties;

    public PropertyLoader(Context context, String propertyFileName) throws Exception {
        mContext = context;
        mPropertyFileName = propertyFileName;

        mProperties = new Properties();
        AssetManager assetManager = mContext.getAssets();
        InputStream inputStream = assetManager.open(mPropertyFileName);
        mProperties.load(inputStream);
    }

    /**
     * Load properties
     *
     * @param context          the application context.
     * @param propertyFileName the property name such as "config.properties".
     * @param key              the key name.
     */
    public static String getProperty(Context context, String propertyFileName, String key) throws IOException {
        Properties properties = new Properties();
        AssetManager assetManager = context.getAssets();
        InputStream inputStream = assetManager.open(propertyFileName);
        properties.load(inputStream);
        return properties.getProperty(key);

    }

    /**
     * Load property
     *
     * @param key the key name.
     */
    public String getProperty(String key) throws IOException {
        return mProperties.getProperty(key);
    }

    public boolean hasProperty(String key) {
        if (!AllSettingsManager.isNullOrEmpty(key)) {
            return true;
        }
        return false;
    }
}

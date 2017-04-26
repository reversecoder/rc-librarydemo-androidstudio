package com.reversecoder.library.time;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Md. Rashsadul Alam
 */
public class TimeManager {

    /**
     * Convert into human readable date time.
     *
     * @param milliSecond  a {@link java.io.InputStream} object.
     * @param dateFormat a {@link java.io.OutputStream} object.
     * @see <a href="https://developer.android.com/reference/java/text/SimpleDateFormat.html">Different date format</a>
     * @throws java.lang.Exception if any.
     * @return String human readable date time.
     */
    public static String convertMilliSecondToTime(long milliSecond, String dateFormat) throws Exception{
        Date date = new Date(milliSecond);
        SimpleDateFormat dateformat = new SimpleDateFormat(dateFormat);
        return dateformat.format(date);
    }
}

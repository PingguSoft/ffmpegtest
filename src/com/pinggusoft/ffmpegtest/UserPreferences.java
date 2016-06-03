package com.pinggusoft.ffmpegtest;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;

//import javax.annotation.Nonnull;

public class UserPreferences {

    public static final String USER_PREFERENCES = "USER_PREFERENCES";
    private static final String KEY_URL = "url";
    private final SharedPreferences preferences;

    public UserPreferences( Context context) {
        preferences = context.getSharedPreferences(USER_PREFERENCES, 0);
    }

    public void setUrl(@Nullable String url) {
        preferences.edit().putString(KEY_URL, url).apply();
    }

    @Nullable
    public String getUrl() {
        //return preferences.getString(KEY_URL, "rtsp://192.168.100.1:554/cam1/h264");
        //return preferences.getString(KEY_URL, "rtsp://mm2.pcslab.com/mm/7h2000.mp4");
        //return "rtsp://mm2.pcslab.com/mm/7h2000.mp4";
        return "rtsp://192.168.100.1:554/cam1/h264";
    }
}

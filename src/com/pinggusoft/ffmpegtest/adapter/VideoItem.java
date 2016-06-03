package com.pinggusoft.ffmpegtest.adapter;

import android.support.annotation.Nullable;

public class VideoItem {
    private final long id;
    @Nullable
    private final String text;

    private String video;
    @Nullable
    private String key;

    public VideoItem(long id,
                     String text,
                     String video,
                     String key) {
        this.id = id;
        this.text = text;
        this.video = video;
        this.key = key;
    }

    public long id() {
        return id;
    }

    @Nullable
    public String text() {
        return text;
    }

    public String video() {
        return video;
    }

    @Nullable
    public String key() {
        return key;
    }
}

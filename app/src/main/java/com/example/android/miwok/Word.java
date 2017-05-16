package com.example.android.miwok;

/**
 * Created by Arfat Salman on 14-Mar-17.
 */

public class Word {
    private String english;
    private String miwok;
    private int image_resource_id = NO_IMAGE;
    private int mAudioResourceID;

    private static final int NO_IMAGE = -1;

    public Word(String eng, String mi, int audio) {
        english = eng;
        miwok = mi;
        mAudioResourceID = audio;
    }

    public Word(String eng, String mi, int image, int audio) {
        english = eng;
        miwok = mi;
        image_resource_id = image;
        mAudioResourceID = audio;
    }

    public String getEnglish() {
        return english;
    }

    public int getImageResourceId() {return image_resource_id; }

    public String getMiwok() {
        return miwok;
    }

    public boolean hasImage() {
        return image_resource_id  != NO_IMAGE;
    }

    public int getAudioResource() {
        return mAudioResourceID;
    }
}

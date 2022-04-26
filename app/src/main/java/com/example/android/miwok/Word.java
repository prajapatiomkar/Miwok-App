package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImages = NO_IMAGE_PROVIDE;
    private static final int NO_IMAGE_PROVIDE = -1;
    private int mAudioResourceId;

    public Word(String defaultTranslation, String miwokTranslation, int images, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImages = images;
        mAudioResourceId = audioResourceId;

    }

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;

    }


    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImages;
    }

    public boolean hasImage() {
        return mImages != NO_IMAGE_PROVIDE;
    }

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }
}

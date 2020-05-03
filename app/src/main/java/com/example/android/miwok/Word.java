package com.example.android.miwok;

/**
 * Displays text to the user.
 */
public class Word {

    // String value
    private String mMiwokTranslation;

    private String mDefaultTranslation;

    private int mSoundId;

    private int mImageResourceId = NO_IMAGE_PRIVIDED;

    private static final int NO_IMAGE_PRIVIDED = -1;


    /**
     * Constructs a new TextView with initial values for text and text color.
     */
    public Word (String defaultTranslation, String miwokTranslation, int soundId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mSoundId = soundId;
    }

    public Word (String defaultTranslation, String miwokTranslation, int imageResourceId, int soundId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
        mSoundId = soundId;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getImageResourceId() {return mImageResourceId;}

    public int getSoundId() {return mSoundId;}

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PRIVIDED;
    }


    }

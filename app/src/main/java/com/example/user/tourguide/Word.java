package com.example.user.tourguide;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains resource IDs for the default translation, Miwok translation, audio file, and
 * optional image file for that word.
 */
public class Word {

    /** String resource ID for the default translation of the word */
    private int mplaceName;

    /** String resource ID for the Miwok translation of the word */
    private int minfo;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(int placeName, int info) {
        mplaceName = placeName;
        minfo = info;
    }

    public Word(int placeName, int info, int imageResourceId) {
        mplaceName = placeName;
        minfo = info;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the string resource ID for the default translation of the word.
     */
    public int getPlaceName() {
        return mplaceName;
    }

    /**
     * Get the string resource ID for the Miwok translation of the word.
     */
    public int getInfo() { return minfo;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
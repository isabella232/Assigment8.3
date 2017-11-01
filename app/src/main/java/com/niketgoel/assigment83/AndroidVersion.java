package com.niketgoel.assigment83;

/**
 * Created by niketgoel on 31/10/17.
 */


public class AndroidVersion {
    // Android version number like 1.0,2.0,etc
    private String mAndroidVersionName;
    //Drawable image id
    private int mImageResourceId;

    /**
     * constructor to initialize the parameters
     * @param androidVersion
     * @param imageResourceId
     */
    public AndroidVersion(String androidVersion, int imageResourceId){
        mAndroidVersionName = androidVersion;
        mImageResourceId = imageResourceId;
    }

    public String getmAndroidVersion() {
        return mAndroidVersionName;
    }


    public int getmImageResourceId() {
        return mImageResourceId;
    }
}

package com.pinniboina.telshare;

import android.net.Uri;

public class Upload {
    private String mName;
    private String mImageUri;

    public Upload() {
        //empty
    }

    public Upload(String name, String imageUri) {
        if(name.trim().equals("")){
            name = "No Name";
        }
        mName = name;
        mImageUri = imageUri;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmImageUri() {
        return mImageUri;
    }

    public void setmImageUri(String mImageUri) {
        this.mImageUri = mImageUri;
    }
}

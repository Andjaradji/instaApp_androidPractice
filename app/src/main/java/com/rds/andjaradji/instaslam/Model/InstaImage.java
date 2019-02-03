package com.rds.andjaradji.instaslam.Model;

import android.net.Uri;

import java.net.URI;

/**
 * Created by Anjar on 15/03/2018.
 */

public class InstaImage {
 private Uri imgURI;

    public InstaImage(Uri imgURI) {
        this.imgURI = imgURI;
    }

    public Uri getImgURI() {
        return imgURI;
    }
}

package com.example.user.plugvr;

import android.graphics.drawable.Drawable;

/**
 * Created by User on 2018-07-11.
 */

public class MainListViewItem {

    private int ivAppImage;
    private String tvAppName;
    private String tvAppDescript;

    public void setIvAppImage(int pic) { ivAppImage = pic; }

    public void setTvAppName(String name) { tvAppName = name; }

    public void setTvAppDescript(String desc) {tvAppDescript = desc;}

    public int getIvAppImage() { return this.ivAppImage; }

    public String getTvAppName() { return  this.tvAppName; }

    public String getTvAppDescript() { return this.tvAppDescript; }
}

package com.example.user.plugvr;

import android.graphics.drawable.Drawable;

public class SettingListViewItem {

    private Drawable ivIcon;
    private String tvSetting;

    public void setIvIcon(Drawable pic) { ivIcon = pic; }

    public void setTvSetting(String name) { tvSetting = name; }

    public Drawable getIvIcon() { return this.ivIcon; }

    public String getTvSetting() { return  this.tvSetting; }

}

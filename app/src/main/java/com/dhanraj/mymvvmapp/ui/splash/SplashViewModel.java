package com.dhanraj.mymvvmapp.ui.splash;

import android.graphics.drawable.Drawable;

public class SplashViewModel {

    private int drawable;
    private String appname;

    public SplashViewModel(int drawable, String name) {
        this.drawable = drawable;
        this.appname = name;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname;
    }
}

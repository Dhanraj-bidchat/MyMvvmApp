package com.dhanraj.mymvvmapp.ui.splash;

import android.view.View;
import android.widget.Toast;

public class SplashScreenHandlers {

    public void onClickImage(View view, SplashViewModel model) {
        Toast.makeText(view.getContext(), "This is image "+ model.getAppname(), Toast.LENGTH_SHORT).show();
    }
}

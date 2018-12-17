package com.dhanraj.mymvvmapp.ui.login;

import android.content.Intent;
import android.view.View;

import com.dhanraj.mymvvmapp.ui.home.HomeActivity;

public class LoginActivityHandler {

    public void showHome(View view) {

        view.getContext().startActivity(new Intent(view.getContext(), HomeActivity.class));

    }
}

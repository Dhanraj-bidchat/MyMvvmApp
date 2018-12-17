package com.dhanraj.mymvvmapp.ui.home;

import android.content.Intent;
import android.view.View;

import com.dhanraj.mymvvmapp.ui.createUser.CreateUserActivity;

public class HomeScreenHandler {

    public void createUser(View view) {

        view.getContext().startActivity(new Intent(view.getContext(), CreateUserActivity.class));

    }
}

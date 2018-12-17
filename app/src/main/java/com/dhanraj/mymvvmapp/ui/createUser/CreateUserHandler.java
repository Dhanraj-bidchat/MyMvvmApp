package com.dhanraj.mymvvmapp.ui.createUser;

import android.app.Activity;
import android.view.View;

public class CreateUserHandler {

    private Activity activity;

    public CreateUserHandler(Activity activity) {
        this.activity = activity;
    }

    public void userCreated(View view) {

        this.activity.finish();

    }
}

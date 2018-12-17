package com.dhanraj.mymvvmapp.ui.createUser;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.dhanraj.mymvvmapp.R;
import com.dhanraj.mymvvmapp.databinding.ActivityCreateUserBinding;

public class CreateUserActivity extends AppCompatActivity {

    private static final String TAG = CreateUserActivity.class.getSimpleName();

    private Context mContext;
    private ActivityCreateUserBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_create_user);
        binding.setHandler(new CreateUserHandler(this));
        mContext = this;

    }
}

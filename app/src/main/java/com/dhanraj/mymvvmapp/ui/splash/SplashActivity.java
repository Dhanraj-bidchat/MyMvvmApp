package com.dhanraj.mymvvmapp.ui.splash;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dhanraj.mymvvmapp.R;
import com.dhanraj.mymvvmapp.databinding.ActivitySplashBinding;
import com.dhanraj.mymvvmapp.ui.login.LoginActivity;

public class SplashActivity extends AppCompatActivity {

    private static final String TAG = SplashActivity.class.getSimpleName();
    private ActivitySplashBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_splash);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash);

        SplashViewModel model = new SplashViewModel(R.mipmap.ic_launcher_round, "Lets Go");
        binding.setSplash(model);
        binding.setHandler(new SplashScreenHandlers());

        Handler handler = new Handler();
        handler.postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
        }, 700);

    }
}

package com.dhanraj.mymvvmapp.ui.splash;

import android.databinding.DataBindingUtil;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.dhanraj.mymvvmapp.R;
import com.dhanraj.mymvvmapp.databinding.ActivitySplashBinding;

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
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(SplashActivity.this, "welcome", Toast.LENGTH_SHORT).show();
            }
        }, 700);

    }
}

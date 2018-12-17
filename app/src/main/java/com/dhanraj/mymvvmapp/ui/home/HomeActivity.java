package com.dhanraj.mymvvmapp.ui.home;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.dhanraj.mymvvmapp.R;
import com.dhanraj.mymvvmapp.databinding.ActivityHomeBinding;
import com.dhanraj.mymvvmapp.ui.createUser.CreateUserActivity;
import com.dhanraj.mymvvmapp.ui.profile.ProfileActivity;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private static final String TAG = HomeActivity.class.getSimpleName();

    private Context mContext;
    private ActivityHomeBinding binding;
    private HomeScreenAdapter homeScreenAdapter;
    private List<User> users = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home);
        binding.setListerner(new HomeScreenHandler());

        mContext = this;

        users.add(new User("Captan America", "captan@gmail.com", "oh good"));
        users.add(new User("Thor", "thor@gmail.com", "Where is the Thanos"));
        users.add(new User("Iron Man", "tony@gmail.com", "no food pepper"));

        binding.rvUsers.setLayoutManager(new LinearLayoutManager(mContext));
        homeScreenAdapter = new HomeScreenAdapter(mContext, users, new HomeListerner() {
            @Override
            public void showProfile(User user) {
                Toast.makeText(mContext, ""+user.getUsername(), Toast.LENGTH_SHORT).show();
                startActivity(new Intent(HomeActivity.this, ProfileActivity.class));
            }
        });

        binding.rvUsers.setAdapter(homeScreenAdapter);

    }
}

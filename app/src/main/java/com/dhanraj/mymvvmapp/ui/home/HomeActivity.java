package com.dhanraj.mymvvmapp.ui.home;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dhanraj.mymvvmapp.R;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private static final String TAG = HomeActivity.class.getSimpleName();

    private Context mContext;
    private RecyclerView rv;
    private HomeScreenAdapter homeScreenAdapter;
    private List<User> users = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mContext = this;
        rv = findViewById(R.id.rvUsers);

        users.add(new User("Captan America", "captan@gmail.com", "oh good"));
        users.add(new User("Thor", "thor@gmail.com", "Where is the Thanos"));
        users.add(new User("Iron Man", "tony@gmail.com", "no food pepper"));

        rv.setLayoutManager(new LinearLayoutManager(mContext));
        homeScreenAdapter = new HomeScreenAdapter(mContext, users);
        rv.setAdapter(homeScreenAdapter);
    }
}

package com.dhanraj.mymvvmapp.ui.home;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.dhanraj.mymvvmapp.R;
import com.dhanraj.mymvvmapp.databinding.ListItemHomeUserBinding;

import java.util.List;

public class HomeScreenAdapter extends RecyclerView.Adapter<HomeScreenAdapter.MyViewHolder> {
    private static final String TAG = HomeScreenAdapter.class.getSimpleName();

    private Context mContext;
    private List<User> users;
    private HomeListerner homeInterface;
    private LayoutInflater layoutInflater;


    public HomeScreenAdapter(Context context, List<User> userList, HomeListerner homeListerner) {
        this.mContext = context;
        this.users = userList;
        this.homeInterface = homeListerner;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private final ListItemHomeUserBinding binding;

        public MyViewHolder(@NonNull ListItemHomeUserBinding itemHomeUserBinding) {
            super(itemHomeUserBinding.getRoot());
            this.binding = itemHomeUserBinding;

        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(viewGroup.getContext());
        }
        ListItemHomeUserBinding binding =
                DataBindingUtil.inflate(layoutInflater, R.layout.list_item_home_user, viewGroup, false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        User user = users.get(i);
        myViewHolder.binding.setUser(user);


        myViewHolder.binding.layoutUser.setOnClickListener(v -> {
            if(this.homeInterface != null) {
                this.homeInterface.showProfile(user);
            }
        });

    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}

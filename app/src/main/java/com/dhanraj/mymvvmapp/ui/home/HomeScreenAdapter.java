package com.dhanraj.mymvvmapp.ui.home;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dhanraj.mymvvmapp.R;

import java.util.List;

public class HomeScreenAdapter extends RecyclerView.Adapter<HomeScreenAdapter.MyViewHolder> {
    private static final String TAG = HomeScreenAdapter.class.getSimpleName();

    private  Context mContext;
    private List<User> users;
    public HomeScreenAdapter(Context context, List<User> userList) {
        this.mContext = context;
        this.users = userList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView tvName, tvEmail, tvComment;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.tvName);
            tvEmail = itemView.findViewById(R.id.tvEmail);
            tvComment = itemView.findViewById(R.id.tvComment);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View viewItem = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_home_user, viewGroup, false);
        return new MyViewHolder(viewItem);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        User user = users.get(i);
        myViewHolder.tvName.setText(user.getUsername());
        myViewHolder.tvEmail.setText(user.getEmail());
        myViewHolder.tvComment.setText(user.getComment());

    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}

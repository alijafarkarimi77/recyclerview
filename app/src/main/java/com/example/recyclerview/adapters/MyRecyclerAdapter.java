package com.example.recyclerview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;
import com.example.recyclerview.model.User;

import java.util.List;

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.MyViewHolder> {
     private Context context;
     private List<User> users;
    public MyRecyclerAdapter(Context context,List<User>users){
        this.context=context;
        this.users=users;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       View view= LayoutInflater.from(context).inflate(R.layout.my_recycler_list_items,viewGroup,false);
        return  new  MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder (@NonNull MyViewHolder viewHolder, int i) {
        viewHolder.name.setText(users.get(i).getName()+ "  "+users.get(i).getFamily() );

    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView name;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name= itemView.<TextView>findViewById(R.id.name);
        }
    }
}

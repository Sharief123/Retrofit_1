package com.example.retrofit_1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class Recycleradapter extends RecyclerView.Adapter<Recycleradapter.MyHolder> {


    private ArrayList<Response> getMenus = new ArrayList<>();

    public Recycleradapter(ArrayList<Response> getMenus) {
        this.getMenus.addAll(getMenus);
    }


    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.test_menu_layout,parent,false);

        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.name.setText(getMenus.get(position).getName());

        //holder.email.setText(getMenus.get(position).getId());

    }

    @Override
    public int getItemCount() {
        return getMenus.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder
    {
        TextView name;
        TextView email;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            email = (itemView).findViewById(R.id.em);
        }
    }
}

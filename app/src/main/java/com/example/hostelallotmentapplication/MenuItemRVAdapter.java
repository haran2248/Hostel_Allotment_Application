package com.example.hostelallotmentapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MenuItemRVAdapter extends RecyclerView.Adapter<MenuItemViewHolder> {

    ArrayList<MenuItem> itemList;
    Context context;

    //constructor
    public MenuItemRVAdapter(ArrayList<MenuItem> itemList, Context context) {
        this.itemList = itemList;
        this.context = context;
    }

    @NonNull
    @Override
    public MenuItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_item_layout, parent, false);
        MenuItemViewHolder viewHolder = new MenuItemViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MenuItemViewHolder holder, int position) {

        holder.menuItemName.setText(itemList.get(position).getName());
        holder.menuItemSide.setText(String.valueOf(itemList.get(position).getSide()));
        holder.menuItemNameid = String.valueOf(itemList.get(position).getName());
        holder.menuItemSideid = String.valueOf(itemList.get(position).getSide());
    }

    @Override
    public int getItemCount() { return itemList.size(); }
}

package com.example.hostelallotmentapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DetailsRVAdapter extends RecyclerView.Adapter<DetailsRVAdapter.DetailsVH> {
    @NonNull
    ArrayList<Details> list=new ArrayList<Details>();
    Context context;

    public DetailsRVAdapter(@NonNull ArrayList<Details> list, Context context) {
        this.list = list;
        this.context = context;
    }

    public DetailsRVAdapter.DetailsVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DetailsVH(LayoutInflater.from(parent.getContext()).inflate(R.layout.details,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull DetailsRVAdapter.DetailsVH holder, int position) {
        holder.populate(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class DetailsVH extends RecyclerView.ViewHolder {
        TextView Roomno,NoofRooms,Name,Email,Wing1,Wing2,Wing3,Wing4,Wing5,NewHostel;
        public DetailsVH(@NonNull View itemView) {
            super(itemView);
            Roomno=itemView.findViewById(R.id.roomno);
            NoofRooms=itemView.findViewById(R.id.Nos);
            Name=itemView.findViewById(R.id.name);
            Email=itemView.findViewById(R.id.email);
            Wing1=itemView.findViewById(R.id.WingM1);
            Wing2=itemView.findViewById(R.id.WingM2);
            Wing3=itemView.findViewById(R.id.WingM3);
            Wing4=itemView.findViewById(R.id.WingM4);
            Wing5=itemView.findViewById(R.id.WingM5);
            NewHostel=itemView.findViewById(R.id.newH);
        }

        public void populate(Details details) {
            Name.setText(details.getName());
            Email.setText(details.getEmail());
            Roomno.setText(details.getRoomno());
            NoofRooms.setText(String.valueOf(details.getNoOfRooms()));
            Wing1.setText(details.getWing1());
            Wing2.setText(details.getWing2());
            Wing3.setText(details.getWing3());
            Wing4.setText(details.getWing4());
            Wing5.setText(details.getWing5());
            NewHostel.setText(details.getHostel());
        }
    }
}

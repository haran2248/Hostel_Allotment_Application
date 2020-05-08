package com.example.hostelallotmentapplication;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MenuItemViewHolder extends RecyclerView.ViewHolder {

    TextView menuItemName, menuItemSide;
    Button book;
    String menuItemNameid, menuItemSideid;
    DatabaseReference userReference=FirebaseDatabase.getInstance().getReference().child("users");

    public MenuItemViewHolder(@NonNull final View itemView) {
        super(itemView);

        menuItemName = itemView.findViewById(R.id.hostel_name);
        menuItemSide = itemView.findViewById(R.id.hostel_side);
        book =  itemView.findViewById(R.id.book_btn);

        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent book = new Intent(itemView.getContext(), RoomBooking.class);
                userReference.child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("details").child("newHostel").setValue(menuItemNameid);
                itemView.getContext().startActivity(book);
            }
        });
    }
}

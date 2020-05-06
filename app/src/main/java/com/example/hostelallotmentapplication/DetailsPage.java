package com.example.hostelallotmentapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Objects;

public class DetailsPage extends AppCompatActivity {
    RecyclerView details;
    Button exit;
    FirebaseAuth auth;
    DatabaseReference databaseReference;
    DetailsRVAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_page);
        details=findViewById(R.id.details_rv);
        exit=findViewById(R.id.exit);
        auth=FirebaseAuth.getInstance();
        details.setLayoutManager(new LinearLayoutManager(this));
        databaseReference= FirebaseDatabase.getInstance().getReference().child("users");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                ArrayList<Details> detailsArrayList=new ArrayList<>();
                for(DataSnapshot shot:dataSnapshot.child(auth.getCurrentUser().getUid()).getChildren()){
                    detailsArrayList.add(shot.getValue(Details.class));
                }
                adapter=new DetailsRVAdapter(detailsArrayList,getApplicationContext());
                details.setAdapter(adapter);
                Toast.makeText(DetailsPage.this,"Success",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(DetailsPage.this,"Error in loading",Toast.LENGTH_SHORT).show();

            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });

    }
}

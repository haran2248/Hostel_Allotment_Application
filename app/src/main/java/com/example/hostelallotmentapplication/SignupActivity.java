package com.example.hostelallotmentapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignupActivity extends AppCompatActivity {

    Button signup1;
    EditText bitsm,bitsp,name,room;
    DatabaseReference userReference;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        mAuth=FirebaseAuth.getInstance();

        bitsm=findViewById(R.id.bitsemail);
        bitsp=findViewById(R.id.bitspassword);
        name=findViewById(R.id.name);
        room=findViewById(R.id.roomno);
        signup1=findViewById(R.id.signupfirst);
        userReference= FirebaseDatabase.getInstance().getReference().child("users");



        signup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.createUserWithEmailAndPassword(bitsm.getText().toString(),bitsp.getText().toString())
                        .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                            int status1,status2,status3,status4;
                            @Override
                            public void onSuccess(AuthResult authResult) {

                                userReference.child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("details").child("Name").setValue(name.getText().toString());
                                userReference.child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("details").child("Email").setValue(bitsm.getText().toString());
                                userReference.child(FirebaseAuth.getInstance().getCurrentUser().getUid()).child("details").child("RoomNO").setValue(room.getText().toString());
                                Toast.makeText(SignupActivity.this,"User created successfully",Toast.LENGTH_SHORT).show();
                                Intent intent=new Intent(SignupActivity.this,MainActivity.class);
                                startActivity(intent);
                                finish();

                            }
                        })

                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(SignupActivity.this,e.getMessage(),Toast.LENGTH_SHORT).show();

                            }
                        });

            }
        });



    }
}

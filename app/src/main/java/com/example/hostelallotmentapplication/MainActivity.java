package com.example.hostelallotmentapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    TextInputEditText idText, passwordText;
    TextInputLayout user,pass;
  private   Button login,signup;
    int c;
    String id_input, password_input;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=findViewById(R.id.user);
        pass=findViewById(R.id.pass);
        idText = findViewById(R.id.login_IDEditTExt);
        passwordText = findViewById(R.id.login_passwordEditText);
        login = (Button)findViewById(R.id.loginbtn);
        signup=(Button) findViewById(R.id.signupbtn);
        final FirebaseAuth mAuth=FirebaseAuth.getInstance();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id_input = idText.getText().toString();
                password_input = passwordText.getText().toString();

                if (id_input.isEmpty() || password_input.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter username/password", Toast.LENGTH_SHORT).show();
                }
                mAuth.signInWithEmailAndPassword(idText.getText().toString(),passwordText.getText().toString())
                        .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                            @Override
                            public void onSuccess(AuthResult authResult) {
                                Intent intent=new Intent(MainActivity.this, RecycleView.class);
                                startActivity(intent);
                                Toast.makeText(MainActivity.this,"Accessed",Toast.LENGTH_SHORT);

                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(MainActivity.this,e.getMessage(),Toast.LENGTH_SHORT).show();
                            }
                        });


    }
});
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,SignupActivity.class);
                startActivity(i);
            }
        });
    }
}


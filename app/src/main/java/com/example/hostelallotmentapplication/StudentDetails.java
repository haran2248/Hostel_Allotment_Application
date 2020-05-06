package com.example.hostelallotmentapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class StudentDetails extends AppCompatActivity {

    TextView nameText, idText, hostelText, roomText;
    Button bookrooms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);

        initialize();
        String id = getIntent().getStringExtra("id");
        String name = getIntent().getStringExtra("name");
        final String hostel = getIntent().getStringExtra("hostel");
        String roomnum = getIntent().getStringExtra("roomnum");
        idText.setText(id);
        nameText.setText(name);
        hostelText.setText(hostel);
        roomText.setText(roomnum);

        bookrooms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hostellist = new Intent(StudentDetails.this, RecycleView.class);
                hostellist.putExtra("hostel", hostel);
                startActivity(hostellist);
            }
        });
    }

    private void initialize() {
        nameText = findViewById(R.id.NameTextView);
        idText = findViewById(R.id.IDTextView);
        hostelText = findViewById(R.id.HostelTextView);
        roomText = findViewById(R.id.RoomTextView);
        bookrooms = findViewById(R.id.bookroomsbtn);
    }
}

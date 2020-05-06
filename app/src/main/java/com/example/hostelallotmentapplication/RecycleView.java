package com.example.hostelallotmentapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class RecycleView extends AppCompatActivity {

    RecyclerView recyclerView;
    MenuItemRVAdapter adapter;

    ArrayList<MenuItem> itemList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);

        addStuff();
        initRecyclerView();
    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.menu_rv);
        adapter = new MenuItemRVAdapter(itemList, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private void addStuff() {
        String[] names = {"AH1","AH2","AH3","AH4","AH5","AH6","AH7","AH8","AH9","CH1","CH2","CH3","CH4","CH5","CH6","CH7","DH1","DH2","DH3","DH4"};
        String[] side = {"A side","A side","A side","A side","A side","A side","A side","A side","A side","C side","C side","C side","C side","C side","C side","C side","D side","D side","D side","D side"};

        for (int i = 0; i < names.length; i++) {
            itemList.add(new MenuItem(names[i], side[i]));
        }
    }
}

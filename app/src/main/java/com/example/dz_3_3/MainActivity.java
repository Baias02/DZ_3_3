package com.example.dz_3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> arrayList;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayList = new ArrayList<>();

        arrayList.add("ZULFIA");
        arrayList.add("VARIS");
        arrayList.add("KENCH");
        arrayList.add("SULTAN");
        arrayList.add("BAYAS");
        arrayList.add("RYSYA");

        ContactAdapter adapter = new ContactAdapter(arrayList);

        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setAdapter(adapter);
    }
}

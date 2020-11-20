package com.example.ezyfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class SnackActivity extends AppCompatActivity {
    private ArrayList<Integer> fotoMinuman = new ArrayList<>();
    private ArrayList<String> namaMinuman= new ArrayList<>();
    private ArrayList<String> hargaMinuman= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
        getdatafromfoto();
    }
    private void prosesRecycleViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMinuman, namaMinuman, hargaMinuman, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
    private void getdatafromfoto(){
        namaMinuman.add("Taro");
        hargaMinuman.add("5000");
        fotoMinuman.add(R.drawable.taro);

        namaMinuman.add("Chiki ball");
        hargaMinuman.add("5000");
        fotoMinuman.add(R.drawable.cikiball);

        prosesRecycleViewAdapter();
    }
}
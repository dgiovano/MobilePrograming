package com.example.ezyfood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class FoodActivity extends AppCompatActivity {
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
        namaMinuman.add("Efata");
        hargaMinuman.add("20000");
        fotoMinuman.add(R.drawable.efata);

        namaMinuman.add("Ayam Rocky");
        hargaMinuman.add("15000");
        fotoMinuman.add(R.drawable.rocky);

//        namaMinuman.add("Jus Mangga");
//        hargaMinuman.add("7000");
//        fotoMinuman.add(R.drawable.mangga);
//
//        namaMinuman.add("Jus Alpukat");
//        hargaMinuman.add("10000");
//        fotoMinuman.add(R.drawable.alpukat);

        prosesRecycleViewAdapter();
    }
}
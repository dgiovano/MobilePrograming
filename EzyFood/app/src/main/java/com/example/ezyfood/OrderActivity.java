package com.example.ezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {
    private Integer fotoMinuman;
    private String namaMinuman;
    private String hargaMinuman;
    ImageView imageViewFotoMinuman;
    TextView textViewNamaMinuman;
    TextView textViewHargaMinuman;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        imageViewFotoMinuman=findViewById(R.id.imageViewFotoMinuman);
        textViewNamaMinuman=findViewById(R.id.textViewNamaMinuman);
        textViewHargaMinuman=findViewById(R.id.textViewHargaMinuman);
        getDataOrder();
        setDataOrder();
    }
    private void getDataOrder(){
        fotoMinuman = getIntent().getIntExtra("foto",1);
        namaMinuman = getIntent().getStringExtra("nama");
        hargaMinuman = getIntent().getStringExtra("harga");
    }
    private void setDataOrder(){
        imageViewFotoMinuman.setImageResource(fotoMinuman);
        textViewNamaMinuman.setText(namaMinuman);
        textViewHargaMinuman.setText(hargaMinuman);
    }

}
package com.example.ezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button DrinksButton;
    private Button SnacksButton;
    private Button FoodsButton;
    private Button TopupButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FoodsButton = (Button) findViewById(R.id.FoodsButton);
        FoodsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenFoodActivity();
            }
        });
        DrinksButton = (Button) findViewById(R.id.DrinksButton);
        DrinksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDrinkActivity();
            }
        });
        SnacksButton=(Button) findViewById(R.id.SnacksButton);
        SnacksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenSnackActivity();
            }
        });

    }
    public void  OpenFoodActivity(){
        Intent intent = new Intent(this, FoodActivity.class);
        startActivity(intent);
    }
    public void OpenDrinkActivity(){
        Intent intent = new Intent(this, DrinkActivity.class);
        startActivity(intent);
    }
    public void OpenSnackActivity(){
        Intent intent=new Intent(this, SnackActivity.class);
        startActivity(intent);
    }

}
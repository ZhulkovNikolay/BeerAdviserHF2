package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindBeer (View view) {
        TextView brands =  findViewById(R.id.brands);
        Spinner color = findViewById(R.id.color);
        String beerType = String.valueOf(color.getSelectedItem());

        List<String> advisedList = new BeerExpert().getBrands(beerType);
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : advisedList) {
            stringBuilder.append(s).append('\n');
        }
            brands.setText(stringBuilder);
    }



}

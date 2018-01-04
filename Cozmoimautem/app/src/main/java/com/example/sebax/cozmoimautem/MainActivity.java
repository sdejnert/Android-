package com.example.sebax.cozmoimautem;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActionBar actionBar;
    GridView grid;
    String[] text = {
            "Lista problemów",
            "Lista części",
            "Kalkulator paliwa",
            "Krótkie poradniki"

    };
    int[] imageId = {
            R.drawable.znak, R.drawable.gear, R.drawable.paliwo, R.drawable.ksiazka
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#726d6d")));

        CustomGrid adapter = new CustomGrid(MainActivity.this, text, imageId);
        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

        @Override
        public void onItemClick(AdapterView<?> parent, View view,
        int position, long id) {
            if( position == 0){
            Intent intent = new Intent(MainActivity.this, ListProblem.class);
            startActivity(intent);
            }
        }
    });



    }
}

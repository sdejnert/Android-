package com.example.sebax.cozmoimautem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class CalcActivity extends AppCompatActivity {

    EditText odleglosc = (EditText)findViewById(R.id.odlegloscE);
    String odlegloscString = odleglosc.getText().toString();
    double odlegloscDouble = Double.parseDouble(odlegloscString);
    EditText cena = (EditText)findViewById(R.id.cenaE);
    String cenaString = cena.getText().toString();
    double cenaDouble = Double.parseDouble(cenaString);
    EditText spalanie = (EditText)findViewById(R.id.spalanieE);
    String spalanieString = spalanie.getText().toString();
    double spalanieDouble = Double.parseDouble(spalanieString);
    TextView wynik = (TextView)findViewById(R.id.wynik);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

    }
}

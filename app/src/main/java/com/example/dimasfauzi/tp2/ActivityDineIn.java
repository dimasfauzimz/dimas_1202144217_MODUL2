package com.example.dimasfauzi.tp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class ActivityDineIn extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Spinner nama_meja; // set tipe data variable nama_meja, tipe data yang digunakan spinner
    Button button_pick; // set tipe variable menjadi button
    Intent intent ;// set tipe variable menjadi intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
        button_pick=(Button)findViewById(R.id.button_pick); // set tipe variable button
        button_pick.setOnClickListener(new View.OnClickListener() { // set listener pada button pick
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(intent); // memunculkan / menapilkan activity baru
                //Toast.makeText(getApplicationContext(), "Gotcha "+options.getText(), Toast.LENGTH_SHORT).show();
            }
        });
        nama_meja = (Spinner)findViewById(R.id.nama_meja); // set variable nama_menjad dari id widget di layout
        // Spinner click listener
        nama_meja.setOnItemSelectedListener(this); // set jika user mengganti spinner / opsi yang dipilih

        // Spinner Drop down elements
        List<String> categories = new ArrayList<>(); // membuat list untuk kategori nama_meja
        categories.add("Meja 1");// menambahkan opsi
        categories.add("Meja 2");// menambahkan opsi
        categories.add("Meja 3");// menambahkan opsi
        categories.add("Meja 4");// menambahkan opsi
        categories.add("Meja 5");// menambahkan opsi
        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);
        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        nama_meja.setAdapter(dataAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}

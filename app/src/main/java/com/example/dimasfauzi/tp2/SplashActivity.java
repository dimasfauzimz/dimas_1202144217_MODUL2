package com.example.dimasfauzi.tp2;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, MainActivity.class); // Class intent untuk me link ke activity selanjutnya
        startActivity(intent);// memulai activity selanjutnya
        finish();// hapus activity ini dari history back
    }
}

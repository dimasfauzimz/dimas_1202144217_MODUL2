package com.example.dimasfauzi.tp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityTakeAway extends AppCompatActivity {
    Button button_pick; // set tipe variable menjadi button
    Intent intent ;// set tipe variable menjadi intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
        button_pick=(Button)findViewById(R.id.button_pick); // set tipe variable button
        button_pick.setOnClickListener(new View.OnClickListener() { // set listener pada button pick
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(intent); // memunculkan / menapilkan activity baru
                //Toast.makeText(getApplicationContext(), "Gotcha "+options.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}

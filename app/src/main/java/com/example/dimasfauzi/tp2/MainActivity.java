package com.example.dimasfauzi.tp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button pesan; // set tipe data variable pesan
    RadioGroup menu; // set tipe data variable menu
    RadioButton options; // set tipe data variable options
    Intent intent; // set tipe data variable intents
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // menampilkan halaman di layout activity main
        Toast.makeText(this, "DIMAS_1202144217", Toast.LENGTH_SHORT).show(); // membuat toast / popup
        pesan=(Button)findViewById(R.id.pesan);// set isi variable pesan dari id layout
        menu = (RadioGroup) findViewById(R.id.menu_diner);// set isi variable pesan dari id layout
        pesan.setOnClickListener(new View.OnClickListener() { // set listener untuk tombol pesan
            @Override
            public void onClick(View view) {
                int selectedId = menu.getCheckedRadioButtonId();// mengambil id radio yang dipilih user
                options = (RadioButton) findViewById(selectedId);
                if(options.getText().equals("Take Away")){ // jika user memilih menu / radio take away
                    intent = new Intent(getApplicationContext(), ActivityTakeAway.class); // setting activity selanjutnya akan kemana
                }else{
                    intent = new Intent(getApplicationContext(), ActivityDineIn.class);  // setting activity selanjutnya akan kemana
                }
                startActivity(intent);  // memulai activity baru
                //Toast.makeText(getApplicationContext(), "Gotcha "+options.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}

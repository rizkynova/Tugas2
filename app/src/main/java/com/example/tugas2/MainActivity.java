package com.example.tugas2;
/*
     Tugas 2
     Nama  : Rizky Novayandi
     Kelas : IF4
     NIM   : 10117140
     Tanggal Pengerjaan : Rabu 15 April 2020 11:26 WIB
*/
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView TextView = findViewById(R.id.textView4);
        TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,register.class);
                startActivity(i);
            }
        });

    }
}

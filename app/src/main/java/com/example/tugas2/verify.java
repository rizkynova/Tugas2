package com.example.tugas2;

/*
     Tugas 2
     Nama  : Rizky Novayandi
     Kelas : IF4
     NIM   : 10117140
     Tanggal Pengerjaan : Kamis 16 April 2020 23:06 WIB
*/

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class verify extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(verify.this,verifyaccount.class);
                startActivity(i);
            }
        });

    }
}

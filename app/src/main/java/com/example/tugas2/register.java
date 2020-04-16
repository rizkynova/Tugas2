package com.example.tugas2;

/*
     Tugas 2
     Nama  : Rizky Novayandi
     Kelas : IF4
     NIM   : 10117140
     Tanggal Pengerjaan : Kamis 15 April 2020 07:26 WIB
*/



import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class register extends AppCompatActivity {
    EditText bloodtipe;
    Button button;
    Toolbar toolbar;
    private Spinner spinnerz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        //toolbar
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Register");
        setSupportActionBar(toolbar);

        //set icon ke toolbar
        toolbar.setNavigationIcon(R.drawable.ic_header_back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //pindah layar intent ke verify
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(register.this,verify.class);
                startActivity(i);
            }
        });
    }

}

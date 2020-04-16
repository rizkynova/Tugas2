package com.example.tugas2;

/*
     Tugas 2
     Nama  : Rizky Novayandi
     Kelas : IF4
     NIM   : 10117140
     Tanggal Pengerjaan : Jumat 17 April 2020 03:37 WIB
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

public class userhome extends AppCompatActivity {
    EditText editteks;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userhome);
        editteks = (EditText) findViewById(R.id.editText13);
        toolbar = (Toolbar) findViewById(R.id.toolbar2);
        toolbar.setNavigationIcon(R.drawable.ic_side_menu);
        toolbar.setNavigationIcon(R.drawable.ic_side_menu);
        editteks.setFocusable(false);
    }
}

package com.example.birthdayrem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.EditText;

public class Add_birthday extends AppCompatActivity {

    Toolbar toolbar;
    EditText birthTitle,noteDet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_birthday);

        toolbar = findViewById(R.id.Toolbar);
        setSupportActionBar(toolbar);

        noteDet = findViewById(R.id.noteDet);
        birthTitle = findViewById(R.id.birthTitle);

    }
}
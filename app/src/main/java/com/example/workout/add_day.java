package com.example.workout;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class add_day extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_day);

        EditText nameEditText = findViewById(R.id.add_day_text);
        EditText uriEditText = findViewById(R.id.add_uri_text);
        Button buttonAdd = findViewById(R.id.button_add_final);

        buttonAdd.setOnClickListener(view -> {
           BeginnerActivity.addDay(nameEditText.getText().toString() , uriEditText.getText().toString());
           finish();
        }
        );
    }
}
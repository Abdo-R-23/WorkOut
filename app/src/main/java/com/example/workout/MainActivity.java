package com.example.workout;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.workout.db.DataBase;

public class MainActivity extends AppCompatActivity {

    CardView beginnerCardView ;
    CardView advanceCardView ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.advance_beginner);

        beginnerCardView = findViewById(R.id.beginnerCard);
        advanceCardView = findViewById(R.id.advanceCard);


        beginnerCardView.setOnClickListener(view -> {
            Intent intent = new Intent(this, BeginnerActivity.class);
            startActivity(intent);
        });

        advanceCardView.setOnClickListener(view -> {
            Intent intent = new Intent(this, AdvanceActivity.class);
            startActivity(intent);

        });
    }
}

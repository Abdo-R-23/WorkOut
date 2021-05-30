package com.example.workout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.CompoundButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import com.example.workout.db.AdvanceDb;
import com.example.workout.db.DataBase;

public class AdvanceActivity extends AppCompatActivity implements OnLinkClick {
    RecyclerView recyclerView;
    AdvanceAdapter adapter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advancee);

        recyclerView = findViewById(R.id.advance_actitvityy);
        adapter = new AdvanceAdapter(this);
        recyclerView.setAdapter(adapter);
        adapter.setList(DataProvider.provideAdvanceData());
        AdvanceDb mdb = Room.databaseBuilder(getApplicationContext(),
                AdvanceDb.class, "advance_db").allowMainThreadQueries().build();
        if (mdb.advanceDao().getAdvanceDays().isEmpty()){ mdb.advanceDao().insertDays(DataProvider.provideAdvanceData());}
        adapter.setList( mdb.advanceDao().getAdvanceDays());
    }

    @Override
    public void onClickObserver(String uri) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)));
    }

    @Override
    public void onBoxClicked(Day day, CompoundButton compoundButton) {

    }

    @Override
    public void onDelClicked(int id) {

    }
}



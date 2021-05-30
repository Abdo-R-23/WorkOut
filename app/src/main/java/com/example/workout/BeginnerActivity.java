package com.example.workout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CompoundButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import com.example.workout.db.DataBase;
import com.google.firebase.auth.FirebaseAuth;

public class BeginnerActivity extends AppCompatActivity implements OnLinkClick {
    RecyclerView recyclerView;
    static BeginnerAdapter adapter;
    private static DataBase mdb;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beginner_activity);

        recyclerView = findViewById(R.id.recycle_view);
        adapter = new BeginnerAdapter(this);
        recyclerView.setAdapter(adapter);

        Button buttonAdd = findViewById(R.id.button_add_begginer);
        buttonAdd.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), add_day.class);
            startActivity(intent);
        });

        mdb = Room.databaseBuilder(getApplicationContext(),
                DataBase.class, "beginner_db").allowMainThreadQueries().build();
        if (mdb.dao().getDays().isEmpty()){ mdb.dao().insertDays(DataProvider.provideBeginnerData());
        System.out.println("called");}
        adapter.setList( mdb.dao().getDays());
    }

    @Override
    public void onClickObserver(String uri) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)));

    }

    @Override
    public void onBoxClicked(Day day, CompoundButton compoundButton) {
        day.setDone(compoundButton.isChecked());
        mdb.dao().deleteDay(day.id);
        mdb.dao().insertDay(day);

    }

    @Override
    public void onDelClicked(int id) {
        mdb.dao().deleteDay(id);
        adapter.setList(mdb.dao().getDays());
    }

    public static void addDay(String dayName, String dayUri){
        mdb.dao().insertDay(new Day(dayName,dayUri,"",false));
        adapter.setList(mdb.dao().getDays());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menus, menu);
        return true;

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.logout) {
            FirebaseAuth.getInstance().signOut();
            Intent intent;
            intent = new Intent(getApplicationContext(), Login.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

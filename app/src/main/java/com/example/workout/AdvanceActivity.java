package com.example.workout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

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
    }

    @Override
    public void onClickObserver(String uri) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)));
    }
}



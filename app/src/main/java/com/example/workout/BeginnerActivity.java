package com.example.workout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class BeginnerActivity extends AppCompatActivity implements OnLinkClick {
    RecyclerView recyclerView;
    BeginnerAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beginner_activity);

        recyclerView = findViewById(R.id.recycle_view);
        adapter = new BeginnerAdapter(this);
        recyclerView.setAdapter(adapter);
        adapter.setList(DataProvider.provideBeginnerData());
    }

    @Override
    public void onClickObserver(String uri) {
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)));

    }
}

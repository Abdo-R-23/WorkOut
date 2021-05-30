package com.example.workout.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.example.workout.advanceDays;

@Database(entities = {advanceDays.class }, version = 1, exportSchema = false)
public abstract class AdvanceDb extends RoomDatabase {
    public abstract AdvanceDao advanceDao();
}

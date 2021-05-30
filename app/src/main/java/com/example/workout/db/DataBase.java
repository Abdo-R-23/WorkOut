package com.example.workout.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.example.workout.Day;


@Database(entities = {Day.class }, version = 2, exportSchema = false)
public abstract class DataBase extends RoomDatabase {
    public abstract Dao dao();
}

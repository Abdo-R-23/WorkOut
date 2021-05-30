package com.example.workout.db;

import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import com.example.workout.Day;
import java.util.List;

@androidx.room.Dao
public interface Dao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertDays(List<Day> days);

    @Insert
    void insertDay(Day day);

    @Query("delete from days_table where id =:id")
    void deleteDay(int id);

    @Query("select * from days_table")
    List<Day> getDays();
}
package com.example.workout.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import com.example.workout.Day;
import com.example.workout.advanceDays;

import java.util.List;
@Dao
public interface AdvanceDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertDays(List<advanceDays> days);

    @Insert
    void insertDay(advanceDays day);

//    @Query("delete from fav_table where name =:pokemonName")
//    void deleteDay(String dayName);

    @Query("select * from advance_days_table")
    List<advanceDays> getAdvanceDays();
}

package com.example.workout;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "advance_days_table")
public class advanceDays {
    @PrimaryKey(autoGenerate = true)
    public int id;
    String dayNumber;
    Boolean Done;
    String uri;
    String uri2;

    public advanceDays() {
    }

    public advanceDays(String dayNumber, String uri, String uri2 , Boolean done) {

        this.Done = done;
        this.dayNumber = dayNumber;
        this.uri = uri;
        this.uri2 = uri2;
    }

    public int getId() {
        return id;
    }

    public Boolean getDone() {
        return Done;
    }

    public void setDone(Boolean done) {
        Done = done;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDayNumber(String dayNumber) {
        this.dayNumber = dayNumber;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public void setUri2(String uri2) {
        this.uri2 = uri2;
    }

    public String getDayNumber() {
        return dayNumber;
    }

    public String getUri() {
        return uri;
    }

    public String getUri2() {
        return uri2;
    }
}

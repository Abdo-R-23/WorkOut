package com.example.workout;

public class Day {


    String dayNumber;
    String uri;
    String uri2;

    public Day( String dayNumber, String uri, String uri2) {

        this.dayNumber = dayNumber;
        this.uri = uri;
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

package com.example.workout;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {


    static List<Day>provideBeginnerData(){

        List<Day> daysList = new ArrayList<>();
        daysList.add(new Day("Day one: chest and abs     ","https://www.youtube.com/watch?v=G2XrGztOTi0","https://www.youtube.com/watch?v=TIMghHu6QFU"));
        daysList.add(new Day("Day two: legs and abs     ","https://www.youtube.com/watch?v=vUf6sKEHKi0","https://www.youtube.com/watch?v=JLdSuFF62AI"));
        daysList.add(new Day("Day three: rest ","",""));
        daysList.add(new Day("Day four: back and abs    ","https://www.youtube.com/watch?v=SOvsUhLCdys","https://www.youtube.com/watch?v=JLdSuFF62AI"));
        daysList.add(new Day("Day five: shoulders and abs     ","https://www.youtube.com/watch?v=tKU64bd4gaw","https://www.youtube.com/watch?v=TIMghHu6QFU"));
        daysList.add(new Day("Day six: full body and arms     ","https://www.youtube.com/watch?v=oZjW1o1gorw","https://www.youtube.com/watch?v=wwKb-wZCEjs"));
        daysList.add(new Day("Day seven: shoulders and back     ","https://www.youtube.com/watch?v=gdXLJiFfR6M","https://www.youtube.com/watch?v=SOvsUhLCdys"));
        daysList.add(new Day("Day eight: full body     ","https://www.youtube.com/watch?v=oZjW1o1gorw",""));
        return daysList;
    }

    static List<Day>provideAdvanceData(){
        List<Day> daysList = new ArrayList<>();
        daysList.add(new Day("Day one: abs     ","https://www.youtube.com/watch?v=JLdSuFF62AI",""));
        daysList.add(new Day("Day two: legs and abs     ","https://www.youtube.com/watch?v=vUf6sKEHKi0","https://www.youtube.com/watch?v=JLdSuFF62AI"));
        daysList.add(new Day("Day three: arms and back   ","https://www.youtube.com/watch?v=wwKb-wZCEjs","https://www.youtube.com/watch?v=SOvsUhLCdys"));
        daysList.add(new Day("Day four: width and abs     ","https://www.youtube.com/watch?v=gdXLJiFfR6M","https://www.youtube.com/watch?v=vICVYyx22AY"));
        daysList.add(new Day("Day five: rest    ","",""));
        daysList.add(new Day("Day six: full body     "," https://www.youtube.com/watch?v=oZjW1o1gorw ",""));
        daysList.add(new Day("Day seven: chest and back     ","https://www.youtube.com/watch?v=G2XrGztOTi0","https://www.youtube.com/watch?v=SOvsUhLCdys"));
        daysList.add(new Day("Day eight: full body and abs     ","https://www.youtube.com/watch?v=oZjW1o1gorw","https://www.youtube.com/watch?v=TIMghHu6QFU"));
        return daysList;
    }
}

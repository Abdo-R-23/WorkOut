package com.example.workout;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {


    static List<Day>provideBeginnerData(){

        List<Day> daysList = new ArrayList<>();
        daysList.add(new Day("Day one: chest and abs     ","https://www.youtube.com/watch?v=G2XrGztOTi0","https://www.youtube.com/watch?v=TIMghHu6QFU",false));
        daysList.add(new Day("Day two: legs and abs     ","https://www.youtube.com/watch?v=vUf6sKEHKi0","https://www.youtube.com/watch?v=JLdSuFF62AI",false));
        daysList.add(new Day("Day three: rest ","","",false));
        daysList.add(new Day("Day four: back and abs    ","https://www.youtube.com/watch?v=SOvsUhLCdys","https://www.youtube.com/watch?v=JLdSuFF62AI",false));
        daysList.add(new Day("Day five: shoulders and abs     ","https://www.youtube.com/watch?v=tKU64bd4gaw","https://www.youtube.com/watch?v=TIMghHu6QFU",false));
        daysList.add(new Day("Day six: full body and arms     ","https://www.youtube.com/watch?v=oZjW1o1gorw","https://www.youtube.com/watch?v=wwKb-wZCEjs",false));
        daysList.add(new Day("Day seven: shoulders and back     ","https://www.youtube.com/watch?v=gdXLJiFfR6M","https://www.youtube.com/watch?v=SOvsUhLCdys",false));
        daysList.add(new Day("Day eight: full body     ","https://www.youtube.com/watch?v=oZjW1o1gorw","",false));
        return daysList;
    }

    static List<advanceDays>provideAdvanceData(){
        List<advanceDays> daysList = new ArrayList<>();
        daysList.add(new advanceDays("Day one: abs     ","https://www.youtube.com/watch?v=JLdSuFF62AI","",false));
        daysList.add(new advanceDays("Day two: legs and abs     ","https://www.youtube.com/watch?v=vUf6sKEHKi0","https://www.youtube.com/watch?v=JLdSuFF62AI",false));
        daysList.add(new advanceDays("Day three: arms and back   ","https://www.youtube.com/watch?v=wwKb-wZCEjs","https://www.youtube.com/watch?v=SOvsUhLCdys",false));
        daysList.add(new advanceDays("Day four: width and abs     ","https://www.youtube.com/watch?v=gdXLJiFfR6M","https://www.youtube.com/watch?v=vICVYyx22AY",false));
        daysList.add(new advanceDays("Day five: rest    ","","",false));
        daysList.add(new advanceDays("Day six: full body     "," https://www.youtube.com/watch?v=oZjW1o1gorw ","",false));
        daysList.add(new advanceDays("Day seven: chest and back     ","https://www.youtube.com/watch?v=G2XrGztOTi0","https://www.youtube.com/watch?v=SOvsUhLCdys",false));
        daysList.add(new advanceDays("Day eight: full body and abs     ","https://www.youtube.com/watch?v=oZjW1o1gorw","https://www.youtube.com/watch?v=TIMghHu6QFU",false));
        return daysList;
    }
}

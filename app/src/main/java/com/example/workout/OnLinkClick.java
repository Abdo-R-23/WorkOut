package com.example.workout;


import android.widget.CompoundButton;

public interface OnLinkClick {
    void onClickObserver(String uri);
    void onBoxClicked(Day day , CompoundButton compoundButton);
    void onDelClicked(int id);
}

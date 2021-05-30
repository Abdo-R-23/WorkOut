package com.example.workout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class BeginnerAdapter extends RecyclerView.Adapter<BeginnerAdapter.DayViewHolder> {
    private final OnLinkClick onLinkClick ;
    public static List<Day> daysList = new ArrayList<>() ;

    public BeginnerAdapter(OnLinkClick onLinkClick) {
        this.onLinkClick = onLinkClick;
    }

    @NonNull
    @Override
    public DayViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DayViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.days_list_item, parent, false ),onLinkClick);
    }

    @Override
    public void onBindViewHolder(@NonNull DayViewHolder holder, int position) {

        holder.DayNumber.setText(daysList.get(position).getDayNumber());
        holder.uri.setText(daysList.get(position).getUri());
        holder.uri.setOnClickListener(view -> onLinkClick.onClickObserver(daysList.get(position).getUri()));
        holder.uri2.setText(daysList.get(position).getUri2());
        holder.uri2.setOnClickListener(view -> onLinkClick.onClickObserver(daysList.get(position).getUri2()));
        holder.checkBox.setChecked(daysList.get(position).Done);
//        holder.checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//                onLinkClick.onBoxClicked(daysList.get(position),compoundButton);
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return daysList.size();
    }

    public void setList (List <Day> daysList ){
        this.daysList = daysList;
        notifyDataSetChanged();
    }

    static class DayViewHolder extends RecyclerView.ViewHolder{
        TextView DayNumber;
        TextView uri;
        TextView uri2;
        CheckBox checkBox;
        ImageButton imageButton;

        public DayViewHolder(@NonNull View itemView ,OnLinkClick onLinkClick) {
            super(itemView);
            DayNumber = itemView.findViewById(R.id.day_text_view) ;
            uri = itemView.findViewById(R.id.uri_1);
            uri2 = itemView.findViewById(R.id.uri_2);
            checkBox = itemView.findViewById(R.id.checkBox);
            imageButton = itemView.findViewById(R.id.imageButton_del);
            checkBox.setOnCheckedChangeListener((compoundButton, b) -> onLinkClick.onBoxClicked(daysList.get(getAdapterPosition()),compoundButton));
            imageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onLinkClick.onDelClicked(daysList.get(getAdapterPosition()).id);
                }
            });
        }
    }
}

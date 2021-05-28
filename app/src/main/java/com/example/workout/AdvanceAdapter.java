package com.example.workout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AdvanceAdapter extends RecyclerView.Adapter<AdvanceAdapter.DayViewHolder> {
    private final OnLinkClick onLinkClick ;
    private List<Day> daysList = new ArrayList<>() ;

    public AdvanceAdapter(OnLinkClick onLinkClick) {
        this.onLinkClick = onLinkClick;
    }

        @NonNull
        @Override
        public DayViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new DayViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.days_list_item, parent, false ));
        }

        @Override
        public void onBindViewHolder(@NonNull DayViewHolder holder, int position) {

            holder.DayNumber.setText(daysList.get(position).getDayNumber());
            holder.uri.setText(daysList.get(position).getUri());
            holder.uri2.setText(daysList.get(position).getUri2());
            holder.uri.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onLinkClick.onClickObserver(daysList.get(position).getUri());
                }
            });
            holder.uri2.setText(daysList.get(position).getUri2());

            holder.uri2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onLinkClick.onClickObserver(daysList.get(position).getUri2());
                }
            });
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

            public DayViewHolder(@NonNull View itemView) {
                super(itemView);
                DayNumber = itemView.findViewById(R.id.day_text_view) ;
                uri = itemView.findViewById(R.id.uri_1);
                uri2 = itemView.findViewById(R.id.uri_2);
            }
        }
    }




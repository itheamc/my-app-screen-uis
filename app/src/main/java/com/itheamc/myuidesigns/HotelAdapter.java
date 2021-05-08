package com.itheamc.myuidesigns;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.HotelViewHolder> {
    private List<String> strings;

    public HotelAdapter(@NonNull List<String> stringList) {
        this.strings = stringList;
    }

    @NonNull
    @Override
    public HotelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.hotel_view, parent, false);
        View view2 = inflater.inflate(R.layout.product_view, parent, false);

        return new HotelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HotelViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return strings.size();
    }

    public static class HotelViewHolder extends RecyclerView.ViewHolder {

        public HotelViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}

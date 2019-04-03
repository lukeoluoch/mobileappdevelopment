package com.example.myapplicationz;
import android.graphics.ColorSpace;
import android.support.v7.widget.RecyclerView;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myapplicationz.model.FastFood;

import java.util.ArrayList;
import java.util.List;
public class RecyclerViewAdapter extends RecyclerView.Adapter <RecyclerViewAdapter.ListItemViewHolder> {


    private ArrayList<FastFood> items;
    private SparseBooleanArray selectedItems;
    private static ClickListener clickListener;

    public interface ClickListener {
        void onItemClick(int position, View v);
        void onItemLongClick(int position, View v);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {
        TextView name;

        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);
            name = (TextView) itemView.findViewById(R.id.ffname);
        }

        @Override
        public void onClick(View v) {
            clickListener.onItemClick(getAdapterPosition(), v);
        }

        @Override
        public boolean onLongClick(View v) {
            clickListener.onItemLongClick(getAdapterPosition(), v);
            return false;
        }
    }
    public void setOnItemClickListener(ClickListener clickListener) {
        RecyclerViewAdapter.clickListener = clickListener;
    }




    RecyclerViewAdapter(ArrayList<FastFood> modelData) {
        if (modelData == null) {
            throw new IllegalArgumentException("modelData must not be null");
        }
        items = modelData;
        selectedItems = new SparseBooleanArray();
    }

    @Override
    public ListItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.item_demo_01, viewGroup, false);
        return new ListItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ListItemViewHolder viewHolder, int position) {
        FastFood model = items.get(position);
        viewHolder.name.setText(String.valueOf(model.name));
        viewHolder.food.setText(String.valueOf(model.food));
        viewHolder.slogan.setText(String.valueOf(model.slogan));
        viewHolder.desc.setText(String.valueOf(model.description));
        viewHolder.itemView.setActivated(selectedItems.get(position, false));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }



    public final static class ListItemViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView food;
        TextView slogan;
        TextView desc;

        public ListItemViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.txt_name);
            food = (TextView) itemView.findViewById(R.id.txt_age);
            slogan = (TextView) itemView.findViewById(R.id.txt_slogan);
            desc = (TextView) itemView.findViewById(R.id.txt_desc);
        }
    }
}
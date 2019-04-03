package com.example.assignment07;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.assignment07.model.Superhero;

import java.util.List;


public class SuperheroListAdapter extends RecyclerView.Adapter<SuperheroListAdapter.SuperheroViewHolder> {

    class SuperheroViewHolder extends RecyclerView.ViewHolder {
        private final TextView SuperheroItemView;
        private final Context context1;

        private SuperheroViewHolder(View itemView) {
            super(itemView);
            context1=itemView.getContext();
            SuperheroItemView = itemView.findViewById(R.id.textView);
        }
    }

    private final LayoutInflater mInflater;
    private List<Superhero> mSuperheros; // Cached copy of Superheros

    SuperheroListAdapter(Context context) { mInflater = LayoutInflater.from(context); }

    @Override
    public SuperheroViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.recyclerview_item, parent, false);
        SuperheroViewHolder holder=new SuperheroViewHolder(itemView);



        return holder;
    }

    @Override
    public void onBindViewHolder(SuperheroViewHolder holder, int position) {
        final Superhero current=mSuperheros.get(position);
        if (mSuperheros != null) {
            Superhero current2 = mSuperheros.get(position);
            holder.SuperheroItemView.setText(current2.name);
        } else {
            // Covers the case of data not being ready yet.
            holder.SuperheroItemView.setText("No Superhero");
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Here Is Click", "onClick: " + current.name+current.company+current.secretID);
                final Intent intent = new Intent(v.getContext(),SuperheroDetailsActivity.class);
                intent.putExtra("NameDetail",current.name);
                intent.putExtra("AlterDetail",current.secretID);
                intent.putExtra("CompanyDetail",current.company);
                v.getContext().startActivity(intent);
            }
        });
    }

    void setSuperheros(List<Superhero> Superheros){
        mSuperheros = Superheros;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        if (mSuperheros != null)
            return mSuperheros.size();
        else return 0;
    }
}
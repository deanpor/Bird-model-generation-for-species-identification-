package com.example.birdmodelcreation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LegAdapter extends RecyclerView.Adapter<LegAdapter.ViewHolder>{


    LegData[] mylegData;
    Context contextLeg;


    private LegAdapter.RecyclerViewClickListener listener;

    public LegAdapter(LegData[] mylegData, Context contextLeg, RecyclerViewClickListener listener) {
        this.mylegData = mylegData;
        this.contextLeg = contextLeg;
        this.listener = listener;
    }


    @NonNull
    @Override
    public LegAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycle_view_item_list, parent, false);
        LegAdapter.ViewHolder viewHolder = new LegAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull LegAdapter.ViewHolder holder, int position){
        final LegData myLegdata = mylegData[position];
        holder.legImage.setImageResource(myLegdata.getLegImage());
        holder.legDescription.setText(myLegdata.getLegDescription());
    }

    public interface RecyclerViewClickListener{
        void onClick(View v, int position);
    }

    @Override
    public int getItemCount(){return mylegData.length;}

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private ImageView legImage;
        private TextView legDescription;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            legImage = itemView.findViewById(R.id.imageview);
            legDescription = itemView.findViewById(R.id.description);

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view){listener.onClick(view, getAdapterPosition());}
    }
}

package com.example.birdmodelcreation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NeckAdapter extends RecyclerView.Adapter<NeckAdapter.ViewHolder>{

    NeckData[] myneckData;
    Context contextNeck;
    private RecyclerViewClickListener listener;

    public NeckAdapter(NeckData[] myneckData, Context contextNeck, RecyclerViewClickListener listener) {
        this.myneckData = myneckData;
        this.contextNeck = contextNeck;
        this.listener = listener;
    }

    @NonNull
    @Override
    public NeckAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycle_view_item_list,parent,false);
        NeckAdapter.ViewHolder viewHolder = new NeckAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NeckAdapter.ViewHolder holder, int position) {
        final NeckData myNeckdata = myneckData[position];
        holder.neckImage.setImageResource(myNeckdata.getNeckImage());
        holder.neckDescription.setText(myNeckdata.getNeckDescription());

    }

    public interface RecyclerViewClickListener{
        void onClick(View v, int position);
    }


    @Override
    public int getItemCount() {
        return myneckData.length;
    }




    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private ImageView neckImage;
        private TextView neckDescription;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            neckImage = itemView.findViewById(R.id.imageview);
            neckDescription = itemView.findViewById(R.id.description);



            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            listener.onClick(view, getAdapterPosition());
        }
    }





}

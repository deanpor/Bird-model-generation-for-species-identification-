package com.example.birdmodelcreation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BodyShapeAdapter extends RecyclerView.Adapter<BodyShapeAdapter.ViewHolder> {

    BodyShapeData[] myBodyShapeData;
    Context contextBodyShape;


    private BodyShapeAdapter.RecyclerViewClickListener listener;

    public BodyShapeAdapter(BodyShapeData[] myBodyShapeData, Context contextBodyShape, RecyclerViewClickListener listener) {
        this.myBodyShapeData = myBodyShapeData;
        this.contextBodyShape = contextBodyShape;
        this.listener = listener;
    }

    @NonNull
    @Override
    public BodyShapeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycle_view_item_list, parent, false);
        BodyShapeAdapter.ViewHolder viewHolder = new BodyShapeAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BodyShapeAdapter.ViewHolder holder, int position){
        final BodyShapeData myBodyShapedata = myBodyShapeData[position];
        holder.BodyShapeImage.setImageResource(myBodyShapedata.getBodyShapeImage());
        holder.BodyShapeDescription.setText(myBodyShapedata.getBodyShapeDescription());
    }

    public interface RecyclerViewClickListener{
        void onClick(View v, int position);
    }

    @Override
    public int getItemCount(){return myBodyShapeData.length;}

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private ImageView BodyShapeImage;
        private TextView BodyShapeDescription;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            BodyShapeImage = itemView.findViewById(R.id.imageview);
            BodyShapeDescription = itemView.findViewById(R.id.description);

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view){listener.onClick(view, getAdapterPosition());}
    }


}

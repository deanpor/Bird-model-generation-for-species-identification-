package com.example.birdmodelcreation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BeakAdapter extends RecyclerView.Adapter<BeakAdapter.ViewHolder> {

    BeakData[] mybeakData;
    Context contextBeak;
    private RecyclerViewClickListener listener;

    public BeakAdapter(BeakData[] mybeakData, beak_selection beak, RecyclerViewClickListener listener) {
        this.mybeakData = mybeakData;
        this.contextBeak = beak;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycle_view_item_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final BeakData myBeakdata = mybeakData[position];
        holder.beakImage.setImageResource(myBeakdata.getBeakImage());
        holder.beakDescription.setText(myBeakdata.getBeakDescription());

    }

    public interface RecyclerViewClickListener{
        void onClick(View v, int position);
    }


    @Override
    public int getItemCount() {
        return mybeakData.length;
    }




    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private ImageView beakImage;
        private TextView beakDescription;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            beakImage = itemView.findViewById(R.id.imageview);
            beakDescription = itemView.findViewById(R.id.description);



            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            listener.onClick(view, getAdapterPosition());
        }
    }

}

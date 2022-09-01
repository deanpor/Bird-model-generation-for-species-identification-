package com.example.birdmodelcreation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class WingAdapter extends RecyclerView.Adapter<WingAdapter.ViewHolder>{

    WingData[] mywingData;
    Context contextWing;

    private WingAdapter.RecyclerViewClickListener listener;

    public WingAdapter(WingData[] mywingData, Context contextWing, WingAdapter.RecyclerViewClickListener listener) {
        this.mywingData = mywingData;
        this.contextWing = contextWing;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycle_view_item_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position){
        final WingData myWingdata = mywingData[position];
        holder.wingImage.setImageResource(myWingdata.getWingImage());
        holder.wingDescription.setText(myWingdata.getWingDescription());
    }

    public interface RecyclerViewClickListener{
        void onClick(View v, int position);
    }

    @Override
    public int getItemCount(){return mywingData.length;}

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private ImageView wingImage;
        private TextView wingDescription;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            wingImage = itemView.findViewById(R.id.imageview);
            wingDescription = itemView.findViewById(R.id.description);

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view){listener.onClick(view, getAdapterPosition());}
    }
}

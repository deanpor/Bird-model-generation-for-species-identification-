package com.example.birdmodelcreation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HeadAdapter extends RecyclerView.Adapter<HeadAdapter.ViewHolder>{

    HeadData[] myheadData;
    Context contextHead;
    private RecyclerViewClickListener listener;


    public HeadAdapter(HeadData[] myheadData, Context contextHead, RecyclerViewClickListener listener) {
        this.myheadData = myheadData;
        this.contextHead = contextHead;
        this.listener = listener;
    }

    @NonNull
    @Override
    public HeadAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycle_view_item_list,parent,false);
        HeadAdapter.ViewHolder viewHolder = new HeadAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HeadAdapter.ViewHolder holder, int position) {
        final HeadData myHeaddata = myheadData[position];
        holder.headImage.setImageResource(myHeaddata.getHeadImage());
        holder.headDescription.setText(myHeaddata.getHeadDescription());

    }

    public interface RecyclerViewClickListener{
        void onClick(View v, int position);
    }


    @Override
    public int getItemCount() {
        return myheadData.length;
    }




    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private ImageView headImage;
        private TextView headDescription;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            headImage = itemView.findViewById(R.id.imageview);
            headDescription = itemView.findViewById(R.id.description);



            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            listener.onClick(view, getAdapterPosition());
        }
    }








}

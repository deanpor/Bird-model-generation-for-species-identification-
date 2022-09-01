package com.example.birdmodelcreation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TailAdapter extends RecyclerView.Adapter<TailAdapter.ViewHolder> {


    TailData[] mytailData;
    Context contextTail;
    private RecyclerViewClickListener listener;


    public TailAdapter(TailData[] myTailData, Context contextTail, TailAdapter.RecyclerViewClickListener listener) {
        this.mytailData = myTailData;
        this.contextTail = contextTail;
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
        final TailData myTaildata = mytailData[position];
        holder.tailImage.setImageResource(myTaildata.getTailImage());
        holder.tailDescription.setText(myTaildata.getTailDescription());

    }

    public interface RecyclerViewClickListener{
        void onClick(View v, int position);
    }

    @Override
    public int getItemCount() {
        return mytailData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ImageView tailImage;
        private TextView tailDescription;

        public ViewHolder (@NonNull View itemView)
        {

            super(itemView);
            tailImage = itemView.findViewById(R.id.imageview);
            tailDescription = itemView.findViewById(R.id.description);



            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            listener.onClick(view, getAdapterPosition());
        }
    }
}

package com.example.birdmodelcreation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class EyesAdapter extends RecyclerView.Adapter<EyesAdapter.ViewHolder>{

    EyesData[] myEyesData;
    Context contextEyes;

    private EyesAdapter.RecyclerViewClickListener listener;

    public EyesAdapter(EyesData[] myEyesData, Context contextEyes, RecyclerViewClickListener listener) {
        this.myEyesData = myEyesData;
        this.contextEyes = contextEyes;
        this.listener = listener;
    }

    @NonNull
    @Override
    public EyesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycle_view_item_list, parent, false);
        EyesAdapter.ViewHolder viewHolder = new EyesAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull EyesAdapter.ViewHolder holder, int position){
        final EyesData myEyesdata = myEyesData[position];
        holder.EyesImage.setImageResource(myEyesdata.getEyesImage());
        holder.EyesDescription.setText(myEyesdata.getEyesDescription());
    }

    public interface RecyclerViewClickListener{
        void onClick(View v, int position);
    }

    @Override
    public int getItemCount(){return myEyesData.length;}

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private ImageView EyesImage;
        private TextView EyesDescription;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            EyesImage = itemView.findViewById(R.id.imageview);

            EyesDescription = itemView.findViewById(R.id.description);

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view){listener.onClick(view, getAdapterPosition());}
    }

}

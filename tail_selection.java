package com.example.birdmodelcreation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tail_selection extends AppCompatActivity {

    public TailData[] myTailData;
    private RecyclerView recyclerViewTail;
    private TailAdapter.RecyclerViewClickListener listener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tail_selection);

        recyclerViewTail = findViewById(R.id.recyclerView_tail);

        setAdapter();
    }

    private void setOnClickListener(){

        listener = new TailAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                int selectedTailImage = myTailData[position].getTailImage();

                String selectedBeakDescription = myTailData[position].getTailDescription();

               // System.out.println(selectedBeakDescription);
                Intent resultIntent = new Intent();
                resultIntent.putExtra("SelectedTail", selectedTailImage);

                setResult(RESULT_OK, resultIntent);
                finish();

            }
        };




    }

    private void setAdapter(){



        setOnClickListener();
        recyclerViewTail.setHasFixedSize(true);
        recyclerViewTail.setLayoutManager(new LinearLayoutManager(this));


        //  list.add(new com.example.birdmodelcreation.BeakData("Generalist ",R.drawable.generalist));
        myTailData = new TailData[]{
                new  TailData("Double Tail",R.drawable.double_tail),
                new  TailData("Fan Tail",R.drawable.fan),
                new TailData("Forked Tail",R.drawable.forked),
                new TailData("Notched Tail",R.drawable.notched),
                new  TailData("Pointed Tail",R.drawable.pointed),
                new  TailData("Rounded Tail",R.drawable.rounded),
                new TailData("Square Tail",R.drawable.squared),
                new  TailData("Wedge Tail",R.drawable.wedge),


                //  new  BeakData("Avatar",R.drawable.avatar),
        };

        TailAdapter myTailAdapter = new TailAdapter(myTailData,tail_selection.this, listener);
        recyclerViewTail.setAdapter(myTailAdapter);


    }

}
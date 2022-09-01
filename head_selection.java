package com.example.birdmodelcreation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class head_selection extends AppCompatActivity {

    public HeadData[] myHeadData;

    private RecyclerView recyclerView;

    private HeadAdapter.RecyclerViewClickListener listener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_head_selection);

        recyclerView = findViewById(R.id.recyclerView_head);

        setAdapter();
    }


    private void setOnClickListener(){

        listener = new HeadAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                int selectedHeadImage = myHeadData[position].getHeadImage();

                String selectedHeadDescription = myHeadData[position].getHeadDescription();

               // System.out.println(selectedBeakDescription);
                Intent resultIntent = new Intent();
                resultIntent.putExtra("SelectedHead", selectedHeadImage);

                setResult(RESULT_OK, resultIntent);
                finish();

            }
        };




    }



    private void setAdapter(){



        setOnClickListener();
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        //  list.add(new com.example.birdmodelcreation.BeakData("Generalist ",R.drawable.generalist));
        myHeadData = new HeadData[]{
                new  HeadData("Head Selection 1",R.drawable.birds_head1),
                new  HeadData("Head Selection 2",R.drawable.birds_head2),
              /*  new BeakData("Fruit Eating/ Scavenging",R.drawable.fruit_eating),
                new BeakData("Surface Skimming",R.drawable.surface_skimming),
                new  BeakData("Coniferous Seed Eating",R.drawable.coniferous_seed_eating),
                new  BeakData("Probing/ Nectar Feeding",R.drawable.probing),
                new  BeakData("Mud Probing",R.drawable.mud_probing),
                new  BeakData("Filter Feeding",R.drawable.filter_feeding),
                new  BeakData("Insect Catching/ Aerial Fishing/ Pursuit Fishing/ Chiseling",R.drawable.insect_catching),*/

                //  new  BeakData("Avatar",R.drawable.avatar),
        };

        HeadAdapter myHeadAdapter = new HeadAdapter(myHeadData,head_selection.this, listener);
        recyclerView.setAdapter(myHeadAdapter);


    }
}
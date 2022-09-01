package com.example.birdmodelcreation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class neck_selection extends AppCompatActivity {

    public NeckData[] myNeckData;
    private RecyclerView recyclerView;

    private NeckAdapter.RecyclerViewClickListener listener;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neck_selection);
        recyclerView =findViewById(R.id.recyclerView_neck);


        setAdapter();
    }

    private void setOnClickListener(){

        listener = new NeckAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                int selectedNeckImage = myNeckData[position].getNeckImage();

                String selectedNeckDescription = myNeckData[position].getNeckDescription();

                // System.out.println(selectedBeakDescription);
                Intent resultIntent = new Intent();
                resultIntent.putExtra("SelectedNeck", selectedNeckImage);

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
        myNeckData = new NeckData[]{
                new  NeckData("S Shape Curvy Neck",R.drawable.birds_neck_curvy),
                new  NeckData("Straight Long Neck",R.drawable.birds_straight_neck),
              /* new ,*/
                /*  new BeakData("Fruit Eating/ Scavenging",R.drawable.fruit_eating),
                  new BeakData("Surface Skimming",R.drawable.surface_skimming),
                  new  BeakData("Coniferous Seed Eating",R.drawable.coniferous_seed_eating),
                  new  BeakData("Probing/ Nectar Feeding",R.drawable.probing),
                  new  BeakData("Mud Probing",R.drawable.mud_probing),
                  new  BeakData("Filter Feeding",R.drawable.filter_feeding),
                  new  BeakData("Insect Catching/ Aerial Fishing/ Pursuit Fishing/ Chiseling",R.drawable.insect_catching),*/

                //  new  BeakData("Avatar",R.drawable.avatar),
        };

        NeckAdapter myNeckAdapter = new NeckAdapter(myNeckData,neck_selection.this, listener);
        recyclerView.setAdapter(myNeckAdapter);


    }
}
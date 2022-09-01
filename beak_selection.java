package com.example.birdmodelcreation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class beak_selection extends AppCompatActivity {


    public BeakData[] myBeakData;


    private RecyclerView recyclerView;


    private BeakAdapter.RecyclerViewClickListener listener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beak_selection);

        recyclerView = findViewById(R.id.recyclerView_beak);


        setAdapter();




    }

    private void setOnClickListener(){

        listener = new BeakAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                int selectedBeakImage = myBeakData[position].getBeakImage();

                String selectedBeakDescription = myBeakData[position].getBeakDescription();

                System.out.println(selectedBeakDescription);
                Intent resultIntent = new Intent();
                resultIntent.putExtra("SelectedBeak", selectedBeakImage);

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
        myBeakData = new BeakData[]{
                new  BeakData("Generalist/ Grain Eating/ Raptorial",R.drawable.generalist),
                new  BeakData("Deep Netting",R.drawable.deep_netting),
                new BeakData("Fruit Eating/ Scavenging",R.drawable.fruit_eating),
                new BeakData("Surface Skimming",R.drawable.surface_skimming),
                new  BeakData("Coniferous Seed Eating",R.drawable.coniferous_seed_eating),
                new  BeakData("Probing/ Nectar Feeding",R.drawable.probing),
                new  BeakData("Mud Probing",R.drawable.mud_probing),
                new  BeakData("Filter Feeding",R.drawable.filter_feeding),
                new  BeakData("Insect Catching/ Aerial Fishing/ Pursuit Fishing/ Chiseling",R.drawable.insect_catching),

                //  new  BeakData("Avatar",R.drawable.avatar),
        };

        BeakAdapter myBeakAdapter = new BeakAdapter(myBeakData,beak_selection.this, listener);
        recyclerView.setAdapter(myBeakAdapter);


    }

}

package com.example.birdmodelcreation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class bodyShape_selection extends AppCompatActivity {

    public BodyShapeData[] myBodyShapeData;

    private RecyclerView recyclerView;
    private BodyShapeAdapter.RecyclerViewClickListener listener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_shape_selection);

        recyclerView = findViewById(R.id.recyclerView_bodyShape);

        setAdapter();
    }


    private void setOnClickListener(){

        listener = new BodyShapeAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                int selectedBodyShapeImage = myBodyShapeData[position].getBodyShapeImage();

                String selectedBodyShapeDescription = myBodyShapeData[position].getBodyShapeDescription();


                //System.out.println("Here got leg" );
                Intent resultIntent = new Intent();
                resultIntent.putExtra("SelectedBodyShape", selectedBodyShapeImage);

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
        myBodyShapeData = new BodyShapeData[]{

                new BodyShapeData("Body Shape Selection 1", R.drawable.birds_body_1),


                new BodyShapeData("Body Shape Selection 2", R.drawable.bird_body_2),
               /* new LegData("Perching Leg", R.drawable.perching_leg),
                new LegData("Swimming Leg", R.drawable.swimming_leg),*/
                /*new  BeakData("Generalist/ Grain Eating/ Raptorial",R.drawable.generalist),
                new  BeakData("Deep Netting",R.drawable.deep_netting),
                new BeakData("Fruit Eating/ Scavenging",R.drawable.fruit_eating),
                new BeakData("Surface Skimming",R.drawable.surface_skimming),
                new  BeakData("Coniferous Seed Eating",R.drawable.coniferous_seed_eating),
                new  BeakData("Probing/ Nectar Feeding",R.drawable.probing),
                new  BeakData("Mud Probing",R.drawable.mud_probing),
                new  BeakData("Filter Feeding",R.drawable.filter_feeding),
                new  BeakData("Insect Catching/ Aerial Fishing/ Pursuit Fishing/ Chiseling",R.drawable.insect_catching),*/

                //  new  BeakData("Avatar",R.drawable.avatar),
        };

        BodyShapeAdapter myBodyShapeAdapter = new BodyShapeAdapter(myBodyShapeData,bodyShape_selection.this, listener);
        recyclerView.setAdapter(myBodyShapeAdapter);


    }
}
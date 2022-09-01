package com.example.birdmodelcreation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class wing_selection extends AppCompatActivity {

    public WingData[] myWingData;

    private RecyclerView recyclerView;

    private WingAdapter.RecyclerViewClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wing_selection);

        recyclerView = findViewById(R.id.recyclerView_wing);


        setAdapter();

    }


    private void setOnClickListener(){

        listener = new WingAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                int selectedWingImage = myWingData[position].getWingImage();

                String selectedWingDescription = myWingData[position].getWingDescription();

                System.out.println(selectedWingDescription);
                Intent resultIntent = new Intent();
                resultIntent.putExtra("SelectedWing", selectedWingImage);

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
        myWingData = new WingData[]{

                new WingData("Active Soaring Wing", R.drawable.active_soaring_wings),

                new WingData("High Speed Wing", R.drawable.high_speed_wings),

                new WingData("Passive Soaring Wing/ Elliptical Wing", R.drawable.passive_elliptical_wings),
              /*  new  BeakData("Generalist/ Grain Eating/ Raptorial",R.drawable.generalist),
                new  BeakData("Deep Netting",R.drawable.deep_netting),
                new BeakData("Fruit Eating/ Scavenging",R.drawable.fruit_eating),
                new BeakData("Surface Skimming",R.drawable.surface_skimming),
                new  BeakData("Coniferous Seed Eating",R.drawable.coniferous_seed_eating),
                new  BeakData("Probing/ Nectar Feeding",R.drawable.probing),
                new  BeakData("Mud Probing",R.drawable.mud_probing),
                new  BeakData("Filter Feeding",R.drawable.filter_feeding),
                new  BeakData("Insect Catching/ Aerial Fishing/ Pursuit Fishing/ Chiseling",R.drawable.insect_catching),
*/
                //  new  BeakData("Avatar",R.drawable.avatar),
        };

        WingAdapter myWingAdapter = new WingAdapter(myWingData,wing_selection.this, listener);
        recyclerView.setAdapter(myWingAdapter);


    }
}
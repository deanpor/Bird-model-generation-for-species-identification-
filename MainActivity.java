package com.example.birdmodelcreation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView card1, card2, card3, card4;
    private CardView card5, card6, card7, card8;

    private ImageView Wing, Beak, Leg, Tail;
    private ImageView Eyes, Head, Neck, BodyShape;



    private int imageWing ;
    private int imageBeak;
    private int imageLeg;
    private int imageTail;

    private int imageEyes ;
    private int imageHead;
    private int imageNeck;
    private int imageBodyShape;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        card1=(CardView) findViewById(R.id.c1Wing);
        card2=(CardView) findViewById(R.id.c2Beak);
        card3=(CardView) findViewById(R.id.c3Leg);
        card4=(CardView) findViewById(R.id.c4Tail);

        card5=(CardView) findViewById(R.id.c5Eyes);
        card6=(CardView) findViewById(R.id.c6Head);
        card7=(CardView) findViewById(R.id.c7Neck);
        card8=(CardView) findViewById(R.id.c8BodyShape);

        Wing=(ImageView) findViewById(R.id.wing);
        Beak =(ImageView) findViewById(R.id.beak);
        Leg=(ImageView) findViewById(R.id.leg);
        Tail=(ImageView) findViewById(R.id.tail);

        Eyes=(ImageView) findViewById(R.id.eyes);
        Head =(ImageView) findViewById(R.id.head);
        Neck=(ImageView) findViewById(R.id.neck);
        BodyShape=(ImageView) findViewById(R.id.bodyShape);





        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);

        card5.setOnClickListener(this);
        card6.setOnClickListener(this);
        card7.setOnClickListener(this);
        card8.setOnClickListener(this);



    }



    @Override
    public void onClick(View v){

        Intent i;



        switch (v.getId()){


            case R.id.c1Wing:


                i = new Intent(this,wing_selection.class);
                startActivityForResult(i, 1);
                break;

            case R.id.c2Beak:
                i = new Intent(this,beak_selection.class);
                startActivityForResult(i, 2);
                break;

            case R.id.c3Leg:
                i = new Intent(this,leg_selection.class);
                startActivityForResult(i, 3);
                break;

            case R.id.c4Tail:
                i = new Intent(this,tail_selection.class);
                startActivityForResult(i, 4);
                break;



            case R.id.c5Eyes:

                i = new Intent(this,eyes_selection.class);
                startActivityForResult(i, 5);
                break;

            case R.id.c6Head:
                i = new Intent(this,head_selection.class);
                startActivityForResult(i, 6);
                break;

            case R.id.c7Neck:
                i = new Intent(this,neck_selection.class);
                startActivityForResult(i, 7);
                break;

            case R.id.c8BodyShape:
                i = new Intent(this,bodyShape_selection.class);
                startActivityForResult(i, 8);
                break;

        }


    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
               imageWing = data.getIntExtra("SelectedWing", 0);
               
                Wing.setImageResource(+imageWing);
            }
            if (resultCode == RESULT_CANCELED) {

                Wing.setImageResource(R.drawable.wing_selection);
            }
        }else

        if (requestCode == 2) {
            if (resultCode == RESULT_OK) {
                imageBeak = data.getIntExtra("SelectedBeak", 0);



                Beak.setImageResource(+imageBeak);
            }
            if (resultCode == RESULT_CANCELED) {
                Beak.setImageResource(R.drawable.beak_selection);

            }
        }

        if (requestCode == 3) {
            if (resultCode == RESULT_OK) {
                imageLeg = data.getIntExtra("SelectedLeg", 0);


                Leg.setImageResource(+imageLeg);
            }
            if (resultCode == RESULT_CANCELED) {
                Leg.setImageResource(R.drawable.leg_selection);

            }
        }

        if (requestCode == 4) {
            if (resultCode == RESULT_OK) {
                imageTail = data.getIntExtra("SelectedTail", 0);


                Tail.setImageResource(+imageTail);
            }
            if (resultCode == RESULT_CANCELED) {
                Tail.setImageResource(R.drawable.tail_selection);

            }
        }

        if (requestCode == 5) {
            if (resultCode == RESULT_OK) {
                imageEyes = data.getIntExtra("SelectedEyes", 0);


                Eyes.setImageResource(+imageEyes);
            }
            if (resultCode == RESULT_CANCELED) {
                Eyes.setImageResource(R.drawable.eye_selection);

            }
        }

        if (requestCode == 6) {
            if (resultCode == RESULT_OK) {
                imageHead = data.getIntExtra("SelectedHead", 0);


                Head.setImageResource(+imageHead);
            }
            if (resultCode == RESULT_CANCELED) {
                Head.setImageResource(R.drawable.head_selection);

            }
        }

        if (requestCode == 7) {
            if (resultCode == RESULT_OK) {
                imageNeck = data.getIntExtra("SelectedNeck", 0);


                Neck.setImageResource(+imageNeck);
            }
            if (resultCode == RESULT_CANCELED) {
                Neck.setImageResource(R.drawable.neck_selection);

            }
        }

        if (requestCode == 8) {
            if (resultCode == RESULT_OK) {
                imageBodyShape = data.getIntExtra("SelectedBodyShape", 0);


                BodyShape.setImageResource(+imageBodyShape);
            }
            if (resultCode == RESULT_CANCELED) {
                BodyShape.setImageResource(R.drawable.body_selection);

            }
        }


    }


}
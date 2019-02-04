package com.example.akshay.currency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.nio.InvalidMarkException;


public class MainActivity extends AppCompatActivity {

     int activeplayer=0;
     int tappable1;
     int tappable2;
     //0 for red 1 for yellow and 2 for empty state
     int[] gamestate={0,2,2,0,2,1,1,2,2,1,1,2,0,2,2,0};
     int[] available_pos;

    public void playgame(View view){

         ImageView dot=(ImageView)view;
         dot.getId();
         dot.animate().alpha(0.5f).setDuration(10);
         if(activeplayer==0){
        switch(dot.getId()) {
            case R.id.red00:

                ImageView tap = (ImageView) findViewById(R.id.red01);//for 01 tap
                ImageView tap2=(ImageView)findViewById(R.id.red10);//for 10 tap
                 int tapped = Integer.parseInt(tap.getTag().toString());
                 int tapped2=Integer.parseInt(tap2.getTag().toString());



                    if(gamestate[tapped]==2){
                        tap.setVisibility(View.VISIBLE);
                        tap.animate().alpha(0.003f).setDuration(10);
                        tap.setOnClickListener(new View.OnClickListener() {
                            @Override
                                public void onClick(View view) {
                                      ImageView tap = (ImageView) findViewById(R.id.red01);

                                      int tappedtag=Integer.parseInt(tap.getTag().toString());
                                      ImageView tapped = (ImageView) findViewById(R.id.red00);
                                int prev=Integer.parseInt(tapped.getTag().toString());
                                gamestate[prev]=2;
                                      display(tap,tapped);
                                      gamestate[tappedtag]=0;
                                      activeplayer=1;
                                    }
                                });}
                    if(gamestate[tapped2]==2) {
                        tap2.setVisibility(View.VISIBLE);
                        tap2.animate().alpha(0.003f).setDuration(10);
                        tap2.setOnClickListener(new View.OnClickListener() {
                            @Override
                                 public void onClick(View view) {
                                        ImageView tap = (ImageView) findViewById(R.id.red10);
                                        int tappedtag=Integer.parseInt(tap.getTag().toString());
                                        ImageView tapped = (ImageView) findViewById(R.id.red00);
                                        int prev=Integer.parseInt(tapped.getTag().toString());
                                        gamestate[prev]=2;
                                        display(tap,tapped);
                                        gamestate[tappedtag]=activeplayer;
                                        activeplayer=1;
                                    }
                                });}



             }
          // }
         }
         if(activeplayer==1){
             switch(dot.getId()) {
                 case R.id.yellow11:

                     ImageView tap = (ImageView) findViewById(R.id.yellow01);//for 01 tap
                     ImageView tap2=(ImageView)findViewById(R.id.yellow10);//for 10 tap
                     ImageView tap3=(ImageView)findViewById(R.id.yellow12);
                     ImageView tap4=(ImageView)findViewById(R.id.yellow21);
                     int tapped = Integer.parseInt(tap.getTag().toString());
                     int tapped2=Integer.parseInt(tap2.getTag().toString());
                     int tapped3=Integer.parseInt(tap3.getTag().toString());
                     int tapped4=Integer.parseInt(tap4.getTag().toString());

                       //  tap.setVisibility(View.VISIBLE);
                        //tap.animate().alpha(0.003f).setDuration(10);
                        // tap2.animate().alpha(0.003f).setDuration(10);
                        // tap3.animate().alpha(0.003f).setDuration(10);
                        //tap4.animate().alpha(0.003f).setDuration(10);
                      if(gamestate[tapped]==2){
                          tap.setVisibility(View.VISIBLE);
                          tap.animate().alpha(0.003f).setDuration(10);
                     tap.setOnClickListener(new View.OnClickListener() {
                             @Override
                             public void onClick(View view) {
                                 ImageView tap = (ImageView) findViewById(R.id.yellow01);

                                 int tappedtag=Integer.parseInt(tap.getTag().toString());

                                 ImageView tapped = (ImageView) findViewById(R.id.yellow11);
                                 int prev=Integer.parseInt(tapped.getTag().toString());
                                 gamestate[prev]=2;
                                 display(tap,tapped);
                                 gamestate[tappedtag]=activeplayer;
                                 activeplayer=0;
                             }
                         });}
                         if(gamestate[tapped2]==2){
                             tap2.setVisibility(View.VISIBLE);
                             tap2.animate().alpha(0.003f).setDuration(10);
                         tap2.setOnClickListener(new View.OnClickListener() {
                             @Override
                             public void onClick(View view) {
                                 ImageView tap = (ImageView) findViewById(R.id.yellow10);

                                 int tappedtag=Integer.parseInt(tap.getTag().toString());

                                 ImageView tapped = (ImageView) findViewById(R.id.yellow11);
                                 int prev=Integer.parseInt(tapped.getTag().toString());
                                 gamestate[prev]=2;
                                 display(tap,tapped);
                                 gamestate[tappedtag]=activeplayer;
                                 activeplayer=0;
                             }
                         });}
                     if(gamestate[tapped3]==2){
                         tap3.setVisibility(View.VISIBLE);
                         tap3.animate().alpha(0.003f).setDuration(10);
                         tap3.setOnClickListener(new View.OnClickListener() {
                             @Override
                             public void onClick(View view) {
                                 ImageView tap = (ImageView) findViewById(R.id.yellow12);

                                 int tappedtag=Integer.parseInt(tap.getTag().toString());

                                 ImageView tapped = (ImageView) findViewById(R.id.yellow11);
                                 int prev=Integer.parseInt(tapped.getTag().toString());
                                 gamestate[prev]=2;
                                 display(tap,tapped);
                                 gamestate[tappedtag]=activeplayer;
                                 activeplayer=0;
                             }
                         });}
                     if(gamestate[tapped4]==2){
                         tap4.setVisibility(View.VISIBLE);
                         tap4.animate().alpha(0.003f).setDuration(10);
                         tap4.setOnClickListener(new View.OnClickListener() {
                             @Override
                             public void onClick(View view) {
                                 ImageView tap = (ImageView) findViewById(R.id.yellow21);

                                 int tappedtag=Integer.parseInt(tap.getTag().toString());

                                 ImageView tapped = (ImageView) findViewById(R.id.yellow11);
                                 int prev=Integer.parseInt(tapped.getTag().toString());
                                 gamestate[prev]=2;
                                 display(tap,tapped);
                                 gamestate[tappedtag]=activeplayer;
                                 activeplayer=0;
                             }
                         });}


             }

         }
         dot.animate().alpha(0.5f).setDuration(1000);










    }

    public void display(ImageView tap,ImageView tapped)
    {
        tap.animate().alpha(1.0f).setDuration(100);
        //tap2.setVisibility(View.INVISIBLE);
        tapped.setVisibility(View.INVISIBLE);
        //one.setVisibility(View.INVISIBLE);
    }

    public void displayfour(ImageView tap,ImageView tap2,ImageView tap3,ImageView tap4,ImageView tapped)
    {
        tap.animate().alpha(1.0f).setDuration(100);
        tap2.setVisibility(View.INVISIBLE);
        tap3.setVisibility(View.INVISIBLE);
        tap4.setVisibility(View.INVISIBLE);
        tapped.setVisibility(View.INVISIBLE);
        //one.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView tap=(ImageView)findViewById(R.id.red01);

        tap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                ImageView tap=(ImageView)findViewById(R.id.red01);
                tap.setVisibility(View.INVISIBLE);
            }
        });

    }


}

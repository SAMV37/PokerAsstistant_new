package com.Sam.samvel.pokerasstistant;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class BB_pocket_cards extends Activity {

    ImageButton back_button;
    Button red;
    Button black;
    Button other;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_bb_pocket_cards);


        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowmanager = (WindowManager) getApplicationContext().getSystemService(Context.WINDOW_SERVICE);
        windowmanager.getDefaultDisplay().getMetrics(displayMetrics);
        float height = displayMetrics.heightPixels / displayMetrics.density * Start.dpToPx(1);
        float width = displayMetrics.widthPixels / displayMetrics.density * Start.dpToPx(1);

        back_button = (ImageButton) findViewById(R.id.back_button);
        red = (Button) findViewById(R.id.red);
        black = (Button) findViewById(R.id.black);
        other = (Button) findViewById(R.id.other);

        red.setY((int) (height / 5));

        black.setY((int) (height / 4.9));

        other.setY((int)(height / 4.8));

        back_button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch(motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        back_button.setAlpha(.7F);
                        break;
                    case MotionEvent.ACTION_UP:
                        startActivity(new Intent(getApplicationContext(), Sit_place.class));
                        back_button.setAlpha(1);
                        break;
                }
                return false;
            }
        });

        red.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch(motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        red.setAlpha(.7F);
                        break;
                    case MotionEvent.ACTION_UP:
                        startActivity(new Intent(getApplicationContext(), BB_pocket_cards_red.class));
                        red.setAlpha(1);
                        break;
                }
                return false;
            }
        });

        black.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch(motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        black.setAlpha(.7F);
                        break;
                    case MotionEvent.ACTION_UP:
                        startActivity(new Intent(getApplicationContext(), BB_pocket_cards_black.class));
                        black.setAlpha(1);
                        break;
                }
                return false;
            }
        });

        other.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch(motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        other.setAlpha(.7F);
                        break;
                    case MotionEvent.ACTION_UP:
                        startActivity(new Intent(getApplicationContext(), BB_pocket_cards_other.class));
                        other.setAlpha(1);
                        break;
                }
                return false;
            }
        });
    }
    public void onBackPressed(){
        startActivity(new Intent(getApplicationContext(), Sit_place.class));
    }
}

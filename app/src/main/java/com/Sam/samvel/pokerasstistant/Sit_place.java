package com.Sam.samvel.pokerasstistant;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Sit_place extends Activity {

    ImageButton home_button;
    Button mp;
    Button utg;
    Button co;
    Button bt;
    Button sb;
    Button bb;
    TextView sit_quest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_sit_place);

        home_button = (ImageButton) findViewById(R.id.home_button);
        mp = (Button) findViewById(R.id.mp);
        utg = (Button) findViewById(R.id.utg);
        co = (Button) findViewById(R.id.co);
        bt = (Button) findViewById(R.id.bt);
        sb = (Button) findViewById(R.id.sb);
        bb = (Button) findViewById(R.id.bb);
        sit_quest = (TextView) findViewById(R.id.sit_quest);


        home_button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch(motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        home_button.setAlpha(.7F);
                        break;
                    case MotionEvent.ACTION_UP:
                        home_button.setAlpha(1);
                        startActivity(new Intent(getApplicationContext(), Start.class));
                        break;
                }
                return false;
            }
        });

        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowmanager = (WindowManager) getApplicationContext().getSystemService(Context.WINDOW_SERVICE);
        windowmanager.getDefaultDisplay().getMetrics(displayMetrics);
        float height = displayMetrics.heightPixels / displayMetrics.density * dpToPx(1);
        float width = displayMetrics.widthPixels / displayMetrics.density * dpToPx(1);
        int diagonal = (int) Math.sqrt(height * height + width * width);


        ///utg
        utg.setY((int)(height / 1.9));
        utg.setX(dpToPx(8));

        ///mp
        mp.setY((int)(height / 1.9));
        mp.setX((width / 2) - (dpToPx(100) / 2));

        ///co
        co.setY((int)(height / 1.9));
        co.setX(width - dpToPx(100) - dpToPx(8));

        ///bt
        bt.setY((int)(height / 1.9) + dpToPx(100));
        bt.setX(dpToPx(8));

        ///sb
        sb.setY((int)(height / 1.9) + dpToPx(100));
        sb.setX((width / 2) - (dpToPx(100) / 2));

        ///bb
        bb.setY((int)(height / 1.9) + dpToPx(100));
        bb.setX(width - dpToPx(100) - dpToPx(8));

        ///sit_quest
        sit_quest.setY((int)(width / 6));
        sit_quest.setTextSize((int)(diagonal / 45));

        ///home_button
        home_button.getLayoutParams().height = (int)(width / 7);
        home_button.getLayoutParams().width = (int)(width / 7);

        utg.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch(motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        utg.setAlpha(.7F);
                        break;
                    case MotionEvent.ACTION_UP:
                        utg.setAlpha(1);
                        startActivity(new Intent(getApplicationContext(), UTG_pocket_cards.class));
                        break;
                }
                return false;
            }
        });

        mp.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch(motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        mp.setAlpha(.7F);
                        break;
                    case MotionEvent.ACTION_UP:
                        startActivity(new Intent(getApplicationContext(), MP_pocket_cards.class));
                        mp.setAlpha(1);
                        break;
                }
                return false;
            }
        });

        co.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch(motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        co.setAlpha(.7F);
                        break;
                    case MotionEvent.ACTION_UP:
                        startActivity(new Intent(getApplicationContext(), CO_pocket_cards.class));
                        co.setAlpha(1);
                        break;
                }
                return false;
            }
        });

        bt.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch(motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        utg.setAlpha(.7F);
                        break;
                    case MotionEvent.ACTION_UP:
                        utg.setAlpha(1);
                        startActivity(new Intent(getApplicationContext(), BT_pocket_cards.class));
                        break;
                }
                return false;
            }
        });

        sb.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch(motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        sb.setAlpha(.7F);
                        break;
                    case MotionEvent.ACTION_UP:
                        sb.setAlpha(1);
                        startActivity(new Intent(getApplicationContext(), SB_pocket_cards.class));
                        break;
                }
                return false;
            }
        });

        bb.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch(motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        bb.setAlpha(.7F);
                        break;
                    case MotionEvent.ACTION_UP:
                        bb.setAlpha(1);
                        startActivity(new Intent(getApplicationContext(), BB_pocket_cards.class));
                        break;
                }
                return false;
            }
        });
    }
    public void onBackPressed(){
    }
    public static float dpToPx(int dp) {
        return (dp * Resources.getSystem().getDisplayMetrics().density);
    }
}

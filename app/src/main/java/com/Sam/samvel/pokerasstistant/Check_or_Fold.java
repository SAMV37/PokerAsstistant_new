package com.Sam.samvel.pokerasstistant;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class Check_or_Fold extends Activity {
    int roomchange = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_check_or__fold);
    }
    public void onCall(View v){
        if(roomchange<3){
            roomchange++;
        }else{
            startActivity(new Intent(getApplicationContext(), Won.class));
        }
    }
    public void onRaise(View v){
        startActivity(new Intent(getApplicationContext(), Fold.class));
    }
    public void onBackPressed(){}

}

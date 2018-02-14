package com.Sam.samvel.pokerasstistant;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class Flop extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_flop);
    }
    public void onPair(View v){
        startActivity(new Intent(getApplicationContext(), All_In.class));
    }
    public void onOther(View v){
        startActivity(new Intent(getApplicationContext(), Check_or_Fold.class));
    }
    public void onBackPressed(){
    }
}

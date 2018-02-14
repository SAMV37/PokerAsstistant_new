package com.Sam.samvel.pokerasstistant;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class MP_pocket_cards_red extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_mp_pocket_cards_red);
    }
    public void onFold(View v){
        startActivity(new Intent(getApplicationContext(), MP_pocket_cards_red_fold.class));
    }
    public void onRaise(View v){
        startActivity(new Intent(getApplicationContext(), All_In.class));
    }
    public void onCall(View v){
        startActivity(new Intent(getApplicationContext(), MP_pocket_cards_red_call.class));
    }
    public void onBackPressed(){}
    public void onBack(View v){
        startActivity(new Intent(getApplicationContext(), MP_pocket_cards.class));
    }
}

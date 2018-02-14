package com.Sam.samvel.pokerasstistant;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class BB_pocket_cards_black_call extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_bb_pocket_cards_black_call);
    }
    public void onFold(View v){
        startActivity(new Intent(getApplicationContext(), Won.class));
    }
    public void onCall(View v){
        startActivity(new Intent(getApplicationContext(), Flop.class));
    }
    public void onRaise(View v){
        startActivity(new Intent(getApplicationContext(), Fold.class));
    }
    public void onBackPressed(){}
    public void onBack(View v){
        startActivity(new Intent(getApplicationContext(), BB_pocket_cards_black.class));
    }
}

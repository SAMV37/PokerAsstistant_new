package com.Sam.samvel.pokerasstistant;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class BT_pocket_cards extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_bt_pocket_cards);
    }
    public void onRed(View v) {
        startActivity(new Intent(getApplicationContext(), BT_pocket_cards_red.class));
    }
    public void onBlack(View v) {
        startActivity(new Intent(getApplicationContext(), BT_pocket_cards_black.class));
    }
    public void onOther(View v) {
        startActivity(new Intent(getApplicationContext(), Fold.class));
    }
    public void onBackPressed(){}
    public void onBack(View v){
        startActivity(new Intent(getApplicationContext(), Sit_place.class));
    }
}

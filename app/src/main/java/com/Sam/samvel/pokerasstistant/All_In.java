package com.Sam.samvel.pokerasstistant;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class All_In extends Activity {

    public Button butt_again;

    InterstitialAd mInterstitialAd;

    private void requestNewInterstitial() {
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("SEE_YOUR_LOGCAT_TO_GET_YOUR_DEVICE_ID")
                .build();

        mInterstitialAd.loadAd(adRequest);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_all_in2);

        butt_again = (Button) findViewById(R.id.butt_again);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels;
        int width = displayMetrics.widthPixels;


        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-8598314984497600/5824621778");

        mInterstitialAd.setAdListener( new AdListener() {
            @Override
            public void onAdClosed() {
                requestNewInterstitial();
                startActivity(new Intent(getApplicationContext(), Sit_place.class));
            }
        });

        requestNewInterstitial();
    }
    public void onAgain(View v){
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            startActivity(new Intent(getApplicationContext(), Sit_place.class));
        }
    }
    public void onBackPressed(){
        if(mInterstitialAd.isLoaded()){
            mInterstitialAd.show();
        }
    }
}

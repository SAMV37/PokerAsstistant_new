package com.Sam.samvel.pokerasstistant;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;


public class Fold extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_fold);
        AdMob();

    }
    public void onAgain(View v){
//        if (interstitial.isLoaded()){
//            interstitial.show();
//        } else {
//            startActivity(new Intent(getApplicationContext(), Sit_place.class));
//        }
        //startActivity(new Intent(getApplicationContext(), ad.class));
    }
    public void onBackPressed(){
    }
    InterstitialAd interstitial;

    public void AdMob() {
        AdRequest adRequest = new AdRequest.Builder().build();
        interstitial = new InterstitialAd(this);
        interstitial.setAdUnitId("ca-app-pub-8598314984497600/5824621778");
        interstitial.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
                //Ads loaded
            }

            @Override
            public void onAdClosed() {
                super.onAdClosed();
                interstitial.show();
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                super.onAdFailedToLoad(errorCode);
                //Ads couldn't loaded
            }
        });
        interstitial.loadAd(adRequest);
    }


}

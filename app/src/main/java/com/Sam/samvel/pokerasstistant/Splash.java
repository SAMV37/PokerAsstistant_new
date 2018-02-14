package com.Sam.samvel.pokerasstistant;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.WindowManager;

import com.cunoraz.gifview.library.GifView;

public class Splash extends Activity{

    GifView gif;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowmanager = (WindowManager) getApplicationContext().getSystemService(Context.WINDOW_SERVICE);
        windowmanager.getDefaultDisplay().getMetrics(displayMetrics);
        float width = displayMetrics.widthPixels / displayMetrics.density * dpToPx(1);

        gif = (GifView) findViewById(R.id.gif);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                startActivity(new Intent(getApplicationContext(), Start.class).addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION));
                finish();
            }
        }, 3000);

        gif.getLayoutParams().height = (int) (width / 1.4);
        gif.getLayoutParams().width = (int) (width / 1.4);

    }
    public void onBackPressed(){}


    public static float pxToDp(int px) {
        return (px / Resources.getSystem().getDisplayMetrics().density);
    }
    public static float dpToPx(int dp) {
        return (dp * Resources.getSystem().getDisplayMetrics().density);
    }
}

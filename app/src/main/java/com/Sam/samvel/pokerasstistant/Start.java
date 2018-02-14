package com.Sam.samvel.pokerasstistant;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Start extends Activity {
    Button start_button;
    Button table_button;
    Button share_button;
    Button rate_button;
    Button eng_button;
    Button rus_button;
    RelativeLayout activity_start;
    ImageView logo;
    private TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_start);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowmanager = (WindowManager) getApplicationContext().getSystemService(Context.WINDOW_SERVICE);
        windowmanager.getDefaultDisplay().getMetrics(displayMetrics);
        float height = displayMetrics.heightPixels / displayMetrics.density * dpToPx(1);
        float width = displayMetrics.widthPixels / displayMetrics.density * dpToPx(1);

        activity_start = (RelativeLayout) findViewById(R.id.activity_start);

        start_button = (Button) findViewById(R.id.start_button);
        table_button = (Button) findViewById(R.id.table_button);
        share_button = (Button) findViewById(R.id.share_button);
        rate_button = (Button) findViewById(R.id.rate_button);
        eng_button = (Button) findViewById(R.id.eng_button);
        rus_button = (Button) findViewById(R.id.rus_button);
        logo = (ImageView) findViewById(R.id.logo);

        start_button.setCompoundDrawables(Drawable.createFromPath("@drawable/start_button_design.png"), null, null, null);


        //////////////////////////////////////////////////////////Design
        int y = (int) (height / 5) * 2;
        int button_height = (int) (height / 20);

        ///start button
        start_button.setWidth((int) (width / 3));
        start_button.setHeight(button_height);
        start_button.setY(y);
        start_button.setX((width - (width / 3)) / 2);

        ///table button
        table_button.setWidth((int) (width / 3));
        table_button.setHeight(button_height);
        table_button.setY(y + (height - y) / 4);
        table_button.setX((width - (width / 3)) / 2);

        ///share button
        share_button.setWidth((int) (width / 3));
        share_button.setHeight(button_height);
        share_button.setY(y + (height - y) / 2);
        share_button.setX((width - (width / 3)) / 5);

        ///rate button
        rate_button.setWidth((int) (width / 3));
        rate_button.setHeight(button_height);
        rate_button.setY(y + (height - y) / 2);
        rate_button.setX(width - ((width - (width / 3)) / 5 + width / 3));

        ///rus button
        rus_button.setWidth((int) (width / 4));
        rus_button.setHeight(button_height);
        rus_button.setY(y + ((height - y) / 4) * 3);
        rus_button.setX(width - ((width - (width / 4)) / 4 + width / 4));

        ///eng button
        eng_button.setWidth((int) (width / 4));
        eng_button.setHeight(button_height);
        eng_button.setY(y + ((height - y) / 4) * 3);
        eng_button.setX((width - (width / 4)) / 4);

        ///logo
        logo.getLayoutParams().height = (int) (height / 5);
        logo.getLayoutParams().width = (int) (height / 5);
        logo.setX((width - (height / 5)) / 2);
        logo.setY(height / 10);


        //////////////////////////////////////////////////////////////////Java

        start_button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        start_button.setAlpha(.7F);
                        break;
                    case MotionEvent.ACTION_UP:
                        start_button.setAlpha(1);
                        startActivity(new Intent(getApplicationContext(), Sit_place.class));
                        break;
                }
                return false;
            }
        });

        table_button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        table_button.setAlpha(.7F);
                        break;
                    case MotionEvent.ACTION_UP:
                        startActivity(new Intent(getApplicationContext(), Table.class));
                        table_button.setAlpha(1);
                        activity_start.setAlpha(.7F);
                        break;
                }
                return false;
            }
        });

        share_button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        share_button.setAlpha(.7F);
                        break;
                    case MotionEvent.ACTION_UP:
                        share_button.setAlpha(1);

                        Intent share = new Intent(Intent.ACTION_SEND);
                        share.setType("text/plain");
                        share.putExtra(Intent.EXTRA_SUBJECT, "SSS Poker Bot");
                        String applink = "https://play.google.com/store/apps/details?id=com.Sam.samvel.pokerasstistant&hl=en";
                        share.putExtra(Intent.EXTRA_TEXT, "Try new app: " + applink);
                        startActivity(Intent.createChooser(share, "Share via"));
                        break;
                }
                return false;
            }
        });

        rate_button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        rate_button.setAlpha(.7F);
                        break;
                    case MotionEvent.ACTION_UP:
                        rate_button.setAlpha(1);
                        try {
                            startActivity(new Intent(Intent.ACTION_VIEW,
                                    Uri.parse("market//details?id=com.Sam.samvel.pokerasstistant&hl=en")));

                        }catch(ActivityNotFoundException ae){
                            startActivity(new Intent(Intent.ACTION_VIEW,
                                    Uri.parse("https://play.google.com/store/apps/details?id=com.Sam.samvel.pokerasstistant&hl=en")));
                        }
                        break;
                }
                return false;
            }
        });

        eng_button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        eng_button.setAlpha(.7F);
                        break;
                    case MotionEvent.ACTION_UP:
                        eng_button.setAlpha(1);
                        language_change("eng");
                        break;
                }
                return false;
            }
        });

        rus_button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        rus_button.setAlpha(.7F);
                        break;
                    case MotionEvent.ACTION_UP:
                        rus_button.setAlpha(1);
                        language_change("rus");
                        break;
                }
                return false;
            }
        });
    }

    public static float pxToDp(int px) {
        return (px / Resources.getSystem().getDisplayMetrics().density);
    }
    public static float dpToPx(int dp) {
        return (dp * Resources.getSystem().getDisplayMetrics().density);
    }
    public void onBackPressed(){
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        activity_start.setAlpha(1);
    }

    public void language_change(String lang){
        if(lang.equals("eng")){
            Toast.makeText(this, "Language changed to English",
                    Toast.LENGTH_SHORT).show();

        }else if(lang.equals("rus")){
            Toast.makeText(this, "Language changed to Russian",
                    Toast.LENGTH_SHORT).show();
        }
    }
}

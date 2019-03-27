/*
 * Copyright (c) 2019.
 * Opatile Kelobang
 * http://www.bogote.co.za
 * Android App Development
 */

package co.za.bogote.mycodespace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        textView = (TextView) findViewById(R.id.main_menu_welcome);
        Bundle extras = getIntent().getExtras();

        if (extras != null)
        {
            textView.setText("Welcome " + extras.getString("Username"));
        }
    }

    public void loadIntroScreen(View view)
    {
        new PreferenceManager(this).clearPreference();
        startActivity(new Intent(this, WelcomeActivity.class));
        finish();
    }

    public void calculationBtnClicked(View view)
    {
        startActivity(new Intent(this, CalculationActivity.class));
        finish();
    }

    public void aboutMeBtnClicked(View view)
    {
        startActivity(new Intent(this, AboutMe.class));
        finish();
    }

    public void devProfileBtnClicked(View view)
    {
        startActivity(new Intent(this, DevProfile.class ));
        finish();
    }
}

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
import android.view.KeyEvent;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;

public class AboutMe extends AppCompatActivity {

    private CircleImageView circleImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        circleImageView = findViewById(R.id.profile_pic);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK ) {
            startActivity(new Intent(this, MenuActivity.class));
            finish();
        }
        return super.onKeyDown(keyCode, event);
    }

    public void goToMainScreen(View view)
    {
        startActivity(new Intent(this, MenuActivity.class));
        finish();
    }
}

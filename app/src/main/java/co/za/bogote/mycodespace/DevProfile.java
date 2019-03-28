/*
 * Copyright (c) 2019.
 * Opatile Kelobang
 * http://www.bogote.co.za
 * Android App Development
 */

package co.za.bogote.mycodespace;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.SupportMenuInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Toolbar;

import static co.za.bogote.mycodespace.R.menu.navigation_items;

public class DevProfile extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dev_profile);

    }


    // Add Item To Menu
    public boolean onCreateOptionsMenu(Menu menu)
    {

        return true;
    }

    public void goToMainScreen(View view)
    {
        startActivity(new Intent(this, MenuActivity.class));
        finish();
    }


}

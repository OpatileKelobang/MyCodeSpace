/*
 * Copyright (c) 2019.
 * Opatile Kelobang
 * http://www.bogote.co.za
 * Android App Development
 */

package co.za.bogote.mycodespace;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;

public class DevProfile extends AppCompatActivity {

    private Toolbar myToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dev_profile);

    }


}

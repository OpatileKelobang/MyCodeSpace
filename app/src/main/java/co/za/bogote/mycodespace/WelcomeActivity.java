package co.za.bogote.mycodespace;

import android.content.Intent;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewPager mPager;
    private int[] layouts = {R.layout.first_slide, R.layout.second_slide};
    private MpagerAdapter mpagerAdapter;

    private LinearLayout Dots_Layout;
    private ImageView[] dots;

    private Button btnNext, btnSkip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        if(Build.VERSION.SDK_INT >= 19)
        {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
        else
            {
                getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            }

        mPager = (ViewPager) findViewById(R.id.viewPager);
        mpagerAdapter =  new MpagerAdapter(layouts, this);
        mPager.setAdapter(mpagerAdapter);

        Dots_Layout = (LinearLayout) findViewById(R.id.dotsLayout);
        btnNext = (Button) findViewById(R.id.btnNext);
        btnSkip = (Button) findViewById(R.id.btnSkip);
        btnNext.setOnClickListener(this);
        btnSkip.setOnClickListener(this);
        createDots(0);

        mPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int position) {
                createDots(position);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

    }


    private void createDots(int currentPosition)
    {
       if (Dots_Layout != null)
           Dots_Layout.removeAllViews();

       dots = new ImageView[layouts.length];

       for(int i = 0; i < layouts.length; i++)
       {
           dots[i] = new ImageView(this);
           if (i == currentPosition)
           {
               dots[i].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.active_dots));
           }
           else
           {
               dots[i].setImageDrawable(ContextCompat.getDrawable(this, R.drawable.default_dots));
           }

       LinearLayout.LayoutParams params =  new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
           params.setMargins(4, 0, 4, 0);

       Dots_Layout.addView(dots[i], params);
       }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btnNext:
                break;

            case R.id.btnSkip:
                loadHome();
                break;
        }
    }

    private void loadHome()
    {
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }
}

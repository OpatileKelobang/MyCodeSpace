package co.za.bogote.mycodespace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    private EditText visitorName;
    private Button mainBtnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        visitorName = (EditText) findViewById(R.id.capture_visitors_name);
        mainBtnNext = (Button) findViewById(R.id.main_btn_next);

        mainBtnNext.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                if (visitorName.getText().toString().equals(""))
                {
                    Toast.makeText(MainActivity.this, "Please enter your name", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Welcome to my Code Space " + visitorName.getText().toString(), Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                    intent.putExtra("Username", visitorName.getText().toString());
                    finish();
                    startActivity(intent);
                }

            }
        });

    }

    public void nextBtnOnClicked(View view)
    {


    }


}

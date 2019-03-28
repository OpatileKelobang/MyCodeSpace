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
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculationActivity extends AppCompatActivity {

    private EditText base1;
    private EditText base2;
    private EditText height;
    private Button calculate;
    private TextView answer;
    private Button clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation);

       // Initialize Variables
        base1 = (EditText) findViewById(R.id.input_base1);
        base2 = (EditText) findViewById(R.id.input_base2);
        height = (EditText) findViewById(R.id.input_height);
        calculate = (Button) findViewById(R.id.button_add);
        answer = (TextView) findViewById(R.id.answer_field);
        clear = (Button) findViewById(R.id.clear_btn);

        calculate.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View view) {
                if ((base1.getText().length() > 0) && (base2.getText().length() > 0))
                {
                    double baseNum1 = Double.parseDouble(base1.getText().toString());
                    double baseNum2 = Double.parseDouble(base2.getText().toString());
                    double heightNum = Double.parseDouble(height.getText().toString());
                    double result = (baseNum1 + baseNum2) * heightNum / 2;
                    answer.setText("Area of the Trapezoid is: " + Double.toString(result));
                }
                else
                    {
                        Toast.makeText(CalculationActivity.this, "Invalid input. Please try again", Toast.LENGTH_SHORT).show();
                    }
            }

        });

        clear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                base1.setText("");
                base2.setText("");
                height.setText("");
                answer.setText("");
                base1.requestFocus();
            }

        });

    }


    public void goToMainScreen(View view)
    {
        startActivity(new Intent(this, MenuActivity.class));
        finish();
    }


}

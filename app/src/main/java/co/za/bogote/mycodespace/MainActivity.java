package co.za.bogote.mycodespace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText visitorName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        visitorName = (EditText) findViewById(R.id.capture_visitors_name);

    }

    public void nextBtnOnClicked(View view)
    {
        Toast.makeText(getApplicationContext(), "Welcome to my Code Space " + visitorName.getText().toString(), Toast.LENGTH_LONG).show();
        Intent intent = new Intent(this, MenuActivity.class);
        intent.putExtra("Username", visitorName.getText().toString());
        finish();
        startActivity(intent);
    }
}

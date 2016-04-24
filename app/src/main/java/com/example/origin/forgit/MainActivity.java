package com.example.origin.forgit;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static java.lang.Integer.*;

public class MainActivity extends AppCompatActivity {
    // Declare our view variables
    public static final String TAG = MainActivity.class.getSimpleName();
    private TextView mFactDisplayText;
    private Button mGenereateButton;
    private FactBook mFactBook = new FactBook();
    private RelativeLayout mLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Assign views from layout to fields
        mGenereateButton = (Button) findViewById(R.id.generateButton);
        mFactDisplayText = (TextView) findViewById(R.id.factDisplayText);
        mLayout = (RelativeLayout) findViewById(R.id.myLayout);
        View.OnClickListener generateListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //update screen with our dynamic fact
                Pair dump = mFactBook.get_fact();
                mFactDisplayText.setText(dump.get_first());
                mLayout.setBackgroundColor(dump.get_second());
                mGenereateButton.setTextColor(dump.get_second());
            }
        };
        mGenereateButton.setOnClickListener(generateListener);
        //Toast.makeText(MainActivity.this, "Yay, our activity was created", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "Shit's working in OnCreate yo");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

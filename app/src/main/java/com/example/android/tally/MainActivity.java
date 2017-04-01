package com.example.android.tally;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayCount(int count){
        TextView acc = (TextView) findViewById(R.id.count);
        acc.setText(""+count);
    }

    public void increment(View view){
        count = count+ 1;
        displayCount(count);
    }

    public void decrement(View view){
        count = count- 1;
        if(count<0){
            Toast.makeText(this, "Can't go below 0", Toast.LENGTH_SHORT).show();
            count = 0;
        }else {
            displayCount(count);
        }
    }

    public void reset(View view){
        Toast.makeText(this, "Reset the tally", Toast.LENGTH_SHORT).show();
        count = 0;
        displayCount(count);
    }
}

package com.example.lifecyclehomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.count_textView);

        if (savedInstanceState != null){
            mCount = savedInstanceState.getInt("count_same");
            mShowCount.setText(Integer.toString(mCount));
        }
    }

    public void countUp(View view) {
        mCount++;

        if (mShowCount != null){
            mShowCount.setText(Integer.toString(mCount));
        }
    }
    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("count_same", mCount);
    }
}

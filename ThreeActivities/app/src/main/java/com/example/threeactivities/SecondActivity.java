package com.example.threeactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    private static final String LOG_TAG = SecondActivity.class.getSimpleName();

    private EditText mReply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void launchThirdActivity(View view) {
        Log.d(LOG_TAG, "Button Clicked second_button");
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }
}
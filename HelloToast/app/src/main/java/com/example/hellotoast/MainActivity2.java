package com.example.hellotoast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private String messageTemp = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TAG", "onCreate: MainActivity 2 on Create");
        setContentView(R.layout.activity_main2);
        String message = getIntent().getStringExtra(MainActivity.EXTRA_MESSAGE);
        messageTemp = message;
        TextView textView = findViewById(R.id.text_message);
        textView.setText(message);
    }

//    @Override
//    protected void onSaveInstanceState(@NonNull Bundle outState) {
//        super.onSaveInstanceState(outState);
//        Log.d("TAG", "onStateInstance: Mainactivity2");
//        outState.putString("counter", messageTemp);
//    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    public void returnReply(View view) {
        Log.d("Tag","Button clicked MainActivity");
        Intent replyIntent = new Intent();
        replyIntent.putExtra("TAG", messageTemp);
        setResult(RESULT_OK, replyIntent);
        Log.d("TAG", "End SecondActivity");
        finish();
    }
}
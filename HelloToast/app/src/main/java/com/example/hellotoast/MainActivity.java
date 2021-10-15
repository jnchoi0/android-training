package com.example.hellotoast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
//import android.support.design.widget.CoordinatorLayout;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    public static final String EXTRA_MESSAGE = "com.example.android.twoactivities.extra.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        if (savedInstanceState != null) {
            Log.d("TAG", "has saved instace");
//            mShowCount.setText(String.valueOf(savedInstanceState.getInt("count")));
            mShowCount.setText(Integer.toString(mCount));

        }

    }

    public void showToast(View view) {
//        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
////        Snackbar toast = Snackbar.make(this, R.string.toast_message, Snackbar.LENGTH_LONG);
//        toast.show();
        Intent intent = new Intent(this, MainActivity2.class);
        String message = mShowCount.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
        Log.d("TAG", "showToast: MainActivity");
    }

    public void countUp(View view) {
        ++mCount;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("tag", "onDestroy: MainActivity");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        Log.d("Tag", "onSaveInstanceState: MainActivity");
        outState.putInt("count", mCount);
        super.onSaveInstanceState(outState);
    }
}
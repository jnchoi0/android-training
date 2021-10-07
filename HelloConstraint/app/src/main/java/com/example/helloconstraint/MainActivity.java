package com.example.helloconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
//    private boolean mresetPress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
//        mresetPress = (boolean) findViewById(R.id.count_reset);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        ++mCount;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
            view.setBackgroundColor(0xFF00FF00);
//        if (mShowCount == null)
//            view.setBackgroundColor(0xFFBB86FC);
//        Log.d( "countUp: ", String.valueOf(mShowCount));
    }

    public void countReset(View view) {
        if (mShowCount != null)
            view.setBackgroundColor(0xFF00FF00);
        mCount = 0;
        mShowCount.setText(Integer.toString(mCount));
        view.setBackgroundColor(0xff888888);
    }
}
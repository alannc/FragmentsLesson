package com.alannnc.fragments.fragments;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends FragmentActivity implements TopFragment.ToolbarListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onButtonClick(String text) {
        // Get Fragment B
        BottomFragment bottomFragment = new BottomFragment();
                getSupportFragmentManager().findFragmentById(R.id.fragment_bottom);
        TextView textView = findViewById(R.id.editable_text);
        bottomFragment.changeText(textView, text);
    }
}

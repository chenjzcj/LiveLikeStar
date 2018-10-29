package com.felix.livelikestar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import com.wapchief.likestarlibrary.like.TCHeartLayout;

public class MainActivity extends AppCompatActivity {

    private TCHeartLayout mHeartLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mHeartLayout = findViewById(R.id.heart_layout);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            mHeartLayout.addFavor();
        }
        return super.onTouchEvent(event);
    }
}

package com.example.activityoptionstest;

import android.os.Bundle;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ViewCompat.setTransitionName(findViewById(R.id.testr), "23333");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        //ActivityCompat.finishAfterTransition(this);
    }
}

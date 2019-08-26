package com.example.activityoptionstest;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.makeCustomAnimation:
                makeCustomAnimation(v);
                break;
            case R.id.makeScaleUpAnimation:
                makeScaleUpAnimation(v);
                break;
            case R.id.makeThumbnailScaleUpAnimation:
                makeThumbnailScaleUpAnimation(v);
                break;
            case R.id.makeSceneTransitionAnimation:
                makeSceneTransitionAnimation(v);
                break;
            case R.id.makeSceneTransitionAnimation2:
                makeSceneTransitionAnimation2(v);
                break;
            case R.id.makeClipRevealAnimation:
                makeClipRevealAnimation(v);
                break;
        }

    }

    private void makeClipRevealAnimation(View v) {
        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeClipRevealAnimation(v, v.getWidth() / 2, v.getHeight() / 2, v.getWidth(), v.getHeight());
        Intent intent = new Intent(this, SecondActivity.class);
        ActivityCompat.startActivity(this, intent, optionsCompat.toBundle());
    }

    private void makeSceneTransitionAnimation2(View v) {
        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(this, Pair.create(findViewById(R.id.share_pic), "23333"));
        Intent intent = new Intent(this, SecondActivity.class);
        ActivityCompat.startActivity(this, intent, optionsCompat.toBundle());
    }

    private void makeSceneTransitionAnimation(View v) {
        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(this, findViewById(R.id.share_pic), "23333");
        Intent intent = new Intent(this, SecondActivity.class);
        ActivityCompat.startActivity(this, intent, optionsCompat.toBundle());
    }

    private void makeThumbnailScaleUpAnimation(View v) {
        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat
                .makeThumbnailScaleUpAnimation(v,
                        BitmapFactory.decodeResource(getResources(), R.drawable.h3), v.getWidth() / 2, v.getHeight() / 2);
        Intent intent = new Intent(this, SecondActivity.class);
        ActivityCompat.startActivity(this, intent, optionsCompat.toBundle());
    }

    private void makeScaleUpAnimation(View v) {
        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeScaleUpAnimation(v, v.getWidth() / 2, v.getHeight() / 2, v.getWidth(), v.getHeight());
        Intent intent = new Intent(this, SecondActivity.class);
        ActivityCompat.startActivity(this, intent, optionsCompat.toBundle());
    }

    private void makeCustomAnimation(View v) {
        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeCustomAnimation(this, R.anim.slide_bottom_in, R.anim.slide_bottom_out);
        Intent intent = new Intent(this, SecondActivity.class);
        //overridePendingTransition(R.anim.slide_bottom_in, R.anim.slide_bottom_out);
        //startActivity(intent, optionsCompat.toBundle());
        ActivityCompat.startActivity(this, intent, optionsCompat.toBundle());
    }
}

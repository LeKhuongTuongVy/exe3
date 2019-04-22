package com.example.exe3;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Animation rotateAnimation;
    ImageView imageView;
    Button btnplay, btnstop;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=(ImageView)findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.chongchong);
        rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate);
        rotateAnimation();
    }

    private void rotateAnimation(){
        rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate);
        imageView.startAnimation(rotateAnimation);
    }
}

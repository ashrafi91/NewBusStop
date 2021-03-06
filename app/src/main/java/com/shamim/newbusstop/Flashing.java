package com.shamim.newbusstop;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Flashing extends AppCompatActivity {
    ConstraintLayout flashing_root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flashing);
        flashing_root = findViewById(R.id.flashing_root);

        final Animation animationFadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        flashing_root.startAnimation(fadeIn);

        fadeIn.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                Log.d("Flashing", "FadeIn onAnimationStart");
            }


            @Override
            public void onAnimationEnd(Animation animation) {

                Log.d("Flashing", "FadeIn onAnimationEnd");

                startActivity(new Intent(Flashing.this, Home.class));

            }

            @Override
            public void onAnimationRepeat(Animation animation) {


            }
        });

    }
}




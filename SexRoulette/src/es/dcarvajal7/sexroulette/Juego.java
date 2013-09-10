package es.dcarvajal7.sexroulette;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

public class Juego extends Activity {

	float inicio=0.0f;
	float fin=0.0f;
    @Override public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.juego);

    }
    
    public void lanzarRuleta(View view){
        ImageView aniView = (ImageView) findViewById(R.id.imageView1);
        Random r = new Random();
        
        fin=r.nextInt(360)+720;
        RotateAnimation animation = new RotateAnimation(inicio, fin,
        		Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
		animation.setInterpolator(new LinearInterpolator());
		animation.setDuration((long) (fin+4000));
		animation.setFillAfter(true);
		aniView.startAnimation(animation);
    }
    
    
}

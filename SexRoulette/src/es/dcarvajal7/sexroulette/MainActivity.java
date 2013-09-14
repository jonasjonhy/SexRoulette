package es.dcarvajal7.sexroulette;

import com.google.ads.AdRequest;
import com.google.ads.AdView;

import android.R.anim;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		AdView adView = (AdView)this.findViewById(R.id.anuncioPrincipal);
        adView.loadAd(new AdRequest());
		
        ImageView aniView = (ImageView) findViewById(R.id.imageView1);

		
		RotateAnimation animation = new RotateAnimation(0, 360,
        		Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
		animation.setInterpolator(new LinearInterpolator());
		animation.setDuration(30000L);
		animation.setRepeatCount(Animation.INFINITE);
		animation.setInterpolator(this, android.R.anim.cycle_interpolator);
		animation.setFillAfter(true);
		
		aniView.startAnimation(animation);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	 public void lanzarAcercaDe(View view){
	        Intent i = new Intent(this, AcercaDe.class);
	              startActivity(i);
	      }
	
	public void lanzarJuego(View view){
		Intent i = new Intent(this, Juego.class);
        startActivity(i);
	}

}

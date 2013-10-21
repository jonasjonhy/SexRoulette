package es.dcarvajal7.sexroulette;

import java.util.Random;

import com.tapit.adview.AdInterstitialView;



import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

public class Juego3 extends Activity {

	float inicio=0.0f;
	float fin=0.0f;
	float seleccion=0.0f;
	
	AdInterstitialView interstitialAd;
	
    @Override public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.juego3);
        
        interstitialAd = new AdInterstitialView(this, "34017");
    	interstitialAd.load();
        
    	
        
    }
    
    public void lanzarRuleta(View view){
        ImageView aniView = (ImageView) findViewById(R.id.imageView1);
        ImageView aniView2 = (ImageView) findViewById(R.id.imageView3);

        AnimationDrawable animacion = (AnimationDrawable)getResources().getDrawable(R.drawable.animaciontropic);
        aniView.setImageDrawable(animacion);
        animacion.start();
        
        AnimationDrawable animacion2 = (AnimationDrawable)getResources().getDrawable(R.drawable.animacion3);
        aniView2.setImageDrawable(animacion2);
        animacion2.start();
        
        Random r = new Random();
        
        fin=r.nextInt(360)+720;
        seleccion=fin-720;
        
        RotateAnimation animation = new RotateAnimation(inicio, fin,
        		Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
		animation.setInterpolator(new LinearInterpolator());
		animation.setDuration((long) (fin+4500));
		animation.setInterpolator(this, android.R.anim.decelerate_interpolator);
		animation.setFillAfter(true);
		animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
            	String accion="";
            	if(seleccion<=30){
            		accion=getResources().getString(R.string.fresas);
            	}else if(seleccion>150 && seleccion <=210){
            		accion=getResources().getString(R.string.uvas);
            	}else if(seleccion>90 && seleccion <=150){
            		accion=getResources().getString(R.string.manzana);
            	}else if(seleccion>30 && seleccion <=90){
            		accion=getResources().getString(R.string.platano);
            	}else if(seleccion>210 && seleccion <=270){
            		accion=getResources().getString(R.string.sandia);
            	}else if(seleccion>270 && seleccion <=330){
            		accion=getResources().getString(R.string.pina);
            	}else if(seleccion>330 && seleccion <=360){
            		accion=getResources().getString(R.string.fresas);
            	}
            	
            	 Intent i = new Intent(Juego3.this, PantallaResultado2.class);
            	 i.putExtra("pantalla", "juego1");
            	 i.putExtra("accion", accion);
                 startActivity(i);
                 
                 Random r = new Random();
             	
             	if(r.nextInt(99)<=20){
                 	if(interstitialAd.isLoaded()) {
                 	    // interstitial was loaded successfully, show it!
                 	    interstitialAd.showInterstitial();
                 	}
             	}
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
		
		aniView.startAnimation(animation);
    }
    
    public void lanzarMenuPrincipal(View view){
    	Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
      }  

}

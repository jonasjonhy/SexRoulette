package es.dcarvajal7.sexroulette;

 

import android.app.Activity;
import android.content.Intent;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;

 

public class VersionPremium extends Activity {

    /** Called when the activity is first created. */

    @Override public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.versionpremium);

        
    }
    
    public void descargar(View view){
    	final String appName = "es.dcarvajal7.sexroulettePremium";
    	try {
    	    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id="+appName)));
    	} catch (android.content.ActivityNotFoundException anfe) {
    	    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id="+appName)));
    	}
    }
    
    public void cerrar(View view){
        this.finish();
      }

}

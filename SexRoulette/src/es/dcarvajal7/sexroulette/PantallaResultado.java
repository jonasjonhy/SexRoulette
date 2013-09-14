package es.dcarvajal7.sexroulette;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class PantallaResultado extends Activity {

	
    @Override public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.pantallaresultado);

    }
    
    public void lanzarJuego2(View view){
    	Intent i = new Intent(this, Juego2.class);
        startActivity(i);
      } 
    
    
}

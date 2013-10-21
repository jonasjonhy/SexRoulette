package es.dcarvajal7.sexroulette;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class PantallaResultado2 extends Activity {

	String accion;
	String pantalla;
	
    @Override public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.pantallaresultado2);
        Bundle bundle=getIntent().getExtras();
        
        ImageView uno=(ImageView) findViewById(R.id.imageView1);
        ImageView dos=(ImageView) findViewById(R.id.imageView3);
        ImageView boton=(ImageView) findViewById(R.id.button1);
        TextView txt1=(TextView) findViewById(R.id.textView1);
        TextView txt2=(TextView) findViewById(R.id.textView2);
        
        accion=bundle.getString("accion");
        pantalla=bundle.getString("pantalla");
        if(bundle.getString("pantalla").equals("juego1")){
        	boton.setImageResource(R.drawable.continuar2);
        	dos.setImageResource(R.drawable.interrogacion);
        	txt2.setText("");

        	if(bundle.getString("accion").equals(getResources().getString(R.string.fresas))){
            	uno.setImageResource(R.drawable.fresas);
            	txt1.setText(getResources().getString(R.string.fresas));
        	} else if(bundle.getString("accion").equals(getResources().getString(R.string.uvas))){
            	uno.setImageResource(R.drawable.uvas);
            	txt1.setText(getResources().getString(R.string.uvas));
        	} else if(bundle.getString("accion").equals(getResources().getString(R.string.manzana))){
            	uno.setImageResource(R.drawable.manzana);
            	txt1.setText(getResources().getString(R.string.manzana));
        	} else if(bundle.getString("accion").equals(getResources().getString(R.string.platano))){
            	uno.setImageResource(R.drawable.platano);
            	txt1.setText(getResources().getString(R.string.platano));
        	}else if(bundle.getString("accion").equals(getResources().getString(R.string.sandia))){
            	uno.setImageResource(R.drawable.sandia);
            	txt1.setText(getResources().getString(R.string.sandia));
        	}else if(bundle.getString("accion").equals(getResources().getString(R.string.pina))){
            	uno.setImageResource(R.drawable.pina);
            	txt1.setText(getResources().getString(R.string.pina));

        	}
        	
        	
        }else if(bundle.getString("pantalla").equals("juego2")){
        	boton.setImageResource(R.drawable.volveraempezar2);
        	if(bundle.getString("accion1").equals(getResources().getString(R.string.fresas))){
            	uno.setImageResource(R.drawable.fresas);
            	txt1.setText(getResources().getString(R.string.fresas));
        	} else if(bundle.getString("accion1").equals(getResources().getString(R.string.uvas))){
            	uno.setImageResource(R.drawable.uvas);
            	txt1.setText(getResources().getString(R.string.uvas));
        	} else if(bundle.getString("accion1").equals(getResources().getString(R.string.manzana))){
            	uno.setImageResource(R.drawable.manzana);
            	txt1.setText(getResources().getString(R.string.manzana));
        	} else if(bundle.getString("accion1").equals(getResources().getString(R.string.platano))){
            	uno.setImageResource(R.drawable.platano);
            	txt1.setText(getResources().getString(R.string.platano));
        	}else if(bundle.getString("accion1").equals(getResources().getString(R.string.sandia))){
            	uno.setImageResource(R.drawable.sandia);
            	txt1.setText(getResources().getString(R.string.sandia));
        	}else if(bundle.getString("accion1").equals(getResources().getString(R.string.pina))){
            	uno.setImageResource(R.drawable.pina);
            	txt1.setText(getResources().getString(R.string.pina));

        	}
        	
        	if(bundle.getString("accion").equals(getResources().getString(R.string.boca))){
            	dos.setImageResource(R.drawable.boca2);
            	txt2.setText(getResources().getString(R.string.boca));
        	} else if(bundle.getString("accion").equals(getResources().getString(R.string.pezon))){
            	dos.setImageResource(R.drawable.pezones2);
            	txt2.setText(getResources().getString(R.string.pezon));
        	} else if(bundle.getString("accion").equals(getResources().getString(R.string.entrepierna))){
            	dos.setImageResource(R.drawable.piernas2);
            	txt2.setText(getResources().getString(R.string.entrepierna));
        	} else if(bundle.getString("accion").equals(getResources().getString(R.string.oreja))){
            	dos.setImageResource(R.drawable.oreja2);
            	txt2.setText(getResources().getString(R.string.oreja));
        	}else if(bundle.getString("accion").equals(getResources().getString(R.string.cuello))){
            	dos.setImageResource(R.drawable.cuello2);
            	txt2.setText(getResources().getString(R.string.cuello));
        	}else if(bundle.getString("accion").equals(getResources().getString(R.string.pechos))){
            	dos.setImageResource(R.drawable.tetas2);
            	txt2.setText(getResources().getString(R.string.pechos));
        	}
        	
        }
    }
    
    public void lanzarJuego2(View view){
    	if(pantalla.equals("juego1")){
	    	Intent i = new Intent(this, Juego4.class);
	    	i.putExtra("accion1", accion);
	    	i.putExtra("pantalla", "juego2");
	        startActivity(i);
    	}else if(pantalla.equals("juego2")){
	    	Intent i = new Intent(this, Juego3.class);
	    	i.putExtra("accion", "");
	    	i.putExtra("pantalla", "juego1");
	        startActivity(i);
    	}
      } 
    
    
}

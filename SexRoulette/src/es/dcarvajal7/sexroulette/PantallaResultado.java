package es.dcarvajal7.sexroulette;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class PantallaResultado extends Activity {

	String accion;
	String pantalla;
	
    @Override public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.pantallaresultado);
        Bundle bundle=getIntent().getExtras();
        
        ImageView uno=(ImageView) findViewById(R.id.imageView1);
        ImageView dos=(ImageView) findViewById(R.id.imageView3);
        ImageView boton=(ImageView) findViewById(R.id.button1);
        TextView txt1=(TextView) findViewById(R.id.textView1);
        TextView txt2=(TextView) findViewById(R.id.textView2);
        
        accion=bundle.getString("accion");
        pantalla=bundle.getString("pantalla");
        if(bundle.getString("pantalla").equals("juego1")){
        	boton.setImageResource(R.drawable.continuar);
        	dos.setImageResource(R.drawable.interrogacion);
        	txt2.setText("");

        	if(bundle.getString("accion").equals(getResources().getString(R.string.lamer))){
            	uno.setImageResource(R.drawable.lamer);
            	txt1.setText(getResources().getString(R.string.lamer));
        	} else if(bundle.getString("accion").equals(getResources().getString(R.string.cosquillas))){
            	uno.setImageResource(R.drawable.cosquillas);
            	txt1.setText(getResources().getString(R.string.cosquillas));
        	} else if(bundle.getString("accion").equals(getResources().getString(R.string.besar))){
            	uno.setImageResource(R.drawable.besar);
            	txt1.setText(getResources().getString(R.string.besar));
        	} else if(bundle.getString("accion").equals(getResources().getString(R.string.masaje))){
            	uno.setImageResource(R.drawable.masaje);
            	txt1.setText(getResources().getString(R.string.masaje));
        	}else if(bundle.getString("accion").equals(getResources().getString(R.string.morder))){
            	uno.setImageResource(R.drawable.morder);
            	txt1.setText(getResources().getString(R.string.morder));
        	}else if(bundle.getString("accion").equals(getResources().getString(R.string.tocar))){
            	uno.setImageResource(R.drawable.tocar);
            	txt1.setText(getResources().getString(R.string.tocar));

        	}
        	
        	
        }else if(bundle.getString("pantalla").equals("juego2")){
        	boton.setImageResource(R.drawable.volveraempezar);
        	if(bundle.getString("accion1").equals(getResources().getString(R.string.lamer))){
            	uno.setImageResource(R.drawable.lamer);
            	txt1.setText(getResources().getString(R.string.lamer));
        	} else if(bundle.getString("accion1").equals(getResources().getString(R.string.cosquillas))){
            	uno.setImageResource(R.drawable.cosquillas);
            	txt1.setText(getResources().getString(R.string.cosquillas));
        	} else if(bundle.getString("accion1").equals(getResources().getString(R.string.besar))){
            	uno.setImageResource(R.drawable.besar);
            	txt1.setText(getResources().getString(R.string.besar));
        	} else if(bundle.getString("accion1").equals(getResources().getString(R.string.masaje))){
            	uno.setImageResource(R.drawable.masaje);
            	txt1.setText(getResources().getString(R.string.masaje));
        	}else if(bundle.getString("accion1").equals(getResources().getString(R.string.morder))){
            	uno.setImageResource(R.drawable.morder);
            	txt1.setText(getResources().getString(R.string.morder));
        	}else if(bundle.getString("accion1").equals(getResources().getString(R.string.tocar))){
            	uno.setImageResource(R.drawable.tocar);
            	txt1.setText(getResources().getString(R.string.tocar));

        	}
        	
        	if(bundle.getString("accion").equals(getResources().getString(R.string.boca))){
            	dos.setImageResource(R.drawable.boca);
            	txt2.setText(getResources().getString(R.string.boca));
        	} else if(bundle.getString("accion").equals(getResources().getString(R.string.pezon))){
            	dos.setImageResource(R.drawable.pezones);
            	txt2.setText(getResources().getString(R.string.pezon));
        	} else if(bundle.getString("accion").equals(getResources().getString(R.string.entrepierna))){
            	dos.setImageResource(R.drawable.entrepierna);
            	txt2.setText(getResources().getString(R.string.entrepierna));
        	} else if(bundle.getString("accion").equals(getResources().getString(R.string.oreja))){
            	dos.setImageResource(R.drawable.oreja);
            	txt2.setText(getResources().getString(R.string.oreja));
        	}else if(bundle.getString("accion").equals(getResources().getString(R.string.cuello))){
            	dos.setImageResource(R.drawable.cuello);
            	txt2.setText(getResources().getString(R.string.cuello));
        	}else if(bundle.getString("accion").equals(getResources().getString(R.string.pechos))){
            	dos.setImageResource(R.drawable.pechos);
            	txt2.setText(getResources().getString(R.string.pechos));
        	}
        	
        }
    }
    
    public void lanzarJuego2(View view){
    	if(pantalla.equals("juego1")){
	    	Intent i = new Intent(this, Juego2.class);
	    	i.putExtra("accion1", accion);
	    	i.putExtra("pantalla", "juego2");
	        startActivity(i);
    	}else if(pantalla.equals("juego2")){
	    	Intent i = new Intent(this, Juego.class);
	    	i.putExtra("accion", "");
	    	i.putExtra("pantalla", "juego1");
	        startActivity(i);
    	}
      } 
    
    
}

package es.dcarvajal7.sexroulette;

import org.apache.http.HttpEntity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;



public class TrucoItem extends Activity {
	
	
	ListView lv;
	HttpEntity entity;
	ProgressDialog dialog;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        
        setContentView(R.layout.trucoitem);
        
        TextView trucoTitulo = (TextView)this.findViewById(R.id.TextViewTitulo);
        TextView trucoTexto = (TextView)this.findViewById(R.id.TextViewDesc);

        
        final Bundle bundle=getIntent().getExtras();
    	
       
        
        switch (bundle.getInt("truco")) {
        case 0:
	        trucoTitulo.setText(R.string.k1);
	        trucoTexto.setText(R.string.k1n);
			break;
		case 1:
	        trucoTitulo.setText(R.string.k2);
	        trucoTexto.setText(R.string.k2n);
			break;
		case 2:
	        trucoTitulo.setText(R.string.k3);
	        trucoTexto.setText(R.string.k3n);
			break;
		case 3:
	        trucoTitulo.setText(R.string.k4);
	        trucoTexto.setText(R.string.k4n);
			break;
		case 4:
	        trucoTitulo.setText(R.string.k5);
	        trucoTexto.setText(R.string.k5n);
			break;
		case 5:
	        trucoTitulo.setText(R.string.k6);
	        trucoTexto.setText(R.string.k6n);
			break;
		default:
	        trucoTitulo.setText("Prueba de nuevo");
			break;
		}
    }
    
    public void cerrarPostura(View view){
        this.finish();
      }
}

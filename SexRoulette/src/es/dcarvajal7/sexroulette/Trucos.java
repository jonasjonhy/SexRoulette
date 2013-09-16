package es.dcarvajal7.sexroulette;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.ads.AdRequest;
import com.google.ads.AdView;


public class Trucos extends Activity {
	

	ListView lv;
	String[] datos;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	
    	String[] datos = {getResources().getString(R.string.k1),
  			  getResources().getString(R.string.k2),
  			  getResources().getString(R.string.k3),
  			  getResources().getString(R.string.k4),
  			  getResources().getString(R.string.k5),
  			  getResources().getString(R.string.k6)};
    	
    	this.datos=datos;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trucos);
        AdView adView = (AdView)this.findViewById(R.id.anuncioList);
        adView.loadAd(new AdRequest());
        
        lv = (ListView)findViewById(R.id.list);
        
        lv.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,this.datos));
        
        
        lv.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                int position, long id) {
            	
            	Intent i1 = new Intent(Trucos.this, TrucoItem.class);
                
                i1.putExtra("truco", position);

                startActivity(i1);
            }
          });
        
        
       
    }
    
}

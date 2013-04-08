package com.civichackathon.rahbar;

import com.civichackathon.rahbar.common.Global;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Main extends Activity{
	
	
	
	
   // private Adapter languageAdopter;
    Spinner spinnerLang;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
    
        Resources res = getResources();
        String[] languages = new String[]{res.getString(R.string.Lanuage_English),res.getString(R.string.Lanuage_Urdu),res.getString(R.string.Lanuage_Pashto)};
       
       spinnerLang = (Spinner)findViewById(R.id.spinner1);
       spinnerLang.setAdapter(new ArrayAdapter<CharSequence>(this, android.R.layout.simple_list_item_1, languages));
       
       
       spinnerLang.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
    	    
    	   public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) { 
    	       int index = spinnerLang.getSelectedItemPosition();
    	       
    	       if(index==0)
    	       {
    	    	  Global.LANGUAGE_SELECTED=Global.LANUGAGE_ENGLISH;
    	       }
    	       else if(index==1)
    	       {
    	    	   Global.LANGUAGE_SELECTED=Global.LANUGAGE_URDU; 
    	       }
    	       else if(index ==2)
    	       {
    	    	   Global.LANGUAGE_SELECTED=Global.LANUGAGE_PASHTO;
    	       }
    	    	   
    	    } 

    	    public void onNothingSelected(AdapterView<?> adapterView) {
    	        return;
    	    } 
    	}); 
       
	
	}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_layout, menu);
        return true;
    }
    
    public void proceed(View widget)
    {
 	   if(widget.getId() == R.id.button1)
 	   {
 		   //open the main menu
 		   Intent intent = new Intent(Main.this,MainMenu.class);
 		   startActivity(intent);
 	   }
    }
}

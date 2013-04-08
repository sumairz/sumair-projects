package com.civichackathon.rahbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.RadioGroup;

public class MainMenu extends Activity {

	RadioGroup rdgpProc;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);
        
        rdgpProc = (RadioGroup)findViewById(R.id.radioGroupProcedure);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_layout, menu);
        return true;
    }
    
    public void openProcedure(View widget)
    {
    	Intent intent;
    	
    	int index = rdgpProc.indexOfChild(findViewById(rdgpProc.getCheckedRadioButtonId()));

    	//nic
    	if(index ==0)
    	{
    		intent=new Intent(MainMenu.this, NIC.class);
    		startActivity(intent);
    	}
    	
    	//license
    	else if(index ==1)
    	{
    		intent=new Intent(MainMenu.this, License.class);
    		startActivity(intent);
    	}
    	
    	//interboard
    	else if(index ==2)
    	{
    		intent=new Intent(MainMenu.this, Interboard.class);
    		startActivity(intent);
    	}

    }
}

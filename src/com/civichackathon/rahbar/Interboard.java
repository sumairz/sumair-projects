package com.civichackathon.rahbar;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Interboard extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interboard_layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.interboard_layout, menu);
        return true;
    }
}

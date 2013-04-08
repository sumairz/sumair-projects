package com.civichackathon.rahbar;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class License extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.license_layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.license_layout, menu);
        return true;
    }
}

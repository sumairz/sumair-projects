package com.civichackathon.rahbar;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class NIC extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nic_layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.nic_layout, menu);
        return true;
    }
}

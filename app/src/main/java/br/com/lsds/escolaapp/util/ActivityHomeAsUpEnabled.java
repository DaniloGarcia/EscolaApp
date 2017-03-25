package br.com.lsds.escolaapp.util;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ActivityHomeAsUpEnabled extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}

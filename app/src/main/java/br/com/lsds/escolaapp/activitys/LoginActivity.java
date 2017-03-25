package br.com.lsds.escolaapp.activitys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.lsds.escolaapp.R;
import br.com.lsds.escolaapp.util.ActivityHomeAsUpEnabled;

public class LoginActivity extends ActivityHomeAsUpEnabled {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}

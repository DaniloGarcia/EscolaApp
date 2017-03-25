package br.com.lsds.escolaapp.activitys;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.lsds.escolaapp.R;
import br.com.lsds.escolaapp.util.ActivityHomeAsUpEnabled;

public class CriarContaActivity extends ActivityHomeAsUpEnabled {

    Activity    activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_conta);
        activity = this;

    }
}

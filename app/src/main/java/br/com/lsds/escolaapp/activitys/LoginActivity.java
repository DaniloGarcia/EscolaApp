package br.com.lsds.escolaapp.activitys;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import br.com.lsds.escolaapp.R;
import br.com.lsds.escolaapp.util.ActivityHomeAsUpEnabled;

public class LoginActivity extends ActivityHomeAsUpEnabled {

    Activity    activity;
    Button      btnEntrar;
    int         tipoLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        activity = this;

        tipoLogin = getIntent().getExtras().getInt("TIPO");
        Log.d("Parametro", String.valueOf(tipoLogin));

        Log.d("Parametro", String.valueOf(R.id.radio_pai));

        btnEntrar = (Button) findViewById(R.id.btn_entrar);
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                switch (tipoLogin){
                    case R.id.radio_pai:
                        intent = new Intent(activity, AlunosActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.radio_local:
                        intent = new Intent(activity, AlunosChamados.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}

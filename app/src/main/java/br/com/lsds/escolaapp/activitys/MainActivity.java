package br.com.lsds.escolaapp.activitys;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.lsds.escolaapp.R;

public class MainActivity extends AppCompatActivity {
    Button      btnCriarConta;
    Button      btnEntrar;
    Activity    activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activity = this;

        btnCriarConta   = (Button) findViewById(R.id.btn_criar_conta);
        btnEntrar       = (Button) findViewById(R.id.btn_entrar);

        btnCriarConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, CriarContaActivity.class);
                startActivity(intent);
            }
        });

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}

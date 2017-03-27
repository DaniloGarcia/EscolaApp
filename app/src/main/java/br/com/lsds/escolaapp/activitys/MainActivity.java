package br.com.lsds.escolaapp.activitys;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import br.com.lsds.escolaapp.R;

import static android.R.attr.button;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {
    Button      btnCriarConta;
    Button      btnEntrar;
    RadioGroup  radOpc_main;
    RadioButton radButton;
    Activity    activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activity = this;

        btnCriarConta   = (Button) findViewById(R.id.btn_criar_conta);
        btnEntrar       = (Button) findViewById(R.id.btn_entrar);
        radOpc_main     = (RadioGroup) findViewById(R.id.opc_main);

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

        radOpc_main.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.radio_pai:
                        // habilitar o botao criar conta
                        btnCriarConta.setVisibility(View.VISIBLE);
                        break;
                    default:
                        // desabilitar o botao criar conta
                        btnCriarConta.setVisibility(View.INVISIBLE);
                        break;
                }
            }
        });
    }
}

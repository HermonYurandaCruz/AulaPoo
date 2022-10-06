package com.codeline.aula1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TelaLogin extends AppCompatActivity {
TextView tv_criar;
EditText ed_email,ed_senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);
        getSupportActionBar().hide();
        Inicializar();

        //dar acao ao texto criar
tv_criar.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

    }
});

    }


    public void Inicializar(){
        tv_criar=findViewById(R.id.tv_criar);
        ed_email=findViewById(R.id.emailLogin);
        ed_senha=findViewById(R.id.ed_senha);


    }
}
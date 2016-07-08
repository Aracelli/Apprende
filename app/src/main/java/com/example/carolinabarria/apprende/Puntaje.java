package com.example.carolinabarria.apprende;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Puntaje extends AppCompatActivity implements View.OnClickListener{

    Button btn_reiniciar;
   // TextView tv_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puntaje);

       // tv_resultado = (TextView) findViewById(R.id.tv_resultado);
        btn_reiniciar = (Button) findViewById(R.id.btn_reiniciar);
        btn_reiniciar.setOnClickListener(this);

        /*Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        if(extras !=null){
            String dato = extras.getString("DATO");
            tv_resultado.setText(dato);

        }*/


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_reiniciar:
                Intent intent = new Intent(Puntaje.this,MainActivity.class);
                startActivity(intent);
                break;
        }
    }
}

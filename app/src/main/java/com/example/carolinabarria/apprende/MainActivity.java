package com.example.carolinabarria.apprende;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_play; //Creacion de variable


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_play = (Button) findViewById(R.id.btn_play);//Enlace de boton
        btn_play.setOnClickListener(this);//Habilita el método
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_play:
                Intent intent = new Intent(MainActivity.this,Layout1.class);
                startActivity(intent);
                break;
        }

    }
}//Fin clase

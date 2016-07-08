package com.example.carolinabarria.apprende;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Layout3 extends AppCompatActivity implements View.OnClickListener{

    RadioButton rb_euro, rb_moneda, rb_dolar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout3);

        rb_euro = (RadioButton) findViewById(R.id.rb_euro);
        rb_moneda = (RadioButton) findViewById(R.id.rb_moneda);
        rb_dolar = (RadioButton) findViewById(R.id.rb_dolar);
        rb_euro.setOnClickListener(this);
        rb_moneda.setOnClickListener(this);
        rb_dolar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.rb_euro:
                Intent intent = new Intent(Layout3.this,Puntaje.class);
                startActivity(intent);
                break;
            case R.id.rb_moneda:
                Intent intent1 = new Intent(Layout3.this, Puntaje.class);
                startActivity(intent1);
                break;
            case R.id.rb_dolar:
                Intent intent2 = new Intent(Layout3.this,Puntaje.class);
                startActivity(intent2);
                break;
        }
    }
}

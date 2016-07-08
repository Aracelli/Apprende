package com.example.carolinabarria.apprende;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Layout1 extends AppCompatActivity implements View.OnClickListener{

    RadioButton rb_prat, rb_pinera, rb_massu;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout1);

        rb_prat = (RadioButton) findViewById(R.id.rb_prat); //la R almacena todas las clases
        rb_pinera = (RadioButton) findViewById(R.id.rb_pinera);
        rb_massu = (RadioButton) findViewById(R.id.rb_massu);
        rb_prat.setOnClickListener(this);
        rb_pinera.setOnClickListener(this);
        rb_massu.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.rb_prat:
                String dato = rb_prat.getText().toString();
                Intent intent = new Intent(Layout1.this,Layout2.class);

               // intent.putExtra("Dato", dato);
                startActivity(intent);
                break;
            case R.id.rb_pinera:
                Intent intent1 = new Intent(Layout1.this, Layout2.class);
                startActivity(intent1);
                break;
            case R.id.rb_massu:
                Intent intent2 = new Intent(Layout1.this,Layout2.class);
                startActivity(intent2);
                break;
        }
    }


}

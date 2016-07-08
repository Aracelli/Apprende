package com.example.carolinabarria.apprende;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Layout2 extends AppCompatActivity implements View.OnClickListener{

    RadioButton rb_chiloe, rb_vina, rb_antofagasta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout2);

        rb_chiloe = (RadioButton) findViewById(R.id.rb_chiloe);
        rb_vina = (RadioButton) findViewById(R.id.rb_vina);
        rb_antofagasta = (RadioButton) findViewById(R.id.rb_antofagasta);
        rb_chiloe.setOnClickListener(this);
        rb_vina.setOnClickListener(this);
        rb_antofagasta.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.rb_chiloe:
                Intent intent = new Intent(Layout2.this,Layout3.class);
                startActivity(intent);
                break;
            case R.id.rb_vina:
                Intent intent1 = new Intent(Layout2.this, Layout3.class);
                startActivity(intent1);
                break;
            case R.id.rb_antofagasta:
                Intent intent2 = new Intent(Layout2.this,Layout3.class);
                startActivity(intent2);
                break;
        }
    }
}

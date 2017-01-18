package com.example.javie.claro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button saldoButton = (Button) findViewById(R.id.button2);
        saldoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //Iniciar salgo
                Intent intent = new Intent(MainActivity.this, Saldo.class);
                startActivity(intent);

            }
        });


        Button soporteButton = (Button) findViewById(R.id.button8);
        soporteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Iniciar salgo
                Toast.makeText(getApplicationContext(),"Proximamente",Toast.LENGTH_LONG).show();
            }
        });

    }
}

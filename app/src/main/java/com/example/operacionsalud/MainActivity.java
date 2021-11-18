package com.example.operacionsalud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calculadoracientifica(View view)
    {
        Intent icalculadora = new Intent(MainActivity.this, Calculadora.class);
        startActivity(icalculadora);
    }

    public void salud(View view)
    {
        Intent isalud = new Intent(MainActivity.this,Salud.class);
        startActivity(isalud);
    }

    public void Salir(View view)
    {
        finish();
    }

}
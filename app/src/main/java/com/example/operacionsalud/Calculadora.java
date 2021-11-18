package com.example.operacionsalud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity {

    private EditText et1,et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        et1 = (EditText) findViewById(R.id.txtNro1);
        et2 = (EditText) findViewById(R.id.txtNro2);
        tv1 = (TextView) findViewById(R.id.tvRespuesta);
    }

    //Este metodo es para el boton sumar
    public void Sumar(View view)
    {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);

        double suma = num1 + num2;

        String result = String.valueOf(suma);
        tv1.setText(result);
    }

    //Este metodo es para el boton restar
    public void Restar(View view)
    {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);

        double resta = num1 - num2;

        String result = String.valueOf(resta);
        tv1.setText(result);
    }

    //Este metodo es para el boton multiplicar
    public void Multiplicar(View view)
    {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);

        double mult = num1 * num2;

        String result = String.valueOf(mult);
        tv1.setText(result);
    }

    //Este metodo es para el boton dividir
    public void Dividir(View view)
    {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);

        if(num1 == 0)
        {
            tv1.setText("ERROR");
        } else
        {
            double div = num1 / num2;
            String result = String.valueOf(div);
            tv1.setText(result);
        }
    }

    //Este metodo es para el boton raiz
    public void Raiz(View view)
    {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        double num1 = Integer.parseInt(valor1);
        double num2 = Integer.parseInt(valor2);

        double raiz = Math.pow(num1,(1/num2));

        String result = String.valueOf(raiz);
        tv1.setText(result);
    }

    //Este metodo es para el boton seno
    public void Seno(View view)
    {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        double num1 = Integer.parseInt(valor1);

        double sen = Math.sin(num1);

        String result = String.valueOf(sen);
        tv1.setText(result);
    }

    //Este metodo es para el boton coseno
    public void Coseno(View view)
    {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        double num1 = Integer.parseInt(valor1);

        double cos = Math.cos(num1);

        String result = String.valueOf(cos);
        tv1.setText(result);
    }

    //Este metodo es para el boton tangente
    public void Tangente(View view)
    {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        double num1 = Integer.parseInt(valor1);

        double tan = Math.tan(num1);

        String result = String.valueOf(tan);
        tv1.setText(result);
    }

    //Este metodo es para el boton factorial
    public void Factorial(View view)
    {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        double num1 = Integer.parseInt(valor1);
        int x;
        double fac = 1;

        for(x = 1; x <= num1; x++)
        {
            fac = fac * x;

            String result = String.valueOf(fac);
            tv1.setText(result);
        }

    }

    //Este metodo es para el boton potencia
    public void Potencia(View view)
    {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        double num1 = Integer.parseInt(valor1);
        double num2 = Integer.parseInt(valor2);

        double exp = Math.pow(num1,num2);

        String result = String.valueOf(exp);
        tv1.setText(result);
    }

    //Este metodo es para el boton de numero aleatorios
    public void Rnd(View view)
    {
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        double num1 = Integer.parseInt(valor1);
        double num2 = Integer.parseInt(valor2);

        double rnd =(double)Math.floor(Math.random()*(num2-num1)+num1);
        String result = String.valueOf(rnd);
        tv1.setText(result);

    }

    //Este metodo es para el boton limpiar
    public void Limpiar(View view)
    {
        et1.setText("");
        et2.setText("");
        tv1.setText("Respuesta");
    }
}
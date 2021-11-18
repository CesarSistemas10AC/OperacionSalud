package com.example.operacionsalud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Salud extends AppCompatActivity {
    EditText etNombre, etPeso, etAltura;
    Button btnCalcular, btnLimpiar;
    RadioButton rbVaron, rbMujer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salud);

        etNombre = (EditText) findViewById(R.id.txtnombre);
        etPeso = (EditText) findViewById(R.id.txtpeso);
        etAltura = (EditText) findViewById(R.id.txtalto);
        btnCalcular = (Button) findViewById(R.id.btncalcular);
        btnLimpiar = (Button) findViewById(R.id.btnlimpiar);
        rbVaron = (RadioButton) findViewById(R.id.rhombre);
        rbMujer = (RadioButton) findViewById(R.id.rmujer);

        btnLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Limpiar();
            }
        });

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalcularIMC();
            }
        });
    }
        private void Limpiar()
        {
            etNombre.setText("");
            etAltura.setText("");
            etPeso.setText("");
        }

        private String MensajeIMC(double IMC)
        {
            String mensaje = "";
            if(IMC<16)
                mensaje = "Delgadez severa: Consuma una cantidad acorde de nutrientes para conseguir su peso ideal";
            else if (IMC>=16 & IMC <17)
                mensaje = "Delgadez moderada: Su peso es normal pero ayudese con algunos carbohidratos y siga con su ejercicio";
            else if (IMC>=17 & IMC<19)
                mensaje = "Delgadez leve: Su peso es el indicado siga con la misma alimentación y nutrientes junto con el ejercicio interdiario";
            else if (IMC>=19 & IMC<25)
                mensaje = "Su peso es normal: Felicitaciones siga así, usted se ama!";
            else if (IMC>=25 & IMC<30)
                mensaje = "Poca obesidad: Consuma mas frutas y menos masas, menos carbohidratos para conseguir su peso ideal";
            else if (IMC>=30 & IMC<35)
                mensaje = "Obesidad leve: Consuma mucha agua y frutas con cereales, realice más ejercicio y menos grasas";
            else if (IMC>=35 & IMC<40)
                mensaje = "Obesidad alta: Tenga cuidado haga ejercicio y no esté sentado xD";
            else
                mensaje = "Otro tipo de IMC";
            return mensaje;
        }

        private void CalcularIMC()
        {
            String nombre = etNombre.getText().toString();
            Double altura = Double.valueOf(etAltura.getText().toString());
            Double peso = Double.valueOf(etPeso.getText().toString());
            double IMC = peso / Math.pow(altura,2);
            Toast.makeText(this,"Tu IMC es: " +String.format("%.2f: ",IMC)+MensajeIMC(IMC), Toast.LENGTH_LONG).show();
            if (rbMujer.isChecked()==true)
                Toast.makeText(this, "SU GÉNERO ES FEMENINO", Toast.LENGTH_SHORT).show();
            else if (rbVaron.isChecked()==true)
                Toast.makeText(this, "SU GÉNERO ES MASCULINO", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, "No eligió género, solo hay dos", Toast.LENGTH_SHORT).show();
        }
    }

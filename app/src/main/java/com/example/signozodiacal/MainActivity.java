package com.example.signozodiacal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonAceptar;
    private int dia=0;
    private int mes=0;
    private String mensaje;
    private CalendarView calendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAceptar= (Button) findViewById(R.id.buttonAceptar);
        calendarView=(CalendarView) findViewById(R.id.calendarView);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int i, int i1, int i2) {
                dia=i2;
                mes=(i1+1);
            }
        });

        buttonAceptar.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 mensaje=signoZodiacal(dia,mes);
                 Intent intento= new Intent(getApplicationContext(),VistaSignoZodiacal.class);
                 intento.putExtra("VALOR",mensaje);
                 startActivity(intento);
             }
         });
    }

    public String signoZodiacal(int dia,int mes){

        String sig="";

        if(dia >= 20 && dia <= 31 && mes == 1 ||dia >= 1 && dia <= 18 && mes == 2 ){
            sig="Acuario.";
        }else if (dia >= 19 && dia <= 29 && mes == 2 ||dia >= 1 && dia <= 20 && mes == 3 ){
            sig="Piscis.";
        }else if (dia >= 21 && dia <= 31 && mes == 3 ||dia >= 1 && dia <= 19 && mes == 4 ){
            sig="Aries.";
        }else if (dia >= 20 && dia <= 30 && mes == 4 ||dia >= 1 && dia <= 20 && mes == 5 ) {
            sig="Tauro.";
        }else if (dia >= 21 && dia <= 31 && mes == 5 ||dia >= 1 && dia <= 20 && mes == 6 ) {
            sig="Géminis.";
        }else if (dia >= 21 && dia <= 30 && mes == 6 ||dia >= 1 && dia <= 22 && mes == 7 ) {
            sig="Cáncer.";
        }else if (dia >= 23 && dia <= 31 && mes == 7 ||dia >= 1 && dia <= 22 && mes == 8 ) {
            sig="Leo.";
        }else if (dia >= 23 && dia <= 31 && mes == 8 ||dia >= 1 && dia <= 22 && mes == 9 ) {
            sig="Virgo.";
        }else if (dia >= 23 && dia <= 30 && mes == 9 ||dia >= 1 && dia <= 22 && mes == 10 ) {
            sig="Libra.";
        }else if (dia >= 23 && dia <= 31 && mes == 10 ||dia >= 1 && dia <= 21 && mes == 11 ) {
            sig = "Escorpio.";
        }else if (dia >= 22 && dia <= 30 && mes == 11 ||dia >= 1 && dia <= 21 && mes == 12 ) {
            sig = "Sagitario.";
        }else if (dia >= 22 && dia <= 31 && mes == 12 ||dia >= 1 && dia <= 19 && mes == 1 ) {
            sig = "Capricornio.";
        }

        return sig;
    }
}

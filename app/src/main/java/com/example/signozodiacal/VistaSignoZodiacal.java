package com.example.signozodiacal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class VistaSignoZodiacal extends AppCompatActivity {

    private Button bt_salir;
    private TextView tv_signo;
    private String mensaje="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_signo_zodiacal);
        bt_salir=(Button) findViewById(R.id.bt_salir);
        tv_signo=(TextView) findViewById(R.id.tv_signoZodiacal);

        mensaje=getIntent().getStringExtra("VALOR");
        tv_signo.setText("Tu signo es:\n"+mensaje);

        bt_salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}

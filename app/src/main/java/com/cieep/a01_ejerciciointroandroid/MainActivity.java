package com.cieep.a01_ejerciciointroandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // PASO 1 - Definir variables de vista
    private EditText txtNombre;
    private TextView lblSaludo;
    private Button btnReset;
    private Button btnSaludar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // PASO 2 - Inicialización de las variables de la vista
        inicializaVistas();

        // PASO 3 - Eventos
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lblSaludo.setText("");
            }
        });

        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtNombre.getText().toString().trim().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Escribe algo bobo", Toast.LENGTH_SHORT).show();
                }
                else {
                    lblSaludo.setText("Hola "+txtNombre.getText().toString() + ", Buenos días");
                    txtNombre.getText().clear();
                }
            }
        });

    }

    private void inicializaVistas() {
        txtNombre = findViewById(R.id.txtNombreMain);
        lblSaludo = findViewById(R.id.lblSaludoMain);
        btnReset = findViewById(R.id.btnResetMain);
        btnSaludar = findViewById(R.id.btnSaludarMain);

    }
}
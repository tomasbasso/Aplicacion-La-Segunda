package com.example.prueba1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    EditText txtusuario, txtcontrasena;
    View btniniciar;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        txtusuario=findViewById(R.id.editText_usuario);
        txtcontrasena=findViewById(R.id.editText_contrasena);
        btniniciar=findViewById(R.id.button_actmain_iniciarsesion);







        btniniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtusuario.getText().toString().equals("alumno") && txtcontrasena.getText().toString().equals("1234")){
                    Intent intent = new Intent(MainActivity.this, Menu.class);
                    startActivity(intent);
                } else  {

                   Toast.makeText(MainActivity.this, R.string.msj_error, Toast.LENGTH_SHORT).show();


                }
            }

        }


        );
    }
}
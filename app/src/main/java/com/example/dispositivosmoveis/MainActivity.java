package com.example.dispositivosmoveis;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button sortear;
    TextView resultado;
    EditText numero1;
    EditText numero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
         sortear = findViewById(R.id.sortear);
         resultado = findViewById(R.id.resultado);
         numero1 = findViewById(R.id.numero1);
         numero2 = findViewById(R.id.numero2);

        sortear.setOnClickListener(this::realizaSorteio);
    }

    private void realizaSorteio(View view) {
        try {
            int n1 = Integer.parseInt(numero1.getText().toString());
            int n2 = Integer.parseInt(numero2.getText().toString());

            int res = new Random().nextInt((n2 - n1)+1)+n1;

            resultado.setText("Resultado: " + res);

        } catch (Exception e) {

            new AlertDialog.Builder(this).setMessage("Informe dois números para poder sortear!").show();

        }

    }


}

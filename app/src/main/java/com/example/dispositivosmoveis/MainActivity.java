package com.example.dispositivosmoveis;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ImageView imagemResultado = findViewById(R.id.imagem);

        imagemResultado.setImageResource(R.drawable.perfil);

        Button botao = findViewById(R.id.button);
        botao.setOnClickListener(v -> {
            EditText peso = findViewById(R.id.peso);
            EditText altura = findViewById(R.id.altura);

            TextView resultado = findViewById(R.id.resultado);
            TextView classificacao = findViewById(R.id.classificacao);

            double valorPeso = Double.parseDouble(peso.getText().toString());
            double valorAltura = Double.parseDouble(altura.getText().toString());

            double IMC = valorPeso / (valorAltura * valorAltura);

            resultado.setText(String.format("IMC: %.2f", IMC));

            if (IMC < 18.5) {
                classificacao.setText("Abaixo do peso");
                imagemResultado.setImageResource(R.drawable.abaixopeso);
                return;
            }
            if (IMC < 25) {
                classificacao.setText("Peso normal");
                imagemResultado.setImageResource(R.drawable.normal);
                return;
            }
            if (IMC < 30) {
                classificacao.setText("Sobrepeso");
                imagemResultado.setImageResource(R.drawable.sobrepeso);
                return;
            }
            if (IMC < 35) {
                classificacao.setText("Obesidade grau 1");
                imagemResultado.setImageResource(R.drawable.obesidade1);
                return;
            }
            if (IMC < 40) {
                classificacao.setText("Obesidade grau 2");
                imagemResultado.setImageResource(R.drawable.obesidade2);
                return;
            }
            classificacao.setText("Obesidade grau 3");
            imagemResultado.setImageResource(R.drawable.obesidade3);
        });
    }
}
package com.example.dispositivosmoveis;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_result);

        TextView resultado = findViewById(R.id.resultado);
        TextView classificacao = findViewById(R.id.classificacao);
        ImageView imagemResultado = findViewById(R.id.imagem);


        TextView tvPesoInformado = findViewById(R.id.pesoInformado);
        TextView tvAlturaInformada = findViewById(R.id.alturaInformada);

        imagemResultado.setImageResource(R.drawable.perfil);

        Intent intent = getIntent();
        if (intent != null) {
            Bundle bundleRecebido = intent.getExtras();

            if (bundleRecebido != null) {
                String pesoStr = bundleRecebido.getString("CHAVE_PESO");
                String alturaStr = bundleRecebido.getString("CHAVE_ALTURA");

                tvPesoInformado.setText("Peso: " + pesoStr + " kg");
                tvAlturaInformada.setText("Altura: " + alturaStr + " m");

                double valorPeso = Double.parseDouble(pesoStr);
                double valorAltura = Double.parseDouble(alturaStr);

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
            }
        }
    }
}
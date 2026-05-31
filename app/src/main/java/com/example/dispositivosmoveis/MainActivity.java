package com.example.dispositivosmoveis;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ImageView telaInicial = findViewById(R.id.image);
        telaInicial.setImageResource(R.drawable.perfil);

        Button botao = findViewById(R.id.button);
        botao.setOnClickListener(v -> {
            EditText peso = findViewById(R.id.peso);
            EditText altura = findViewById(R.id.altura);

            String strPeso = peso.getText().toString();
            String strAltura = altura.getText().toString();



            Intent intent = new Intent(MainActivity.this, ResultActivity.class);


            Bundle bundle = new Bundle();
            bundle.putString("CHAVE_PESO", strPeso);
            bundle.putString("CHAVE_ALTURA", strAltura);


            intent.putExtras(bundle);
            startActivity(intent);
        });
    }
}
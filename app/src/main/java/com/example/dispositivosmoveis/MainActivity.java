package com.example.dispositivosmoveis;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

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

        DesenhoView desenho = findViewById(R.id.desenhoView);
        Button limpar = findViewById(R.id.button);

        limpar.setOnClickListener(v -> desenho.limpar());

        Button azul = findViewById(R.id.botaoazul);
        azul.setOnClickListener(v -> desenho.setCor(Color.BLUE));

        Button vermelho = findViewById(R.id.botaovermelho);
        vermelho.setOnClickListener(v -> desenho.setCor(Color.RED));
    }
}
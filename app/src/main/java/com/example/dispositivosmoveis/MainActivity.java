package com.example.dispositivosmoveis;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Integer> fibonacci = criarItensFibonacci(20);
        MeuAdapter adapter = new MeuAdapter(fibonacci);
        recyclerView.setAdapter(adapter);
    }

    private List<Integer> criarItensFibonacci(int quantidade) {
        List<Integer> numeros = new ArrayList<>();
        int numeroAnterior = 1;
        int numeroAnterior2 = 1;
        numeros.add(1);
        numeros.add(1);
        for (int i = 0; i < quantidade; i++) {
            int numeroAtual = numeroAnterior + numeroAnterior2;
            numeros.add(numeroAtual);
            numeroAnterior2 = numeroAnterior;
            numeroAnterior = numeroAtual;
        }
        return numeros;
    }
}
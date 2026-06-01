package com.example.dispositivosmoveis;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityTelaProgramatica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        LinearLayout layoutPrincipal = new LinearLayout(this);
        layoutPrincipal.setOrientation(LinearLayout.VERTICAL);

        layoutPrincipal.setGravity(Gravity.CENTER);

        LinearLayout.LayoutParams parametrosLayout = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );
        layoutPrincipal.setLayoutParams(parametrosLayout);

        LinearLayout.LayoutParams parametrosComponentes = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        TextView textoOla = new TextView(this);
        textoOla.setText("Olá Mundo");
        textoOla.setTextSize(24);

        Button botaoClique = new Button(this);
        botaoClique.setText("Clique aqui");

        layoutPrincipal.addView(textoOla, parametrosComponentes);

        LinearLayout.LayoutParams parametrosBotao = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        layoutPrincipal.addView(botaoClique, parametrosBotao);

        setContentView(layoutPrincipal);
    }
}
package com.example.dispositivosmoveis;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class DesenhoView extends View {

    private List<Linha> linhas = new ArrayList<>();
    private Linha linhaAtual;

    private int corAtual = Color.RED;


    public DesenhoView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (Linha linha : linhas) {
            canvas.drawPath(linha.path, linha.paint);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            Path novoPath = new Path();
            novoPath.moveTo(event.getX(), event.getY());

            Paint novoPaint = new Paint();
            novoPaint.setColor(corAtual);
            novoPaint.setStyle(Paint.Style.STROKE);
            novoPaint.setStrokeWidth(20f);

            linhaAtual = new Linha(novoPath, novoPaint);
            linhas.add(linhaAtual);

            invalidate();
            return true;
        }

        if (event.getAction() == MotionEvent.ACTION_MOVE) {
            linhaAtual.path.lineTo(event.getX(), event.getY());
            invalidate();
            return true;
        }

        return false;
    }

    public void limpar() {
        linhas = new ArrayList<>();
        invalidate();
    }

    public void setCor(int cor) {
        corAtual = cor;
    }
}
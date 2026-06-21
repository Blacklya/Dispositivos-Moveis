package com.example.dispositivosmoveis;

import android.graphics.Paint;
import android.graphics.Path;

public class Linha {

    public final Path path;
    public final Paint paint;

    Linha(Path path, Paint paint) {
        this.path = path;
        this.paint = paint;
    }
}

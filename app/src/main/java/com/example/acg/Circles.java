package com.example.acg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Random;

public class Circles extends View {
    public Circles(Context context) {
        super(context);
    }

    public Circles(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Circles(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public Circles(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        Paint p = new Paint();
        p.setAntiAlias(true);
        p.setStyle(Paint.Style.FILL);
        Random random = new Random();

        for(int i = 0; i < 10; i ++){
            p.setARGB(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
            canvas.drawCircle(random.nextInt(width), random.nextInt(height), random.nextInt(100), p);
        }

        p.setStyle(Paint.Style.STROKE);
        p.setStrokeWidth(5);
        p.setColor(Color.YELLOW);
        canvas.drawRect(2, 2, width-3, height-3, p);

        super.onDraw(canvas);
    }
}

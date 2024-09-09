package com.example.acg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Squares extends View {
    public Squares(Context context) {
        super(context);
    }

    public Squares(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Squares(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public Squares(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        int radius = 200;
        Paint p = new Paint();
        p.setStyle(Paint.Style.FILL);
        p.setColor(Color.BLUE);
        canvas.drawRect(width/2-radius, height/2-radius, width/2+radius, height/2+radius, p);

        p.setColor(Color.RED);
        canvas.drawCircle(width/2, height/2, radius, p);

        super.onDraw(canvas);
    }
}

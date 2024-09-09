package com.example.acg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Lines extends View {
    public Lines(Context context) {
        super(context);
    }

    public Lines(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Lines(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public Lines(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        Paint p = new Paint();
        p.setColor(Color.GREEN);
        p.setStyle(Paint.Style.FILL);

        canvas.drawLine(width / 2, 0, width / 2, height, p);

        super.onDraw(canvas);
    }
}

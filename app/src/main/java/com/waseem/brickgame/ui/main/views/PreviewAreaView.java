package com.waseem.brickgame.ui.main.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.waseem.brickgame.figures.Figure;


public class PreviewAreaView extends View {

    private Paint paint;
    private Figure figure;
    public static int PREVIEW_AREA_WIDTH;

    public PreviewAreaView(Context context) {
        super(context);
        init();
    }

    public PreviewAreaView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public PreviewAreaView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        paint = new Paint();
    }

    public void drawNextFigure(Figure figure) {
        this.figure = figure;
        invalidate();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        PREVIEW_AREA_WIDTH = MeasureSpec.getSize(widthMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (figure != null) {
            Path path = figure.getPath();
            paint.setColor(figure.getColor());
            canvas.drawPath(path, paint);
        }
    }
}

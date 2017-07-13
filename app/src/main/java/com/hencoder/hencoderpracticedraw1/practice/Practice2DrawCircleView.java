package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);



    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        int offsetWidth = width / 4;
        int offsetHeight = height / 4;
//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.BLACK);
        canvas.drawCircle(offsetWidth, offsetHeight, 200, paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10);

        canvas.drawCircle(offsetWidth * 3, offsetHeight, 200, paint);

        paint.setColor(Color.parseColor("#880000FF"));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(offsetWidth, offsetHeight * 3, 200, paint);

        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(50);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(offsetWidth*3, offsetHeight * 3, 200, paint);


    }
}

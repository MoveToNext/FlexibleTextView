package com.flexible.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * PackageName:  liu.myapplication
 * Description: 自定义灵活textview，自定义属性 shape {"circular","square"}
 * date:   2016/11/24 15:42
 */
public class FlexibleTextView extends TextView {

    private Paint mBgPaint;
    private boolean rect = false;

    private boolean Round = false;
    private boolean SQUARE = false;
    private int measuredWidth;
    private int measuredHeight;
    private int Arc;
    private Paint paint3;
    private int color;
    private int sizecolor;
    private int bgColor;

    public FlexibleTextView(Context context) {
        this(context, null);
    }

    public FlexibleTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public FlexibleTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initOptions(context, attrs);
    }

    private void initOptions(Context context, AttributeSet attrs) {
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.FlexibleTextView);
        sizecolor = typedArray.getColor(R.styleable.FlexibleTextView_tColor, Color.RED);
        bgColor = typedArray.getColor(R.styleable.FlexibleTextView_bgColor, Color.RED);
        int shape = typedArray.getInt(R.styleable.FlexibleTextView_shape, -1);
        typedArray.recycle();

        if (shape < 0){
            throw new RuntimeException("Shape is not defined, please first definition, thank you");
        }

        switch (shape){
            case 0:
                Round = true;
            break;
            case 1:
                SQUARE = true;
            break;
        }

        /**
         * 背景画笔
         * */
        mBgPaint = new Paint();
        mBgPaint.setColor(bgColor);
        mBgPaint.setAntiAlias(true);

        paint3 = new Paint();
        paint3.setColor(Color.YELLOW);
    }

    /**
     * 默认透明背景的文本
     * @param text 文本
     */
    public void showText(String text) {
        rect = false;
        setTextColor(sizecolor);
        mBgPaint.setColor(Color.TRANSPARENT);
        setText(text);
    }

    /**
     * 自定义文本背景
     * @param text 文本
     * @param color 显示的字体颜色
     */
    public void showCustomText(String text, int color) {
        rect = false;
        setTextColor(color);
        mBgPaint.setColor(Color.TRANSPARENT);
        setText(text);
    }

    /**
     * 显示圆形背景的文本，圆形颜色自定义属性设置
     * @param text 文本
     */
    public void showCicleText(String text) {
        if (Round){
            rect = false;
            mBgPaint.setColor(bgColor);
            setTextColor(Color.WHITE);
            setText(text);
        }else {
            throw new RuntimeException("The definition is square and cannot use this method");
        }
    }
    /**
     * 显示紫色方块背景
     * @param text 文本
     */
    public void showPurpleText(String text) {
        if (SQUARE){
            rect = true;
            color = getResources().getColor(R.color.trend_purple);
            setTextColor(Color.WHITE);
            setText(text);
        }else {
            throw new RuntimeException("The definition is Round and cannot use this method");
        }
    }
    /**
     * 显示灰色方块背景
     * @param text 文本
     */
    public void showGrayText(String text) {
        if (SQUARE){
            rect = true;
            color = getResources().getColor(R.color.trend_gray);
            setTextColor(Color.WHITE);
            setText(text);
        }else {
            throw new RuntimeException("The definition is Round and cannot use this method");
        }
    }
    /**
     * 显示绿色方块背景
     * @param text 文本
     */
    public void showGreenText(String text) {
        if (SQUARE){
            rect = true;
            color = getResources().getColor(R.color.trend_green);
            setTextColor(Color.WHITE);
            setText(text);
        }else {
            throw new RuntimeException("The definition is Round and cannot use this method");
        }
    }
    /**
     * 显示蓝色方块背景
     * @param text 文本
     */
    public void showBlueText(String text) {
        if (SQUARE){
            rect = true;
            color = getResources().getColor(R.color.trend_blue);
            setTextColor(Color.WHITE);
            setText(text);
        }else {
            throw new RuntimeException("The definition is Round and cannot use this method");
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        measuredWidth = getMeasuredWidth();
        measuredHeight = getMeasuredHeight();
        Arc = Math.min(measuredHeight, measuredWidth)/2;
        if (Round){
            canvas.drawCircle(measuredWidth/2,measuredHeight/2, Arc, mBgPaint);
        }
        if (rect) {
            canvas.drawColor(color);
        }
        super.onDraw(canvas);
    }

}

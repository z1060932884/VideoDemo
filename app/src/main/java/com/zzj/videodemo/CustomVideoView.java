package com.zzj.videodemo;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.VideoView;

/**
 * @author : zzj
 * @e-mail : zhangzhijun@pansoft.com
 * @date : 2018/12/10 16:48
 * @desc :
 * @version: 1.0
 */
public class CustomVideoView extends VideoView {
    /**
     *     声明屏幕的大小
     */

    int width = 1920;
    int height = 1080;
    public CustomVideoView(Context context) {
        super(context);
    }

    public CustomVideoView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CustomVideoView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        //设置宽高
        int defaultWidth = getDefaultSize(width,widthMeasureSpec);
        int defaultHeight = getDefaultSize(height,heightMeasureSpec);
        setMeasuredDimension(defaultWidth,defaultHeight);
    }
}

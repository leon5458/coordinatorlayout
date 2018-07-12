package com.hly.coordinatorlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;


    public class AlphaTitleScrollView extends ScrollView {
    public final String TAG = getClass().getName();

    public AlphaTitleScrollView(Context context, AttributeSet attrs,
                                int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public AlphaTitleScrollView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
        // TODO Auto-generated constructor stub
    }

    public AlphaTitleScrollView(Context context) {
        this(context, null);
    }


    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        if (onScrollChange != null) {
            onScrollChange.onScrollChange(l, t, oldl, oldt);
        }

    }

    OnScrollChange onScrollChange;

    public void setOnScrollChange(OnScrollChange onScrollChange) {
        this.onScrollChange = onScrollChange;
    }

    public interface OnScrollChange {
        void onScrollChange(int l, int t, int oldl, int oldt);
    }
}
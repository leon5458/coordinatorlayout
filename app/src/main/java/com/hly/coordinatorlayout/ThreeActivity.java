package com.hly.coordinatorlayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2018/7/11~~~~~~
 * ~~~~~~更改时间:2018/7/11~~~~~~
 * ~~~~~~版本号:1~~~~~~
 */
public class ThreeActivity extends AppCompatActivity {
    private AlphaTitleScrollView scrollView;
    private TextView title;
    private ImageView img;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three_activity_layout);
        scrollView = findViewById(R.id.detail);
        title = findViewById(R.id.title);
        img = findViewById(R.id.img);

        scrollView.smoothScrollTo(0, 0);
        title.getBackground().mutate().setAlpha(0);

        scrollView.setOnScrollChange(new AlphaTitleScrollView.OnScrollChange() {
            @Override
            public void onScrollChange(int l, int t, int oldl, int oldt) {
                if (t >= img.getMeasuredHeight() - title.getMeasuredHeight()) {
                    title.getBackground().mutate().setAlpha(255);
                    title.setVisibility(View.VISIBLE);
                } else {
                    title.getBackground().mutate().setAlpha(0);
                    title.setVisibility(View.GONE);
                }
            }
        });


    }
}

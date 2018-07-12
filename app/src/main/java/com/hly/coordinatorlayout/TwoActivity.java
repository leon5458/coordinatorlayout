package com.hly.coordinatorlayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2018/7/11~~~~~~
 * ~~~~~~更改时间:2018/7/11~~~~~~
 * ~~~~~~版本号:1~~~~~~
 */
public class TwoActivity extends AppCompatActivity {
    private FloatingActionButton fab;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two_activity_layout);

        Toolbar toolbar =findViewById(R.id.toolbar);
        toolbar.setTitle("标题");

        fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TwoActivity.this,ThreeActivity.class));
            }
        });
    }
}

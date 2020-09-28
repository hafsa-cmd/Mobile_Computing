package com.example.assign01;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.CookieHandler;

public class MainActivity extends AppCompatActivity {
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = this.getWindow().getDecorView();

        view.setBackgroundResource(R.color.colorAccent);
    }

    public void goDarkPink(View view)
    {
        view.setBackgroundResource(R.color.darkPink);
    }

    public void goBlue(View view) {
        view.setBackgroundResource(R.color.blue);
    }

    public void goPink(View view) {
        view.setBackgroundResource(R.color.Pink);
    }
}
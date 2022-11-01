package com.example.laba7_kim_gurbanov;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View v) {
        AppCompatButton Btn = (AppCompatButton) v;
        String txt = Btn.getText().toString();
        TextView Text = findViewById(R.id.Txt);

        Text.setText("Была нажаа кнопка " + txt);
    }
}
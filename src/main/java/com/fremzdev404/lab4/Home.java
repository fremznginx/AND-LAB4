package com.fremzdev404.lab4;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Home extends AppCompatActivity {
    TextView tvCS;

    String[] colorCode = {"#FF6633", "#FFB399'", "#FF33FF", "#FFFF99", "#00B3E6",
            "#E6B333", "#3366E6", "#999966", "#99FF99", "#B34D4D",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tvCS = findViewById(R.id.tvCS);

        tvCS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                int i = (r.nextInt(10) + 1);
                tvCS.setTextColor(Color.parseColor(colorCode[i]));
                tvCS.setTextSize(50);
            }
        });
    }
    public void clickButtonTv1(View v) {
        tvCS.setTextSize(20);
        Toast.makeText(this, tvCS.getText(),
        Toast.LENGTH_LONG).show();
    }
}

package com.example.blind_cats;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Care extends AppCompatActivity {

    TextView textView4;
    Button home, jett, merry, faq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_care);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        textView4 = (TextView) findViewById(R.id.textView4);
        home = (Button) findViewById(R.id.btnHomeCare);
        jett = (Button) findViewById(R.id.btnJettCare);
        merry = (Button) findViewById(R.id.btnMerryCare);
        faq = (Button) findViewById(R.id.btnFAQCare);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Care.this, "I am a black cat!", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Care.this, MainActivity.class);
                startActivity(intent);
            }
        });

        jett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Care.this, Jett.class);
                startActivity(intent);
            }
        });

        merry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Care.this, Merry.class);
                startActivity(intent);
            }
        });

        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Care.this, FAQ.class);
                startActivity(intent);
            }
        });

    }
}
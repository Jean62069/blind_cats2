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

public class FAQ extends AppCompatActivity {

    TextView textView5;
    Button home, jett, merry, care;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        textView5 = (TextView) findViewById(R.id.textView5);
        home = (Button) findViewById(R.id.btnHomeF);
        merry = (Button) findViewById(R.id.btnMerryF);
        care = (Button) findViewById(R.id.btnCareF);
        jett = (Button) findViewById(R.id.btnJettF);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FAQ.this, "I am have the answers", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(FAQ.this, MainActivity.class);
                startActivity(intent);
            }
        });

        merry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FAQ.this, Merry.class);
                startActivity(intent);
            }
        });

        care.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FAQ.this, Care.class);
                startActivity(intent);
            }
        });

        jett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FAQ.this, Jett.class);
                startActivity(intent);
            }
        });
    }
}
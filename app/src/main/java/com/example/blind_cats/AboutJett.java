package com.example.blind_cats;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class AboutJett extends AppCompatActivity {
    TextView textView7;
    Button home, merry, care, faq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_jett);


        textView7 = (TextView) findViewById(R.id.textView);
        home = (Button) findViewById(R.id.btnHome);
        merry = (Button) findViewById(R.id.btnMerry);
        care = (Button) findViewById(R.id.btnCare);
        faq = (Button) findViewById(R.id.btnFAQ);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AboutJett.this, "I am a white cat!", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(AboutJett.this, MainActivity.class);
                startActivity(intent);
            }
        });

        merry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutJett.this, Merry.class);
                startActivity(intent);
            }
        });

        care.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutJett.this, Care.class);
                startActivity(intent);
            }
        });

        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutJett.this, FAQ.class);
                startActivity(intent);
            }
        });
    }
}

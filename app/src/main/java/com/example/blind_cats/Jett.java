package com.example.blind_cats;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class Jett extends AppCompatActivity {
    TextView textView2;
    Button home, merry, care, faq, aboutJett, galleryJett;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jett);


        textView2 = (TextView) findViewById(R.id.textView);
        home = (Button) findViewById(R.id.btnHome);
        merry = (Button) findViewById(R.id.btnMerry);
        care = (Button) findViewById(R.id.btnCare);
        faq = (Button) findViewById(R.id.btnFAQ);
        aboutJett = (Button) findViewById(R.id.aboutJett);
        galleryJett = (Button) findViewById(R.id.galleryJett);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Jett.this, "I am a white cat!", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Jett.this, MainActivity.class);
                startActivity(intent);
            }
        });

        merry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Jett.this, Merry.class);
                startActivity(intent);
            }
        });

        care.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Jett.this, Care.class);
                startActivity(intent);
            }
        });

        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Jett.this, FAQ.class);
                startActivity(intent);
            }
        });

        aboutJett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Jett.this, AboutJett.class);
                startActivity(intent);
            }
        });

        galleryJett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Jett.this, "Scroll down to see more photos!", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Jett.this, JettGallery.class);
                startActivity(intent);

            }
        });
    }
}

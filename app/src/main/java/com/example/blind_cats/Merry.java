package com.example.blind_cats;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class Merry extends AppCompatActivity {

    TextView textView3;
    Button home, jett, care, faq, aboutMerry, galleryMerry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_merry);


        textView3 = (TextView) findViewById(R.id.textView);
        home = (Button) findViewById(R.id.btnHome);
        jett = (Button) findViewById(R.id.btnJett);
        care = (Button) findViewById(R.id.btnCare);
        faq = (Button) findViewById(R.id.btnFAQ);
        aboutMerry = (Button) findViewById(R.id.aboutMerry);
        galleryMerry = (Button) findViewById(R.id.galleryMerry);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Merry.this, "I am a black cat!", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Merry.this, MainActivity.class);
                startActivity(intent);
            }
        });

        jett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Merry.this, Jett.class);
                startActivity(intent);
            }
        });

        care.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Merry.this, Care.class);
                startActivity(intent);
            }
        });

        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Merry.this, FAQ.class);
                startActivity(intent);
            }
        });

        aboutMerry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Merry.this, AboutMerry.class);
                startActivity(intent);
            }
        });

        galleryMerry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Merry.this, MerryGallery.class);
                startActivity(intent);
            }
        });
    }
}

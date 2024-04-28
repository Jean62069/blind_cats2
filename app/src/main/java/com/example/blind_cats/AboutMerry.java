package com.example.blind_cats;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class AboutMerry extends AppCompatActivity {

    TextView textView7;
    Button home, jett, care, faq, aboutMerry, galleryMerry;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_merry);

        textView7 = (TextView) findViewById(R.id.textView);
        home = (Button) findViewById(R.id.btnHome);
        jett = (Button) findViewById(R.id.btnJett);
        care = (Button) findViewById(R.id.btnCare);
        faq = (Button) findViewById(R.id.btnFAQ);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AboutMerry.this, "My fur is sooo soft.", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(AboutMerry.this, MainActivity.class);
                startActivity(intent);
            }
        });

        jett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutMerry.this, Jett.class);
                startActivity(intent);
            }
        });

        care.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutMerry.this, Care.class);
                startActivity(intent);
            }
        });

        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutMerry.this, FAQ.class);
                startActivity(intent);
            }
        });
    }
}

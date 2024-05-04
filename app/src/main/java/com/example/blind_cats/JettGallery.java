package com.example.blind_cats;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
;

public class JettGallery extends AppCompatActivity {

    TextView textView2;
    Button home, merry, care, faq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jett_gallery);

        textView2 = (TextView) findViewById(R.id.textView);
        home = (Button) findViewById(R.id.btnHome);
        merry = (Button) findViewById(R.id.btnMerry);
        care = (Button) findViewById(R.id.btnCare);
        faq = (Button) findViewById(R.id.btnFAQ);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(JettGallery.this, "Thanks for looking at my app.", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(JettGallery.this, MainActivity.class);
                startActivity(intent);
            }
        });

        merry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JettGallery.this, Merry.class);
                startActivity(intent);
            }
        });

        care.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JettGallery.this, Care.class);
                startActivity(intent);
            }
        });

        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JettGallery.this, FAQ.class);
                startActivity(intent);
            }
        });


    }
}

package com.example.blind_cats;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MerryGallery extends AppCompatActivity {

    TextView textView2;
    Button home, jett, care, faq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_merry_gallery);

        textView2 = (TextView) findViewById(R.id.textView);
        home = (Button) findViewById(R.id.btnHome);
        jett = (Button) findViewById(R.id.btnJett);
        care = (Button) findViewById(R.id.btnCare);
        faq = (Button) findViewById(R.id.btnFAQ);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MerryGallery.this, "Thanks for looking at my photos.", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MerryGallery.this, MainActivity.class);
                startActivity(intent);
            }
        });

        jett.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MerryGallery.this, Jett.class);
                startActivity(intent);
            }
        });

        care.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MerryGallery.this, Care.class);
                startActivity(intent);
            }
        });

        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MerryGallery.this, FAQ.class);
                startActivity(intent);
            }
        });


    }
}

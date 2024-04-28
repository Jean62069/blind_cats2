package com.example.blind_cats;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    Button jett, merry, care, faq;


    // This is where we take care of core business logic...
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Following line brings view on top of the activity
        setContentView(R.layout.activity_main);


        textView = (TextView) findViewById(R.id.textView);
        jett = (Button) findViewById(R.id.jett);
        merry= (Button) findViewById(R.id.merry);
        care= (Button) findViewById(R.id.care);
        faq= (Button) findViewById(R.id.faq);

        jett.setOnClickListener(this);
        merry.setOnClickListener(this);
        care.setOnClickListener(this);
        faq.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.jett) {
            Intent intent5 = new Intent(MainActivity.this, Jett.class);
            startActivity(intent5);
            Toast.makeText(this, "Jett.. Relaxing...", Toast.LENGTH_LONG).show();

        } else if (id == R.id.merry) {
            Intent intent6 = new Intent(MainActivity.this, Merry.class);
            startActivity(intent6);
        }
        else if (id == R.id.care) {
            Intent intent7 = new Intent(MainActivity.this, Care.class);
            startActivity(intent7);
        } else if (id == R.id.faq) {
            Intent intent8 = new Intent(MainActivity.this, FAQ
                    .class);
            startActivity(intent8);

        }else {
            throw new IllegalStateException("Unexpected value: " + view.getId());
        }


    }
}

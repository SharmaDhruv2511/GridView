package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetaliedActivity extends AppCompatActivity {

    ImageView imageView;
    TextView tv;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalied);
        imageView = findViewById(R.id.imageView2);
        tv = findViewById(R.id.textView2);


        Intent intent = getIntent();
        String name =intent.getStringExtra("name");
        int image= intent.getIntExtra("image",R.drawable.honda);

        imageView.setImageResource(image);
        tv.setText(name);



    }
}
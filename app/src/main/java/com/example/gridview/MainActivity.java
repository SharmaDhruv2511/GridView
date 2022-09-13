package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView gridView;

    String pname[] = {"Lamborghini", "Audi", "Mercedes", "Toyots"};
    Integer pimage[] = {R.drawable.honda, R.drawable.lambo, R.drawable.rr, R.drawable.tata};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.grid_view);
        CustomAdupter customAdupter = new CustomAdupter(this,pimage,pname);
        gridView.setAdapter(customAdupter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 0){
                    Intent intent = new Intent(MainActivity.this,DetaliedActivity.class);
                    intent.putExtra("name",pname[0]);
                    intent.putExtra("image",pimage[0]);
                    startActivity(intent);
                }
                if (i == 1){
                    Intent intent = new Intent(MainActivity.this,DetaliedActivity.class);
                    intent.putExtra("name",pname[1]);
                    intent.putExtra("image",pimage[1]);
                    startActivity(intent);
                }

            }
        });
    }
}
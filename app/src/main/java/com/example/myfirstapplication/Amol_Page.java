package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import static com.example.myfirstapplication.R.id.imageViewId_1;
import static com.example.myfirstapplication.R.id.imageViewId_2;
import static com.example.myfirstapplication.R.id.imageViewId_3;

public class Amol_Page extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageView1,imageView2,imageView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amol__page);

        imageView1 = findViewById(imageViewId_1);
        imageView2 = findViewById(imageViewId_2);
        imageView3 = findViewById(imageViewId_3);

        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (view.getId()==imageViewId_1){

            Intent intent = new Intent(Amol_Page.this,MainActivity.class);
            startActivity(intent);
        }

        if (view.getId()==imageViewId_2){

            Intent intent = new Intent(Amol_Page.this,all_doa_page.class);
            startActivity(intent);
        }

        if (view.getId()==imageViewId_3){

            Intent intent = new Intent(Amol_Page.this,Hadis_Page.class);
            startActivity(intent);
        }
    }
}

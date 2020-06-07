package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import static com.example.myfirstapplication.R.id.imageViewId_1;
import static com.example.myfirstapplication.R.id.imageViewId_2;
import static com.example.myfirstapplication.R.id.imageViewId_4;

public class Hadis_Page extends AppCompatActivity implements View.OnClickListener {


    private ImageView imageView1,imageView2,imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadis__page);


        imageView1 = findViewById(imageViewId_1);
        imageView2 = findViewById(imageViewId_2);
        imageView4 = findViewById(imageViewId_4);


        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view.getId()==imageViewId_1){

            Intent intent = new Intent(Hadis_Page.this,MainActivity.class);
            startActivity(intent);
        }

        if (view.getId()==imageViewId_2){

            Intent intent = new Intent(Hadis_Page.this,all_doa_page.class);
            startActivity(intent);
        }

        if (view.getId()==imageViewId_4){

            Intent intent = new Intent(Hadis_Page.this,Amol_Page.class);
            startActivity(intent);
        }
        
    }
}

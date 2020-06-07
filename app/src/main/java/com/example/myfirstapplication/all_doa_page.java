package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import static com.example.myfirstapplication.R.id.ayatul_kursi_Id;
import static com.example.myfirstapplication.R.id.daily_doaId;
import static com.example.myfirstapplication.R.id.imageViewId_1;
import static com.example.myfirstapplication.R.id.imageViewId_2;
import static com.example.myfirstapplication.R.id.imageViewId_3;
import static com.example.myfirstapplication.R.id.imageViewId_4;
import static com.example.myfirstapplication.R.id.janaja_namajer_doaId;
import static com.example.myfirstapplication.R.id.namajer_doaId;

public class all_doa_page extends AppCompatActivity implements View.OnClickListener {


    private Button Namajer_Doa_Button,Daily_Doa_Button,janaja_namajer_Doa_Button,ayatul_kursi_Button;

    private ImageView imageView1,imageView2,imageView3,imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_doa_page);

        Namajer_Doa_Button = findViewById(namajer_doaId);
        Daily_Doa_Button = findViewById(daily_doaId);
        janaja_namajer_Doa_Button = findViewById(janaja_namajer_doaId);
        ayatul_kursi_Button = findViewById(ayatul_kursi_Id);


        imageView1 = findViewById(imageViewId_1);
        imageView2 = findViewById(imageViewId_2);
        imageView3 = findViewById(imageViewId_3);
        imageView4 = findViewById(imageViewId_4);

        Namajer_Doa_Button.setOnClickListener(this);
        Daily_Doa_Button.setOnClickListener(this);
        janaja_namajer_Doa_Button.setOnClickListener(this);
        ayatul_kursi_Button.setOnClickListener(this);


        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if (view.getId()== namajer_doaId){
            Intent intent = new Intent(all_doa_page.this,Namajer_Doa.class);
            startActivity(intent);
        }
        if (view.getId()== daily_doaId){
            Intent intent = new Intent(all_doa_page.this,Daily_Doa.class);
            startActivity(intent);
        }
        if (view.getId()== janaja_namajer_doaId){
            Intent intent = new Intent(all_doa_page.this,janana_namajer_doaId.class);
            startActivity(intent);
        }
        if (view.getId()== ayatul_kursi_Id){
            Intent intent = new Intent(all_doa_page.this,ayatul_kursi_page.class);
            startActivity(intent);
        }
        if (view.getId()== imageViewId_1){
            Intent intent = new Intent(all_doa_page.this,MainActivity.class);
            startActivity(intent);
        }
        if (view.getId()== imageViewId_3){
            Intent intent = new Intent(all_doa_page.this,Hadis_Page.class);
            startActivity(intent);
        }
        if (view.getId()== imageViewId_4){
            Intent intent = new Intent(all_doa_page.this,Amol_Page.class);
            startActivity(intent);
        }

    }
}

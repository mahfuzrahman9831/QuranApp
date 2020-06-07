package com.example.myfirstapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import static com.example.myfirstapplication.R.id.daily_doaId;
import static com.example.myfirstapplication.R.id.imageViewId_1;
import static com.example.myfirstapplication.R.id.imageViewId_2;
import static com.example.myfirstapplication.R.id.imageViewId_3;
import static com.example.myfirstapplication.R.id.imageViewId_4;
import static com.example.myfirstapplication.R.id.namajer_doaId;
import static com.example.myfirstapplication.R.id.sura_adiyatId;
import static com.example.myfirstapplication.R.id.sura_alakId;
import static com.example.myfirstapplication.R.id.sura_asorId;
import static com.example.myfirstapplication.R.id.sura_baiyinahId;
import static com.example.myfirstapplication.R.id.sura_duhaId;
import static com.example.myfirstapplication.R.id.sura_falakID;
import static com.example.myfirstapplication.R.id.sura_fatihaId;
import static com.example.myfirstapplication.R.id.sura_filId;
import static com.example.myfirstapplication.R.id.sura_humajhahId;
import static com.example.myfirstapplication.R.id.sura_ikhlachId;
import static com.example.myfirstapplication.R.id.sura_inshirahId;
import static com.example.myfirstapplication.R.id.sura_kadorId;
import static com.example.myfirstapplication.R.id.sura_kafirunId;
import static com.example.myfirstapplication.R.id.sura_kariahId;
import static com.example.myfirstapplication.R.id.sura_kausarId;
import static com.example.myfirstapplication.R.id.sura_kuraishId;
import static com.example.myfirstapplication.R.id.sura_lahab_Id;
import static com.example.myfirstapplication.R.id.sura_lailId;
import static com.example.myfirstapplication.R.id.sura_maunId;
import static com.example.myfirstapplication.R.id.sura_nasId;
import static com.example.myfirstapplication.R.id.sura_nasor_Id;
import static com.example.myfirstapplication.R.id.sura_takasurId;
import static com.example.myfirstapplication.R.id.sura_tinId;
import static com.example.myfirstapplication.R.id.sura_zilzalId;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    private ImageView imageView1,imageView2,imageView3,imageView4;
    private Button sura_Fatiha_Button,sura_nas_Button,sura_falak_Button,sura_ikhlach_Button,sura_lahab_Button,sura_nasor_Button,sura_kafirun_Button,
                   sura_kausar_Button,sura_maun_Button,sura_kuraish_Button,sura_fil_Button,sura_humajhah_Button,sura_asor_Button,sura_takasur_Button,
                   sura_kariyah_Button,sura_adiyat_Button,sura_zilzal_Button,sura_baiyinah_Button,sura_kador_Button,sura_alak_Button,sura_tin_Button,
                   sura_inshirah_Button,sura_duha_Button,sura_lail_Button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        imageView1 = findViewById(imageViewId_1);
        imageView2 = findViewById(imageViewId_2);
        imageView3 = findViewById(imageViewId_3);
        imageView4 = findViewById(imageViewId_4);

        sura_Fatiha_Button = findViewById(sura_fatihaId);
        sura_nas_Button = findViewById(sura_nasId);
        sura_falak_Button = findViewById(sura_falakID);
        sura_ikhlach_Button = findViewById(sura_ikhlachId);
        sura_lahab_Button = findViewById(sura_lahab_Id);
        sura_nasor_Button = findViewById(sura_nasor_Id);
        sura_kafirun_Button = findViewById(sura_kafirunId);
        sura_kausar_Button = findViewById(sura_kausarId);
        sura_maun_Button = findViewById(sura_maunId);
        sura_kuraish_Button = findViewById(sura_kuraishId);
        sura_fil_Button = findViewById(sura_filId);
        sura_humajhah_Button = findViewById(sura_humajhahId);
        sura_asor_Button = findViewById(sura_asorId);
        sura_takasur_Button = findViewById(sura_takasurId);
        sura_kariyah_Button = findViewById(sura_kariahId);
        sura_adiyat_Button = findViewById(sura_adiyatId);
        sura_zilzal_Button = findViewById(sura_zilzalId);
        sura_baiyinah_Button = findViewById(sura_baiyinahId);
        sura_kador_Button = findViewById(sura_kadorId);
        sura_alak_Button = findViewById(sura_alakId);
        sura_tin_Button = findViewById(sura_tinId);
        sura_inshirah_Button = findViewById(sura_inshirahId);
        sura_duha_Button = findViewById(sura_duhaId);
        sura_lail_Button = findViewById(sura_lailId);



        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);

        sura_Fatiha_Button.setOnClickListener(this);
        sura_nas_Button.setOnClickListener(this);
        sura_falak_Button.setOnClickListener(this);
        sura_ikhlach_Button.setOnClickListener(this);
        sura_lahab_Button.setOnClickListener(this);
        sura_nasor_Button.setOnClickListener(this);
        sura_kafirun_Button.setOnClickListener(this);
        sura_kausar_Button.setOnClickListener(this);
        sura_maun_Button.setOnClickListener(this);
        sura_kuraish_Button.setOnClickListener(this);
        sura_fil_Button.setOnClickListener(this);
        sura_humajhah_Button.setOnClickListener(this);
        sura_asor_Button.setOnClickListener(this);
        sura_takasur_Button.setOnClickListener(this);
        sura_kariyah_Button.setOnClickListener(this);
        sura_adiyat_Button.setOnClickListener(this);
        sura_zilzal_Button.setOnClickListener(this);
        sura_baiyinah_Button.setOnClickListener(this);
        sura_kador_Button.setOnClickListener(this);
        sura_alak_Button.setOnClickListener(this);
        sura_tin_Button.setOnClickListener(this);
        sura_inshirah_Button.setOnClickListener(this);
        sura_duha_Button.setOnClickListener(this);
        sura_lail_Button.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {

        if (view.getId()== imageViewId_2){
            Intent intent = new Intent(MainActivity.this,all_doa_page.class);
            startActivity(intent);
        }
        if (view.getId()== imageViewId_3){
            Intent intent = new Intent(MainActivity.this,Hadis_Page.class);
            startActivity(intent);
        }
        if (view.getId()== imageViewId_4){
            Intent intent = new Intent(MainActivity.this, Amol_Page.class);
            startActivity(intent);
        }
        if (view.getId()== sura_fatihaId){
            Intent intent = new Intent(MainActivity.this, sura_Fatiha.class);
            startActivity(intent);
        }
        if (view.getId()== sura_nasId){
            Intent intent = new Intent(MainActivity.this, sura_nas.class);
            startActivity(intent);
        }
        if (view.getId()== sura_falakID){
            Intent intent = new Intent(MainActivity.this, sura_falak.class);
            startActivity(intent);
        }
        if (view.getId()== sura_ikhlachId){
            Intent intent = new Intent(MainActivity.this, sura_ikhlach.class);
            startActivity(intent);
        }
        if (view.getId()== sura_lahab_Id){
            Intent intent = new Intent(MainActivity.this, sura_lahab.class);
            startActivity(intent);
        }
        if (view.getId()== sura_nasor_Id){
            Intent intent = new Intent(MainActivity.this, sura_nasor.class);
            startActivity(intent);
        }
        if (view.getId()== sura_kafirunId){
            Intent intent = new Intent(MainActivity.this, sura_kafirun.class);
            startActivity(intent);
        }
        if (view.getId()== sura_kausarId){
            Intent intent = new Intent(MainActivity.this, sura_kausar.class);
            startActivity(intent);
        }
        if (view.getId()== sura_maunId){
            Intent intent = new Intent(MainActivity.this, sura_maun.class);
            startActivity(intent);
        }
        if (view.getId()== sura_kuraishId){
            Intent intent = new Intent(MainActivity.this, sura_kuraish.class);
            startActivity(intent);
        }
        if (view.getId()== sura_filId){
            Intent intent = new Intent(MainActivity.this, sura_fil.class);
            startActivity(intent);
        }
        if (view.getId()== sura_humajhahId){
            Intent intent = new Intent(MainActivity.this, sura_humajhah.class);
            startActivity(intent);
        }
        if (view.getId()== sura_asorId){
            Intent intent = new Intent(MainActivity.this, sura_asor.class);
            startActivity(intent);
        }
        if (view.getId()== sura_takasurId){
            Intent intent = new Intent(MainActivity.this, sura_takasur.class);
            startActivity(intent);
        }
        if (view.getId()== sura_kariahId){
            Intent intent = new Intent(MainActivity.this, sura_kariyah.class);
            startActivity(intent);
        }
        if (view.getId()== sura_adiyatId){
            Intent intent = new Intent(MainActivity.this,sura_adiyat.class);
            startActivity(intent);
        }
        if (view.getId()== sura_zilzalId){
            Intent intent = new Intent(MainActivity.this,sura_zilzal.class);
            startActivity(intent);
        }
        if (view.getId()== sura_baiyinahId){
            Intent intent = new Intent(MainActivity.this,sura_baiyinah.class);
            startActivity(intent);
        }
        if (view.getId()== sura_kadorId){
            Intent intent = new Intent(MainActivity.this,sura_kador.class);
            startActivity(intent);
        }
        if (view.getId()== sura_alakId){
            Intent intent = new Intent(MainActivity.this,sura_alak.class);
            startActivity(intent);
        }
        if (view.getId()== sura_tinId){
            Intent intent = new Intent(MainActivity.this,sura_tin.class);
            startActivity(intent);
        }
        if (view.getId()== sura_inshirahId){
            Intent intent = new Intent(MainActivity.this,sura_inshirah.class);
            startActivity(intent);
        }
        if (view.getId()== sura_duhaId){
            Intent intent = new Intent(MainActivity.this,sura_duha.class);
            startActivity(intent);
        }
        if (view.getId()== sura_lailId){
            Intent intent = new Intent(MainActivity.this,sura_lail.class);
            startActivity(intent);
        }

    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder alertDialogBuilder;
        alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);

        alertDialogBuilder.setMessage(R.string.AlertDialog_Message);
        alertDialogBuilder.setCancelable(false);

        alertDialogBuilder.setPositiveButton("হ্যাঁ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });

        alertDialogBuilder.setNegativeButton("না", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

    }
}

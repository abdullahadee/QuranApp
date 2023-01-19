package com.example.quran;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        setContentView(R.layout.activity_landscape);

        Button btnParaNumber = findViewById(R.id.btnParaNumber);
        Button btnSurahNumber = findViewById(R.id.btnSurahNumber);
        Button btnQuran = findViewById(R.id.btnQuran);
        Button btnGit = findViewById(R.id.btnGit);

        btnSurahNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent SurahIntent = new Intent(MainActivity.this,Surah.class);
                startActivity(SurahIntent);
            }
        });

        btnParaNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ParahIntent = new Intent(MainActivity.this,Parah.class);
                startActivity(ParahIntent);
            }
        });
        btnQuran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent QuranIntent = new Intent(MainActivity.this, Quran.class);
                startActivity(QuranIntent);
            }
        });
    }
}
package com.example.skore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Skor extends AppCompatActivity{

    int skorA = 0;
    int skorB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skor);

        TextView namaTim_A = findViewById(R.id.txt_Tim_A);
        String nama_A = getIntent().getStringExtra("Nama Tim A");
        namaTim_A.setText(nama_A);

        TextView namaTim_B = findViewById(R.id.txt_Tim_B);
        String nama_B = getIntent().getStringExtra("Nama Tim B");
        namaTim_B.setText(nama_B);

    }

    private void poinTimA(int score_A){
        TextView scoreTimA = (TextView) findViewById(R.id.tv_tim_A);
        scoreTimA.setText("" + score_A);
    }


    public void satu_poin_A(View view) {
        skorA = skorA + 1;
        poinTimA(skorA);

    }

    public void dua_poin_A(View view) {
        skorA = skorA + 2;
        poinTimA(skorA);
    }

    public void tiga_poin_A(View view) {
        skorA = skorA + 3;
        poinTimA(skorA);
    }

    private void poinTimB(int score_B){
        TextView scoreTimB = (TextView) findViewById(R.id.tv_tim_B);
        scoreTimB.setText(String.valueOf(score_B));
    }

    public void satu_poin_B(View view) {
        skorB = skorB + 1;
        poinTimB(skorB);
    }

    public void dua_poin_B(View view) {
        skorB = skorB + 2;
        poinTimB(skorB);
    }

    public void tiga_poin_B(View view) {
        skorB = skorB + 3;
        poinTimB(skorB);
    }

    public void riset_poin_A(View view) {
        skorA = 0;
        poinTimA(0);
    }

    public void riset_poin_B(View view) {
        skorB = 0;
        poinTimB(0);
    }
}


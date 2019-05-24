package com.example.skore;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Btn_Input(View view) {

        EditText InputNamaTimA = findViewById(R.id.edt_Tim_A);
        EditText InputNamaTimB = findViewById(R.id.edt_TIm_B);

        String NamaTimA = InputNamaTimA.getText().toString();
        Log.d(TAG, NamaTimA);

        String NamaTimB = InputNamaTimB.getText().toString();
        Log.d(TAG, NamaTimB);

        if (InputNamaTimA.getText().toString().equals("") || InputNamaTimB.getText().toString().equals("")) {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setMessage("Anda Belim Memasukan Nam Tim").setNegativeButton("Masukan Nama Tim", null).create().show();
        } else {

            Intent intent = new Intent(MainActivity.this, Skor.class);
            intent.putExtra("Nama Tim A", NamaTimA);
            intent.putExtra("Nama Tim B", NamaTimB);
            startActivity(intent);
            InputNamaTimA.setText("");
            InputNamaTimA.requestFocus();
            InputNamaTimB.setText("");
            InputNamaTimB.requestFocus();

        }

    }
}
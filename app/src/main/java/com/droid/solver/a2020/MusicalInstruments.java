package com.droid.solver.a2020;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MusicalInstruments extends AppCompatActivity {
MediaPlayer m1,m2,m3,m4,m5,m6,m7,m8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musical_instruments);
        m1=MediaPlayer.create(MusicalInstruments.this,R.raw.veena);
        m2=MediaPlayer.create(MusicalInstruments.this,R.raw.tabla);
        m3=MediaPlayer.create(MusicalInstruments.this,R.raw.flute);
        m4=MediaPlayer.create(MusicalInstruments.this,R.raw.violin);
        m5=MediaPlayer.create(MusicalInstruments.this,R.raw.harmonium);
        m6=MediaPlayer.create(MusicalInstruments.this,R.raw.tanpura);
        m7=MediaPlayer.create(MusicalInstruments.this,R.raw.sarod);
        m8=MediaPlayer.create(MusicalInstruments.this,R.raw.mridangam);


    }
    public void play1(View v)
    {
         m1.start();
    }
    public void play2(View v)
    {
        m2.start();
    }
    public void play3(View v)
    {
        m3.start();
    }
    public void play4(View v)
    {
        m4.start();
    }
    public void play5(View v)
    {
        m5.start();
    }
    public void play6(View v)
    {
        m6.start();
    }
    public void play7(View v)
    {
        m7.start();
    }
    public void play8(View v)
    {
        m8.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        m1.release();
        m2.release();
        m3.release();
        m4.release();
        m5.release();
        m6.release();
        m7.release();
        m8.release();

    }
}
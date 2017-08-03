package br.araujo.douglas.toastapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import br.araujo.douglas.minhabiblioteca.*;
import br.araujo.douglas.minhabiblioteca.BuildConfig;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chamaLa(View view) {
        if(br.araujo.douglas.toastapp.BuildConfig.REPOST_CRASH){
            CustomToast.showToast(this, "Repost Crash", 1);
        }else{
            CustomToast.showToast(this, "No Repost Crash", 2);
        }

    }
}

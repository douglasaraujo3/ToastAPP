package br.araujo.douglas.toastapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import br.araujo.douglas.minhabiblioteca.*;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chamaLa(View view) {
        CustomToast.showToast(this, "Olá", 1);
    }
}

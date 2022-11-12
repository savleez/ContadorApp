package com.sergio.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Integer contador;
    private TextView txtContador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.txtContador = (TextView) findViewById(R.id.txtContador);
        this.contador = 0;
    }

    public void contadorIncrease(View view) {
        this.contador++;
        contadorUpdateView();
    }

    public void contadorDecrease(View view) {
        this.contador--;
        contadorUpdateView();
    }

    public void contadorReset(View view) {
        this.contador = 0;
        contadorUpdateView();
    }

    public void contadorUpdateView() {
        this.txtContador.setText(this.contador+"");
    }
}
package com.example.maris.labo_contadorgol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView Gol_eqA;
    private TextView Gol_eqB;
    private int contA;
    private int contB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contA = 0;
        contB = 0;
        Gol_eqA = findViewById(R.id.id_eqA_cont);
        Gol_eqB = findViewById(R.id.id_eqB_cont);
    }
    public void puntajeA(View view){
        contA++;
        Gol_eqA.setText(contA+"");
    }
    public void puntajeB(View view){
        contB++;
        Gol_eqB.setText(contB+"");
    }
    public void reset(View view){
        contA = 0;
        contB = 0;
        Gol_eqA.setText(contA+"");
        Gol_eqB.setText(contB+"");
    }
}

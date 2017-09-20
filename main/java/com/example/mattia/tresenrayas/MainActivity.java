package com.example.mattia.tresenrayas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //iniciamos el aray CELDAS

        CELDAS=new int[9];

        CELDAS[0]=R.id.a1;
        CELDAS[1]=R.id.a2;
        CELDAS[2]=R.id.a3;
        CELDAS[3]=R.id.b1;
        CELDAS[4]=R.id.b2;
        CELDAS[5]=R.id.b3;
        CELDAS[6]=R.id.c1;
        CELDAS[7]=R.id.c2;
        CELDAS[8]=R.id.c3;
    }


    private int[] CELDAS;


    public int contador=0;

    public void jugar(View vista){

        ImageView imagen;

        for(int eachCelda:CELDAS) {

            imagen = (ImageView) findViewById((eachCelda));

            imagen.setImageResource(R.drawable.celda);
        }


    }

    public void pulsar(View vista){

    int celda=0;

        for (int i=0;i<9;i++){

            if (CELDAS[i]==vista.getId()){

                celda=i;

                break;
            }
        }

       // Toast.makeText(this, "Has pulsado la celda " + celda, Toast.LENGTH_LONG).show();

        marca(celda);

        contador++;


    }

    public void marca(int numero){



        ImageView imagen;

        imagen=(ImageView)findViewById(CELDAS[numero]);

        if (contador%2==0){
            imagen.setImageResource(R.drawable.aspa);
        }else{
            imagen.setImageResource(R.drawable.circulo);
        }



    }





}

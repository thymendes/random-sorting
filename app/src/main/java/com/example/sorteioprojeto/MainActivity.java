package com.example.sorteioprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumero(View view){

        TextView sortear = (TextView) findViewById(R.id.textViewResultado);
        int numero = new Random().nextInt(11);

        sortear.setText("O número selecionado é: "+ numero);



    }
}

package com.example.guilherme.equa2grau;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Equacao2grau equa = new Equacao2grau();
    private EditText txtA, txtB, txtC;
    private TextView txtResult;                                                                     // var for textFieldResult
    private double numA, numB, numC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtA = (EditText)findViewById(R.id.editTextA);
        txtB = (EditText)findViewById(R.id.editTextB);
        txtC = (EditText)findViewById(R.id.editTextC);
        txtResult = (TextView)findViewById(R.id.textViewResult);

    }

    public void calc(View view){

        numA = Double.parseDouble(String.valueOf(txtA.getText()));
        numB = Double.parseDouble(String.valueOf(txtB.getText()));
        numC = Double.parseDouble(String.valueOf(txtC.getText()));

        equa.setA(numA);
        equa.setB(numB);
        equa.setC(numC);

        if(equa.calcularDelta() < 0){

            txtResult.setText("Não existe Resolução real!!!");

        }else{

            txtResult.setText("\n\tAs raizes da equação são:\nX'= " + equa.calcularX1() +"\nX''= " + equa.calcularX2());

        }

    }
}

package com.example.operapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText edtNum1;
    private EditText edtNum2;
    private Button btnSumar;
    private Button btnRestar;
    private Button btnMultiplicar;
    private Button btnDividir;
    private TextView tvResultado;
    private Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ESTADO", "Creando actividad...");
        Toast.makeText(getBaseContext(),"Método OnCreate",Toast.LENGTH_LONG).show();

        edtNum1 = findViewById(R.id.edt_num1);
        edtNum2 = findViewById(R.id.edt_num2);
        btnSumar = findViewById(R.id.btn_sumar);
        btnRestar = findViewById(R.id.btn_restar);
        btnMultiplicar = findViewById(R.id.btn_multiplicar);
        btnDividir = findViewById(R.id.btn_dividir);
        tvResultado = findViewById(R.id.tv_resultado);
        /*spinner1 = findViewById(R.id.spinner5);

        String [] opciones = {"Sumar", "Restar", "Multiplicar", "Dividir"};
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        spinner1.setAdapter(adapter);*/

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double resultado, num1, num2;
                String lectura;

                lectura = edtNum1.getText().toString();
                num1 = Double.valueOf(lectura);
                lectura = edtNum2.getText().toString();
                num2 = Double.valueOf(lectura);

                resultado = num1 * num2;

                tvResultado.setText("Resultado: "+resultado);
            }
        });

        btnDividir.setOnClickListener(this);
    }

    public void sumar(View elemento){
        double resultado, num1, num2;
        String lectura;

        lectura = edtNum1.getText().toString();
        num1 = Double.valueOf(lectura);
        lectura = edtNum2.getText().toString();
        num2 = Double.valueOf(lectura);

        resultado = num1 + num2;

        tvResultado.setText("Resultado: "+resultado);

        Toast.makeText(this, "Voy a sumar",Toast.LENGTH_LONG).show();
    }

    public void restar(View elemento){
        double resultado, num1, num2;
        String lectura;

        lectura = edtNum1.getText().toString();
        num1 = Double.valueOf(lectura);
        lectura = edtNum2.getText().toString();
        num2 = Double.valueOf(lectura);

        resultado = num1 - num2;

        tvResultado.setText("Resultado: "+resultado);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ESTADO", "Iniciando actividad...");
        Toast.makeText(getBaseContext(),"Método onStart",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ESTADO", "Mostrando elemento de actividad...");
        Toast.makeText(getBaseContext(),"Método onResume",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ESTADO", "Pausando actividad...");
        Toast.makeText(getBaseContext(),"Método onPause",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ESTADO", "Deteniendo actividad...");
        Toast.makeText(getBaseContext(),"Método onStop",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ESTADO", "Terminando actividad...");
        Toast.makeText(getBaseContext(),"Método onDestroy",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        double resultado = 0;
        double num1,num2;
        String lectura;

        lectura = edtNum1.getText().toString();
        num1 = Double.valueOf(lectura);
        lectura = edtNum2.getText().toString();
        num2 = Double.valueOf(lectura);

        if (num2 != 0){
            resultado = num1/num2;
            tvResultado.setText("Resultado: "+resultado);
        }
        else {
            Toast.makeText(this, "No se puede dividir por cero",Toast.LENGTH_LONG).show();
        }


    }
}

package co.edu.unab.operapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editNum1, editNum2;
    private Button buttonRestar, buttonMutiplicar, buttonDividir;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ESTADO","Creando actividad..");
        Toast.makeText(getBaseContext(),"Metodo OnCreate", Toast.LENGTH_LONG).show();

        editNum1 = findViewById(R.id.edit_num1);
        editNum2 = findViewById(R.id.edit_num2);
        textViewResultado = findViewById(R.id.text_resultado);
        buttonMutiplicar = findViewById(R.id.button_multip);
        buttonRestar = findViewById(R.id.button_restar);
        buttonDividir = findViewById(R.id.button_dividir);

        buttonRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Restando", Toast.LENGTH_LONG).show();
                double resultado, num1, num2;
                String lectura;
                lectura = editNum1.getText().toString();
                num1 = Double.valueOf(lectura);
                lectura = editNum2.getText().toString();
                num2 = Double.valueOf(lectura);
                resultado = num1-num2;
                textViewResultado.setText("Resultado: " + resultado);
            }
        });

        buttonMutiplicar.setOnClickListener(this);
        buttonDividir.setOnClickListener(this);

    }

    public void sumar(View view){
        Toast.makeText(getBaseContext(), "Sumando", Toast.LENGTH_LONG).show();
        double resultado, num1, num2;
        String lectura;
        lectura = editNum1.getText().toString();
        num1 = Double.valueOf(lectura);
        lectura = editNum2.getText().toString();
        num2 = Double.valueOf(lectura);
        resultado = num1+num2;
        textViewResultado.setText("Resultado: " + resultado);
    }

    /*public void restar(View view){
        Toast.makeText(getBaseContext(), "Restando", Toast.LENGTH_LONG).show();
        double resultado, num1, num2;
        String lectura;
        lectura = editNum1.getText().toString();
        num1 = Double.valueOf(lectura);
        lectura = editNum2.getText().toString();
        num2 = Double.valueOf(lectura);
        resultado = num1-num2;
        textViewResultado.setText("Resultado: " + resultado);
    }*/

    public void multiplicar (View view){
        Toast.makeText(getBaseContext(), "Sumando", Toast.LENGTH_LONG).show();
        double resultado, num1, num2;
        String lectura;
        lectura = editNum1.getText().toString();
        num1 = Double.valueOf(lectura);
        lectura = editNum2.getText().toString();
        num2 = Double.valueOf(lectura);
        resultado = num1*num2;
        textViewResultado.setText("Resultado: " + resultado);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ESTADO","Iniciando actividad..");
        Toast.makeText(this,"Metodo onStart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ESTADO","Ocultando actividad..");
        Toast.makeText(getApplication(),"Metodo onPause", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ESTADO","Deteniendo actividad..");
        Toast.makeText(getBaseContext(),"Metodo onPause", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ESTADO","Terminando actividad..");
        Toast.makeText(getBaseContext(),"Metodo onDestroy", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ESTADO","Mostrando actividad..");
        Toast.makeText(getBaseContext(),"Metodo onResume", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        /*Toast.makeText(getBaseContext(), "Multiplicando", Toast.LENGTH_LONG).show();
        double resultado, num1, num2;
        String lectura;
        lectura = editNum1.getText().toString();
        num1 = Double.valueOf(lectura);
        lectura = editNum2.getText().toString();
        num2 = Double.valueOf(lectura);
        resultado = num1*num2;
        textViewResultado.setText("Resultado: " + resultado);*/


        double resultado, num1, num2;
        String lectura;
        lectura = editNum1.getText().toString();
        num1 = Double.valueOf(lectura);
        lectura = editNum2.getText().toString();
        num2 = Double.valueOf(lectura);

        switch (v.getId()){
            case R.id.button_multip:
                resultado = num1*num2;
                textViewResultado.setText("Resultado: " + resultado);
                Toast.makeText(getBaseContext(), "Multiplicando", Toast.LENGTH_LONG).show();
                break;
            case R.id.button_dividir:
                if(num2 != 0){
                    resultado = num1/num2;
                    textViewResultado.setText("Resultado: " + resultado);
                    Toast.makeText(getBaseContext(), "Dividiendo", Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(getBaseContext(), "Error: Division por CERO", Toast.LENGTH_LONG).show();
                    textViewResultado.setText("Error: Division por CERO");
                }
                break;
        }

        /*if(num2 != 0){
            resultado = num1/num2;
            textViewResultado.setText("Resultado: " + resultado);
            Toast.makeText(getBaseContext(), "Dividiendo", Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(getBaseContext(), "Error: Division por CERO", Toast.LENGTH_LONG).show();
        }*/


    }
}

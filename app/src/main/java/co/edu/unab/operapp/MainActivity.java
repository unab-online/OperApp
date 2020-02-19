package co.edu.unab.operapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtNum1;
    private EditText edtNum2;
    private Button btnSumar;
    private Button btnRestar;
    private Button btnMulti;
    private Button btnDivi;
    private TextView txvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setTitle(R.string.app_name);

        setContentView(R.layout.activity_main);

        edtNum1 = findViewById(R.id.edt_num1);
        edtNum2 = findViewById(R.id.edt_num2);

        btnSumar = findViewById(R.id.btn_sumar);
        btnRestar = findViewById(R.id.btn_restar);
        btnMulti = findViewById(R.id.btn_multi);
        btnDivi = findViewById(R.id.btn_div);

        txvResultado = findViewById(R.id.txv_resultado);

        btnMulti.setOnClickListener(this);
        btnDivi.setOnClickListener(this);


        edtNum1.setText("0.0");
        edtNum2.setText("0.0");

        Log.d("ESTADO", "Creando actividad...");
        Toast.makeText(getBaseContext(), "Método OnCreate",Toast.LENGTH_LONG).show();

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double resultado, num1, num2;
                String lectura;

                lectura = edtNum1.getText().toString();
                num1 = Double.valueOf(lectura);
                lectura = edtNum2.getText().toString();
                num2 = Double.valueOf(lectura);

                resultado = num1-num2;

                txvResultado.setText("Resultado: "+resultado);

                Toast.makeText(getBaseContext(), "Restando...", Toast.LENGTH_SHORT).show();
            }
        });


    }

    public void sumar(View elemento){

        double resultado, num1, num2;
        String lectura;

        lectura = edtNum1.getText().toString();
        num1 = Double.valueOf(lectura);
        lectura = edtNum2.getText().toString();
        num2 = Double.valueOf(lectura);

        resultado = num1+num2;

        txvResultado.setText("Resultado: "+resultado);

        Toast.makeText(getBaseContext(), "Sumando...", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ESTADO", "Iniciando actividad...");
        Toast.makeText(this, R.string.text_titulo,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ESTADO", "Mostrando elementos de actividad...");
        Toast.makeText(getApplication(), "Método onResume",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ESTADO", "Ocultando actividad...");
        Toast.makeText(getBaseContext(), "Método onPause...",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ESTADO", "Deteniendo actividad...");
        Toast.makeText(getBaseContext(), "Método onStop..",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ESTADO", "Terminando actividad...");
        Toast.makeText(getBaseContext(), "Método onDestroy..",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        double resultado, num1, num2;
        String lectura;

        lectura = edtNum1.getText().toString();
        num1 = Double.valueOf(lectura);
        lectura = edtNum2.getText().toString();
        num2 = Double.valueOf(lectura);

        switch (v.getId()){
            case R.id.btn_multi:
                resultado = num1*num2;

                txvResultado.setText("Resultado: "+resultado);

                Toast.makeText(getBaseContext(), "Multiplicando...", Toast.LENGTH_LONG).show();
                break;
            case  R.id.btn_div:
                if(num2!=0){
                    resultado = num1/num2;
                    txvResultado.setText("Resultado: "+resultado);
                    Toast.makeText(getBaseContext(), "Dividiendo...", Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(getBaseContext(), "Error: No se puede dividir por 0 :(", Toast.LENGTH_LONG).show();
                }
                break;

        }




    }


}

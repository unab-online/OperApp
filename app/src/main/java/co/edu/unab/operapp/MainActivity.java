package co.edu.unab.operapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.app.ProgressDialog.show;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtNum1, edtNum2;
    private Button btnSumar, btnRestar, btnMultiplicar, btnDividir;
    private TextView txtView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNum1 = findViewById(R.id.edt_num1);
        edtNum2 = findViewById(R.id.edt_num2);
        btnSumar = findViewById(R.id.btn_sumar);
        btnRestar = findViewById(R.id.btn_restar);
        btnMultiplicar = findViewById(R.id.btn_multiplicar);
        btnDividir = findViewById(R.id.btn_dividir);
        txtView2 = findViewById(R.id.textView2);

        btnRestar.setOnClickListener(this);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double resultado, num1, num2;
                String lectura;

                lectura = edtNum1.getText().toString();
                num1 = Double.valueOf(lectura);
                lectura = edtNum2.getText().toString();
                num2 = Double.valueOf(lectura);

                resultado = num1 + num2;
                txtView2.setText("Resultado = "+resultado);
            }
        });

        Log.d("Estado", "Creando antividad...");
        Toast.makeText(getBaseContext(), "Método OnCreate", Toast.LENGTH_LONG).show();
    }



    public void multi(View vista){

        double resultado, num1, num2;
        String lectura;

        lectura = edtNum1.getText().toString();
        num1 = Double.valueOf(lectura);
        lectura = edtNum2.getText().toString();
        num2 = Double.valueOf(lectura);

        resultado = num1 * num2;
        txtView2.setText("Resultado = "+resultado);
    }

    public void dividir(View vista){

        double resultado, num1, num2;
        String lectura;

        lectura = edtNum1.getText().toString();
        num1 = Double.valueOf(lectura);
        lectura = edtNum2.getText().toString();
        num2 = Double.valueOf(lectura);
        if(num2!=0){
            resultado = num1 / num2;
            txtView2.setText("Resultado = "+resultado);
        }else{
            Toast.makeText(getBaseContext(),"Really?",Toast.LENGTH_LONG).show();
        }

    }
    @Override
    protected void onStart() {
        Log.d("Estado", "Iniciando actividad...");
        Toast.makeText(getBaseContext(), "Método OnStart", Toast.LENGTH_LONG).show();
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Log.d("Estado", "Reiniciando actividad...");
        Toast.makeText(getBaseContext(), "Método OnRestart", Toast.LENGTH_LONG).show();
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.d("Estado", "Resumiendo actividad...");
        Toast.makeText(getBaseContext(), "Método OnResume", Toast.LENGTH_LONG).show();
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("Estado", "Ocultando actividad...");
        Toast.makeText(getBaseContext(), "Método OnPause", Toast.LENGTH_LONG).show();
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("Estado", "Deteniendo actividad...");
        Toast.makeText(getBaseContext(), "Método OnStop", Toast.LENGTH_LONG).show();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("Estado", "Destruyendo actividad...");
        Toast.makeText(getBaseContext(), "Método OnDestroy", Toast.LENGTH_LONG).show();
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {

        double resultado, num1, num2;
        String lectura;

        lectura = edtNum1.getText().toString();
        num1 = Double.valueOf(lectura);
        lectura = edtNum2.getText().toString();
        num2 = Double.valueOf(lectura);

        resultado = num1 - num2;
        txtView2.setText("Resultado = "+resultado);
    }
}

package co.edu.unab.operapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtNum1,edtNum2;
    private Button btnSumar,btnRestar,btnMultiplicar,btnDividir;
    private TextView txtResultado;


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
        txtResultado = findViewById(R.id.txt_resultado);

        btnMultiplicar.setOnClickListener(this);
        btnDividir.setOnClickListener(this);

        edtNum1.setText("0.0");
        edtNum2.setText("0.0");

        Log.d( "ESTADO", "Creando actividad...");
        Toast.makeText(getBaseContext(),"Método OnCreate",Toast.LENGTH_LONG).show();

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double resultado,num1,num2;
                String lectura;
                lectura = edtNum1.getText().toString();
                num1 = Double.valueOf(lectura);
                lectura = edtNum2.getText().toString();
                num2 = Double.valueOf(lectura);
                resultado = num1-num2;

                txtResultado.setText("Resultado: " + resultado);
            }
        });




    }

    public void sumar(View vista)
    {

        Toast.makeText(getBaseContext(), "Voy a sumar...", Toast.LENGTH_LONG).show();

        double resultado,num1,num2;
        String lectura;
        lectura = edtNum1.getText().toString();
        num1 = Double.valueOf(lectura);
        lectura = edtNum2.getText().toString();
        num2 = Double.valueOf(lectura);

        resultado = num1 + num2;

        txtResultado.setText("Resultado: " + resultado);


    }




    @Override
    protected void onStart() {
        super.onStart();
        Log.d( "ESTADO", "Iniciando actividad...");
        Toast.makeText(this,R.string.text_titulo,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d( "ESTADO", "Mostrando elementos de la actividad...");
        Toast.makeText(getApplication(),"Método OnResume",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d( "ESTADO", "Ocultando actividad...");
        Toast.makeText(getBaseContext(),"Método OnPause",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d( "ESTADO", "Deteniendo actividad...");
        Toast.makeText(getBaseContext(),"Método OnStop",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d( "ESTADO", "Terminando actividad...");
        Toast.makeText(getBaseContext(),"Método OnDestroy",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        double resultado,num1,num2;
        String lectura;
        lectura = edtNum1.getText().toString();
        num1 = Double.valueOf(lectura);
        lectura = edtNum2.getText().toString();
        num2 = Double.valueOf(lectura);
        resultado = 0;

        switch (v.getId()){

            case R.id.btn_multiplicar:
                resultado = num1*num2;
                break;
            case R.id.btn_dividir:
                if(num2!=0)
                {
                    resultado = num1/num2;
                }
                else
                {
                    Toast.makeText(getApplication(),"No se puede dividir entre 0",Toast.LENGTH_LONG).show();
                }

                break;

        }




        txtResultado.setText("Resultado: " + resultado);
    }
}

package co.edu.unab.operapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText txtNum1;
    private EditText txtNum2;
    private TextView txtResultado;
    private Button btnSumar;
    private Button btnRestar;
    private Button btnMultiplicar;
    private Button btnDividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum1 = findViewById(R.id.txt_num1);
        txtNum2 = findViewById(R.id.txt_num2);
        txtResultado = findViewById(R.id.txt_resultado);
        btnSumar = findViewById(R.id.btn_sum);
        btnRestar = findViewById(R.id.btn_res);
        btnMultiplicar = findViewById(R.id.btn_mul);
        btnDividir = findViewById(R.id.btn_div);

        //METODO INTERFAZ
        btnMultiplicar.setOnClickListener(this);
        btnDividir.setOnClickListener(this);

        //METODO LISTENER
        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double resultado = Double.parseDouble(txtNum1.getText().toString())-Double.parseDouble(txtNum2.getText().toString());
                txtResultado.setText(Double.toString(resultado));
            }
        });

        Log.d("ESTADO", "Creando actividad...");
        Toast.makeText(this,"Método OnCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ESTADO", "Empezando Actividad...");
        Toast.makeText(this,"Método OnStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ESTADO", "Mostrando elementos de Actividad...");
        Toast.makeText(this,"Método OnResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ESTADO", "Pausando Actividad...");
        Toast.makeText(this,"Método OnPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ESTADO", "Deteniendo Actividad...");
        Toast.makeText(this,"Método OnStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ESTADO", "Terminando Actividad...");
        Toast.makeText(this,"Método OnDestroy", Toast.LENGTH_SHORT).show();
    }

    //METODO ONCLICK
    public void sumar(View vista){
        double resultado = Double.parseDouble(txtNum1.getText().toString())+Double.parseDouble(txtNum2.getText().toString());
        txtResultado.setText(Double.toString(resultado));
    }

    @Override
    public void onClick(View v) {
        double resultado;

        switch (v.getId()){
            case R.id.btn_mul:
                resultado = Double.parseDouble(txtNum1.getText().toString())*Double.parseDouble(txtNum2.getText().toString());
                txtResultado.setText(Double.toString(resultado));
                break;
            case R.id.btn_div:
                if(Double.parseDouble(txtNum2.getText().toString()) != 0){
                    resultado = Double.parseDouble(txtNum1.getText().toString())/Double.parseDouble(txtNum2.getText().toString());
                    txtResultado.setText(Double.toString(resultado));
                }else{
                    Toast.makeText(getBaseContext(),"Resultado Indeterminado en divisiones por 0", Toast.LENGTH_LONG).show();
                    txtResultado.setText("");
                }
                break;
        }
    }
}

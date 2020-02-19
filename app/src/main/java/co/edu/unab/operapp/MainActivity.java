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

    private EditText inputNum1;
    private EditText inputNum2;
    private Button btnSuma;
    private Button btnResta;
    private Button btnMult;
    private Button btnDivi;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // R > Hace referencia a la carpeta resource
        Log.d("ESTADO","Creando actividad...");
        Toast.makeText(this,"Método onCreate",Toast.LENGTH_LONG).show();

        inputNum1 = findViewById(R.id.input_num1); // Se asocia el elemento EditText con su respectivo elemento gráfico.
        inputNum2 = findViewById(R.id.input_num2);

        btnSuma = findViewById(R.id.btn_suma);
        btnResta = findViewById(R.id.btn_resta);
        btnMult = findViewById(R.id.btn_mult);
        btnDivi = findViewById(R.id.btn_divi);

        txtResult = findViewById(R.id.txt_result);



        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double resultado,num1,num2;
                resultado = Double.valueOf(inputNum1.getText().toString()) - Double.valueOf(inputNum2.getText().toString());
                txtResult.setText("Resultado: "+resultado);
            }
        });

        btnMult.setOnClickListener(this);
        btnDivi.setOnClickListener(this);
    }

    /**
     * Bundle: El que guarda o maneja los estados de la actividad.
     */

    @Override
    public void onClick(View v) {
        double resultado,num1,num2;

        switch (v.getId()){

            case R.id.btn_mult:
                 resultado = Double.valueOf(inputNum1.getText().toString()) * Double.valueOf(inputNum2.getText().toString());
                 txtResult.setText("Resultado: "+resultado);
                 break;
            case R.id.btn_divi:
                if (Double.valueOf(inputNum2.getText().toString()) != 0){
                    resultado = Double.valueOf(inputNum1.getText().toString()) / Double.valueOf(inputNum2.getText().toString());
                    txtResult.setText("Resultado: "+resultado);}
                else{
                    Toast.makeText(getApplication(),"No se permite la división por 0",Toast.LENGTH_LONG).show();
                }
                break;
        }

    }

    public void sumar(View elemento){

        double resultado,num1,num2;
        resultado = Double.valueOf(inputNum1.getText().toString()) + Double.valueOf(inputNum2.getText().toString());
        txtResult.setText("Resultado: "+resultado);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ESTADO","Iniciando actividad...");
        Toast.makeText(this,R.string.text_titulo,Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ESTADO","Mostrando elementos de actividad...");
        Toast.makeText(getApplication(),"Método onResume",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ESTADO","Ocultando actividad...");
        Toast.makeText(this,"Método onPause",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ESTADO","Deteniendo actividad...");
        Toast.makeText(this,"Método onStop",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ESTADO","Terminando actividad...");
        Toast.makeText(this,"Método onDestroy",Toast.LENGTH_SHORT).show();
    }


}

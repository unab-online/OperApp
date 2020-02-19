package co.edu.unab.OperApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

//  AppCompatActivity: indica que está manejando retrocompatibilidad

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editNum1, editNum2;
    private Button btnSumar;
    private Button btnRestar;
    private Button btnMultiplicar;
    private Button btnDividir;
    private TextView txtresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // R (apunta a la carpeta resourse "res");

        editNum1 = findViewById(R.id.edt_num1);
        editNum2 = findViewById(R.id.edt_num2);
        btnSumar = findViewById(R.id.btn_sumar);
        btnRestar = findViewById(R.id.btn_restar);
        btnMultiplicar = findViewById(R.id.btn_multiplicar);
        btnDividir = findViewById(R.id.btn_dividir);
        txtresultado = findViewById(R.id.txt_resultado);

        btnMultiplicar.setOnClickListener(this);
        btnDividir.setOnClickListener(this);

        editNum1.setText("2");
        editNum2.setText("5");

        // Hay tres formas para llamar la función onClick
        // A través del atributo onClick
        // Agregando listenerOnclick
        //Implementar interfaz Onclick OperApp

        Log.d("ESTADO", "Creando actividad...");
        Toast.makeText(getBaseContext(),R.string.oncreate, Toast.LENGTH_LONG).show();

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double resultado, num1, num2;
                String leer;
                leer = editNum1.getText().toString();
                num1 = Double.valueOf(leer);

                leer = editNum2.getText().toString();
                num2 = Double.parseDouble(leer);

                resultado = num1-num2;

                txtresultado.setText("Resultado: "+ resultado);

                Toast.makeText(getApplication(), "Restando...",Toast.LENGTH_SHORT).show();
            }
        });
    }



    public void sumar(View vista) {
        Toast.makeText(getApplication(), "Sumando...",Toast.LENGTH_SHORT).show();
        double resultado, num1, num2;
        String leer;
        leer = editNum1.getText().toString();
        num1 = Double.valueOf(leer);

        leer = editNum2.getText().toString();
        num2 = Double.parseDouble(leer);

        resultado = num1 + num2;

        txtresultado.setText("Resultado: "+ resultado);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ESTADO","Iniciando actividad...");
        Toast.makeText(getApplicationContext(),"Método onStart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ESTADO","Mostrando actividad...");
        Toast.makeText(this,"Método onResume", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ESTADO","Pausando actividad...");
        Toast.makeText(getApplication(),"Método onPause", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ESTADO","Parando actividad...");
        Toast.makeText(getBaseContext(),"Método onStop", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ESTADO","Terminando actividad...");
        Toast.makeText(getBaseContext(),"Método onDestoy", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {

        double resultado=0, num1, num2;
        String leer;

        leer = editNum1.getText().toString();
        num1 = Double.valueOf(leer);
        leer = editNum2.getText().toString();
        num2 = Double.valueOf(leer);

        switch (v.getId()){
            case R.id.btn_multiplicar:
                resultado = num1*num2;
                txtresultado.setText("Resultado: "+ resultado);
                Toast.makeText(getApplication(), "Multiplicando...",Toast.LENGTH_LONG).show();
                break;

            case R.id.btn_dividir:
                if (num2!=0){
                    resultado = num1/num2;txtresultado.setText("Resultado: "+ resultado);
                    Toast.makeText(getApplication(), "Dividiendo",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplication(), "No se puede dividir por Cero",Toast.LENGTH_LONG).show();
                }
                break;


        }



    }
}

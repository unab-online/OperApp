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

    private EditText edtNum1;
    private EditText edtNum2;
    private Button btnSumar;
    private Button btnRestar;
    private Button btnMulti;
    private Button btnDivi;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNum1 = findViewById(R.id.edt);
        edtNum2 = findViewById(R.id.edit_num2);

//edtNum1.setText("0.0");

        btnSumar = findViewById(R.id.btn_suma);
        btnRestar = findViewById(R.id.btn_resta);
        btnMulti = findViewById(R.id.btn_multi);
        btnDivi = findViewById(R.id.btn_div);

        txtResultado = findViewById(R.id.txtResultado);


        Log.d("ESTADO", "Creando actividad...");
        Toast.makeText(getBaseContext(), "Método OnCreate", Toast.LENGTH_LONG).show();


//Resta
        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double resultado, num1, num2;
                String lectura;

                lectura = edtNum1.getText().toString();
                num1 = Double.valueOf(lectura);
                lectura = edtNum2.getText().toString();
                num2 = Double.valueOf(lectura);

                resultado = num1 - num2;

                txtResultado.setText("Resultado: " + resultado);
            }
        });

//Multiplica
        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double resultado, num1, num2;
                String lectura;

                lectura = edtNum1.getText().toString();
                num1 = Double.valueOf(lectura);
                lectura = edtNum2.getText().toString();
                num2 = Double.valueOf(lectura);

                resultado = num1 * num2;

                txtResultado.setText("Resultado: " + resultado);
            }
        });

    }



    // sumar

    @Override
    public void onClick(View v) {
        double resultado, num1, num2;
        String lectura;

        lectura = edtNum1.getText().toString();
        num1 = Double.valueOf(lectura);
        lectura = edtNum2.getText().toString();
        num2 = Double.valueOf(lectura);

        resultado = num1 + num2;

        txtResultado.setText("Resultado: " + resultado);

    }
}

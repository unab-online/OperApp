package co.edu.unab.operapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnSumar;
    private Button btnRestar;
    private Button btnMultiplicar;
    private Button btnDividir;
    private Button BtnOtroLayout;
    private TextView textViewResultado;
    private EditText editNum1;
    private EditText editNum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("msj", "lol"); //imprimir en consola "logat"
        Toast.makeText(getBaseContext(),"cv", Toast.LENGTH_LONG).show(); //mensaje de emergencia en el cel

        editNum1 = findViewById(R.id.editText_num1);
        editNum2 = findViewById(R.id.editText_num2);
        btnSumar = findViewById(R.id.btn_sumar);
        btnRestar = findViewById(R.id.btn_restar);
        btnMultiplicar = findViewById(R.id.btn_multiplicar);
        btnDividir = findViewById(R.id.btn_dividir);

        textViewResultado = findViewById(R.id.textView_resultado);

        btnSumar.setOnClickListener(this);
        btnSumar.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                Toast.makeText(getApplicationContext(), "vamos a sumar",Toast.LENGTH_LONG).show();
                double resultado,num1, num2;
                String lectura;

                lectura = editNum1.getText().toString();
                num1 = Double.valueOf(lectura);

                lectura = editNum2.getText().toString();
                num2 = Double.valueOf(lectura);

                resultado = num1+num2;
                textViewResultado.setText("Resultado: "+resultado);
            }
        });

        btnRestar.setOnClickListener(this);
        btnRestar.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                Toast.makeText(getApplicationContext(), "vamos a restar",Toast.LENGTH_LONG).show();
                double resultado,num1, num2;
                String lectura;

                lectura = editNum1.getText().toString();
                num1 = Double.valueOf(lectura);

                lectura = editNum2.getText().toString();
                num2 = Double.valueOf(lectura);

                resultado = num1-num2;
                textViewResultado.setText("Resultado: "+resultado);
            }
        });

        btnMultiplicar.setOnClickListener(this);
        btnMultiplicar.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                Toast.makeText(getApplicationContext(), "vamos a multiplicar",Toast.LENGTH_LONG).show();
                double resultado,num1, num2;
                String lectura;

                lectura = editNum1.getText().toString();
                num1 = Double.valueOf(lectura);

                lectura = editNum2.getText().toString();
                num2 = Double.valueOf(lectura);

                resultado = num1*num2;
                textViewResultado.setText("Resultado: "+resultado);
            }
        });

        btnDividir.setOnClickListener(this);
        btnDividir.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                Toast.makeText(getApplicationContext(), "vamos a multiplicar",Toast.LENGTH_LONG).show();
                double resultado,num1, num2;
                String lectura;

                lectura = editNum1.getText().toString();
                num1 = Double.valueOf(lectura);

                lectura = editNum2.getText().toString();
                num2 = Double.valueOf(lectura);

                resultado = num1/num2;
                textViewResultado.setText("Resultado: "+resultado);
            }
        });

        BtnOtroLayout = findViewById(R.id.BtnOtroLayout);
        BtnOtroLayout.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                BtnOtroLayout.setOnClickListener(new View.OnClickListener(){
                    public void onClick (View v){
                        Intent i = new Intent(MainActivity.this,SecondActivity.class);
                        startActivity(i);
                    }
                });
            }
        });

    }

//ciclo de vida de la actividad, para saber como voy a controlar los diferentes eventos ↓↓↓↓↓↓↓
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ESTADO", "Iniciando Actividad"); //imprimir en consola "logat"
        Toast.makeText(getBaseContext(),"onStar: Iniciando", Toast.LENGTH_LONG).show(); //mensaje de emergencia en el cel
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ESTADO", "Mostrando Actividad"); //imprimir en consola "logat"
        Toast.makeText(getBaseContext(),"onResume: Mostrando", Toast.LENGTH_LONG).show(); //mensaje de emergencia en el cel
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ESTADO", "Reiniciando Actividad"); //imprimir en consola "logat"
        Toast.makeText(getBaseContext(),"onRestart: Reinicianando", Toast.LENGTH_LONG).show(); //mensaje de emergencia en el cel
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d( "ESTADO", "Pausando Actividad");
        Toast.makeText(getBaseContext(),  "onPause: Pausando", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d( "ESTADO", "terminando Actividad");
        Toast.makeText(getBaseContext(),  "onStop: terminando", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ESTADO", "Destruyendo Actividad"); //imprimir en consola "logat"
        Toast.makeText(getBaseContext(),"onDestroy: Destruyendo", Toast.LENGTH_LONG).show(); //mensaje de emergencia en el cel
    }

    @Override
    public void onClick(View v) {

    }
//ciclo de vida de la actividad, para saber como voy a controlar los diferentes eventos ↑↑↑↑↑↑↑

}

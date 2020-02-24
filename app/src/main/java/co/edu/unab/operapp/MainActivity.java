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

    private EditText editText_num1;
    private EditText editText_num2;
    private Button button_Sumar;
    private Button button_Restar;
    private Button button_Multiplicar;//crear variable
    private Button button_Dividir;
    private TextView textView_Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText_num1 = findViewById(R.id.editText_Num1);//definir el id
        editText_num2 = findViewById(R.id.editText_Num2);

        button_Sumar = findViewById(R.id.button_Sumar);
        button_Restar = findViewById(R.id.button_Restar);
        button_Multiplicar = findViewById(R.id.button_Multiplicar);
        button_Dividir = findViewById(R.id.button_Dividir);

        textView_Resultado = findViewById(R.id.textView_Resultado);

        button_Multiplicar.setOnClickListener(this);

        Log.d( "ESTADO", "Creando Actividad");
        Toast.makeText(getBaseContext(),  "Metodo onCreate", Toast.LENGTH_LONG).show();

        button_Restar.setOnClickListener(new View.OnClickListener() {//agregando listener onclick
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "voy a restar",Toast.LENGTH_LONG).show();
                double resultado,num1, num2;
                String lectura;

                lectura = editText_num1.getText().toString();
                num1 = Double.valueOf(lectura);

                lectura = editText_num2.getText().toString();
                num2 = Double.valueOf(lectura);

                resultado = num1-num2;
                textView_Resultado.setText("Resultado: "+resultado);
            }
        });

        button_Multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "voy a sumar",Toast.LENGTH_LONG).show();
                double resultado,num1, num2;
                String lectura;

                lectura = editText_num1.getText().toString();
                num1 = Double.valueOf(lectura);

                lectura = editText_num2.getText().toString();
                num2 = Double.valueOf(lectura);

                resultado = num1*num2;
                textView_Resultado.setText("Resultado: "+resultado);
            }
        });

    }

    public void sumar(View vista){
        Toast.makeText(getApplicationContext(), "voy a sumar",Toast.LENGTH_LONG).show();
        double resultado,num1, num2;
        String lectura;

        lectura = editText_num1.getText().toString();
        num1 = Double.valueOf(lectura);

        lectura = editText_num2.getText().toString();
        num2 = Double.valueOf(lectura);

        resultado = num1+num2;
        textView_Resultado.setText("Resultado: "+resultado);

    }//atributo onclick
    public void dividir(View vista){
        double resultado,num1, num2;
        String lectura;

        lectura = editText_num1.getText().toString();
        num1 = Double.valueOf(lectura);

        lectura = editText_num2.getText().toString();
        num2 = Double.valueOf(lectura);

        resultado = num1/num2;
        if(num2==0){
            Toast.makeText(getApplicationContext(), "Digite un numero distinto a 0",Toast.LENGTH_LONG).show();
            textView_Resultado.setText("Resultado: ");
        }else{
            textView_Resultado.setText("Resultado: "+resultado);
        }

        Toast.makeText(getApplicationContext(), "voy a dividir",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d( "ESTADO", "Iniciando Actividad");
        Toast.makeText(getBaseContext(),  "Metodo onStart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d( "ESTADO", "Mostrando Actividad");
        Toast.makeText(getBaseContext(),  "Metodo onResume", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d( "ESTADO", "Pausando Actividad");
        Toast.makeText(getBaseContext(),  "Metodo onPause", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d( "ESTADO", "terminando Actividad");
        Toast.makeText(getBaseContext(),  "Metodo onStop", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d( "ESTADO", "Destruyendo Actividad");
        Toast.makeText(getBaseContext(),  "Metodo onDestroy", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "voy a multiplicar",Toast.LENGTH_LONG).show();
        double resultado,num1, num2;
        String lectura;

        lectura = editText_num1.getText().toString();
        num1 = Double.valueOf(lectura);

        lectura = editText_num2.getText().toString();
        num2 = Double.valueOf(lectura);

        resultado = num1*num2;
        textView_Resultado.setText("Resultado: "+resultado);
    }
}

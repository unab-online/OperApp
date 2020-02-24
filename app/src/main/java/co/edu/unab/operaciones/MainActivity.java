package co.edu.unab.operaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText editn1;
    private  EditText editn2;
    private Button btnsumar;
    private Button btnrestar;
    private Button btnmultiplicar;
    private Button btndividir;
    private TextView resultadomostrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editn1 = findViewById(R.id.editText);
        editn2 = findViewById(R.id.editText2);

        btnsumar = findViewById(R.id.buttonsumar);
        btnrestar = findViewById(R.id.buttonrestar);
        btnmultiplicar = findViewById(R.id.buttonmultiplicar);
        btndividir = findViewById(R.id.buttondividir);

        resultadomostrar = findViewById(R.id.resultadomostrar);

        editn1.setText("");
        editn2.setText("");

        /*btnsumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/
        btnmultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double resultado, num1, num2;
                String lectura;
                lectura = editn1.getText().toString();
                num1 = Double.parseDouble(lectura);
                lectura = editn2.getText().toString();
                num2 = Double.parseDouble(lectura);

                resultado = num1 * num2;

                resultadomostrar.setText(""+resultado+"");
                Toast.makeText(getBaseContext(),"metodo multiplicar",Toast.LENGTH_LONG).show();
            }
        });

        btndividir.setOnClickListener(this);
        Log.d("estado","creando actividad...");
        Toast.makeText(getBaseContext(),"metodo oncreate",Toast.LENGTH_LONG).show();
    }

    public void sumar(View elemento){

        double resultado, num1, num2;
        String lectura;
        lectura = editn1.getText().toString();
        num1 = Double.parseDouble(lectura);
        lectura = editn2.getText().toString();
        num2 = Double.parseDouble(lectura);

        resultado = num1 + num2;

        resultadomostrar.setText(""+resultado+"");
        Toast.makeText(getBaseContext(),"metodo sumar",Toast.LENGTH_LONG).show();
    }
    public void restar(View elemento){

        double resultado, num1, num2;
        String lectura;
        lectura = editn1.getText().toString();
        num1 = Double.parseDouble(lectura);
        lectura = editn2.getText().toString();
        num2 = Double.parseDouble(lectura);

        resultado = num1 - num2;

        resultadomostrar.setText(""+resultado+"");
        Toast.makeText(getBaseContext(),"metodo restar",Toast.LENGTH_LONG).show();
    }
    /*public void multiplicar(View elemento){

        double resultado, num1, num2;
        String lectura;
        lectura = editn1.getText().toString();
        num1 = Double.parseDouble(lectura);
        lectura = editn2.getText().toString();
        num2 = Double.parseDouble(lectura);

        resultado = num1 * num2;

        resultadomostrar.setText(""+resultado+"");
        Toast.makeText(getBaseContext(),"metodo multiplicar",Toast.LENGTH_LONG).show();
    }*/
    /*public void dividir(View elemento){

        double resultado, num1, num2;
        String lectura;
        lectura = editn1.getText().toString();
        num1 = Double.parseDouble(lectura);
        lectura = editn2.getText().toString();
        num2 = Double.parseDouble(lectura);
        if (num2 == 0){
            resultadomostrar.setText("no se puede");
        }else {
            resultado = num1 / num2;
            resultadomostrar.setText(""+resultado+"");
        }

        Toast.makeText(getBaseContext(),"metodo dividir",Toast.LENGTH_LONG).show();
    }*/

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("estado","iniciando actividad...");
        Toast.makeText(getBaseContext(),"metodo onstart",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("estado","resumiendo actividad...");
        Toast.makeText(getBaseContext(),"metodo onresume",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("estado","pausando actividad...");
        Toast.makeText(getBaseContext(),"metodo onpause",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("estado","deteniendo actividad...");
        Toast.makeText(getBaseContext(),"metodo onpause",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("estado","eliminando actividad...");
        Toast.makeText(getBaseContext(),"metodo onpause",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        double resultado, num1, num2;
        String lectura;
        lectura = editn1.getText().toString();
        num1 = Double.parseDouble(lectura);
        lectura = editn2.getText().toString();
        num2 = Double.parseDouble(lectura);
        if (num2 == 0){
            resultadomostrar.setText("no se puede");
        }else {
            resultado = num1 / num2;
            resultadomostrar.setText(""+resultado+"");
        }

        Toast.makeText(getBaseContext(),"metodo dividir",Toast.LENGTH_LONG).show();
    }
}

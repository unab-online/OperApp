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
    private Button btnMultiplicar;
    private Button btnDividir;
    private TextView txvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //layout que va a cargar primero
        //Asociar
        edtNum1=findViewById(R.id.edt_num1);
        edtNum2=findViewById(R.id.edt_num2);
        btnSumar=findViewById(R.id.btn_sumar);
        btnRestar=findViewById(R.id.btn_restar);
        btnMultiplicar=findViewById(R.id.btn_multiplicar);
        btnDividir=findViewById(R.id.btn_dividir);
        txvResultado=findViewById(R.id.txv_Resultado);
        /*
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double resultado, num1, num2;
                String lectura;

                lectura= edtNum1.getText().toString();
                num1=Double.valueOf(lectura);
                lectura= edtNum2.getText().toString();
                num2=Double.valueOf(lectura);


                resultado=num1*num2;
                txvResultado.setText("Resultado: "+resultado);

                Toast.makeText(getBaseContext(),"voy a Multiplicar...",Toast.LENGTH_LONG).show();
            }
        });*/
        btnMultiplicar.setOnClickListener(this);
        btnDividir.setOnClickListener(this);
        edtNum1.setText("0.0");
        edtNum2.setText("0.0");
        Log.d("ESTADO","Creando Actividad -.-"); //mostrando un mensaje
        Toast.makeText(this,"Hola Mundo!!!",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ESTADO","Iniciando Actividad -.-"); //mostrando un mensaje
        Toast.makeText(this,"Hola Mundo!!!",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ESTADO","Ejecutando Actividad -.-"); //mostrando un mensaje
        Toast.makeText(this,"Hola Mundo!!!",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ESTADO","Ocultando Actividad -.-"); //mostrando un mensaje
        Toast.makeText(this,"Hola Mundo!!!",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ESTADO","Deteniendo Actividad -.-"); //mostrando un mensaje
        Toast.makeText(this,"Hola Mundo!!!",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ESTADO","Terminando Actividad -.-"); //mostrando un mensaje
        Toast.makeText(this,"Hola Mundo!!!",Toast.LENGTH_LONG).show();
    }

    //metodos
    public void sumar(View elemento){

        double resultado, num1, num2;
        String lectura;

        lectura= edtNum1.getText().toString();
        num1=Double.valueOf(lectura);
        lectura= edtNum2.getText().toString();
        num2=Double.valueOf(lectura);


        resultado=num1+num2;
        txvResultado.setText("Resultado: "+resultado);

        Toast.makeText(getBaseContext(),"voy a sumar...",Toast.LENGTH_LONG).show();
    }

    public void restar(View elemento){

        double resultado, num1, num2;
        String lectura;

        lectura= edtNum1.getText().toString();
        num1=Double.valueOf(lectura);
        lectura= edtNum2.getText().toString();
        num2=Double.valueOf(lectura);


        resultado=num1-num2;
        txvResultado.setText("Resultado: "+resultado);

        Toast.makeText(getBaseContext(),"voy a restar...",Toast.LENGTH_LONG).show();
    }


    @Override
    public void onClick(View v) {
        double resultado, num1, num2;
        String lectura;

        lectura= edtNum1.getText().toString();
        num1=Double.valueOf(lectura);
        lectura= edtNum2.getText().toString();
        num2=Double.valueOf(lectura);

        switch (v.getId()){
            case R.id.btn_multiplicar:
                resultado=num1*num2;
                txvResultado.setText("Resultado: "+resultado);

                Toast.makeText(getBaseContext(),"voy a Multiplicar...",Toast.LENGTH_LONG).show();
                break;

            case R.id.btn_dividir:
                if(num2!=0){
                    resultado=num1/num2;
                    txvResultado.setText("Resultado: "+resultado);

                    Toast.makeText(getBaseContext(),"voy a Dividir...",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(getBaseContext(),"No se puede dividir por 0...",Toast.LENGTH_LONG).show();
                }
                break;
        }
        /**/




    }
}

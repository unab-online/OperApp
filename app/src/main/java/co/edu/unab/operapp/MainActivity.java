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
    private EditText edtNum1;
    private EditText edtNum2;
    private TextView tv1;
    private Button btnSumar;
    private Button btnRestar;
    private Button btnMult;
    private Button btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ESTADO", "Creando actividad...");
       Toast.makeText(this, "Oncreate", Toast.LENGTH_LONG).show();
        edtNum1= (EditText)findViewById(R.id.edt_num1);
        edtNum2= (EditText)findViewById(R.id.edt_num2);

        btnSumar=findViewById(R.id.btn_sumar);
        btnRestar=findViewById(R.id.btn_restar);
        btnMult= findViewById(R.id.btn_multiplicar);
        tv1=(TextView)findViewById(R.id.tv_resultado);

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero1= Integer.parseInt(edtNum1.getText().toString());
                int numero2=  Integer.parseInt(edtNum2.getText().toString());
                String resultado= String.valueOf(numero1-numero2);
                tv1.setText(resultado);

            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero1= Integer.parseInt(edtNum1.getText().toString());
                int numero2=  Integer.parseInt(edtNum2.getText().toString());
                String resultado= String.valueOf(numero1*numero2);
                tv1.setText(resultado);
            }
        });


    }

    public void sumar(View view){
        double numero1= Double.parseDouble(edtNum1.getText().toString());
        double numero2=  Double.parseDouble(edtNum2.getText().toString());
        String resultado= String.valueOf(numero1+numero2);
        tv1.setText("Resultado: "+resultado);

    }


    public void dividir(View view){

        int numero1= Integer.parseInt(edtNum1.getText().toString());
        int numero2=  Integer.parseInt(edtNum2.getText().toString());

        if(numero2!=0){
            String resultado= String.valueOf(numero1/numero2);
            tv1.setText(resultado);
        }else{

            Toast.makeText(this,"No se puede dividir entre 0",Toast.LENGTH_LONG).show();
        }

    }

    @Override
    protected void onStart() {
        super.onStart();
       // Log.d("ESTADO", "Start actividad...");
       // Toast.makeText(this, "OnStart", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        //Log.d("ESTADO", "Resume actividad...");
        //Toast.makeText(this, "OnResume", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
       // Log.d("ESTADO", "Pause actividad...");
        //Toast.makeText(this, "OnPause", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        //Log.d("ESTADO", "Stop actividad...");
        //Toast.makeText(this, "Onstop", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
       // Log.d("ESTADO", "Destroy actividad...");
        //Toast.makeText(this, "Ondestroy", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {



    }
}

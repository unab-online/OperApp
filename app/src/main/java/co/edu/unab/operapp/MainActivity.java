package co.edu.unab.operapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtNum1, edtNum2;
    private Button btnSuma, btnResta, btnDivide, btnMulti;
    private TextView txtResul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNum1 = findViewById(R.id.edtNum1);
        edtNum2 = findViewById(R.id.edtNum2);

        btnSuma = findViewById(R.id.btnSumar);
        btnResta = findViewById(R.id.btnRestar);
        btnDivide = findViewById(R.id.btnDivi);
        btnMulti = findViewById(R.id.btnMulti);

        txtResul = findViewById(R.id.txtResul);

        Log.d( "ESTADO",  "Creando actividad.....");
        Toast.makeText( getBaseContext(), "Método Oncreate",Toast.LENGTH_LONG).show();
    }



    @Override
    protected void onStart(){
        super.onStart();
        Log.d( "ESTADO",  "Iniciando actividad.....");
        Toast.makeText( getBaseContext(), "Método OnStart",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d( "ESTADO",  "Resumiendo actividad.....");
        Toast.makeText( getBaseContext(), "Método OnResume",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d( "ESTADO",  "Pausando actividad.....");
        Toast.makeText( getBaseContext(), "Método OnPause",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d( "ESTADO",  "Deteniendo actividad.....");
        Toast.makeText( getBaseContext(), "Método OnStop",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d( "ESTADO",  "Terminando actividad.....");
        Toast.makeText( getBaseContext(), "Método onDestroy",Toast.LENGTH_LONG).show();
    }
}

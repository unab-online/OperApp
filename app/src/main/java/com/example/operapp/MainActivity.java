package com.example.operapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtNum1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNum1 = findViewById(R.id.editText);
        edtNum1.setText("0");

        Log.d(tag, "ESTADO", msg, "Creando Actividad...");
        toast.maketext(getBaseContext(),text, "Metodo Create", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(tag, "ESTADO", msg, "Creando Actividad...");
        toast.maketext(getBaseContext(),text, "Metodo Create", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(tag, "ESTADO", msg, "Creando Actividad...");
        toast.maketext(getBaseContext(),text, "Metodo Create", Toast.LENGTH_LONG).show();
    }
}

package co.edu.unab.operapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageButton BtnSum,BtnRes,BtnMulti,BtnDiv;
    private EditText FirstNumber, SecondNumber;
    private TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BtnDiv= findViewById(R.id.Btndiv);
        BtnMulti= findViewById(R.id.BtnMulti);
        BtnRes= findViewById(R.id.Btnresta);
        BtnSum= findViewById(R.id.Btnmas);
        FirstNumber= findViewById(R.id.firstNumber);
        SecondNumber= findViewById(R.id.secondNumber);
        Result= findViewById(R.id.result);


        BtnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float result= Float.parseFloat(FirstNumber.getText().toString())-Float.parseFloat(SecondNumber.getText().toString());
                Result.setText(FirstNumber.getText().toString()+"-"+ SecondNumber.getText().toString()+ " Resultado:  "+String.valueOf(result));
                FirstNumber.setText("");
                SecondNumber.setText("");
            }
        });

        BtnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float result= Float.parseFloat(FirstNumber.getText().toString())+Float.parseFloat(SecondNumber.getText().toString());
                Result.setText(FirstNumber.getText().toString()+"+"+ SecondNumber.getText().toString()+ "  Resultado: "+  String.valueOf(result));
                FirstNumber.setText("");
                SecondNumber.setText("");
            }
        });
        BtnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float result= Float.parseFloat(FirstNumber.getText().toString())/Float.parseFloat(SecondNumber.getText().toString());
                Result.setText(FirstNumber.getText().toString()+"/"+ SecondNumber.getText().toString()+ " Resultado:  "+ String.valueOf(result));
                FirstNumber.setText("");
                SecondNumber.setText("");
            }
        });
        BtnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float result= Float.parseFloat(FirstNumber.getText().toString())*Float.parseFloat(SecondNumber.getText().toString());
                Result.setText(FirstNumber.getText().toString()+"*"+ SecondNumber.getText().toString()+ " Resultado:  "+ String.valueOf(result));
                FirstNumber.setText("");
                SecondNumber.setText("");
            }
        });

    }
}

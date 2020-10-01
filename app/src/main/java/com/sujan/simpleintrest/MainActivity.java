package com.sujan.simpleintrest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    private EditText etPrinciple, etTime, etRate;
    private Button btnCalculate;
    int Principle, Time;
    float result, Rate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        etPrinciple=findViewById(R.id.etPrinciple);
        etRate=findViewById(R.id.etRate);
        etTime=findViewById(R.id.etTime);
        btnCalculate=findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Principle=Integer.parseInt(etPrinciple.getText().toString());
                Rate=Integer.parseInt(etRate.getText().toString());
                Time=Integer.parseInt(etTime.getText().toString());

                result=(Principle*Time*Rate)/100;
                Toast.makeText(MainActivity.this, "Simple Interest is "+ result, Toast.LENGTH_SHORT).show();
            }
        });

    }
}

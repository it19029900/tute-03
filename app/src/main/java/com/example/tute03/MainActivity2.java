package com.example.tute03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    EditText edittxt1, edittxt2;
    String num1,num2;
    TextView txt1;
    int n1,n2,n3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        edittxt1 = findViewById(R.id.editTextNumber1);
        edittxt2 = findViewById(R.id.editTextNumber2);
        txt1 = findViewById(R.id.lbl1);

        Intent intent = getIntent();
        String num1 =  intent.getStringExtra("val01");
        String num2 =  intent.getStringExtra("val02");

        edittxt1.setText(num1);
        edittxt2.setText(num2);

        n1 = Integer.parseInt(num1);
        n2 = Integer.parseInt(num2);
    }


    public void Add(View view) {
        n3 = n1 + n2;
        txt1.setText(n1 + "+" + n2  +"=" + n3);

    }

    public void subtract(View view) {
        n3 = n1-n2;
        txt1.setText(n1 + "-" + n2  +"=" + n3);

    }

    public void multiply(View view) {
        n3 = n1*n2;
        txt1.setText(n1 + "*" + n2  +"=" + n3);
    }

    public void divide(View view) {
        double n3 = n1/n2;
        txt1.setText(n1 + "/" + n2  +"=" + n3);
    }
}
package com.example.tute03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edittxt1, edittxt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittxt1 = findViewById(R.id.editTextNumber1);
        edittxt2 = findViewById(R.id.editTextNumber2);


    }

    public void btnOK(View view) {
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("val01",edittxt1.getText().toString());
        intent.putExtra("val02",edittxt2.getText().toString());

        startActivity(intent);

        Toast.makeText(this, "Sending Massage", Toast.LENGTH_SHORT).show();


    }

}
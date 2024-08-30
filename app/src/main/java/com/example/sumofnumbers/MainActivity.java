package com.example.sumofnumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button b5;
    EditText e5,e6,e7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b5=(Button)findViewById(R.id.button5);

        e5=(EditText)findViewById(R.id.editText5);
        e6=(EditText)findViewById(R.id.editText6);
        e7=(EditText)findViewById(R.id.editText7);

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1=Double.parseDouble(e5.getText().toString());
                double num2=Double.parseDouble(e6.getText().toString());
                double sum=0;
                sum=num1+num2;
                e7.setText(String.valueOf(sum));
            }
        });
    }
}

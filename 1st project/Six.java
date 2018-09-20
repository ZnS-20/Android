package com.example.anas.project1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Six extends AppCompatActivity {
    TextView t1,t2;
    EditText e1,e2;
    Button b1,b2,b3,b4,b5,b6,b7;
    String s1,s2,s3;
    Float f1,f2,f3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);
        b1=(Button)findViewById(R.id.button16);
        b2=(Button)findViewById(R.id.button17);
        b3=(Button)findViewById(R.id.button18);
        b4=(Button)findViewById(R.id.button19);
        b5=(Button)findViewById(R.id.button20);
        b6=(Button)findViewById(R.id.button21);
        b7=(Button)findViewById(R.id.button22);
        e1=(EditText)findViewById(R.id.editText8);
        e2=(EditText)findViewById(R.id.editText9);
        t1=(TextView)findViewById(R.id.textView4);
        t2=(TextView)findViewById(R.id.textView5);
        Toast.makeText(Six.this, "FOR SINE AND COSINE ENTER VALUE IN FIRST BLOCK", Toast.LENGTH_SHORT).show();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                f1=Float.parseFloat(s1);
                f2=Float.parseFloat(s2);
                f3=f1+f2;
                s3=Float.toString(f3);
                t2.setText(s3);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                f1=Float.parseFloat(s1);
                f2=Float.parseFloat(s2);
                f3=f1-f2;
                s3=Float.toString(f3);
                t2.setText(s3);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                f1=Float.parseFloat(s1);
                f2=Float.parseFloat(s2);
                f3=f1*f2;
                s3=Float.toString(f3);
                t2.setText(s3);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                f1=Float.parseFloat(s1);
                f2=Float.parseFloat(s2);
                f3=f1/f2;
                s3=Float.toString(f3);
                t2.setText(s3);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                Double d1=Double.parseDouble(s1);
                Double d2=Math.sin(d1);
                s3=Double.toString(d2);
                t2.setText(s3);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                Double d3=Double.parseDouble(s1);
                Double d4=Math.cos(d3);
                s3=Double.toString(d4);
                t2.setText(s3);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Six.this,Three.class);
                startActivity(i);
                finish();
            }
        });
    }
}

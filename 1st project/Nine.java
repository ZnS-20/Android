package com.example.anas.project1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Nine extends AppCompatActivity {
    TextView t1;
    Button b1,b2;
    RadioButton r1,r2,r3,r4;
    static int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nine);
        t1=(TextView)findViewById(R.id.textView8);
        b1=(Button)findViewById(R.id.button26);
        b2=(Button)findViewById(R.id.button27);
        r1=(RadioButton)findViewById(R.id.radioButton);
        r2=(RadioButton)findViewById(R.id.radioButton2);
        r3=(RadioButton)findViewById(R.id.radioButton3);
        r4=(RadioButton)findViewById(R.id.radioButton4);
        Toast.makeText(Nine.this, "Negative Marking -1 for wrong answer", Toast.LENGTH_SHORT).show();
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Nine.this,Four.class);
                startActivity(i);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score=0;
                if(r3.isChecked())
                {
                    ++score;
                }
                else
                {
                    --score;
                }
                Intent j=new Intent(Nine.this,Ten.class);
                startActivity(j);
                finish();
            }
        });
    }
}

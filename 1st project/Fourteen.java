package com.example.anas.project1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Fourteen extends AppCompatActivity {
    TextView t1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourteen);
        t1=(TextView)findViewById(R.id.textView13);
        b1=(Button)findViewById(R.id.button32);
        t1.setText("The Result is = "+Nine.score);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Fourteen.this,Three.class);
                startActivity(i);
                finish();
            }
        });
    }
}

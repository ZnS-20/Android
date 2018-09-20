package com.example.anas.project1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Five extends AppCompatActivity {
    TextView t1;
    Button b1,b2,b3;
    MediaPlayer mp;
    ImageView i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
        t1=(TextView)findViewById(R.id.textView3);
        b1=(Button)findViewById(R.id.button13);
        b2=(Button)findViewById(R.id.button14);
        b3=(Button)findViewById(R.id.button15);
        i1=(ImageView)findViewById(R.id.imageView3);
        mp=MediaPlayer.create(this,R.raw.a);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.pause();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.stop();
                Intent i=new Intent(Five.this,Three.class);
                startActivity(i);
                finish();
            }
        });
    }
}

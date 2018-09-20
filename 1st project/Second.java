package com.example.anas.project1;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Second extends AppCompatActivity {
    TextView t1;
    EditText e1,e2,e3,e4,e5;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        t1=(TextView)findViewById(R.id.textView2);
        e1=(EditText)findViewById(R.id.editText3);
        e2=(EditText)findViewById(R.id.editText4);
        e3=(EditText)findViewById(R.id.editText5);
        e4=(EditText)findViewById(R.id.editText6);
        e5=(EditText)findViewById(R.id.editText7);
        b1=(Button)findViewById(R.id.button3);
        b2=(Button)findViewById(R.id.button4);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Second.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                String s3=e3.getText().toString();
                String s4=e4.getText().toString();
                String s5=e5.getText().toString();
                if(s1.equals("")||s2.equals("")||s3.equals("")||s4==""||s5=="")
                {
                    Toast.makeText(Second.this, "Empty Field.Please Fill.", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    SQLiteDatabase data=openOrCreateDatabase("Project",MODE_PRIVATE,null);
                    data.execSQL("create table if not exists user(username varchar,password varchar,email varchar,city varchar,phone varchar");
                    String s6="select * from user where name='"+s1+"' and password='"+s2+"'";
                    Cursor cursor=data.rawQuery(s6,null);
                    if(cursor.getCount()>0)
                    {
                        Toast.makeText(Second.this, "User Exists", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        data.execSQL("insert into user values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')");
                        Toast.makeText(Second.this, "Data Updated", Toast.LENGTH_SHORT).show();
                        Intent k=new Intent(Second.this,MainActivity.class);
                        startActivity(k);
                        finish();
                    }
                }
            }
        });
    }
}

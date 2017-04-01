package com.example.administrator.lab3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lab3 extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_lab3);
        Button button4 = (Button) findViewById (R.id.button04);
        button4.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(lab3.this,Listview.class);
                startActivity(intent);
            }
        });
        Button button007 = (Button) findViewById (R.id.button007);
        button007.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(lab3.this,DilogMainActivity.class);
                startActivity(intent);
            }
        });
        Button button009 = (Button) findViewById (R.id.button09);
        button009.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(lab3.this,SActivity.class);
                startActivity(intent);
            }
        });
        Button button010 = (Button) findViewById (R.id.button10);
        button010.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(lab3.this,DefineMenuTutorial.class);
                startActivity(intent);
            }
        });
        Button btn_process_bar = (Button)findViewById(R.id.progress_bar_btn);
        btn_process_bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(lab3.this, pross.class);
                startActivity(intent);
            }
        });

    }
}

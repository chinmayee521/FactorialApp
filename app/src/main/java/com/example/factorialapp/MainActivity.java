package com.example.factorialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button button;
EditText editText;
TextView textView;
String s;
long   n;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        editText=findViewById(R.id.editText);
        textView=findViewById(R.id.textView3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s=editText.getText().toString().trim();
                if(s.length()>2)
                {
                    textView.setText("Limit exceeded");
                }
                else {
                    n = Long.parseLong(s);
                    long i;
                    long f = 1;

                    for (i = 1; i <= n; i++) {
                        f = f * i;
                    }
                    n = f;
                    textView.setText(Long.toString(n));
                }

            }
        });

    }
}

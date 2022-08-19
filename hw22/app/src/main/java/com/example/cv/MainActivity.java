package com.example.cv;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar =  getSupportActionBar();
        actionBar.setTitle("Cv");

        final EditText nam = findViewById(R.id.name);
        final EditText ag = findViewById(R.id.age);
        final EditText jo = findViewById(R.id.job);
        final EditText nm = findViewById(R.id.nb);
        final EditText email = findViewById(R.id.email);

        Button next = findViewById(R.id.button);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String name = nam.getText().toString();
                String age = ag.getText().toString();
                String job = jo.getText().toString();
                String nb = nm.getText().toString();
                String em = email.getText().toString();

                final Intent i = new Intent(MainActivity.this,MainActivity2.class);



                i.putExtra("name",name);
                i.putExtra("age",age);
                i.putExtra("job",job);
                i.putExtra("number",nb);
                i.putExtra("email",em);
               startActivity(i);


            }
        });



    }
}
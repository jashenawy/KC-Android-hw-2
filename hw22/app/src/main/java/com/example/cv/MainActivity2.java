package com.example.cv;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.time.Instant;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Your Cv");


        Intent i = getIntent();
        String name = i.getStringExtra("name");
        String age = i.getStringExtra("age");
        String job = i.getStringExtra("job");
        String nmb = i.getStringExtra("nb");
        String email = i.getStringExtra("em");


        TextView name1 = findViewById(R.id.name1);
        TextView age1 = findViewById(R.id.age1);
        TextView job1 = findViewById(R.id.job1);
        TextView phone = findViewById(R.id.phone1);
        TextView email1 = findViewById(R.id.email1);

        name1.setText("name:" +name+"");
        age1.setText("age:" +age+"");
        job1.setText("job:" +job+"");
        phone.setText("phone:" +nmb+"");
        email1.setText("email:" +email+"");






    }
}
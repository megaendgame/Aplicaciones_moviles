package com.example.lenovo.splashfirebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    next = findViewById(R.id.btnNext);

    next.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent next = new Intent(MainActivity.this , Registro_activity.class);
            startActivity(next);
        }
    });
    }
}

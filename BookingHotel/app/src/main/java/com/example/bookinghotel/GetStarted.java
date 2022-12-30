package com.example.bookinghotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.bookinghotel.database.DatabaseHandler;
import com.example.bookinghotel.database._6_table;

import java.sql.Date;

public class GetStarted extends AppCompatActivity {
    Button _76, _77;
    DatabaseHandler db = new DatabaseHandler(this);

    public void findViewById() {
        _76 = findViewById(R.id._76);
        _77 = findViewById(R.id._77);
    }

    public void setOnClickListener() {
        _76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GetStarted.this, LogIn.class);
                startActivity(i);
            }
        });
        _77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GetStarted.this, SignUp.class);
                startActivity(i);
            }
        });
    }

    public void others() {
        db.addAll();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);
        findViewById();
        others();
        setOnClickListener();
    }
}
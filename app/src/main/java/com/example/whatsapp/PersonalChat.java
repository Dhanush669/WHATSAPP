package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PersonalChat extends AppCompatActivity {
public void click(View view){
    Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show();
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_chat);
    }
}
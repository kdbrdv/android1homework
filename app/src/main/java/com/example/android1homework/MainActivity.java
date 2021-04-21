package com.example.android1homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText email;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button.findViewById(R.id.button3);
        email.findViewById(R.id.button);
        password.findViewById(R.id.button2);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email.getText().toString().isEmpty() || !password.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Введите данные!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Добро пожаловать!", Toast.LENGTH_SHORT).show();
                    button.setBackgroundColor(getResources().getColor(R.color.orange));
                }
            }
        });
    }

}
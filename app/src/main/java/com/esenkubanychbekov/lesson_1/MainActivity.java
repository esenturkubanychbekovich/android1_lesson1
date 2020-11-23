package com.esenkubanychbekov.lesson_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText userLoginEditText;
    private EditText passwordEditText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userLoginEditText = findViewById(R.id.editTextLogin);
        passwordEditText = findViewById(R.id.editTextPassword);
    }

    public void onClick (View view){
        String login = userLoginEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();
        if (login.isEmpty()){
            Toast.makeText(MainActivity.this,"Поле логин не должен быть пустым",Toast.LENGTH_SHORT).show();
        } else if (password.isEmpty()){
            Toast.makeText(MainActivity.this,"Поле пароль не должен быть пустым",Toast.LENGTH_SHORT).show();
        }
        else if ( password.length() <=4){
            Toast.makeText(MainActivity.this,"Поле пароль должен содержать больше 4 символов",Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(MainActivity.this,"Уcпешно", Toast.LENGTH_SHORT).show();
        }
    }
}
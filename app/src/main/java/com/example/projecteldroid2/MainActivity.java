package com.example.projecteldroid2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    Button loginButton;
    EditText inputEmail, inputPassword;
    TextView signUpNow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    loginButton = findViewById(R.id.buttonLogin);
    signUpNow = findViewById(R.id.textViewSignup);
    inputEmail = findViewById(R.id.editTextEmail);
    inputPassword = findViewById(R.id.editTextPassword);

    loginButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String email, password;
            email = inputEmail.getText().toString();
            password = inputPassword.getText().toString();

            if(email.isEmpty() || !email.contains("@"))
            {

                Toast.makeText(MainActivity.this, "Email is Invalid", Toast.LENGTH_SHORT).show();

            }
            else if(password.length() < 8)
            {

                Toast.makeText(MainActivity.this, "Password is Invalid", Toast.LENGTH_SHORT).show();

            }
        }
    });
    }
}
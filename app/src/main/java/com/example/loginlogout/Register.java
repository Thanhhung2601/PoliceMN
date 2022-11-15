package com.example.loginlogout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.loginlogout.Model.User;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
public class Register extends AppCompatActivity {
    public static int RESULT = 1000 ;
    TextView email , password  ;
    User newUser ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        email = findViewById(R.id.loginEmail);
        password = findViewById(R.id.loginPassword);
    }

    public void handleBack(View view){
        Intent intent = new Intent();
        intent.putExtra("user" , newUser);
        setResult(RESULT , intent);
        finish();
    }

    public void handleRegister(View view){
        String emailValue = email.getText().toString().trim();
        String passwordlValue = password.getText().toString().trim();
        newUser = new User(  emailValue , passwordlValue);
        Toast.makeText(this, "Register Success", Toast.LENGTH_SHORT).show();
    }
}
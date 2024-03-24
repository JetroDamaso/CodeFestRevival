package com.example.codefestrevival;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView debug = findViewById(R.id.testLogin);

        EditText editEmail = findViewById(R.id.editEmail);
        EditText editPassword = findViewById(R.id.editPassword);
        Button signIn = findViewById(R.id.signInButton);
        TextView createAcc = findViewById(R.id.createAccount);
        TextView wrongCreds = findViewById(R.id.textWrongCreds);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ForCreation forLogin = new ForCreation();
                forLogin.setEmail(editEmail.getText().toString());
                forLogin.setPassword(editPassword.getText().toString());

                if(!forLogin.getEmailBank().contains(editEmail.getText().toString())){
                    debug.setText(forLogin.getEmailBank().toString());
                    wrongCreds.setVisibility(View.VISIBLE);
                } else {
                    debug.setText(forLogin.getNameBank().toString());
                    Intent toHomepage = new Intent(MainActivity.this, HomePage.class);
                    startActivity(toHomepage);
                    finish();
                }
            }
        });

        createAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toCreateAcc = new Intent(MainActivity.this, CreateAccount.class);
                startActivity(toCreateAcc);
                finish();
            }
        });
    }
}
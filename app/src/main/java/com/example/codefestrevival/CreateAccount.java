package com.example.codefestrevival;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CreateAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        ForCreation forLogin = new ForCreation();
        MainActivity mainActivity = new MainActivity();

        EditText editName = findViewById(R.id.editTextName);
        EditText editEmail = findViewById(R.id.editTextEmail);
        EditText editPassword = findViewById(R.id.editTextPassword);
        EditText editCPassword = findViewById(R.id.editTextCPassword);
        TextView wrongPassword = findViewById(R.id.textWrongPassword);
        Button buttonCreateAccount = findViewById(R.id.buttonCreateAccount);

        buttonCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!editPassword.getText().toString().equals(editCPassword.getText().toString())){
                    wrongPassword.setVisibility(View.VISIBLE);
                } else {
                    forLogin.setEmail(editEmail.getText().toString());
                    forLogin.setPassword(editPassword.getText().toString());
                    forLogin.setName(editName.getText().toString());

                    forLogin.addNameBank(editName.getText().toString());
                    forLogin.addEmailBank(editEmail.getText().toString());
                    forLogin.addPasswordBank(editPassword.getText().toString());

                    Intent toSuccess = new Intent(CreateAccount.this, AccCreateSuccess.class);
                    startActivity(toSuccess);
                    finish();
                }
            }
        });

    }
}
package com.haiyen.mystore;

<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> origin/ngoc
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
<<<<<<< HEAD
import android.widget.ProgressBar;
=======
>>>>>>> origin/ngoc
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
<<<<<<< HEAD
import com.google.firebase.database.FirebaseDatabase;
import com.haiyen.mystore.models.UserModel;
=======
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
>>>>>>> linh
=======
>>>>>>> origin/ngoc

public class RegistrationActivity extends AppCompatActivity {

    Button signUp;
    EditText name, email, password;
    TextView signIn;
<<<<<<< HEAD

<<<<<<< HEAD
    FirebaseAuth auth;
    FirebaseDatabase database;

    ProgressBar progressBar;
=======
>>>>>>> linh
=======
    FirebaseAuth auth;
>>>>>>> origin/ngoc


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

<<<<<<< HEAD
<<<<<<< HEAD
        auth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();


        progressBar = findViewById(R.id.progressbar);
        progressBar.setVisibility(View.GONE);

=======
>>>>>>> linh
=======
        auth = FirebaseAuth.getInstance();
>>>>>>> origin/ngoc
        signUp=findViewById(R.id.reg_btn);
        name=findViewById(R.id.name);
        email=findViewById(R.id.email_reg);
        password =findViewById(R.id.password_reg);
        signIn=findViewById(R.id.sign_in);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegistrationActivity.this, LoginActivity.class));
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

<<<<<<< HEAD
<<<<<<< HEAD
                createUser();
                progressBar.setVisibility(View.VISIBLE);
=======
>>>>>>> linh
=======
                createUser();
>>>>>>> origin/ngoc
            }
        });

    }
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> origin/ngoc

    private void createUser() {
        String userName = name.getText().toString();
        String userEmail = email.getText().toString();
        String userPassword = password.getText().toString();

        if (TextUtils.isEmpty(userName)){
            Toast.makeText(this, "Name is Empty!", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(userEmail)){
            Toast.makeText(this, "Email is Empty!", Toast.LENGTH_SHORT).show();
            return;
        }
        if (TextUtils.isEmpty(userPassword)){
            Toast.makeText(this, "Password is Empty!", Toast.LENGTH_SHORT).show();
            return;
        }
        if (userPassword.length()<6){
            Toast.makeText(this, "Password length must be greater then 6 letter!", Toast.LENGTH_SHORT).show();
            return;
        }

        // Create User
        auth.createUserWithEmailAndPassword(userEmail, userPassword)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
<<<<<<< HEAD

                            UserModel userModel = new UserModel(userName, userEmail, userPassword);
                            String id = task.getResult().getUser().getUid();
                            database.getReference().child("Users").child(id).setValue(userModel);
                            progressBar.setVisibility(View.GONE);

                            Toast.makeText(RegistrationActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            progressBar.setVisibility(View.GONE);
=======
                            Toast.makeText(RegistrationActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                        }
                        else {
>>>>>>> origin/ngoc
                            Toast.makeText(RegistrationActivity.this, "Error: " + task.getException(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
<<<<<<< HEAD
=======
>>>>>>> linh
=======
>>>>>>> origin/ngoc
}
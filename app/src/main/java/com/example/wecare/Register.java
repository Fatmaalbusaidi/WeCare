package com.example.wecare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Register extends AppCompatActivity {

    private DatabaseReference dbref;
    long id_no=0;

    EditText txt_signup_username;
    EditText txt_signup_Email;
    EditText txt_signup_password;
    Button button7;
    Button button8;
    Button button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        button7=findViewById(R.id.button7);
        button8=findViewById(R.id.button8);
        button9=findViewById(R.id.button9);
        txt_signup_username=findViewById(R.id.txt_signup_username);
        txt_signup_Email=findViewById(R.id.txt_signup_Email);
        txt_signup_password=findViewById(R.id.txt_signup_password);

        dbref= FirebaseDatabase.getInstance().getReference("Logins");

        dbref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists())
                    id_no=(snapshot.getChildrenCount());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Model_user m=new Model_user();
                m.setUsername(txt_signup_username.getText().toString().trim());
                m.setEmail(txt_signup_Email.getText().toString().trim());
                m.setPassword(txt_signup_password.getText().toString().trim());
                m.setIsactive("True");

                dbref.child(txt_signup_username.getText().toString().trim()).setValue(m);
                Intent intent=new Intent(Register.this,Login.class);
                startActivity(intent);

            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Register.this,StartPage.class);
                startActivity(intent);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Register.this,Login.class);
                startActivity(intent);
            }
        });
    }
}
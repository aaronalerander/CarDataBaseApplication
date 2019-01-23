package com.example.aaron.supremelube;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText passwordEt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        passwordEt = (EditText)findViewById(R.id.passwordEt);
        Button login = (Button) findViewById(R.id.loginBtn);

        View.OnClickListener clickListener = new View.OnClickListener() {
            public void onClick(View v) {
                validate(passwordEt.getText().toString());
            }
        };
        login.setOnClickListener(clickListener);


    }

    private void validate(String userPassword){
        if(userPassword.equals("0000")){
            Intent intent = new Intent(MainActivity.this, CarInfoActivity.class);
            startActivity(intent);

        }
    }
}

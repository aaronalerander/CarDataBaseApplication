package com.example.aaron.supremelube;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        password = (EditText)findViewById(R.id.etPassword);
        Button login = (Button) findViewById(R.id.btnLogin);

        View.OnClickListener clickListener = new View.OnClickListener() {
            public void onClick(View v) {
                validate(password.getText().toString());
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

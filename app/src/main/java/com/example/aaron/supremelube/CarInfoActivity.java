package com.example.aaron.supremelube;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class CarInfoActivity extends AppCompatActivity {


    private EditText kilometers;
    private EditText vinEt;
    private Spinner makeSpn;
    private Spinner modelSpn;
    private Calendar date = Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_info);


        EditText kilometersEt = (EditText) findViewById(R.id.kilometersEt);
        EditText vinEt = (EditText) findViewById(R.id.vinEt);
        Spinner makeSpn = findViewById(R.id.makeSpn);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.make, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        makeSpn.setAdapter(adapter);
        setUpSpinner(makeSpn);


    }
    private void setUpSpinner(Spinner makeSpn){
        final Spinner modelSpn = findViewById(R.id.modelSpn);
        modelSpn.setVisibility(View.GONE);
        makeSpn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position == 1){
                    ArrayAdapter<CharSequence> Adapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.chryslerModel, android.R.layout.simple_spinner_item);
                    Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    modelSpn.setAdapter(Adapter);
                    modelSpn.setVisibility(View.VISIBLE);
                }else if(position == 2){
                    ArrayAdapter<CharSequence> Adapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.chevroletModel, android.R.layout.simple_spinner_item);
                    Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    modelSpn.setAdapter(Adapter);
                    modelSpn.setVisibility(View.VISIBLE);
                }else if(position == 3 ){
                    ArrayAdapter<CharSequence> Adapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.cadillacModel, android.R.layout.simple_spinner_item);
                    Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    modelSpn.setAdapter(Adapter);
                    modelSpn.setVisibility(View.VISIBLE);
                }else if(position == 4){
                    ArrayAdapter<CharSequence> Adapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.dodgeModel, android.R.layout.simple_spinner_item);
                    Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    modelSpn.setAdapter(Adapter);
                    modelSpn.setVisibility(View.VISIBLE);
                }else if(position == 5){
                    ArrayAdapter<CharSequence> Adapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.fordModel, android.R.layout.simple_spinner_item);
                    Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    modelSpn.setAdapter(Adapter);
                    modelSpn.setVisibility(View.VISIBLE);
                }else if(position == 6){
                    ArrayAdapter<CharSequence> Adapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.gmcModel, android.R.layout.simple_spinner_item);
                    Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    modelSpn.setAdapter(Adapter);
                    modelSpn.setVisibility(View.VISIBLE);
                }else if(position == 7){
                    ArrayAdapter<CharSequence> Adapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.hyundaiModel, android.R.layout.simple_spinner_item);
                    Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    modelSpn.setAdapter(Adapter);
                    modelSpn.setVisibility(View.VISIBLE);
                }else if(position == 8){
                    ArrayAdapter<CharSequence> Adapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.jeepModel, android.R.layout.simple_spinner_item);
                    Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    modelSpn.setAdapter(Adapter);
                    modelSpn.setVisibility(View.VISIBLE);
                }else if(position == 9){
                    ArrayAdapter<CharSequence> Adapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.kiaModel, android.R.layout.simple_spinner_item);
                    Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    modelSpn.setAdapter(Adapter);
                    modelSpn.setVisibility(View.VISIBLE);
                }else if(position == 10){
                    ArrayAdapter<CharSequence> Adapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.lincolnModel, android.R.layout.simple_spinner_item);
                    Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    modelSpn.setAdapter(Adapter);
                    modelSpn.setVisibility(View.VISIBLE);
                }else if(position == 11){
                    ArrayAdapter<CharSequence> Adapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.nissanModel, android.R.layout.simple_spinner_item);
                    Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    modelSpn.setAdapter(Adapter);
                    modelSpn.setVisibility(View.VISIBLE);
                }else if(position == 12){
                    ArrayAdapter<CharSequence> Adapter = ArrayAdapter.createFromResource(getBaseContext(), R.array.volkswagenModel, android.R.layout.simple_spinner_item);
                    Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    modelSpn.setAdapter(Adapter);
                    modelSpn.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                }





        });
    infoToString();


    }

    private void infoToString() {

    }


}


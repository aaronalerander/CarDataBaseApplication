package com.example.aaron.supremelube;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class CarInfoActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_info);

        final Spinner makeSpn = findViewById(R.id.makeSpn);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.make, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        makeSpn.setAdapter(adapter);


        setUpSpinner(makeSpn);
    }

    private void setUpSpinner(Spinner makeSpn) {
        makeSpn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            Spinner modelSpinner = findViewById(R.id.modelSpn);
            modelSpinner.setVisibility(View.VISIBLE);






            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }
        });
    }


}

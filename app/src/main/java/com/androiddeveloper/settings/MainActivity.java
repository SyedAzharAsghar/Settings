package com.androiddeveloper.settings;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Spinner spinnerCustom, spinnerTradeCustom, spinnerLogSummaryCustom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinnerCustom = (Spinner) findViewById(R.id.typesSpinner);
        List<String> categories = new ArrayList<String>();
        categories.add("ALL");
        categories.add("REG");
        categories.add("ODL");
        categories.add("FUT");
        categories.add("IPO");
        categories.add("SIF");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.text_log_spinner, categories);

        // Drop down layout style -
        dataAdapter.setDropDownViewResource(R.layout.text_log_spinner_drop);


        // Spinner click listener
        spinnerCustom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // On selecting a spinner item
                String item = parent.getItemAtPosition(position).toString();

                // Showing selected spinner item
                Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
                if (item == "REG") {

                    startActivity(new Intent(MainActivity.this, SettingActivity.class));

                }
//                startActivity(new Intent(MainActivity.this,SettingActivity.class));

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinnerCustom.setAdapter(dataAdapter);

    }
}

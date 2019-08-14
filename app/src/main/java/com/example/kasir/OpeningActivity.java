package com.example.kasir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Calendar;

public class OpeningActivity extends AppCompatActivity {
    EditText date_etxt;
    Spinner shift_spnr;
    String [] shift = {"Pagi", "Siang", "Malam"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening);

        findViewById(R.id.linearlayout).setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                try {
                    InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                }catch (Exception e) {

                }
                return true;
            }
        });

        date_etxt = findViewById(R.id.date_etxt);
        date_etxt.setText(Calendar.getInstance().getTime().toString());

        findViewById(R.id.save_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OpeningActivity.this, MainActivity.class));
            }
        });

        shift_spnr = findViewById(R.id.shift_spnr);
        ArrayAdapter aa = new ArrayAdapter(getApplicationContext(),R.layout.spinner_shift, shift);
        aa.setDropDownViewResource(R.layout.spinner_shift_dropdown);
        shift_spnr.setAdapter(aa);
        shift_spnr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), shift[position], Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}

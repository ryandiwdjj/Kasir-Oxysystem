package com.example.kasir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;

public class PaymentActivity extends AppCompatActivity {

    Spinner payment_method_spnr;
    String [] payment_method = {"Kas", "Kartu Kredit", "Kartu Debit", "Go-Pay", "OVO"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        findViewById(R.id.total_etxt).setEnabled(false);

        ArrayAdapter aa = new ArrayAdapter(getApplicationContext(), R.layout.spinner_payment, payment_method);
        aa.setDropDownViewResource(R.layout.spinner_payment_dropdown);

        payment_method_spnr = findViewById(R.id.payment_method_spnr);
        payment_method_spnr.setAdapter(aa);
        payment_method_spnr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(PaymentActivity.this, payment_method[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}

package com.example.kasir;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import eltos.simpledialogfragment.SimpleDialog;
import eltos.simpledialogfragment.input.SimplePinDialog;
import eltos.simpledialogfragment.list.SimpleListDialog;

public class OpeningActivity extends AppCompatActivity implements View.OnClickListener {
    private boolean auth ;
    EditText date_etxt;
    Spinner shift_spnr;
    String[] shift = {"Pagi", "Siang", "Malam"};
    String text = "0";
    Bundle bundle;
    private TextView amount_etxt;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening);

        findViewById(R.id.linearlayout).setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                try {
                    InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                } catch (Exception e) {

                }
                return true;
            }
        });

        DateFormat df = new SimpleDateFormat("EEEE, dd-MMM-yyyy | kk:mm");

        date_etxt = findViewById(R.id.date_etxt);
        date_etxt.setEnabled(false);
        date_etxt.setText(df.format(Calendar.getInstance().getTime()));

        findViewById(R.id.save_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OpeningActivity.this, MainActivity.class));
            }
        });


        ArrayAdapter aa = new ArrayAdapter(getApplicationContext(), R.layout.spinner_shift, shift);
        aa.setDropDownViewResource(R.layout.spinner_shift_dropdown);

        shift_spnr = findViewById(R.id.shift_spnr);
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

        amount_etxt = findViewById(R.id.amount_etxt);
        amount_etxt.setText("Rp. ");
        amount_etxt.setShowSoftInputOnFocus(false);
        findViewById(R.id.btn_1).setOnClickListener(this);
        findViewById(R.id.btn_2).setOnClickListener(this);
        findViewById(R.id.btn_3).setOnClickListener(this);
        findViewById(R.id.btn_4).setOnClickListener(this);
        findViewById(R.id.btn_5).setOnClickListener(this);
        findViewById(R.id.btn_6).setOnClickListener(this);
        findViewById(R.id.btn_7).setOnClickListener(this);
        findViewById(R.id.btn_8).setOnClickListener(this);
        findViewById(R.id.btn_9).setOnClickListener(this);
        findViewById(R.id.btn_0).setOnClickListener(this);
        findViewById(R.id.btn_00).setOnClickListener(this);
        findViewById(R.id.btn_000).setOnClickListener(this);
        findViewById(R.id.backspace_btn).setOnClickListener(this);

        findViewById(R.id.clear_btn).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
//                amount_etxt.setText("Rp. ");
            }
        });
    }

    @Override
    public void onClick(View v) {
        String temp, backspace, clear = "Rp. ";
        backspace = amount_etxt.getText().toString().substring(0, amount_etxt.getText().toString().length() - 1);

        switch (v.getId()) {
            case R.id.btn_1:
                amount_etxt.setText(amount_etxt.getText() + "1");
                break;
            case R.id.btn_2:
                amount_etxt.setText(amount_etxt.getText() + "2");
                break;
            case R.id.btn_3:
                amount_etxt.setText(amount_etxt.getText() + "3");
                break;
            case R.id.btn_4:
                amount_etxt.setText(amount_etxt.getText() + "4");
                break;
            case R.id.btn_5:
                amount_etxt.setText(amount_etxt.getText() + "5");
                break;
            case R.id.btn_6:
                amount_etxt.setText(amount_etxt.getText() + "6");
                break;
            case R.id.btn_7:
                amount_etxt.setText(amount_etxt.getText() + "7");
                break;
            case R.id.btn_8:
                amount_etxt.setText(amount_etxt.getText() + "8");
                break;
            case R.id.btn_9:
                amount_etxt.setText(amount_etxt.getText() + "9");
                break;
            case R.id.btn_0:
                if (amount_etxt.getText().toString().length() == 4) {
//                    amount_etxt.setText(clear);
                } else {
                    amount_etxt.setText(amount_etxt.getText() + "0");
                }
                break;
            case R.id.btn_00:
                if (amount_etxt.getText().toString().length() == 4) {
//                    amount_etxt.setText(clear);
                } else {
                    amount_etxt.setText(amount_etxt.getText() + "00");
                }
                break;
            case R.id.btn_000:
                if (amount_etxt.getText().toString().length() == 4) {
//                    amount_etxt.setText(clear);
                } else {
                    amount_etxt.setText(amount_etxt.getText() + "000");
                }
                break;
            case R.id.backspace_btn:
                if (amount_etxt.getText().toString().length() == 4) {
//                    amount_etxt.setText(clear);
                } else {
                    amount_etxt.setText(backspace);
                }
                break;
        }
//        temp.substring(amount_etxt.getText().toString().length());

        Log.d("temp", backspace);
    }
}

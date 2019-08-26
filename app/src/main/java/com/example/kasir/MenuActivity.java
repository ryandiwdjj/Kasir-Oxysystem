package com.example.kasir;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import Dialog_Frag.List_Table_Dialog;
import Dialog_Frag.Menu_Details_Dialog;

public class MenuActivity extends AppCompatActivity {
    private Boolean auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        auth = false;

        findViewById(R.id.menu_details_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment dialog = new Menu_Details_Dialog();
                dialog.show(getSupportFragmentManager(), "menu_details");
            }
        });

        findViewById(R.id.list_table_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment dialog = new List_Table_Dialog();
                dialog.show(getSupportFragmentManager(), "list_table");
            }
        });

        findViewById(R.id.save_bill_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Toast.makeText(MenuActivity.this, "Bill Saved", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private Dialog createAuthDialog(Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        LayoutInflater inflater = LayoutInflater.from(this);
        View auth_layout = inflater.inflate(R.layout.dialog_auth, null);

        return builder.setView(auth_layout)
                .setTitle("Authenticate your action")
                .setPositiveButton("Authenticate", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        auth = true;
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).create();
    }
}

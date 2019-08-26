package Dialog_Frag;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.kasir.MenuActivity;
import com.example.kasir.R;

public class NewOrder_Details_Dialog extends DialogFragment {

    String [] waiter = {"Bambang", "Sukija", "Melati", "Mawar", "Suyoto"};
    Spinner waiter_spnr;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.dialog_neworderdetails, container, false);

        ArrayAdapter aa = new ArrayAdapter(getContext(),R.layout.spinner_shift, waiter);
        aa.setDropDownViewResource(R.layout.spinner_shift_dropdown);
        waiter_spnr = v.findViewById(R.id.waiter_spnr);
        waiter_spnr.setAdapter(aa);
        waiter_spnr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), waiter[position], Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        v.findViewById(R.id.ok_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), MenuActivity.class));
                dismiss();
            }
        });

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        int width = (int)(getResources().getDisplayMetrics().widthPixels*0.6);

        getDialog().getWindow().setLayout(width, ViewGroup.LayoutParams.WRAP_CONTENT);
    }


}
package Frag;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.kasir.PaymentActivity;
import com.example.kasir.R;

import Dialog_Frag.NewOrder_Details_Dialog;

public class DI_NewOrderFragment extends Fragment {
    String[] lantai = {"Lantai 1", "Lantai 2", "Lantai 3"};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_di_neworder, container, false);

        Spinner spin = (Spinner) v.findViewById(R.id.floor_spnr);
        ArrayAdapter aa = new ArrayAdapter(getActivity(),R.layout.spinner_lantai, lantai);
        aa.setDropDownViewResource(R.layout.spinner_lantai_dropdown);
        spin.setAdapter(aa);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), lantai[position], Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        v.findViewById(R.id.table_test_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int width = (int)(getResources().getDisplayMetrics().widthPixels*0.90);
                int height = (int)(getResources().getDisplayMetrics().heightPixels*0.90);

                DialogFragment dialog = new NewOrder_Details_Dialog();
                dialog.show(getFragmentManager(), "newOrderDetails");
            }
        });

        v.findViewById(R.id.payment_test_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), PaymentActivity.class));
            }
        });

        return v;
    }
}

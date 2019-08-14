package Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.kasir.R;

import java.lang.reflect.Array;

public class NewOrderFragment extends Fragment {
    String[] lantai = {"Lantai 1", "Lantai 2", "Lantai 3"};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_neworder, container, false);

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

        return v;
    }
}

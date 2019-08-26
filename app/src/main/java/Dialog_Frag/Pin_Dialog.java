package Dialog_Frag;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.kasir.R;

public class Pin_Dialog extends DialogFragment {
    EditText pin_etxt;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.simpledialogfragment_pin, container, false);

        pin_etxt = v.findViewById(R.id.pinEntry);
        pin_etxt.setFilters(new InputFilter[] {
                new InputFilter.LengthFilter(6)
        });

        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
//        int width = (int)(getResources().getDisplayMetrics().widthPixels*0.6);
//
//        getDialog().getWindow().setLayout(width, ViewGroup.LayoutParams.WRAP_CONTENT);
    }
}

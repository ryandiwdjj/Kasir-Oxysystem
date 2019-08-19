package Frag;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kasir.R;

public class DineInFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_dinein, container, false);
        v.findViewById(R.id.new_order_dineIn)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        getFragmentManager().beginTransaction()
                                .setCustomAnimations(R.anim.enter_from_top, R.anim.exit_to_bottom)
                                .replace(R.id.frag_container, new DI_NewOrderFragment(), "new_order")
                                .addToBackStack(null)
                                .commit();
                    }
                });

        return v;
    }


}

package Frag;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.kasir.R;

import eltos.simpledialogfragment.SimpleDialog;
import eltos.simpledialogfragment.input.SimplePinDialog;

public class ClosingFragment extends Fragment implements SimpleDialog.OnDialogResultListener {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_closing, container, false);

//        DialogFragment dialog = new Pin_Dialog();
//        dialog.show(getFragmentManager(), "pin_dialog");
        SimplePinDialog.build().title("Authenticate your action!")
                .length(4)
                .pin(getString(R.string.auth_pin))
                .show(this, "pin");

        return v;
    }

    @Override
    public boolean onResult(@NonNull String dialogTag, int which, @NonNull Bundle extras) {
        if(dialogTag.equals("pin")) {
            if(extras.getString(SimplePinDialog.PIN).equals(getString(R.string.auth_pin))) {
                Toast.makeText(getContext(), "Success Authenticate", Toast.LENGTH_SHORT).show();
            }
            else {
                getFragmentManager().beginTransaction()
                        .replace(R.id.frag_container, new MenuFragment(), "menu").commit();

                Toast.makeText(getContext(), "Failed to Authenticate", Toast.LENGTH_SHORT).show();
            }
            return true;
        }
        return false;
    }
}

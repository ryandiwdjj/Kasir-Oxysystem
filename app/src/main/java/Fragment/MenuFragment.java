package Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.kasir.R;

public class MenuFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_menu, container, false);

        final FragmentManager fragmentManager = getFragmentManager();

        fragmentManager.beginTransaction()
                .replace(R.id.menu_frag_container, new DineInFragment()).commit();

        BottomNavigationView bn_main = v.findViewById(R.id.bn_main);

        bn_main.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                if(menuItem.getItemId() == R.id.dine_in_menu) {
                    Log.d("navigation", "dine in");
                    fragmentManager.beginTransaction()
                            .setCustomAnimations(R.anim.enter_from_bottom, R.anim.exit_to_top)
                            .replace(R.id.menu_frag_container, new DineInFragment())
                            .addToBackStack(null)
                            .commit();
                }
                else if(menuItem.getItemId() == R.id.take_away_menu) {
                    Log.d("navigation", "take away");
                    fragmentManager.beginTransaction()
                            .setCustomAnimations(R.anim.enter_from_bottom, R.anim.exit_to_top)
                            .replace(R.id.menu_frag_container, new TakeAwayFragment())
                            .addToBackStack(null)
                            .commit();
                }
                else if(menuItem.getItemId() == R.id.reservation_menu) {
                    Log.d("navigation", "reservation");
                    fragmentManager.beginTransaction()
                            .setCustomAnimations(R.anim.enter_from_bottom, R.anim.exit_to_top)
                            .replace(R.id.menu_frag_container, new ReservationFragment())
                            .addToBackStack(null)
                            .commit();
                }
                return true;
            }
        });


        return v;
    }
}

package com.example.kasir;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.Toast;

import Frag.ClosingFragment;
import Frag.MenuFragment;
import eltos.simpledialogfragment.SimpleDialog;
import eltos.simpledialogfragment.input.SimplePinDialog;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, SimpleDialog.OnDialogResultListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final FragmentManager fragmentManager = getSupportFragmentManager();

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        fragmentManager.beginTransaction()
                .replace(R.id.frag_container, new MenuFragment(), "menu").commit();

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);

        } else {

            Fragment f = getSupportFragmentManager().findFragmentById(R.id.frag_container);

            if(f instanceof MenuFragment) {
                //close aplication
                Log.d("current fragment", "yeye");
            }
            else {
                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(R.anim.enter_from_bottom, R.anim.exit_to_top)
                        .replace(R.id.frag_container, new MenuFragment())
                        .addToBackStack(null)
                        .commit();
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.lock_btn) {
            SimpleDialog.build().title("Lock this Device")
                .msg("Are you sure?")
                .pos("Yes")
                .neg("No")
                .show(MainActivity.this);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_pos) {
        } else if (id == R.id.nav_kitchen) {

        } else if (id == R.id.nav_sync) {

        } else if (id == R.id.nav_closing) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frag_container, new ClosingFragment())
                    .addToBackStack(null)
                    .commit();

        } else if (id == R.id.lock_btn) {


        } else if (id == R.id.nav_exit) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }

    @Override
    public boolean onResult(@NonNull String dialogTag, int which, @NonNull Bundle extras) {
        if(dialogTag.equals(SimpleDialog.TAG)) {
            switch (which){
                case BUTTON_POSITIVE:
                    SimplePinDialog.build().title("Unlock this device")
                            .length(4)
                            .cancelable(false)
                            .pin(getString(R.string.auth_pin))
                            .show(MainActivity.this, "pin");

                    break;
                case BUTTON_NEGATIVE:
                    break;
            }
        }
        else if(dialogTag.equals(SimplePinDialog.PIN)) {
            if(extras.getString(SimplePinDialog.PIN).equals(getString(R.string.auth_pin))) {
                Toast.makeText(getApplicationContext(), "Success Authenticate", Toast.LENGTH_SHORT).show();
            }
        }
        return false;
    }
}

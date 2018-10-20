package com.rodrigoguerra.micalculadora.view;


import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.rodrigoguerra.micalculadora.R;
import com.rodrigoguerra.micalculadora.calculator.view.CalculadoraFragment;
import com.rodrigoguerra.micalculadora.view.fragment.TemperatureFragment;

public class ContainerActivity extends AppCompatActivity {

    CalculadoraFragment calculadoraFragment = new CalculadoraFragment();
    TemperatureFragment temperatureFragment = new TemperatureFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottombar);

        changeFragment(calculadoraFragment);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId() == R.id.itemCalculator) {
                    changeFragment(calculadoraFragment);
                }else if (item.getItemId() == R.id.itemTemperature){
                    changeFragment(temperatureFragment);
                }

                return false;
            }
        });




    }

    private void changeFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null).commit();
    }
}

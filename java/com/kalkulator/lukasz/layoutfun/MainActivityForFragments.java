package com.kalkulator.lukasz.layoutfun;

import android.app.Activity;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityForFragments extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_for_fragments);


        if (findViewById(R.id.fragment_container) != null) {//jeśli jest coś w FrameLayout, to nie musimy nic robić (przywrócone stan, np po onPause)
            if (savedInstanceState != null) {
                return;
            }

            FragmentDynamiczny firstFragment = new FragmentDynamiczny();//tworzymy nowy fragment

            Bundle args = new Bundle();
            args.putInt(FragmentDynamiczny.BUNDLE_KEY, 345);
            firstFragment.setArguments(args);

            getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, firstFragment).commit();
            //wywołujemy po kolei metody, zaczynamy transakcję, dodajemy fragment, commitem zatwierdzamy zmiany
        }
    }

    public void Set1stDynamicFragment(View view) {
        FragmentDynamiczny fragment = new FragmentDynamiczny();//tworzymy nowy fragment
        Bundle args = new Bundle();
        args.putInt(FragmentDynamiczny.BUNDLE_KEY, 345);
        fragment.setArguments(args);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();


    }

    public void Set1stFragment(View view) {
        Fragment1 fragment = new Fragment1();//tworzymy nowy fragment

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    public void SetFragmentText(View view) {
        FragmentDynamiczny fragment=(FragmentDynamiczny)getSupportFragmentManager().findFragmentById(R.id.fragment_container);
        fragment.setText(this);
    }
}

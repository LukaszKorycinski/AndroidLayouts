package com.kalkulator.lukasz.layoutfun;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void StartLineralScrollActivity(View view) {
        Intent intent = new Intent(this, LineralScroll.class);
        startActivity(intent);
    }

    public void StartFragmentsActivity(View view) {
        Intent intent = new Intent(this, MainActivityForFragments.class);
        startActivity(intent);
    }
}

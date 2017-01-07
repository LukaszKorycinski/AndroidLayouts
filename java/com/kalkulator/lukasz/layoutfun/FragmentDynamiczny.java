package com.kalkulator.lukasz.layoutfun;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FragmentDynamiczny extends Fragment {
    static String BUNDLE_KEY = "id";



    public void setText(FragmentActivity activity)
    {
        TextView text = (TextView) activity.findViewById(R.id.TextViewFromDynamicFragment);
        text.setText("fragment dynamiczny");
    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    TextView textViewFromDynamicFragment;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        Bundle b = getArguments();
        int bundleKey = b.getInt(BUNDLE_KEY);


        return inflater.inflate(R.layout.fragment_fragment_dynamiczny, container, false);
    }


}

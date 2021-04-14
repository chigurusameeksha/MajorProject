package com.droid.solver.a2020;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CaptureFragment extends Fragment {

    public static CaptureFragment getInstance() {
        return new CaptureFragment();
    }

    public CaptureFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_facts, container, false);
        return view;
    }
}



    //                         long    78.042073     lat 27.174698469698683







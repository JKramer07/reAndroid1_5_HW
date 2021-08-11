package com.geek.reandroid1_5_hw.ui.fragments.fourth_fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.geek.reandroid1_5_hw.R;
import com.geek.reandroid1_5_hw.ui.fragments.fifth_fragment.FifthFragment;
import com.geek.reandroid1_5_hw.ui.fragments.third_fragment.ThirdFragment;
import com.geek.reandroid1_5_hw.ui.interfaces.FragmentListeners;

import org.w3c.dom.Text;

public class FourthFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fourth, container, false);
    }

}
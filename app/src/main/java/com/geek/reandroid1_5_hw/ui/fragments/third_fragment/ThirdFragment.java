package com.geek.reandroid1_5_hw.ui.fragments.third_fragment;

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
import com.geek.reandroid1_5_hw.ui.fragments.fourth_fragment.FourthFragment;
import com.geek.reandroid1_5_hw.ui.interfaces.FragmentListeners;


public class ThirdFragment extends Fragment {

    private Button btnSend3;
    private TextView thirdText;
    private FragmentListeners listeners;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        listeners = (FragmentListeners) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btnSend3 = view.findViewById(R.id.thirdSendBtn);
        thirdText = view.findViewById(R.id.thirdTv);

        btnSend3.setOnClickListener(v ->{
            listeners.thirdF();
        });
    }
}
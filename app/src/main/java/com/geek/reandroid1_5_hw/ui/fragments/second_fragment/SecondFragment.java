package com.geek.reandroid1_5_hw.ui.fragments.second_fragment;

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
import com.geek.reandroid1_5_hw.ui.fragments.third_fragment.ThirdFragment;
import com.geek.reandroid1_5_hw.ui.interfaces.FragmentListeners;

public class SecondFragment extends Fragment {

    private Button btnSend2;
    private TextView secondText;
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
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btnSend2 = view.findViewById(R.id.secondSendBtn);
        secondText = view.findViewById(R.id.secondTv);

        btnSend2.setOnClickListener(v ->{
            listeners.secondF();
        });
    }
}
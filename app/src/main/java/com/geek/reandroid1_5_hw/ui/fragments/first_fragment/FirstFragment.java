package com.geek.reandroid1_5_hw.ui.fragments.first_fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.geek.reandroid1_5_hw.R;
import com.geek.reandroid1_5_hw.ui.fragments.fifth_fragment.FifthFragment;
import com.geek.reandroid1_5_hw.ui.fragments.second_fragment.SecondFragment;
import com.geek.reandroid1_5_hw.ui.interfaces.FragmentListeners;

public class FirstFragment extends Fragment {

    private EditText editText;
    private Button btnSent;
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
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        editText = view.findViewById(R.id.firstEt);
        btnSent = view.findViewById(R.id.sendBtn);

        btnSent.setOnClickListener(v -> {
            listeners.firstF(editText.getText().toString());
        });
    }
}
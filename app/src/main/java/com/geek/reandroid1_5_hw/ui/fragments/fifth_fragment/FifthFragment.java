package com.geek.reandroid1_5_hw.ui.fragments.fifth_fragment;

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
import com.geek.reandroid1_5_hw.ui.interfaces.FragmentListeners;

public class FifthFragment extends Fragment {

    private TextView showText;
    private Button btnShow;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fifth, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        showText = view.findViewById(R.id.fifthTv);
        btnShow = view.findViewById(R.id.showBtn);

        btnShow.setOnClickListener(v -> {
            Bundle bundle = this.getArguments();
            String text = bundle.getString("key");
            showText.setText(text);
        });
    }
}
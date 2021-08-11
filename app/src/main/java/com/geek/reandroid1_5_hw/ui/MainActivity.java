package com.geek.reandroid1_5_hw.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.geek.reandroid1_5_hw.R;
import com.geek.reandroid1_5_hw.ui.fragments.fifth_fragment.FifthFragment;
import com.geek.reandroid1_5_hw.ui.fragments.first_fragment.FirstFragment;
import com.geek.reandroid1_5_hw.ui.fragments.fourth_fragment.FourthFragment;
import com.geek.reandroid1_5_hw.ui.fragments.second_fragment.SecondFragment;
import com.geek.reandroid1_5_hw.ui.fragments.third_fragment.ThirdFragment;
import com.geek.reandroid1_5_hw.ui.interfaces.FragmentListeners;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.firstCont, new FirstFragment()).commit();
    }
}
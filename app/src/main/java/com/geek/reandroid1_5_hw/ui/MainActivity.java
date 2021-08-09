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

public class MainActivity extends AppCompatActivity implements FragmentListeners {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.firstCont, new FirstFragment()).commit();
    }


    @Override
    public void firstF(String s) {
        Bundle bundle = new Bundle();
        FirstFragment firstFragment = new FirstFragment();
        bundle.putString("key", s);
        firstFragment.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(R.id.firstCont, new SecondFragment()).commit();
    }

    @Override
    public void secondF() {
        getSupportFragmentManager().beginTransaction().replace(R.id.secondCont, new ThirdFragment()).commit();
    }

    @Override
    public void thirdF() {
        getSupportFragmentManager().beginTransaction().replace(R.id.thirdCont, new FourthFragment()).commit();
    }

    @Override
    public void fourthF() {
        getSupportFragmentManager().beginTransaction().replace(R.id.fourthCont, new FifthFragment()).commit();
    }

//    @Override
//    public void fifthF() {
//        FifthFragment fifthFragment = new FifthFragment();
//        TextView showText = fifthFragment.getView().findViewById(R.id.fifthTv);
//        String s = fifthFragment.getArguments().getString("key");
//        showText.setText(s);
//    }
}
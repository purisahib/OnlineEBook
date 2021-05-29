package com.example.new09.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.new09.R;
import com.example.new09.ui.gallery.eleven.ElevenActivity;
import com.example.new09.ui.gallery.nine.NineActivity;
import com.example.new09.ui.gallery.ten.TenActivity;
import com.example.new09.ui.gallery.twelve.TwelveActivity;
import com.example.new09.ui.home.android.AndroidActivity;
import com.example.new09.ui.home.c.cActivity;
import com.example.new09.ui.home.cpp.CppActivity;
import com.example.new09.ui.home.java.JavaActivity;
import com.example.new09.ui.home.php.PhpActivity;
import com.example.new09.ui.home.python.PythonActivity;

public class HomeFragment extends Fragment {

    ImageButton cBtn,cppBtn,javaBtn,pythonBtn,phpBtn,androidBtn;
    Button btn12th,btn11th, btn10th, btn9th;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        cBtn= (ImageButton) root.findViewById(R.id.cBtn);
        cppBtn= (ImageButton) root.findViewById(R.id.cppBtn);
        javaBtn= (ImageButton) root.findViewById(R.id.javaBtn);
        pythonBtn= (ImageButton) root.findViewById(R.id.pythonBtn);
        phpBtn= (ImageButton) root.findViewById(R.id.phpBtn);
        androidBtn= (ImageButton) root.findViewById(R.id.androidBtn);
        btn12th= (Button) root.findViewById(R.id.btn12thclassbooks);
        btn11th= (Button) root.findViewById(R.id.btn11thclassbooks);
        btn10th= (Button) root.findViewById(R.id.btn10thclassbooks);
        btn9th= (Button) root.findViewById(R.id.btn9thclassbooks);
        btn12th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TwelveActivity.class);
                startActivity(intent);
            }
        });
        btn11th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ElevenActivity.class);
                startActivity(intent);
            }
        });
        btn10th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TenActivity.class);
                startActivity(intent);
            }
        });
        btn9th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), NineActivity.class);
                startActivity(intent);
            }
        });
        cBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), cActivity.class);
                startActivity(intent);
            }
        });
        cppBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CppActivity.class);
                startActivity(intent);
            }
        });
        javaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), JavaActivity.class);
                startActivity(intent);
            }
        });
        pythonBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PythonActivity.class);
                startActivity(intent);
            }
        });
        phpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PhpActivity.class);
                startActivity(intent);
            }
        });
        androidBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AndroidActivity.class);
                startActivity(intent);
            }
        });
        return root;
    }
}

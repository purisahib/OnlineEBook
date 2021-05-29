package com.example.new09.ui.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.new09.R;
import com.example.new09.ui.gallery.eleven.ElevenActivity;
import com.example.new09.ui.gallery.nine.NineActivity;
import com.example.new09.ui.gallery.ten.TenActivity;
import com.example.new09.ui.gallery.twelve.TwelveActivity;

public class GalleryFragment extends Fragment {
    Button nineBtn, tenBtn, elevenBtn, twelveBtn;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ;
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        nineBtn = root.findViewById(R.id.nineBtn);
        tenBtn = root.findViewById(R.id.tenBtn);
        elevenBtn = root.findViewById(R.id.elevenBtn);
        twelveBtn = root.findViewById(R.id.twelveBtn);
        //on click listener
        nineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), NineActivity.class);
                startActivity(intent);
            }
        });
        tenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TenActivity.class);
                startActivity(intent);
            }
        });
        elevenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ElevenActivity.class);
                startActivity(intent);
            }
        });
        twelveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TwelveActivity.class);
                startActivity(intent);
            }
        });
        return root;
    }
}
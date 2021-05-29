package com.example.new09.ui.download;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.new09.R;

import java.io.File;

import static android.app.Activity.RESULT_OK;

/**
 Createn by Puri Sahib
 */
public class DownloadFragment extends Fragment {
    public static File path;
    Intent myFileIntent;
    Button btn1,btn2,btn3,btn4;
    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_download, container, false);
        btn1=root.findViewById(R.id.schoolBtn);
        btn2=root.findViewById(R.id.colledgeBtn);
        btn3=root.findViewById(R.id.allBtn);
        btn4=root.findViewById(R.id.openBtn);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SchoolFile.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CollegeFile.class);
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AllFiles.class);
                startActivity(intent);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myFileIntent=new Intent(Intent.ACTION_GET_CONTENT);
                myFileIntent.setType("*/*");
                startActivityForResult(myFileIntent,20);
            }
        });

        return root;
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        switch (requestCode) {
            case 10:
                if (resultCode == RESULT_OK) {
                    path= new File(data.getData().getPath());
                    Intent intent=new Intent(getActivity(), OpenUs.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getActivity(), "File Not finding", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

}

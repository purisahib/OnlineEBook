package com.example.new09.ui.home.cpp;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.new09.R;
import com.example.new09.ui.home.DownloadTaskhome;
import com.example.new09.ui.home.Utilshome;

/*
Createn dy puri sahib
 */
public class CppActivity extends AppCompatActivity implements View.OnClickListener {
    private static Button cpp1,cpp2,cpp3,cpp4,cpp5;
    public Uri uri11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpp);
        initViews();
        setListeners();
    }
    //Initialize al Views
    private void initViews() {
        cpp1= (Button) findViewById(R.id.cpp1Btn);
        cpp2= (Button) findViewById(R.id.cpp2Btn);
        cpp3= (Button) findViewById(R.id.cpp3Btn);
        cpp4= (Button) findViewById(R.id.cpp4Btn);
        cpp5= (Button) findViewById(R.id.cpp5Btn);
    }
    //Set Listeners to Buttons
    private void setListeners() {
        cpp1.setOnClickListener(this);
        cpp2.setOnClickListener(this);
        cpp3.setOnClickListener(this);
        cpp4.setOnClickListener(this);
        cpp5.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        //Before starting any download check internet connection availability
        switch (view.getId()) {
            case R.id.cpp1Btn:
                if (isConnectingToInternet())
                    new DownloadTaskhome(CppActivity.this, cpp1, Utilshome.downloadPdfcpp1);
                else
                    Toast.makeText(CppActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.cpp2Btn:
                if (isConnectingToInternet())
                    new DownloadTaskhome(CppActivity.this, cpp2, Utilshome.downloadPdfcpp2);
                else
                    Toast.makeText(CppActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.cpp3Btn:
                if (isConnectingToInternet())
                    new DownloadTaskhome(CppActivity.this, cpp3, Utilshome.downloadPdfcpp3);
                else
                    Toast.makeText(CppActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.cpp4Btn:
                if (isConnectingToInternet())
                    new DownloadTaskhome(CppActivity.this, cpp4, Utilshome.downloadPdfcpp4);
                else
                    Toast.makeText(CppActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.cpp5Btn:
                if (isConnectingToInternet())
                    new DownloadTaskhome(CppActivity.this, cpp5, Utilshome.downloadPdfcpp5);
                else
                    Toast.makeText(CppActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
        }
    }
    //Check if internet is present or not
    private boolean isConnectingToInternet() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager
                .getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected())
            return true;
        else
            return false;
    }
}

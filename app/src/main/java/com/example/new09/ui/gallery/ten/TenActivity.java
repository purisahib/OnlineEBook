package com.example.new09.ui.gallery.ten;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.new09.R;
import com.example.new09.ui.gallery.UtilsSchool;

/*
Created by puri sahib
 */
public class TenActivity extends AppCompatActivity implements View.OnClickListener {
    private static Button t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ten);
        initViews();
        setListeners();
    }
    //Initialize al Views
    private void initViews() {
        t1= (Button) findViewById(R.id.ten1Btn);
        t2= (Button) findViewById(R.id.ten2Btn);
        t3= (Button) findViewById(R.id.ten3Btn);
        t4= (Button) findViewById(R.id.ten4Btn);
        t5= (Button) findViewById(R.id.ten5Btn);
        t6= (Button) findViewById(R.id.ten6Btn);
        t7= (Button) findViewById(R.id.ten7Btn);
        t8= (Button) findViewById(R.id.ten8Btn);
        t9= (Button) findViewById(R.id.ten9Btn);
        t10= (Button) findViewById(R.id.ten10Btn);
        t11= (Button) findViewById(R.id.ten11Btn);
        t12= (Button) findViewById(R.id.ten12Btn);
        t13= (Button) findViewById(R.id.ten13Btn);
        t14= (Button) findViewById(R.id.ten14Btn);
        t15= (Button) findViewById(R.id.ten15Btn);
        t16= (Button) findViewById(R.id.ten16Btn);
        t17= (Button) findViewById(R.id.ten17Btn);
        t18= (Button) findViewById(R.id.ten18Btn);
        t19= (Button) findViewById(R.id.ten19Btn);
    }
    //Set Listeners to Buttons
    private void setListeners() {
        t1.setOnClickListener(this);
        t2.setOnClickListener(this);
        t3.setOnClickListener(this);
        t4.setOnClickListener(this);
        t5.setOnClickListener(this);
        t6.setOnClickListener(this);
        t7.setOnClickListener(this);
        t8.setOnClickListener(this);
        t9.setOnClickListener(this);
        t10.setOnClickListener(this);
        t11.setOnClickListener(this);
        t12.setOnClickListener(this);
        t13.setOnClickListener(this);
        t14.setOnClickListener(this);
        t15.setOnClickListener(this);
        t16.setOnClickListener(this);
        t17.setOnClickListener(this);
        t18.setOnClickListener(this);
        t19.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        //Before starting any download check internet connection availability
        switch (view.getId()) {
            case R.id.ten1Btn:
                if (isConnectingToInternet())
                    new DownloadTaskten(TenActivity.this, t1, UtilsSchool.downloadPdft1);
                else
                    Toast.makeText(TenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ten2Btn:
                if (isConnectingToInternet())
                    new DownloadTaskten(TenActivity.this, t2, UtilsSchool.downloadPdft2);
                else
                    Toast.makeText(TenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ten3Btn:
                if (isConnectingToInternet())
                    new DownloadTaskten(TenActivity.this, t3, UtilsSchool.downloadPdft3);
                else
                    Toast.makeText(TenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ten4Btn:
                if (isConnectingToInternet())
                    new DownloadTaskten(TenActivity.this, t4, UtilsSchool.downloadPdft4);
                else
                    Toast.makeText(TenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ten5Btn:
                if (isConnectingToInternet())
                    new DownloadTaskten(TenActivity.this, t5, UtilsSchool.downloadPdft5);
                else
                    Toast.makeText(TenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ten6Btn:
                if (isConnectingToInternet())
                    new DownloadTaskten(TenActivity.this, t6, UtilsSchool.downloadPdft6);
                else
                    Toast.makeText(TenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ten7Btn:
                if (isConnectingToInternet())
                    new DownloadTaskten(TenActivity.this, t7, UtilsSchool.downloadPdft7);
                else
                    Toast.makeText(TenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ten8Btn:
                if (isConnectingToInternet())
                    new DownloadTaskten(TenActivity.this, t8, UtilsSchool.downloadPdft8);
                else
                    Toast.makeText(TenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ten9Btn:
                if (isConnectingToInternet())
                    new DownloadTaskten(TenActivity.this, t9, UtilsSchool.downloadPdft9);
                else
                    Toast.makeText(TenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ten10Btn:
                if (isConnectingToInternet())
                    new DownloadTaskten(TenActivity.this, t10, UtilsSchool.downloadPdft10);
                else
                    Toast.makeText(TenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ten11Btn:
                if (isConnectingToInternet())
                    new DownloadTaskten(TenActivity.this, t11, UtilsSchool.downloadPdft11);
                else
                    Toast.makeText(TenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ten12Btn:
                if (isConnectingToInternet())
                    new DownloadTaskten(TenActivity.this, t12, UtilsSchool.downloadPdft12);
                else
                    Toast.makeText(TenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ten13Btn:
                if (isConnectingToInternet())
                    new DownloadTaskten(TenActivity.this, t13, UtilsSchool.downloadPdft13);
                else
                    Toast.makeText(TenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ten14Btn:
                if (isConnectingToInternet())
                    new DownloadTaskten(TenActivity.this, t14, UtilsSchool.downloadPdft14);
                else
                    Toast.makeText(TenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ten15Btn:
                if (isConnectingToInternet())
                    new DownloadTaskten(TenActivity.this, t15, UtilsSchool.downloadPdft15);
                else
                    Toast.makeText(TenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ten16Btn:
                if (isConnectingToInternet())
                    new DownloadTaskten(TenActivity.this, t16, UtilsSchool.downloadPdft16);
                else
                    Toast.makeText(TenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ten17Btn:
                if (isConnectingToInternet())
                    new DownloadTaskten(TenActivity.this, t17, UtilsSchool.downloadPdft17);
                else
                    Toast.makeText(TenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ten18Btn:
                if (isConnectingToInternet())
                    new DownloadTaskten(TenActivity.this, t18, UtilsSchool.downloadPdft18);
                else
                    Toast.makeText(TenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ten19Btn:
                if (isConnectingToInternet())
                    new DownloadTaskten(TenActivity.this, t19, UtilsSchool.downloadPdft19);
                else
                    Toast.makeText(TenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
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

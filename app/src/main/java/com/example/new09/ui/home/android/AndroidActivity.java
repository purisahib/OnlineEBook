package com.example.new09.ui.home.android;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.example.new09.R;
import com.example.new09.ui.home.DownloadTaskhome;
import com.example.new09.ui.home.Utilshome;

/*
created by puri sahib
 */
public class AndroidActivity extends AppCompatActivity implements View.OnClickListener {
private static Button and1,and2,and3,and4,and5,and6,and7,and8,and9,and10;
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);
        initViews();
        setListeners();
        }
//Initialize al Views
private void initViews() {
    and1= (Button) findViewById(R.id.and1Btn);
    and2= (Button) findViewById(R.id.and2Btn);
    and3= (Button) findViewById(R.id.and3Btn);
    and4= (Button) findViewById(R.id.and4Btn);
    and5= (Button) findViewById(R.id.and5Btn);
    and6= (Button) findViewById(R.id.and6Btn);
    and7= (Button) findViewById(R.id.and7Btn);
    and8= (Button) findViewById(R.id.and8Btn);
    and9= (Button) findViewById(R.id.and9Btn);
    and10= (Button) findViewById(R.id.and10Btn);
        }
//Set Listeners to Buttons
private void setListeners() {
    and1.setOnClickListener(this);
    and2.setOnClickListener(this);
    and3.setOnClickListener(this);
    and4.setOnClickListener(this);
    and5.setOnClickListener(this);
    and6.setOnClickListener(this);
    and7.setOnClickListener(this);
    and8.setOnClickListener(this);
    and9.setOnClickListener(this);
    and10.setOnClickListener(this);
}
@Override
public void onClick(View view) {
        //Before starting any download check internet connection availability
        switch (view.getId()) {
            case R.id.and1Btn:
                if (isConnectingToInternet())
                    new DownloadTaskhome(AndroidActivity.this, and1, Utilshome.downloadPdfand1);
                else
                    Toast.makeText(AndroidActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.and2Btn:
                if (isConnectingToInternet())
                    new DownloadTaskhome(AndroidActivity.this, and2, Utilshome.downloadPdfand2);
                else
                    Toast.makeText(AndroidActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.and3Btn:
                if (isConnectingToInternet())
                    new DownloadTaskhome(AndroidActivity.this, and3, Utilshome.downloadPdfand3);
                else
                    Toast.makeText(AndroidActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.and4Btn:
                if (isConnectingToInternet())
                    new DownloadTaskhome(AndroidActivity.this, and4, Utilshome.downloadPdfand4);
                else
                    Toast.makeText(AndroidActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.and5Btn:
                if (isConnectingToInternet())
                    new DownloadTaskhome(AndroidActivity.this, and5, Utilshome.downloadPdfand5);
                else
                    Toast.makeText(AndroidActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.and6Btn:
                if (isConnectingToInternet())
                    new DownloadTaskhome(AndroidActivity.this, and6, Utilshome.downloadPdfand6);
                else
                    Toast.makeText(AndroidActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.and7Btn:
                if (isConnectingToInternet())
                    new DownloadTaskhome(AndroidActivity.this, and7, Utilshome.downloadPdfand7);
                else
                    Toast.makeText(AndroidActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.and8Btn:
                if (isConnectingToInternet())
                    new DownloadTaskhome(AndroidActivity.this, and8, Utilshome.downloadPdfand8);
                else
                    Toast.makeText(AndroidActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.and9Btn:
                if (isConnectingToInternet())
                    new DownloadTaskhome(AndroidActivity.this, and9, Utilshome.downloadPdfand9);
                else
                    Toast.makeText(AndroidActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.and10Btn:
                if (isConnectingToInternet())
                    new DownloadTaskhome(AndroidActivity.this, and10, Utilshome.downloadPdfand10);
                else
                    Toast.makeText(AndroidActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
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


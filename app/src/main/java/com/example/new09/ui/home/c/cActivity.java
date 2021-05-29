package com.example.new09.ui.home.c;

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
Created bu puri sahib
 */
public class cActivity extends AppCompatActivity implements View.OnClickListener {
    private static Button c1,c2,c3,c4,c5;
    public Uri uri11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        initViews();
        setListeners();
    }
    //Initialize al Views
    private void initViews() {
        c1= (Button) findViewById(R.id.c1Btn);
        c2= (Button) findViewById(R.id.c2Btn);
        c3= (Button) findViewById(R.id.c3Btn);
        c4= (Button) findViewById(R.id.c4Btn);
        c5= (Button) findViewById(R.id.c5Btn);
    }
    //Set Listeners to Buttons
    private void setListeners() {
        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
        c4.setOnClickListener(this);
        c5.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        //Before starting any download check internet connection availability
        switch (view.getId()) {
            case R.id.c1Btn:
                if (isConnectingToInternet())
                    new DownloadTaskhome(cActivity.this, c1, Utilshome.downloadPdfc1);
                else
                    Toast.makeText(cActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.c2Btn:
                if (isConnectingToInternet())
                    new DownloadTaskhome(cActivity.this, c2, Utilshome.downloadPdfc2);
                else
                    Toast.makeText(cActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.c3Btn:
                if (isConnectingToInternet())
                    new DownloadTaskhome(cActivity.this, c3, Utilshome.downloadPdfc3);
                else
                    Toast.makeText(cActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.c4Btn:
                if (isConnectingToInternet())
                    new DownloadTaskhome(cActivity.this, c4, Utilshome.downloadPdfc4);
                else
                    Toast.makeText(cActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.c5Btn:
                if (isConnectingToInternet())
                    new DownloadTaskhome(cActivity.this, c5, Utilshome.downloadPdfc5);
                else
                    Toast.makeText(cActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
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


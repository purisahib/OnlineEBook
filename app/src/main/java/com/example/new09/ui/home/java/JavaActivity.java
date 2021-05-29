package com.example.new09.ui.home.java;

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

public class JavaActivity extends AppCompatActivity implements View.OnClickListener {

    private static Button j1,j2,j3,j4,j5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);
        initViews();
        setListeners();
    }
    //Initialize al Views
    private void initViews() {
        j1= (Button) findViewById(R.id.java1Btn);
        j2= (Button) findViewById(R.id.java2Btn);
        j3= (Button) findViewById(R.id.java3Btn);
        j4= (Button) findViewById(R.id.java4Btn);
        j5= (Button) findViewById(R.id.java5Btn);
    }
    //Set Listeners to Buttons
    private void setListeners() {
        j1.setOnClickListener(this);
        j2.setOnClickListener(this);
        j3.setOnClickListener(this);
        j4.setOnClickListener(this);
        j5.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        //Before starting any download check internet connection availability
        switch (view.getId()) {
            case R.id.java1Btn:
                if (isConnectingToInternet())
                    new DownloadTaskhome(JavaActivity.this, j1, Utilshome.downloadPdfj1);
                else
                    Toast.makeText(JavaActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.java2Btn:
                if (isConnectingToInternet())
                    new DownloadTaskhome(JavaActivity.this, j2, Utilshome.downloadPdfj2);
                else
                    Toast.makeText(JavaActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.java3Btn:
                if (isConnectingToInternet())
                    new DownloadTaskhome(JavaActivity.this, j3, Utilshome.downloadPdfj3);
                else
                    Toast.makeText(JavaActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.java4Btn:
                if (isConnectingToInternet())
                    new DownloadTaskhome(JavaActivity.this, j4, Utilshome.downloadPdfj4);
                else
                    Toast.makeText(JavaActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.java5Btn:
                if (isConnectingToInternet())
                    new DownloadTaskhome(JavaActivity.this, j5, Utilshome.downloadPdfj5);
                else
                    Toast.makeText(JavaActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
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

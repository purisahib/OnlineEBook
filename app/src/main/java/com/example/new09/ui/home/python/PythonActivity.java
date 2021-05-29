package com.example.new09.ui.home.python;

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
public class PythonActivity extends AppCompatActivity implements View.OnClickListener {
private static Button py1,py2,py3,py4,py5;
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python);
        initViews();
        setListeners();
        }
//Initialize al Views
private void initViews() {
        py1= (Button) findViewById(R.id.python1Btn);
        py2= (Button) findViewById(R.id.python2Btn);
        py3= (Button) findViewById(R.id.python3Btn);
        py4= (Button) findViewById(R.id.python4Btn);
        py5= (Button) findViewById(R.id.python5Btn);
        }
//Set Listeners to Buttons
private void setListeners() {
        py1.setOnClickListener(this);
        py2.setOnClickListener(this);
        py3.setOnClickListener(this);
        py4.setOnClickListener(this);
        py5.setOnClickListener(this);
        }
@Override
public void onClick(View view) {
        //Before starting any download check internet connection availability
        switch (view.getId()) {
        case R.id.python1Btn:
        if (isConnectingToInternet())
        new DownloadTaskhome(PythonActivity.this, py1, Utilshome.downloadPdfpy1);
        else
        Toast.makeText(PythonActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
        break;
        case R.id.python2Btn:
        if (isConnectingToInternet())
        new DownloadTaskhome(PythonActivity.this, py2, Utilshome.downloadPdfpy2);
        else
        Toast.makeText(PythonActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
        break;
        case R.id.python3Btn:
        if (isConnectingToInternet())
        new DownloadTaskhome(PythonActivity.this, py3, Utilshome.downloadPdfpy3);
        else
        Toast.makeText(PythonActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
        break;
        case R.id.python4Btn:
        if (isConnectingToInternet())
        new DownloadTaskhome(PythonActivity.this, py4, Utilshome.downloadPdfpy4);
        else
        Toast.makeText(PythonActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
        break;
        case R.id.python5Btn:
        if (isConnectingToInternet())
        new DownloadTaskhome(PythonActivity.this, py5, Utilshome.downloadPdfpy5);
        else
        Toast.makeText(PythonActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
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


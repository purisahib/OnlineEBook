package com.example.new09.ui.home.php;

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
public class PhpActivity extends AppCompatActivity implements View.OnClickListener {
private static Button ph1,ph2,ph3,ph4,ph5;
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_php);
        initViews();
        setListeners();
        }
//Initialize al Views
private void initViews() {
        ph1= (Button) findViewById(R.id.php1Btn);
        ph2= (Button) findViewById(R.id.php2Btn);
        ph3= (Button) findViewById(R.id.php3Btn);
        ph4= (Button) findViewById(R.id.php4Btn);
        ph5= (Button) findViewById(R.id.php5Btn);
        }
//Set Listeners to Buttons
private void setListeners() {
        ph1.setOnClickListener(this);
        ph2.setOnClickListener(this);
        ph3.setOnClickListener(this);
        ph4.setOnClickListener(this);
        ph5.setOnClickListener(this);
        }
@Override
public void onClick(View view) {
        //Before starting any download check internet connection availability
        switch (view.getId()) {
        case R.id.php1Btn:
        if (isConnectingToInternet())
        new DownloadTaskhome(PhpActivity.this, ph1, Utilshome.downloadPdfph1);
        else
        Toast.makeText(PhpActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
        break;
        case R.id.php2Btn:
        if (isConnectingToInternet())
        new DownloadTaskhome(PhpActivity.this, ph2, Utilshome.downloadPdfph2);
        else
        Toast.makeText(PhpActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
        break;
        case R.id.php3Btn:
        if (isConnectingToInternet())
        new DownloadTaskhome(PhpActivity.this, ph3, Utilshome.downloadPdfph3);
        else
        Toast.makeText(PhpActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
        break;
        case R.id.php4Btn:
        if (isConnectingToInternet())
        new DownloadTaskhome(PhpActivity.this, ph4, Utilshome.downloadPdfph4);
        else
        Toast.makeText(PhpActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
        break;
        case R.id.php5Btn:
        if (isConnectingToInternet())
        new DownloadTaskhome(PhpActivity.this, ph5, Utilshome.downloadPdfph5);
        else
        Toast.makeText(PhpActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
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


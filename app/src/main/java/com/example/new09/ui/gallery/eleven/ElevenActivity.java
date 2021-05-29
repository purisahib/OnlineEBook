package com.example.new09.ui.gallery.eleven;

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
created by puri sahib
 */
public class ElevenActivity extends AppCompatActivity implements View.OnClickListener {
    private static Button e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16,e17,e18,e19,e20,e21,e22,e23,e24,e25,
            e26,e27,e28,e29,e30,e31,e32,e33,e34,e35,e36,e37,e38,e39,e40,e41,e42,e43,e44,e45,e46,e47,e48,e49,e50,e51,e52,e53,e54;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleven);
        initViews();
        setListeners();
    }
    //Initialize al Views
    private void initViews() {
        e1= (Button) findViewById(R.id.eleven1Btn);
        e2= (Button) findViewById(R.id.eleven2Btn);
        e3= (Button) findViewById(R.id.eleven3Btn);
        e4= (Button) findViewById(R.id.eleven4Btn);
        e5= (Button) findViewById(R.id.eleven5Btn);
        e6= (Button) findViewById(R.id.eleven6Btn);
        e7= (Button) findViewById(R.id.eleven7Btn);
        e8= (Button) findViewById(R.id.eleven8Btn);
        e9= (Button) findViewById(R.id.eleven9Btn);
        e10= (Button) findViewById(R.id.eleven10Btn);

        e11= (Button) findViewById(R.id.eleven11Btn);
        e12= (Button) findViewById(R.id.eleven12Btn);
        e13= (Button) findViewById(R.id.eleven13Btn);
        e14= (Button) findViewById(R.id.eleven14Btn);
        e15= (Button) findViewById(R.id.eleven15Btn);
        e16= (Button) findViewById(R.id.eleven16Btn);
        e17= (Button) findViewById(R.id.eleven17Btn);
        e18= (Button) findViewById(R.id.eleven18Btn);
        e19= (Button) findViewById(R.id.eleven19Btn);
        e20= (Button) findViewById(R.id.eleven20Btn);

        e21= (Button) findViewById(R.id.eleven21Btn);
        e22= (Button) findViewById(R.id.eleven22Btn);
        e23= (Button) findViewById(R.id.eleven23Btn);
        e24= (Button) findViewById(R.id.eleven24Btn);
        e25= (Button) findViewById(R.id.eleven25Btn);
        e26= (Button) findViewById(R.id.eleven26Btn);
        e27= (Button) findViewById(R.id.eleven27Btn);
        e28= (Button) findViewById(R.id.eleven28Btn);
        e29= (Button) findViewById(R.id.eleven29Btn);
        e30= (Button) findViewById(R.id.eleven30Btn);

        e31= (Button) findViewById(R.id.eleven31Btn);
        e32= (Button) findViewById(R.id.eleven32Btn);
        e33= (Button) findViewById(R.id.eleven33Btn);
        e34= (Button) findViewById(R.id.eleven34Btn);
        e35= (Button) findViewById(R.id.eleven35Btn);
        e36= (Button) findViewById(R.id.eleven36Btn);
        e37= (Button) findViewById(R.id.eleven37Btn);
        e38= (Button) findViewById(R.id.eleven38Btn);
        e39= (Button) findViewById(R.id.eleven39Btn);
        e40= (Button) findViewById(R.id.eleven40Btn);

        e41= (Button) findViewById(R.id.eleven41Btn);
        e42= (Button) findViewById(R.id.eleven42Btn);
        e43= (Button) findViewById(R.id.eleven43Btn);
        e44= (Button) findViewById(R.id.eleven44Btn);
        e45= (Button) findViewById(R.id.eleven45Btn);
        e46= (Button) findViewById(R.id.eleven46Btn);
        e47= (Button) findViewById(R.id.eleven47Btn);
        e48= (Button) findViewById(R.id.eleven48Btn);
        e49= (Button) findViewById(R.id.eleven49Btn);
        e50= (Button) findViewById(R.id.eleven50Btn);

        e51= (Button) findViewById(R.id.eleven51Btn);
        e52= (Button) findViewById(R.id.eleven52Btn);
        e53= (Button) findViewById(R.id.eleven53Btn);
        e54= (Button) findViewById(R.id.eleven54Btn);
    }
    //Set Listeners to Buttons
    private void setListeners() {
        e1.setOnClickListener(this);
        e2.setOnClickListener(this);
        e3.setOnClickListener(this);
        e4.setOnClickListener(this);
        e5.setOnClickListener(this);
        e6.setOnClickListener(this);
        e7.setOnClickListener(this);
        e8.setOnClickListener(this);
        e9.setOnClickListener(this);
        e10.setOnClickListener(this);

        e11.setOnClickListener(this);
        e12.setOnClickListener(this);
        e13.setOnClickListener(this);
        e14.setOnClickListener(this);
        e15.setOnClickListener(this);
        e16.setOnClickListener(this);
        e17.setOnClickListener(this);
        e18.setOnClickListener(this);
        e19.setOnClickListener(this);
        e20.setOnClickListener(this);

        e21.setOnClickListener(this);
        e22.setOnClickListener(this);
        e23.setOnClickListener(this);
        e24.setOnClickListener(this);
        e25.setOnClickListener(this);
        e26.setOnClickListener(this);
        e27.setOnClickListener(this);
        e28.setOnClickListener(this);
        e29.setOnClickListener(this);
        e30.setOnClickListener(this);

        e31.setOnClickListener(this);
        e32.setOnClickListener(this);
        e33.setOnClickListener(this);
        e34.setOnClickListener(this);
        e35.setOnClickListener(this);
        e36.setOnClickListener(this);
        e37.setOnClickListener(this);
        e38.setOnClickListener(this);
        e39.setOnClickListener(this);
        e40.setOnClickListener(this);

        e41.setOnClickListener(this);
        e42.setOnClickListener(this);
        e43.setOnClickListener(this);
        e44.setOnClickListener(this);
        e45.setOnClickListener(this);
        e46.setOnClickListener(this);
        e47.setOnClickListener(this);
        e48.setOnClickListener(this);
        e49.setOnClickListener(this);
        e50.setOnClickListener(this);

        e51.setOnClickListener(this);
        e52.setOnClickListener(this);
        e53.setOnClickListener(this);
        e54.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        //Before starting any download check internet connection availability
        switch (view.getId()) {
            case R.id.eleven1Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e1, UtilsSchool.downloadPdfel1);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven2Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e2, UtilsSchool.downloadPdfel2);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven3Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e3, UtilsSchool.downloadPdfel3);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven4Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e4, UtilsSchool.downloadPdfel4);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven5Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e5, UtilsSchool.downloadPdfel5);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven6Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e6, UtilsSchool.downloadPdfel6);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven7Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e7, UtilsSchool.downloadPdfel7);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven8Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e8, UtilsSchool.downloadPdfel8);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven9Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e9, UtilsSchool.downloadPdfel9);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven10Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e10, UtilsSchool.downloadPdfel10);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven11Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e11, UtilsSchool.downloadPdfel11);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven12Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e12, UtilsSchool.downloadPdfel12);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven13Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e13, UtilsSchool.downloadPdfel13);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven14Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e14, UtilsSchool.downloadPdfel14);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven15Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e15, UtilsSchool.downloadPdfel15);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven16Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e16, UtilsSchool.downloadPdfel16);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven17Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e17, UtilsSchool.downloadPdfel17);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven18Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e18, UtilsSchool.downloadPdfel18);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven19Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e19, UtilsSchool.downloadPdfel19);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven20Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e20, UtilsSchool.downloadPdfel20);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven21Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e21, UtilsSchool.downloadPdfel21);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven22Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e22, UtilsSchool.downloadPdfel22);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven23Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e23, UtilsSchool.downloadPdfel23);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven24Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e24, UtilsSchool.downloadPdfel24);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven25Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e25, UtilsSchool.downloadPdfel25);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven26Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e26, UtilsSchool.downloadPdfel26);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven27Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e27, UtilsSchool.downloadPdfel27);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven28Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e28, UtilsSchool.downloadPdfel28);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven29Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e29, UtilsSchool.downloadPdfel29);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven30Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e30, UtilsSchool.downloadPdfel30);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven31Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e31, UtilsSchool.downloadPdfel31);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven32Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e32, UtilsSchool.downloadPdfel32);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven33Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e33, UtilsSchool.downloadPdfel33);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven34Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e34, UtilsSchool.downloadPdfel34);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven35Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e35, UtilsSchool.downloadPdfel35);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven36Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e36, UtilsSchool.downloadPdfel36);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven37Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e37, UtilsSchool.downloadPdfel37);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven38Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e38, UtilsSchool.downloadPdfel38);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven39Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e39, UtilsSchool.downloadPdfel39);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven40Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e40, UtilsSchool.downloadPdfel40);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven41Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e41, UtilsSchool.downloadPdfel41);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven42Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e42, UtilsSchool.downloadPdfel42);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven43Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e43, UtilsSchool.downloadPdfel43);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven44Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e44, UtilsSchool.downloadPdfel44);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven45Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e45, UtilsSchool.downloadPdfel45);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven46Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e46, UtilsSchool.downloadPdfel46);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven47Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e47, UtilsSchool.downloadPdfel47);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven48Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e48, UtilsSchool.downloadPdfel48);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven49Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e49, UtilsSchool.downloadPdfel49);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven50Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e50, UtilsSchool.downloadPdfel50);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven51Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e51, UtilsSchool.downloadPdfel51);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven52Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e52, UtilsSchool.downloadPdfel52);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven53Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e53, UtilsSchool.downloadPdfel53);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eleven54Btn:
                if (isConnectingToInternet())
                    new DownloadEleven(ElevenActivity.this, e54, UtilsSchool.downloadPdfel54);
                else
                    Toast.makeText(ElevenActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
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


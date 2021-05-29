package com.example.new09.ui.gallery.twelve;

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
public class TwelveActivity  extends AppCompatActivity implements View.OnClickListener {
    private static Button tw1,tw2,tw3,tw4,tw5,tw6,tw7,tw8,tw9,tw10,tw11,tw12,tw13,tw14,tw15,tw16,tw17,tw18,tw19,tw20,
            tw21,tw22,tw23,tw24,tw25,tw26,tw27,tw28,tw29,tw30,tw31,tw32,tw33,tw34,tw35,tw36,tw37,tw38,tw39,tw40,tw41,
            tw42,tw43,tw44,tw45,tw46,tw47,tw48,tw49,tw50,tw51,tw52,tw53,tw54,tw55,tw56,tw57,tw58;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twelve);
        initViews();
        setListeners();
    }
    //Initialize al Views
    private void initViews() {
        tw1= (Button) findViewById(R.id.twelve1Btn);
        tw2= (Button) findViewById(R.id.twelve2Btn);
        tw3= (Button) findViewById(R.id.twelve3Btn);
        tw4= (Button) findViewById(R.id.twelve4Btn);
        tw5= (Button) findViewById(R.id.twelve5Btn);
        tw6= (Button) findViewById(R.id.twelve6Btn);
        tw7= (Button) findViewById(R.id.twelve7Btn);
        tw8= (Button) findViewById(R.id.twelve8Btn);
        tw9= (Button) findViewById(R.id.twelve9Btn);
        tw10= (Button) findViewById(R.id.twelve10Btn);
        tw11= (Button) findViewById(R.id.twelve11Btn);
        tw12= (Button) findViewById(R.id.twelve12Btn);
        tw13= (Button) findViewById(R.id.twelve13Btn);
        tw14= (Button) findViewById(R.id.twelve14Btn);
        tw15= (Button) findViewById(R.id.twelve15Btn);
        tw16= (Button) findViewById(R.id.twelve16Btn);
        tw17= (Button) findViewById(R.id.twelve17Btn);
        tw18= (Button) findViewById(R.id.twelve18Btn);
        tw19= (Button) findViewById(R.id.twelve19Btn);
        tw20=(Button)findViewById(R.id.twelve20Btn);

        tw21=(Button)findViewById(R.id.twelve21Btn);
        tw22=(Button)findViewById(R.id.twelve22Btn);
        tw23=(Button)findViewById(R.id.twelve23Btn);
        tw24=(Button)findViewById(R.id.twelve24Btn);
        tw25=(Button)findViewById(R.id.twelve25Btn);
        tw26=(Button)findViewById(R.id.twelve26Btn);
        tw27=(Button)findViewById(R.id.twelve27Btn);
        tw28=(Button)findViewById(R.id.twelve28Btn);
        tw29=(Button)findViewById(R.id.twelve29Btn);
        tw30=(Button)findViewById(R.id.twelve30Btn);
        tw31=(Button)findViewById(R.id.twelve31Btn);
        tw32=(Button)findViewById(R.id.twelve32Btn);
        tw33=(Button)findViewById(R.id.twelve33Btn);
        tw34=(Button)findViewById(R.id.twelve34Btn);
        tw35=(Button)findViewById(R.id.twelve35Btn);
        tw36=(Button)findViewById(R.id.twelve36Btn);
        tw37=(Button)findViewById(R.id.twelve37Btn);
        tw38=(Button)findViewById(R.id.twelve38Btn);
        tw39=(Button)findViewById(R.id.twelve39Btn);
        tw40=(Button)findViewById(R.id.twelve40Btn);

        tw41=(Button)findViewById(R.id.twelve41Btn);
        tw42=(Button)findViewById(R.id.twelve42Btn);
        tw43=(Button)findViewById(R.id.twelve43Btn);
        tw44=(Button)findViewById(R.id.twelve44Btn);
        tw45=(Button)findViewById(R.id.twelve45Btn);
        tw46=(Button)findViewById(R.id.twelve46Btn);
        tw47=(Button)findViewById(R.id.twelve47Btn);
        tw48=(Button)findViewById(R.id.twelve48Btn);
        tw49=(Button)findViewById(R.id.twelve49Btn);
        tw50=(Button)findViewById(R.id.twelve50Btn);
        tw51=(Button)findViewById(R.id.twelve51Btn);
        tw52=(Button)findViewById(R.id.twelve52Btn);
        tw53=(Button)findViewById(R.id.twelve53Btn);
        tw54=(Button)findViewById(R.id.twelve54Btn);
        tw55=(Button)findViewById(R.id.twelve55Btn);
        tw56=(Button)findViewById(R.id.twelve56Btn);
        tw57=(Button)findViewById(R.id.twelve57Btn);
        tw58=(Button)findViewById(R.id.twelve58Btn);
    }
    //Set Listeners to Buttons
    private void setListeners() {
        tw1.setOnClickListener(this);
        tw2.setOnClickListener(this);
        tw3.setOnClickListener(this);
        tw4.setOnClickListener(this);
        tw5.setOnClickListener(this);
        tw6.setOnClickListener(this);
        tw7.setOnClickListener(this);
        tw8.setOnClickListener(this);
        tw9.setOnClickListener(this);
        tw10.setOnClickListener(this);
        tw11.setOnClickListener(this);
        tw12.setOnClickListener(this);
        tw13.setOnClickListener(this);
        tw14.setOnClickListener(this);
        tw15.setOnClickListener(this);
        tw16.setOnClickListener(this);
        tw17.setOnClickListener(this);
        tw18.setOnClickListener(this);
        tw19.setOnClickListener(this);
        tw20.setOnClickListener(this);

        tw22.setOnClickListener(this);
        tw22.setOnClickListener(this);
        tw23.setOnClickListener(this);
        tw24.setOnClickListener(this);
        tw25.setOnClickListener(this);
        tw26.setOnClickListener(this);
        tw27.setOnClickListener(this);
        tw28.setOnClickListener(this);
        tw29.setOnClickListener(this);
        tw30.setOnClickListener(this);
        tw31.setOnClickListener(this);
        tw32.setOnClickListener(this);
        tw33.setOnClickListener(this);
        tw34.setOnClickListener(this);
        tw35.setOnClickListener(this);
        tw36.setOnClickListener(this);
        tw37.setOnClickListener(this);
        tw38.setOnClickListener(this);
        tw39.setOnClickListener(this);
        tw40.setOnClickListener(this);

        tw41.setOnClickListener(this);
        tw42.setOnClickListener(this);
        tw43.setOnClickListener(this);
        tw44.setOnClickListener(this);
        tw45.setOnClickListener(this);
        tw46.setOnClickListener(this);
        tw47.setOnClickListener(this);
        tw48.setOnClickListener(this);
        tw49.setOnClickListener(this);
        tw50.setOnClickListener(this);
        tw51.setOnClickListener(this);
        tw52.setOnClickListener(this);
        tw53.setOnClickListener(this);
        tw54.setOnClickListener(this);
        tw55.setOnClickListener(this);
        tw56.setOnClickListener(this);
        tw57.setOnClickListener(this);
        tw58.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        //Before starting any download check internet connection availability
        switch (view.getId()) {
            case R.id.twelve1Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw1, UtilsSchool.downloadPdftw1);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve2Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw2, UtilsSchool.downloadPdftw2);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve3Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw3, UtilsSchool.downloadPdftw3);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve4Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw4, UtilsSchool.downloadPdftw4);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve5Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw5, UtilsSchool.downloadPdftw5);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve6Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw6, UtilsSchool.downloadPdftw6);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve7Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw7, UtilsSchool.downloadPdftw7);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve8Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw8, UtilsSchool.downloadPdftw8);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve9Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw9, UtilsSchool.downloadPdftw9);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve10Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw10, UtilsSchool.downloadPdftw10);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve11Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw11, UtilsSchool.downloadPdftw11);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve12Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw12, UtilsSchool.downloadPdftw12);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve13Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw13, UtilsSchool.downloadPdftw13);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve14Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw14, UtilsSchool.downloadPdftw14);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve15Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw15, UtilsSchool.downloadPdftw15);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve16Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw16, UtilsSchool.downloadPdftw16);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve17Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw17, UtilsSchool.downloadPdftw17);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve18Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw18, UtilsSchool.downloadPdftw18);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve19Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw19, UtilsSchool.downloadPdftw19);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve20Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw20, UtilsSchool.downloadPdftw20);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve21Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw21, UtilsSchool.downloadPdftw21);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve22Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw22, UtilsSchool.downloadPdftw22);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve23Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw23, UtilsSchool.downloadPdftw23);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve24Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw24, UtilsSchool.downloadPdftw24);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve25Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw25, UtilsSchool.downloadPdftw25);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve26Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw26, UtilsSchool.downloadPdftw26);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve27Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw27, UtilsSchool.downloadPdftw27);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve28Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw28, UtilsSchool.downloadPdftw28);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve29Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw29, UtilsSchool.downloadPdftw29);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve30Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw30, UtilsSchool.downloadPdftw30);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve31Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw31, UtilsSchool.downloadPdftw31);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve32Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw32, UtilsSchool.downloadPdftw32);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve33Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw33, UtilsSchool.downloadPdftw33);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve34Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw34, UtilsSchool.downloadPdftw34);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve35Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw35, UtilsSchool.downloadPdftw35);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve36Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw36, UtilsSchool.downloadPdftw36);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve37Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw37, UtilsSchool.downloadPdftw37);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve38Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw38, UtilsSchool.downloadPdftw38);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve39Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw39, UtilsSchool.downloadPdftw39);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve40Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw40, UtilsSchool.downloadPdftw40);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve41Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw41, UtilsSchool.downloadPdftw41);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve42Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw42, UtilsSchool.downloadPdftw42);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve43Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw43, UtilsSchool.downloadPdftw43);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve44Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw44, UtilsSchool.downloadPdftw44);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve45Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw45, UtilsSchool.downloadPdftw45);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve46Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw45, UtilsSchool.downloadPdftw46);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve47Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw47, UtilsSchool.downloadPdftw47);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve48Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw48, UtilsSchool.downloadPdftw48);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve49Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw49, UtilsSchool.downloadPdftw49);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve50Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw50, UtilsSchool.downloadPdftw50);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve51Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw51, UtilsSchool.downloadPdftw51);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve52Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw52, UtilsSchool.downloadPdftw52);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve53Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw53, UtilsSchool.downloadPdftw53);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve54Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw54, UtilsSchool.downloadPdftw54);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve55Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw55, UtilsSchool.downloadPdftw55);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve56Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw56, UtilsSchool.downloadPdftw56);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve57Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw57, UtilsSchool.downloadPdftw57);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.twelve58Btn:
                if (isConnectingToInternet())
                    new DownloadTwelve(TwelveActivity.this, tw58, UtilsSchool.downloadPdftw58);
                else
                    Toast.makeText(TwelveActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
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

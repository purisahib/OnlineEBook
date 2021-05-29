package com.example.new09.ui.gallery.nine;

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
import com.example.new09.ui.gallery.UtilsSchool;

/*
Createn by puri sahib
 */
public class NineActivity extends AppCompatActivity implements View.OnClickListener {
    private static Button n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14,n15,n16,n17,n18,n19,n11openDownloadedFolder, openPdf;
    public Uri uri11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nine);
        initViews();
        setListeners();
    }
    //Initialize al Views
    private void initViews() {
        n1= (Button) findViewById(R.id.nine1Btn);
        n2= (Button) findViewById(R.id.nine2Btn);
        n3= (Button) findViewById(R.id.nine3Btn);
        n4= (Button) findViewById(R.id.nine4Btn);
        n5= (Button) findViewById(R.id.nine5Btn);
        n6= (Button) findViewById(R.id.nine6Btn);
        n7= (Button) findViewById(R.id.nine7Btn);
        n8= (Button) findViewById(R.id.nine8Btn);
        n9= (Button) findViewById(R.id.nine9Btn);
        n10= (Button) findViewById(R.id.nine10Btn);
        n11= (Button) findViewById(R.id.nine11Btn);
        n12= (Button) findViewById(R.id.nine12Btn);
        n13= (Button) findViewById(R.id.nine13Btn);
        n14= (Button) findViewById(R.id.nine14Btn);
        n15= (Button) findViewById(R.id.nine15Btn);
        n16= (Button) findViewById(R.id.nine16Btn);
        n17= (Button) findViewById(R.id.nine17Btn);
        n18= (Button) findViewById(R.id.nine18Btn);
        n19= (Button) findViewById(R.id.nine19Btn);
        //openDownloadedFolder = (Button) findViewById(R.id.openDownloadedFolder);
        //openPdf=(Button)findViewById( R.id.openPdf );
    }
    //Set Listeners to Buttons
    private void setListeners() {
        n1.setOnClickListener(this);
        n2.setOnClickListener(this);
        n3.setOnClickListener(this);
        n4.setOnClickListener(this);
        n5.setOnClickListener(this);
        n6.setOnClickListener(this);
        n7.setOnClickListener(this);
        n8.setOnClickListener(this);
        n9.setOnClickListener(this);
        n10.setOnClickListener(this);
        n11.setOnClickListener(this);
        n12.setOnClickListener(this);
        n13.setOnClickListener(this);
        n14.setOnClickListener(this);
        n15.setOnClickListener(this);
        n16.setOnClickListener(this);
        n17.setOnClickListener(this);
        n18.setOnClickListener(this);
        n19.setOnClickListener(this);
        //openDownloadedFolder.setOnClickListener(this);
        //openPdf.setOnClickListener( this );
    }
    @Override
    public void onClick(View view) {
        //Before starting any download check internet connection availability
        switch (view.getId()) {
            case R.id.nine1Btn:
                if (isConnectingToInternet())
                    new DownloadTasknine(NineActivity.this, n1,UtilsSchool.downloadPdfn1);
                else
                    Toast.makeText(NineActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nine2Btn:
                if (isConnectingToInternet())
                    new DownloadTasknine(NineActivity.this, n2, UtilsSchool.downloadPdfn2);
                else
                    Toast.makeText(NineActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nine3Btn:
                if (isConnectingToInternet())
                    new DownloadTasknine(NineActivity.this, n3, UtilsSchool.downloadPdfn3);
                else
                    Toast.makeText(NineActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nine4Btn:
                if (isConnectingToInternet())
                    new DownloadTasknine(NineActivity.this, n4, UtilsSchool.downloadPdfn4);
                else
                    Toast.makeText(NineActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nine5Btn:
                if (isConnectingToInternet())
                    new DownloadTasknine(NineActivity.this, n5, UtilsSchool.downloadPdfn5);
                else
                    Toast.makeText(NineActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nine6Btn:
                if (isConnectingToInternet())
                    new DownloadTasknine(NineActivity.this, n6, UtilsSchool.downloadPdfn6);
                else
                    Toast.makeText(NineActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nine7Btn:
                if (isConnectingToInternet())
                    new DownloadTasknine(NineActivity.this, n7, UtilsSchool.downloadPdfn7);
                else
                    Toast.makeText(NineActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nine8Btn:
                if (isConnectingToInternet())
                    new DownloadTasknine(NineActivity.this, n8, UtilsSchool.downloadPdfn8);
                else
                    Toast.makeText(NineActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nine9Btn:
                if (isConnectingToInternet())
                    new DownloadTasknine(NineActivity.this, n9, UtilsSchool.downloadPdfn9);
                else
                    Toast.makeText(NineActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nine10Btn:
                if (isConnectingToInternet())
                    new DownloadTasknine(NineActivity.this, n10, UtilsSchool.downloadPdfn10);
                else
                    Toast.makeText(NineActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nine11Btn:
                if (isConnectingToInternet())
                    new DownloadTasknine(NineActivity.this, n11, UtilsSchool.downloadPdfn11);
                else
                    Toast.makeText(NineActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nine12Btn:
                if (isConnectingToInternet())
                    new DownloadTasknine(NineActivity.this, n12, UtilsSchool.downloadPdfn12);
                else
                    Toast.makeText(NineActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nine13Btn:
                if (isConnectingToInternet())
                    new DownloadTasknine(NineActivity.this, n13, UtilsSchool.downloadPdfn13);
                else
                    Toast.makeText(NineActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nine14Btn:
                if (isConnectingToInternet())
                    new DownloadTasknine(NineActivity.this, n14, UtilsSchool.downloadPdfn14);
                else
                    Toast.makeText(NineActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nine15Btn:
                if (isConnectingToInternet())
                    new DownloadTasknine(NineActivity.this, n15, UtilsSchool.downloadPdfn15);
                else
                    Toast.makeText(NineActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nine16Btn:
                if (isConnectingToInternet())
                    new DownloadTasknine(NineActivity.this, n16, UtilsSchool.downloadPdfn16);
                else
                    Toast.makeText(NineActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nine17Btn:
                if (isConnectingToInternet())
                    new DownloadTasknine(NineActivity.this, n17, UtilsSchool.downloadPdfn17);
                else
                    Toast.makeText(NineActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nine18Btn:
                if (isConnectingToInternet())
                    new DownloadTasknine(NineActivity.this, n18, UtilsSchool.downloadPdfn18);
                else
                    Toast.makeText(NineActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nine19Btn:
                if (isConnectingToInternet())
                    new DownloadTasknine(NineActivity.this, n19, UtilsSchool.downloadPdfn19);
                else
                    Toast.makeText(NineActivity.this, "Oops!! There is no internet connection. Please enable internet connection and try again.", Toast.LENGTH_SHORT).show();
                break;
            /*case R.id.openDownloadedFolder:
                openDownloadedFolder();
                break;
            case R.id.openPdf:

                openpdfPdf();
                break;*/
        }
    }
    /*public void openpdfPdf() {
        startActivity( new Intent( C_Activity.this,Main2Activity.class ) );
        Main2Activity main=new Main2Activity();
        main.send(uri11);
        //uri11;
    }

    //Open downloaded folder
    public void openDownloadedFolder() {
        //First check if SD Card is present or not
        if (new CheckForSDCard().isSDCardPresent()) {

            //Get Download Directory File
            File apkStorage = new File(
                    Environment.getExternalStorageDirectory() + "/"
                            + Utils.downloadDirectory);

            //If file is not present then display Toast
            if (!apkStorage.exists())
                Toast.makeText(C_Activity.this, "Right now there is no directory. Please download some file first.", Toast.LENGTH_SHORT).show();

            else {

                //If directory is present Open Folder

                /** Note: Directory will open only if there is a app to open directory like File Manager, etc.  **/
/*
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                Uri uri = Uri.parse(Environment.getExternalStorageDirectory().getPath()
                        + "/" + Utils.downloadDirectory);
                uri11=Uri.parse(Environment.getExternalStorageDirectory().getPath()+"/"+"Androhub Downloads"+"/"+"demo.pdf");
                Toast.makeText( C_Activity.this,uri11+"---get open---",Toast.LENGTH_SHORT ).show();
                intent.setDataAndType(uri, "file/*");
                startActivity(Intent.createChooser(intent, "Open Download Folder"));
            }

        } else
            Toast.makeText(C_Activity.this, "Oops!! There is no SD Card.", Toast.LENGTH_SHORT).show();

    }
*/
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


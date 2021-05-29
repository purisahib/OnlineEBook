package com.example.new09.ui.download;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.ContextMenu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.MutableLiveData;

import com.example.new09.R;

import java.io.File;
import java.util.ArrayList;

public class SchoolFile extends AppCompatActivity {
    //create list view for vsual list
    ListView lv_pdf;
    public static ArrayList <File> fileList = new ArrayList<File>();
    SchoolPdfAdapter obj_adapter;
    public static int REQUEST_PERMISSIONS = 1;
    boolean boolean_permission;
    File dir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_file);
        init();
    }//Environment.getExternalStorageDirectory()
    private void init() {
        lv_pdf = (ListView) findViewById(R.id.schoolFile);
        dir = new File( Environment.getExternalStoragePublicDirectory(".School/").getAbsolutePath());
        fn_permission();
        lv_pdf.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), SchoolPdfActivity.class);
                intent.putExtra("position", i);
                startActivity(intent);

                Log.e("Position", i +"");
            }
        });
    }

    private void fn_permission() {
        if ((ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED)) {

            if ((ActivityCompat.shouldShowRequestPermissionRationale(SchoolFile.this, Manifest.permission.READ_EXTERNAL_STORAGE))) {
            } else {
                ActivityCompat.requestPermissions(SchoolFile.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                        REQUEST_PERMISSIONS);

            }
        } else {
            boolean_permission = true;

            getfile(dir);

            obj_adapter = new SchoolPdfAdapter(getApplicationContext(), fileList);
            lv_pdf.setAdapter(obj_adapter);

        }
    }

    public ArrayList<File> getfile(File dir) {
        File listFile[] = dir.listFiles();
        if (listFile != null && listFile.length > 0) {
            for (int i = 0; i < listFile.length; i++) {

                if (listFile[i].isDirectory()) {
                    getfile(listFile[i]);

                } else {

                    boolean booleanpdf = false;
                    if (listFile[i].getName().endsWith(".pdf")) {

                        for (int j = 0; j < fileList.size(); j++) {
                            if (fileList.get(j).getName().equals(listFile[i].getName())) {
                                booleanpdf = true;
                            } else {

                            }
                        }

                        if (booleanpdf) {
                            booleanpdf = false;
                        } else {
                            fileList.add(listFile[i]);

                        }
                    }
                }
            }
        }
        return fileList;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult( requestCode, permissions, grantResults );
        if (requestCode == REQUEST_PERMISSIONS) {

            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                boolean_permission = true;
                getfile(dir);

                obj_adapter = new SchoolPdfAdapter(getApplicationContext(), fileList);
                lv_pdf.setAdapter(obj_adapter);

            } else {
                Toast.makeText(getApplicationContext(), "Please allow the permission", Toast.LENGTH_LONG).show();

            }
        }
    }
    private void openDownloadedFolder() {
        //First check if SD Card is present or not
        //if (new CheckForSDCard().isSDCardPresent()) {

        //Get Download Directory File


        //If file is not present then display Toast
        //if (!apkStorage.exists())
        // Toast.makeText(MainActivity.this, "Right now there is no directory. Please download some file first.", Toast.LENGTH_SHORT).show();

        // else {

        //If directory is present Open Folder

        /** Note: Directory will open only if there is a app to open directory like File Manager, etc.  **/

        //Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        //Uri uri = Uri.parse(Environment.getExternalStorageDirectory().getPath()
        ///      + "/" + Utils.downloadDirectory);
        //uri11=Uri.parse(Environment.getExternalStorageDirectory().getPath()+"/"+"Androhub Downloads"+"/"+"demo.pdf");
        //Toast.makeText( MainActivity.this,uri11+"---get open---",Toast.LENGTH_SHORT ).show();
        //intent.setDataAndType(uri, "file/*");
        //startActivity(Intent.createChooser(intent, "Open Download Folder"));
        // }

        //} else
        //  Toast.makeText(MainActivity.this, "Oops!! There is no SD Card.", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        if(v.getId() == R.id.schoolFile){
            menu.add(0,0,0,"Delete");
        }
    }

    private MutableLiveData<String> mText;

    /*public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }*/


}

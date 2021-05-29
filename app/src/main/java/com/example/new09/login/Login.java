package com.example.new09.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import com.example.new09.MainStart;
import com.example.new09.R;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //setContentView(activity_login);
        setContentView(R.layout.activity_login);
        Intent intent=new Intent(Login.this, MainStart.class);
        startActivity(intent);
    }
}

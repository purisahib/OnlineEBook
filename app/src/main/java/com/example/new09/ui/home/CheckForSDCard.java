package com.example.new09.ui.home;

import android.os.Environment;

/*
Createn by puri sahib
 */
public class CheckForSDCard {
    //Check If SD Card is present or not method
    public boolean isSDCardPresent() {
        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
            return true;
        }
        return false;
    }
}

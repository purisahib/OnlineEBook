package com.example.new09.ui.download;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.new09.R;

import java.io.File;
import java.util.ArrayList;

/*
Created by puri sahib
 */
public class CollegePdfAdapter extends ArrayAdapter<File> {
    Context context;
    ViewHolder viewHolder;
    ArrayList<File> al_pdf;
    public CollegePdfAdapter(Context context2, ArrayList<File> al2_pdf) {
        super(context2, R.layout.activity_college_pdf_adapter, al2_pdf);
        this.context = context2;
        this.al_pdf = al2_pdf;
    }
    @Override
    public int getItemViewType(int position) {
        return position;
    }
    @Override
    public int getViewTypeCount() {
        if (al_pdf.size() > 0) {
            return al_pdf.size();
        } else {
            return 1;
        }
    }
    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.activity_college_pdf_adapter, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.tv_filename = (TextView) view.findViewById(R.id.tv_name);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.tv_filename.setText(al_pdf.get(position).getName());
        return view;
    }
    public class ViewHolder {
        TextView tv_filename;
    }
}

package com.example.new09.ui.download;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.new09.R;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;
import com.shockwave.pdfium.PdfDocument;

import java.util.List;

/*
Created by puri sahib
 */
public class OpenUs extends AppCompatActivity implements OnPageChangeListener, OnLoadCompleteListener {
    Integer pageNumber = 0;
    String pdfFileName;
    PDFView pdfView;
    String TAG="PdfActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_open_us);
        inti();
    }

    private void inti() {
        //System.out.println(go);
        //PDF View
        pdfView=findViewById( R.id.pdfView );
        displayFromSdCard();

    }

    private void displayFromSdCard() {
        pdfFileName = DownloadFragment.path.toString();
        pdfView.fromFile(DownloadFragment.path)
                .defaultPage(pageNumber)
                .enableSwipe(true)
                .swipeHorizontal(false)
                .onPageChange(this)
                .enableAnnotationRendering(true)
                .onLoad(this)
                .scrollHandle(new DefaultScrollHandle(this))
                .load();
    }

    @Override
    public void onPageChanged(int page, int pageCount) {
        pageNumber = page;
        setTitle(String.format("%s %s / %s", pdfFileName, page + 1, pageCount));
    }
    @Override
    public void loadComplete(int nbPages) {
        PdfDocument.Meta meta = pdfView.getDocumentMeta();
        printBookmarksTree(pdfView.getTableOfContents(), "-");

    }
    public void printBookmarksTree(List<PdfDocument.Bookmark> tree, String sep) {
        for (PdfDocument.Bookmark b : tree) {

            Log.e(TAG, String.format("%s %s, p %d", sep, b.getTitle(), b.getPageIdx()));

            if (b.hasChildren()) {
                printBookmarksTree(b.getChildren(), sep + "-");
            }
        }
    }
}
/*lets add pdf support libarary
 * adding layout
 * create assets folder and place a pdf in it
 * loading the pdf
 * run and test the app*/



package info.main.bioapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.barteksc.pdfviewer.PDFView

class pdffrActivity : AppCompatActivity() {
    private lateinit var pdfView: PDFView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdffr)
        pdfView= findViewById(R.id.pdfview2)
        pdfView.fromAsset("I8951FR.pdf").load()

    }
}
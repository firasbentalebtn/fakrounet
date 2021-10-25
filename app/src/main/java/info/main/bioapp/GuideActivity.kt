package info.main.bioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView


class GuideActivity : AppCompatActivity() {
    private lateinit var btnFr: Button
    private lateinit var btnAr: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guide)
    btnFr = findViewById(R.id.pdfFr)
    btnAr = findViewById(R.id.pdfAr)
        btnAr.setOnClickListener {
            val intent = Intent(this,pdfarActivity::class.java)
            startActivity(intent)
        }
        btnFr.setOnClickListener {
            val intent = Intent(this,pdffrActivity::class.java)
            startActivity(intent)
        }
    }
}
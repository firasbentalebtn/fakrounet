package info.main.bioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView


class GuideActivity : AppCompatActivity() {
    private lateinit var btnAr: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guide)
    btnAr = findViewById(R.id.pdfFr)
        btnAr.setOnClickListener {
            val intent = Intent(this,pdfarActivity::class.java)
            startActivity(intent)
        }
    }
}
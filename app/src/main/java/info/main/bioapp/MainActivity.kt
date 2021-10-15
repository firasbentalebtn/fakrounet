package info.main.bioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

private lateinit var card1: CardView
private lateinit var card2: CardView
private lateinit var card3: CardView
private lateinit var card4: CardView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        card1 = findViewById(R.id.card1)
        card2 = findViewById(R.id.card2)
        card3 = findViewById(R.id.card3)
        card4 = findViewById(R.id.card4)
        card1.setOnClickListener {
            val intent = Intent(this, GuideActivity::class.java)
            startActivity(intent)        }
        card2.setOnClickListener {
            val intent = Intent(this, MapsActivity::class.java)
            startActivity(intent)        }
        card3.setOnClickListener {
            val intent = Intent(this, SeoActivity::class.java)
            startActivity(intent)        }
        card4.setOnClickListener {
            val intent = Intent(this, ContactActivity::class.java)
            startActivity(intent)        }


    }
}
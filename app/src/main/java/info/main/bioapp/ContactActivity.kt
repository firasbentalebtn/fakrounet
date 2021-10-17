package info.main.bioapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import info.main.bioapp.Adabters.feedback


class ContactActivity : AppCompatActivity() {
    private lateinit var feedbackbtn:Button
    lateinit var feedbackInput:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)
        feedbackbtn = findViewById(R.id.feedback_btn)
        feedbackInput =findViewById(R.id.inputFeedback)
        feedbackbtn.setOnClickListener {
            saveData()
        }
    }

    private fun saveData() {
        val data =feedbackInput.text.toString().trim()
        if(data.isEmpty()){
            feedbackInput.error="Veuiller ecrire"
            return
        }
        val feedbackData = feedback(data)
        val ref = FirebaseDatabase.getInstance().reference
        ref.child("feedback-data").push().setValue(data)
    }

}
package com.example.praktika4

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textView3: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        textView3 = findViewById(R.id.textView3)
        var imageButton: ImageButton = findViewById(R.id.imageButton2)
        var editText: EditText = findViewById(R.id.editTextPersonName)

        imageButton.setOnClickListener {

            if (editText.text.isEmpty()) {
                textView3.text = "Hello chel"
            } else {
                textView3.text = "Hello ${editText.text}  how are you"


            }


        }
        var editText4: EditText = findViewById(R.id.editText4)
        var moodButton: Button = findViewById(R.id.button)
        var textView: TextView = findViewById(R.id.textView)
        moodButton.setOnClickListener {

            if (editText4.text.toString() == "Нормально") {

                textView.text = "Рад что у тебя всё нормально"
                imageButton.setImageResource(R.drawable.norm)

            }
            if (editText4.text.toString() == "Хорошо") {

                textView.text = "Рад что у тебя всё хорошо"

                imageButton.setImageResource(R.drawable.zoro)
            }
            if (editText4.text.toString() == "ХОРОШО") {

                textView.text = "МОСКВА ПЬЁТ ПИВО"
                imageButton.setImageResource(R.drawable.v)

            }
        }
    }
}
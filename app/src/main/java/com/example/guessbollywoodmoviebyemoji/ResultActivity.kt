package com.example.guessbollywoodmoviebyemoji

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName:TextView = findViewById(R.id.tv_name)
        val btnFinish : Button = findViewById(R.id.btn_finish)
        val tvScore : TextView = findViewById(R.id.tv_score)

        tvName.text = intent.getStringExtra(constants.USER_NAME)
        val totalQues = intent.getIntExtra(constants.Total_QUESTIONS,0)
        val correctAnswer = intent.getIntExtra(constants.CORRECT_ANSWERS,0)

        tvScore.text = "Your score is $correctAnswer out of $totalQues"

        btnFinish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))

        }






    }
}
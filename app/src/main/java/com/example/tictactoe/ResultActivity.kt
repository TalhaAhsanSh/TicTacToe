package com.example.tictactoe

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    private lateinit var resultTv: TextView
    private lateinit var btn: Button
    private lateinit var homeButton : ImageButton

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        btn = findViewById(R.id.playAgainBtn)
        resultTv = findViewById(R.id.resultTv)
        homeButton = findViewById(R.id.homeBtn)
        val winner = intent.getStringExtra("Winner")
        val name1 = intent.getStringExtra("name1")
        val name2 = intent.getStringExtra("name2")

        if(winner == "XO Draw!!") {
            resultTv.text = winner
        }

        else{
            resultTv.text = "Winner : $winner"
        }

        btn.setOnClickListener{
            val intent= Intent(this, MainActivity::class.java)
            intent.putExtra("player1Name", name1)
            intent.putExtra("player2Name", name2)
            startActivity(intent)
            finish()
        }

        homeButton.setOnClickListener {
            val intent= Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}
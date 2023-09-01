package com.example.tictactoe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var newButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        newButton = findViewById(R.id.newBtn)

        val intent = Intent(this,DataActivity::class.java)
        newButton.setOnClickListener {
            startActivity(intent)
            finish()
        }

    }
}
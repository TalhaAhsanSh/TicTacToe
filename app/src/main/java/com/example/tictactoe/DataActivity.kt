package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class DataActivity : AppCompatActivity() {
    private lateinit var editText1: EditText
    private lateinit var editText2: EditText
    private lateinit var sButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)

        editText1= findViewById(R.id.player1et)
        editText2 = findViewById(R.id.player2et)
        sButton = findViewById(R.id.startbtn)

        val intent = Intent(this,MainActivity::class.java)

        sButton.setOnClickListener {
            val player1 = editText1.text.toString()
            val player2 = editText2.text.toString()

            if(player1.isEmpty() && player2.isEmpty()){
                Toast.makeText(this, "Please Enter the Name of the players", Toast.LENGTH_SHORT).show()
            }

            else if(player1.isEmpty()){
                editText1.requestFocus()

            }

            else if(player2.isEmpty()){
                editText2.requestFocus()

            }

            else if(player1.isNotEmpty() && player2.isNotEmpty()){
                intent.putExtra("player1Name", player1)
                intent.putExtra("player2Name", player2)

                startActivity(intent)
                finish()
            }
        }




    }
}
package com.example.tictactoe

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

@Suppress("KotlinConstantConditions")
class MainActivity : AppCompatActivity() {
    private lateinit var t1: Button
    private lateinit var t2: Button
    private lateinit var t3: Button
    private lateinit var t4: Button
    private lateinit var t5: Button
    private lateinit var t6: Button
    private lateinit var t7: Button
    private lateinit var t8: Button
    private lateinit var t9: Button
    private lateinit var t10: TextView
    private lateinit var name1: TextView
    private lateinit var name2: TextView
    private lateinit var player1L: LinearLayout
    private lateinit var player2L: LinearLayout
    private var tictactoe = MutableList(3) {MutableList(3) {'0'} }
    private var checkResultX = false
    private var checkResultO = false
    private var tictactoeV = MutableList(3) {MutableList(3) {'0'} }
    private var tictactoeD = MutableList(2) {MutableList(3) {'0'} }
    private var count = 0
    private var name1String : String? = null
    private var name2String : String? = null

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        t1 = findViewById(R.id.tv1)
        t2 = findViewById(R.id.tv2)
        t3 = findViewById(R.id.tv3)
        t4 = findViewById(R.id.tv4)
        t5 = findViewById(R.id.tv5)
        t6 = findViewById(R.id.tv6)
        t7 = findViewById(R.id.tv7)
        t8 = findViewById(R.id.tv8)
        t9 = findViewById(R.id.tv9)
        name1 = findViewById(R.id.X)
        name2 = findViewById(R.id.O)
        player1L = findViewById(R.id.pll1)
        player2L= findViewById(R.id.pll2)
        t10 = findViewById(R.id.tellingTv)

        name1String = intent.getStringExtra("player1Name")
        name2String = intent.getStringExtra("player2Name")

        name1.text = name1String
        name2.text = name2String

        t10.text = "$name1String's turn"

        t1.setOnClickListener {
            insert(1)
        }

        t2.setOnClickListener {
            insert(2)
        }

        t3.setOnClickListener {
            insert(3)
        }

        t4.setOnClickListener {
            insert(4)
        }

        t5.setOnClickListener {
            insert(5)
        }

        t6.setOnClickListener {
            insert(6)
        }

        t7.setOnClickListener {
            insert(7)
        }

        t8.setOnClickListener {
            insert(8)
        }

        t9.setOnClickListener {
            insert(9)
        }

    }

    @SuppressLint("SetTextI18n")
    private fun insert(number: Int){
        if(number == 1){
            if(count % 2 == 0 && tictactoe[0][0] == '0'){
                tictactoe[0][0] = 'X'
                t1.text = 'X'.toString()
                count++
            }

            else if(count % 2 == 1 && tictactoe[0][0] == '0'){
                tictactoe[0][0] = 'O'
                t1.text = 'O'.toString()
                count++
            }
        }

        else if(number == 2){
            if(count % 2 == 0 && tictactoe[0][1] == '0'){
                tictactoe[0][1] = 'X'
                t2.text = 'X'.toString()
                count++
            }

            else if(count % 2 == 1 && tictactoe[0][1] == '0'){
                tictactoe[0][1] = 'O'
                t2.text = 'O'.toString()
                count++
            }
        }

        else if(number == 3){
            if(count % 2 == 0 && tictactoe[0][2] == '0'){
                tictactoe[0][2] = 'X'
                t3.text = 'X'.toString()
                count++
            }

            else if(count % 2 == 1 && tictactoe[0][2] == '0'){
                tictactoe[0][2] = 'O'
                t3.text = 'O'.toString()
                count++
            }
        }

        else if(number == 4){
            if(count % 2 == 0 && tictactoe[1][0] == '0'){
                tictactoe[1][0] = 'X'
                t4.text = 'X'.toString()
                count++
            }

            else if(count % 2 == 1 && tictactoe[1][0] == '0'){
                tictactoe[1][0] = 'O'
                t4.text = 'O'.toString()
                count++
            }
        }

        else if(number == 5){
            if(count % 2 == 0 && tictactoe[1][1] == '0'){
                tictactoe[1][1] = 'X'
                t5.text = 'X'.toString()
                count++
            }

            else if(count % 2 == 1 && tictactoe[1][1] == '0'){
                tictactoe[1][1] = 'O'
                t5.text = 'O'.toString()
                count++
            }
        }

        else if(number == 6){
            if(count % 2 == 0 && tictactoe[1][2] == '0'){
                tictactoe[1][2] = 'X'
                t6.text = 'X'.toString()
                count++
            }

            else if(count % 2 == 1 && tictactoe[1][2] == '0'){
                tictactoe[1][2] = 'O'
                t6.text = 'O'.toString()
                count++
            }
        }

        else if(number == 7){
            if(count % 2 == 0 && tictactoe[2][0] == '0'){
                tictactoe[2][0] = 'X'
                t7.text = 'X'.toString()
                count++
            }

            else if(count % 2 == 1 && tictactoe[2][0] == '0'){
                tictactoe[2][0] = 'O'
                t7.text = 'O'.toString()
                count++
            }
        }

        else if(number == 8){
            if(count % 2 == 0 && tictactoe[2][1] == '0'){
                tictactoe[2][1] = 'X'
                t8.text = 'X'.toString()
                count++
            }

            else if(count % 2 == 1 && tictactoe[2][1] == '0'){
                tictactoe[2][1] = 'O'
                t8.text = 'O'.toString()
                count++
            }
        }

        else if(number == 9){
            if(count % 2 == 0 && tictactoe[2][2] == '0'){
                tictactoe[2][2] = 'X'
                t9.text = 'X'.toString()
                count++
            }

            else if(count % 2 == 1 && tictactoe[2][2] == '0'){
                tictactoe[2][2] = 'O'
                t9.text = 'O'.toString()
                count++
            }
        }

        makeDiagonalAndVertical()
        checkWinner()

        if(checkResultO){
            val intent = Intent(this,ResultActivity::class.java)
            intent.putExtra("Winner", name2String)
            intent.putExtra("name1", name1String)
            intent.putExtra("name2", name2String)
            startActivity(intent)
            finish()
        }

        else if(checkResultX){
            val intent = Intent(this,ResultActivity::class.java)
            intent.putExtra("Winner", name1String)
            intent.putExtra("name1", name1String)
            intent.putExtra("name2", name2String)
            startActivity(intent)
            finish()
        }

        else if(count == 9){
            val intent = Intent(this,ResultActivity::class.java)
            intent.putExtra("Winner", "XO Draw!!")
            intent.putExtra("name1", name1String)
            intent.putExtra("name2", name2String)
            startActivity(intent)
            finish()
        }

        if(count%2 == 0 && !checkResultX && !checkResultO && count!= 9){
            t10.text = "$name1String's turn"
        }

        else if(count%2 == 1 && !checkResultX && !checkResultO && count!= 9){
            t10.text = "$name2String's turn"
        }

    }

    private fun makeDiagonalAndVertical(){
        var k =0
        var l =0

        for(i in 0 until tictactoe.size){
            for(j in 0 until tictactoe[i].size){
                tictactoeV[k][l] = tictactoe[j][i]
                l+=1
            }
            k+=1
            l=0
        }

        k = 0
        l = 0

        for(i in 0..2){
            tictactoeD[k][l] = tictactoe[i][i]
            l+=1
        }

        l=0
        k=1
        var j=2

        for(i in 0..2){
            tictactoeD[k][l] = tictactoe[j][i]
            l+=1
            j-=1
        }
    }



    private fun checkWinner(){

        for (i in tictactoe){
            val flag = i.all{i[0] == it}
            if(flag){
                if(i[0] == 'X'){
                    checkResultX = true
                    return
                }

                else if(i[0] == 'O'){
                    checkResultO = true
                    return
                }
            }
        }

        for (i in tictactoeV){
            val flag = i.all{i[0] == it}
            if(flag){
                if(i[0] == 'X'){
                    checkResultX = true
                    return
                }

                else if(i[0] == 'O'){
                    checkResultO = true
                    return
                }
            }
        }

        for (i in tictactoeD){
            val flag = i.all{i[0] == it}
            if(flag){
                if(i[0] == 'X'){
                    checkResultX = true
                    return
                }

                else if(i[0] == 'O'){
                    checkResultO = true
                    return
                }
            }
        }
    }
}
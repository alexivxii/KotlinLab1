package com.example.firstapptry


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.content.Intent


class MainActivity : AppCompatActivity() {

    var num=0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Text1: TextView = findViewById(R.id.textView)
        val Button1: Button = findViewById(R.id.addButton)
        Button1.setOnClickListener{

            println("Success Add")

            num++
            Text1.text=num.toString()


        }
        val Button2: Button = findViewById(R.id.substractButton)
        Button2.setOnClickListener{

            println("Success Substract")

            num--
            Text1.text=num.toString()

        }
        val Button3: Button = findViewById(R.id.resetButton)
        Button3.setOnClickListener{

            println("Success Reset")

            num=0
            Text1.text=num.toString()

        }

        val buttonClick = findViewById<Button>(R.id.newPageButton)
        buttonClick.setOnClickListener {
            val intent = Intent(this, NewPage::class.java)
            startActivity(intent)
        }


    }
}
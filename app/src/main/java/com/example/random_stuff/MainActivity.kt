package com.example.random_stuff

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    private val quoteList = mutableListOf(
        "สั่งสอนผมด้วยครับ",
        "rm -rf /",
        "wtf",
        "ไม่รับครับ",
        ":wq",
        "สวัสดีครัฟท่านสมาชิก",
        "goodbye(){ goodbye | goodbye & }; goodbye",
        "hodl",
        "helpppp",
        "bebo bebo",
        "ความพอเพียงบังเกิดในใจฉัน",
        "ลูกฉันเป็นคนดี",
        "ไอหนุ่ม กูเป็นพืช",
        "S I M P",
        "Bonker",
        "100% Customer Satisfication")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.random_button)
        button.setOnClickListener {
            val random = Random
            val quote: TextView = findViewById(R.id.random_quote)
            val randomQuote = random.nextInt(quoteList.count())
            quote.text = quoteList[randomQuote]
        }
    }
}

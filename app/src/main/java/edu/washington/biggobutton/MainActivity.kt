package edu.washington.biggobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var numClicks = 0
        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            numClicks += 1
            val btn : Button = it as Button
            if(numClicks == 1)
                it.text = "You have pushed me ${numClicks} time!"
            else
                it.text = "You have pushed me ${numClicks} times!"
        }
    }
}
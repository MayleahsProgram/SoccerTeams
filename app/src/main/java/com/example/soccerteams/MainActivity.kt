package com.example.soccerteams

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    val teams = arrayOf("Man Sundowns FC", "Orlando Pirates", "Bid vest Wits",
        "Stellenbosch FC", "Sek United FC")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val teamsText = findViewById<TextView>(R.id.teamsText)

        teams[0] = "Man Sundowns Fc :)"

        //variable to hold all teams ready to display
        var teamsDisplay = $$""
        teamsDisplay += "${teams[0]}\n"
        teamsDisplay += "${teams[1]}\n"
        teamsDisplay += "${teams[2]}\n"
        teamsDisplay += "${teams[3]}\n"
        teamsDisplay +="${teams[4]}\n"

        //displaying top soccer team in text view on UI
        teamsText.text = teams[0]


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
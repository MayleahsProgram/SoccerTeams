package com.example.soccerteams

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

//created function to display array values in terminal
// fun logArrValues(arr: Array<String>, limit: Int =0){
//if statement to check if there is a limit - if there is a limit, cut the array at that index
// If (limit == 0){
// Log.v("Array values:", Arrays.toString(arr))
// }
// else
// {
//   Log.v("Array values:", Arrays.toString(arr.sliceArray(0..limit-1)))
// }
// }
// create function here --------------------------------------------------------------------------

class MainActivity : AppCompatActivity() {
    // global function
    val teams = arrayOf("Man Sundowns FC", "Orlando Pirates", "Bid vest Wits",
        "Stellenbosch FC", "Sek United FC")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // local function

        val teamsText = findViewById<TextView>(R.id.teamsText)

        teams[0] = "Man Sundowns Fc :)"

        //variable to hold all teams ready to display
        var teamsDisplay = ""
        teamsDisplay += "${teams[0]}\n"
        teamsDisplay += "${teams[1]}\n"
        teamsDisplay += "${teams[2]}\n"
        teamsDisplay += "${teams[3]}\n"
        teamsDisplay +="${teams[4]}\n"

        //displaying top soccer team in text view on UI
        teamsText.text = teamsDisplay

        // add all teams to the display string
        var counter = 0
        while (counter < teams.count()){
            teamsDisplay += "${teams[counter]}\n"
            counter++
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
package com.example.soccerteams

import android.os.Bundle
import android.widget.TextView
import android.util.Log
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

//Look for the shortest string entry in the string array
fun getShortestString(arr: Array<String>) : String {
    var shortestString = arr[0]

    for (element in arr) {
        if (element.length < shortestString.length) {
            shortestString = element
        }
    }
    return shortestString
}


class MainActivity : AppCompatActivity() {
    // global function
    val teams = arrayOf("Man Sundowns FC", "Orlando Pirates", "Bid vest Wits",
        "Stellenbosch FC", "Sek United FC")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // local function

        // calling the method to log array values
        logArrayValues(teams)

        val teamsText = findViewById<TextView>(R.id.textView2)
        var teamsDisplay = ""

        //assigning the starting position
        teams[0]= "Man Sundowns FC"

      // add all teams to display string
        var counter = 0
        while (counter < teams.count()) {
            teamsDisplay += "${teams[counter]}\n"
            counter++
        }


        //call on the shortest string in code
        val shortestTeam = getShortestString(teams)

        teamsText.text = "$teamsDisplay\nShortest Team Name:\n$shortestTeam"

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun logArrayValues(teams: Array<String>) {
        for (team in teams){
            Log.v("Array values:", team)
        }
    }
}
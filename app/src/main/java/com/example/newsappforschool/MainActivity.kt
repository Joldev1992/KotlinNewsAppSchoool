package com.example.newsappforschool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonhome = findViewById<Button>(R.id.buttonHome)
        val buttoneconomy = findViewById<Button>(R.id.buttonEconomy)
        val buttonpolitics = findViewById<Button>(R.id.buttonPolitics)
        val buttonsports = findViewById<Button>(R.id.buttonSports)
        val buttonworld = findViewById<Button>(R.id.buttonWorld)
        val buttonlatest = findViewById<Button>(R.id.buttonLatest)

        buttonhome.setOnClickListener {
            // Get the text fragment instance
            val homefragment = homefragment()

            // Get the support fragment manager instance
            val manager = supportFragmentManager

            // Begin the fragment transition using support fragment manager
            val transaction = manager.beginTransaction()

            // Replace the fragment on container
            transaction.replace(R.id.fragment_container,homefragment)
            transaction.addToBackStack(null)

            // Finishing the transition
            transaction.commit()
        }
        buttonsports.setOnClickListener {
            // Get the text fragment instance
            val sportsFragment = SportsFragment()

            // Get the support fragment manager instance
            val manager = supportFragmentManager

            // Begin the fragment transition using support fragment manager
            val transaction = manager.beginTransaction()

            // Replace the fragment on container
            transaction.replace(R.id.fragment_container,sportsFragment)
            transaction.addToBackStack(null)

            // Finishing the transition
            transaction.commit()
        }

        buttoneconomy.setOnClickListener {
            // Get the text fragment instance
            val economyfragment = Economyfragment()

            // Get the support fragment manager instance
            val manager = supportFragmentManager

            // Begin the fragment transition using support fragment manager
            val transaction = manager.beginTransaction()

            // Replace the fragment on container
            transaction.replace(R.id.fragment_container,economyfragment)
            transaction.addToBackStack(null)

            // Finishing the transition
            transaction.commit()
        }

        buttonpolitics.setOnClickListener {
            // Get the text fragment instance
            val politicsfragment = PoliticsFragment()

            // Get the support fragment manager instance
            val manager = supportFragmentManager

            // Begin the fragment transition using support fragment manager
            val transaction = manager.beginTransaction()

            // Replace the fragment on container
            transaction.replace(R.id.fragment_container,politicsfragment)
            transaction.addToBackStack(null)

            // Finishing the transition
            transaction.commit()
        }
        buttonworld.setOnClickListener {
            // Get the text fragment instance
            val worldfragment = WorldFragment()

            // Get the support fragment manager instance
            val manager = supportFragmentManager

            // Begin the fragment transition using support fragment manager
            val transaction = manager.beginTransaction()

            // Replace the fragment on container
            transaction.replace(R.id.fragment_container,worldfragment)
            transaction.addToBackStack(null)

            // Finishing the transition
            transaction.commit()
        }
        buttonlatest.setOnClickListener {
            // Get the text fragment instance
            val latestfragment = LatestFragment()

            // Get the support fragment manager instance
            val manager = supportFragmentManager

            // Begin the fragment transition using support fragment manager
            val transaction = manager.beginTransaction()

            // Replace the fragment on container
            transaction.replace(R.id.fragment_container,latestfragment)
            transaction.addToBackStack(null)

            // Finishing the transition
            transaction.commit()
        }
    }

}

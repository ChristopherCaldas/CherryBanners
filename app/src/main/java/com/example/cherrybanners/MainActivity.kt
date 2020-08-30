package com.example.cherrybanners

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //App Features
        val button = findViewById<Button>(R.id.button)
        val display1 = findViewById<TextView>(R.id.display1)
        val display2 = findViewById<TextView>(R.id.display2)
        val display3 = findViewById<TextView>(R.id.display3)
        val display4 = findViewById<TextView>(R.id.display4)

        //Decks
        val characterDeck = arrayOf("Tattoo'd 24 Year Old with a Septum Piercing","Train Conductor","Successful Doctor In Their 40s","Personal Trainer","Paraplegic War Hero",
            "An \"Actor\" who did A Gap Yah in Thailand", "Married with Children Prospective Sugar Parent","Recently Converted Atheist","Vegan Chef","Stern but kind University Professor",
            "Butcher with Big Beefy Forearms","Olympic Gymnast","Pro Racecar Driver","Lead Guitarist","Lando Norris","Your Old Dentist","Bad Boy Priest","The Best Plumber In The World",
            "Jesus Christ","MMA Fighter","Super-Model","Pro Chess Player","5-Star Uber Driver","Club Promoter","Software Engineer")
        val goodTraitDeck = arrayOf("Good-Listener","Great Shag","Rich","Loyal","Animal-Lover","Gets Along With Your Friends","Wash-board Abs","Philanthropic","Cooks for you","Big Cuddler",
            "Organized","Goes on long walks on the beach","Shares your music taste","Makes fun plans/dates for you","Owns a private jet","Has a beach house","unlimited supply of vodka",
            "likes/comments on all of your posts")
        val badTraitDeck =  arrayOf("Stares at your forehead instead of your eyes","Bald with Beard","Keeps referring to you as friends","Calls you sweetie during arguments",
            "Refuses to let you order for yourself", "Makes you call the doctors for them","Responds to every introduction with okay","Squirrel-Puncher",
            "Wakes you up by shoving your fingers in your nose","Always smells like cheese", "Spends 3 hours screaming into a pillow daily","Calls all their exes crazy",
            "Doesn't believe in toothpaste","Keeps flirting with your grandma,not in a cute way", "Every time you sneeze he kicks you in the teeth",
            "Buys live mice and leaves them in libraries","Wall-Puncher","Thinks dating you is an act of charity","Bites marble tables")

        //Button Action
        button.setOnClickListener{
            var rand1 = 0
            var rand2 = Random.nextInt(goodTraitDeck.size)

            rand1 = Random.nextInt(characterDeck.size)
            display1.text = characterDeck[rand1]
            rand1 = Random.nextInt(goodTraitDeck.size)
            display2.text = goodTraitDeck[rand1]
            rand1 = Random.nextInt(badTraitDeck.size)
            display4.text = badTraitDeck[rand1]

            while(rand1 == rand2){
                rand2 = Random.nextInt(goodTraitDeck.size)
            }
            display3.text = goodTraitDeck[rand2]
        }
    }
}
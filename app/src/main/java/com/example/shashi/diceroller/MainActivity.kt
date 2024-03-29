package com.example.shashi.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val roll: Button = findViewById(R.id.bt1)
        roll.text = "Let's Roll"

        roll.setOnClickListener {
           Dice()
        }
    }

    private fun Dice() {

        val randomInt = Random().nextInt(6) + 1

        val drawableresourse = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        val diceimage: ImageView = findViewById(R.id.dice_image)
        diceimage.setImageResource(drawableresourse)


    }
}

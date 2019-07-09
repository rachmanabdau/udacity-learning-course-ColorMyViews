package com.volvox.colormyviews

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews : List<View> =
                listOf(box_one_text, box_two_text, box_three_text, box_four_text,
                box_five_text, red_button, green_button, yellow_button, constraint_layout)

        for (item in clickableViews){
            item.setOnClickListener{makeColored(it)}
        }

    }

    private fun makeColored(view: View) {
        when (view.id){

            // Boxes using color class
            R.id.box_one_text -> view.setBackgroundColor(Color.RED)
            R.id.box_two_text -> view.setBackgroundColor(Color.CYAN)

            // Boxes using android resource color
            R.id.box_three_text -> view.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_orange_dark))
            R.id.box_four_text -> view.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_purple))
            R.id.box_five_text -> view.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_red_dark))

            // Colors for buttons
            R.id.red_button -> box_three_text.setBackgroundColor(ContextCompat.getColor(this, R.color.my_red))
            R.id.green_button -> box_four_text.setBackgroundColor(ContextCompat.getColor(this, R.color.my_green))
            R.id.yellow_button -> box_five_text.setBackgroundColor(ContextCompat.getColor(this, R.color.my_yellow))

            else -> view.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_dark))
        }

    }
}
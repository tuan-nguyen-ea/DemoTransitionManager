package com.example.tuan25abc.demotransitionmanager

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.animation.FastOutLinearInInterpolator
import android.support.v4.view.animation.FastOutSlowInInterpolator
import android.transition.Fade
import android.transition.Slide
import android.transition.TransitionManager
import android.transition.TransitionSet
import android.view.Gravity
import android.view.View
import android.view.animation.LinearInterpolator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            // Begin Transition for parent ViewGroup that contains 2 buttons
            // Animations with just one line of code.
            TransitionManager.beginDelayedTransition(container)
            if (item.visibility == View.GONE) {
                item.visibility = View.VISIBLE
            } else {
                item.visibility = View.GONE
            }
        }
    }
}

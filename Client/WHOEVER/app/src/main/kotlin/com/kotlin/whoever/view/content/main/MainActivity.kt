package com.kotlin.whoever.view.content.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kotlin.whoever.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        menu_icon.apply { useHardwareAcceleration(true) }
        menu_icon.setOnClickListener {
                menu_icon.apply {
                    speed = -speed
                    setMinAndMaxFrame(0, 50)
                    if (!isAnimating) { playAnimation() }
                }
        }
    }
}

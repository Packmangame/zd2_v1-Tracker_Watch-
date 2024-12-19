package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class Loading : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading)

        val loadingImage = findViewById<ImageView>(R.id.loading_image)
        val loadingAnimation: Animation =
            AnimationUtils.loadAnimation(this, R.anim.loading_animation)
        loadingImage.startAnimation(loadingAnimation)

        Handler().postDelayed({
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}
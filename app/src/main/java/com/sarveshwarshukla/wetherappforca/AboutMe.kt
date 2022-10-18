package com.sarveshwarshukla.wetherappforca

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AboutMe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aboutme)
        findViewById<Button>(R.id.aboutProject).setOnClickListener{
            val intent = Intent(this, AboutProject::class.java)
            startActivity(intent)
        }
}
}
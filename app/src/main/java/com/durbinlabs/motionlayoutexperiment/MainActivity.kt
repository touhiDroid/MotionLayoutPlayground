package com.durbinlabs.motionlayoutexperiment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.durbinlabs.motionlayoutexperiment.onboard.BoardingActivity
import com.durbinlabs.motionlayoutexperiment.recycler.Model
import kotlinx.android.synthetic.main.scene_layout.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.scene_layout)



        red_star.setOnClickListener {
            startActivity(Intent(this, NewsActivity::class.java))

        }

    }
}

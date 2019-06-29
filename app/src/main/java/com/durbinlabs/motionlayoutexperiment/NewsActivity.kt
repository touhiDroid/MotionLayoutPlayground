package com.durbinlabs.motionlayoutexperiment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.news_layout.*

class NewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.news_layout_img_to_toolbar)

        tvTitle.setOnClickListener {
            startActivity(Intent(this, PointTableActivity::class.java))

        }
    }
}

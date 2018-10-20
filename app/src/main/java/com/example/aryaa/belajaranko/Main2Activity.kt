package com.example.aryaa.belajaranko

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main2.*
import org.jetbrains.anko.startActivity

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val url="http://www.summarecon.com/public/images/article/logo/Pradita-Institute-logo.jpg"

        Glide.with(this)
            .load(url)
            .into(imgLogo2)

        btn2.setOnClickListener {
            startActivity<MainActivity>()
        }
    }
}

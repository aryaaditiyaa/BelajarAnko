package com.example.aryaa.belajaranko

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPindah.setOnClickListener {
            startActivity<Main2Activity>()
        }

        btnToast.setOnClickListener {
            toast("Ah ah ah")
        }

        btnEmail.setOnClickListener {
            email("aryaaditiya15@gmail.com", "Subjek", "Isi")
        }

        btnSMS.setOnClickListener {
            sendSMS("089650576665", "Halo")
        }

        btnAlert.setOnClickListener {
            alert {
                title = "Masuk Pak Ekooo"
                message = "Ini Pesannya"
                yesButton {
                    toast("Yes di klik") }
                noButton {
                    toast("No di klik")
                }
            }.show()
        }
    }
}

package com.example.week2

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    private var i = 0
    private val handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)

        /// waiting 3 seconds
        Thread(Runnable {
            while (i < 1) {
                i += 1
                handler.post(Runnable {

                })
                try {
                    Thread.sleep(3000)
                    startActivity<KelimeTesti> {  }
                    /// is back pressed, close app
                    finish()
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
            }
        }).start()
    }
}

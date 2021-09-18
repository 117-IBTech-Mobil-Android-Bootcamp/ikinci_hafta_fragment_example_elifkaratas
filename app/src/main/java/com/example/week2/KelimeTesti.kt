package com.example.week2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class KelimeTesti : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kelime_testi)

        /// fragment
        supportFragmentManager.beginTransaction().replace(R.id.kelime_testi_layout, KelimeTestiFragment()).commit()
    }
}
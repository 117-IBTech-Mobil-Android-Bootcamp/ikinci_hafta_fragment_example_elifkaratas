package com.example.week2
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class KelimeTesti2 : AppCompatActivity() {
    private var progressBar: ProgressBar? = null
    private var i = 0
    private val handler = Handler()
    private var txtView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kelime_testi_2)
        progressBar = findViewById<ProgressBar>(R.id.progressBar) as ProgressBar
        txtView = findViewById<TextView>(R.id.textView5)
        val ensulin = intent.getStringExtra("Ensülin")
        val gorsellestirmek = intent.getStringExtra("Görselleştirmek")
        val bagis = intent.getStringExtra("Bağış")
        val altinda = intent.getStringExtra("Altında")

        val textView: TextView = findViewById(R.id.bagis) as TextView
        textView.setText(bagis)

        val textView1: TextView = findViewById(R.id.ensulin) as TextView
        textView1.setText(ensulin)

        val textView2: TextView = findViewById(R.id.gorsellestirmek) as TextView
        textView2.setText(gorsellestirmek)

        val textView3: TextView = findViewById(R.id.altinda) as TextView
        textView3.setText(altinda)

        Thread(Runnable {
            // this loop will run until the value of i becomes 99
            while (i < 20) {
                i += 1
                // Update the progress bar and display the current value
                handler.post(Runnable {
                    progressBar!!.progress = i
                    // setting current progress to the textview
                    txtView!!.text = (20-i).toString()
                })
                try {
                    Thread.sleep(1000)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
            }
            // setting the visibility of the progressbar to invisible
            // or you can use View.GONE instead of invisible
            // View.GONE will remove the progressbar
            progressBar!!.visibility = View.INVISIBLE

        }).start()
    }
}
package com.example.week2
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.kelime_testi_fragment.*


class KelimeTestiFragment : Fragment(){

    val myArray = arrayOf<String>("Ensülin","Bağış","Görselleştirmek","Altında")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.kelime_testi_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        kelime_testi_buton.setOnClickListener { view ->
            activity?.startActivity<KelimeTesti2>(){
                putExtra("Ensülin",myArray[0])
                putExtra("Bağış",myArray[1])
                putExtra("Görselleştirmek",myArray[2])
                putExtra("Altında",myArray[3])
            }
        }
    }
}
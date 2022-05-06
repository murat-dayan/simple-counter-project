package com.example.sayacprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var basla=findViewById<Button>(R.id.basla)

        basla.setOnClickListener {
            // Abstract Class
            object:CountDownTimer(15000,1000){
                override fun onTick(millisUntilFinished: Long) {
                    textView.text="Kalan:${millisUntilFinished/1000}"

                    
                }

                override fun onFinish() {
                    textView.text="süreniz bitti :("
                }

            }.start()
        }
    }

}
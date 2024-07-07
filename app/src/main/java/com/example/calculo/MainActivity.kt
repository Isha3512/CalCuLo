package com.example.calculo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View.OnTouchListener
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculo.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        val view= binding.root
        setContentView(view)
        var num= binding.etNumDec.text.toString()
        binding.btn0.setOnClickListener{
            if(num!="0")
            num += "0"
            binding.etNumDec.setText(num)
        }
        binding.btn1.setOnClickListener{
            if(num!="0")
            {
                num+="1"
            }
            else{
                num="1"
            }
            binding.etNumDec.setText(num)
        }
        binding.btn2.setOnClickListener{
            if(num!="0")
            {
                num+="2"
            }
            else{
                num="2"
            }
            binding.etNumDec.setText(num)
        }
        binding.btn3.setOnClickListener{
            if(num!="0")
            {
                num+="3"
            }
            else{
                num="3"
            }
            binding.etNumDec.setText(num)
        }
        binding.btn4.setOnClickListener{
            if(num!="0")
            {
                num+="4"
            }
            else{
                num="4"
            }
            binding.etNumDec.setText(num)
        }
        binding.btn5.setOnClickListener{
            if(num!="0")
            {
                num+="5"
            }
            else{
                num="5"
            }
            binding.etNumDec.setText(num)
        }
        binding.btn6.setOnClickListener{
            if(num!="0")
            {
                num+="6"
            }
            else{
                num="6"
            }
            binding.etNumDec.setText(num)
        }
        binding.btn7.setOnClickListener{
            if(num!="0")
            {
                num+="7"
            }
            else{
                num="7"
            }
            binding.etNumDec.setText(num)
        }
        binding.btn8.setOnClickListener{
            if(num!="0")
            {
                num+="8"
            }
            else{
                num="8"
            }
            binding.etNumDec.setText(num)
        }
        binding.btn9.setOnClickListener{
            if(num!="0")
            {
                num+="9"
            }
            else{
                num="9"
            }
            binding.etNumDec.setText(num)
        }
        binding.btn2zero.setOnClickListener {
            if(num!="0")
                num+="00"
            binding.etNumDec.setText(num)
        }
        binding.btnAdd.setOnClickListener{
            if(num!="0")
            {
                num+="+"
                binding.etNumDec.setText(num)
            }
        }


    }
}




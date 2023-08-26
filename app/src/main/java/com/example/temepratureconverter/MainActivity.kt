package com.example.temepratureconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.temepratureconverter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calculateBtn.setOnClickListener{
            convertTemperature()
        }
    }

    private fun convertTemperature() {
        val celcius = binding.etCelcius.text.toString().toFloat()

        if(celcius!=null){
            val result = (celcius*1.8)+32
            val farenheitResult = String.format("%.2f",result)
            binding.etFarenheit.setText(farenheitResult)
        }
    }
}
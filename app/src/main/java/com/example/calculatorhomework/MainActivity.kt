package com.example.calculatorhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.calculatorhomework.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.acBtn.setOnClickListener {
            clearText()
        }


        binding.number0.setOnClickListener {
            if (binding.sonucText.text != "") {
                binding.sonucText.text = binding.sonucText.text.toString() + "0"
            }
        }
        binding.number1.setOnClickListener {
            binding.sonucText.text = binding.sonucText.text.toString() + "1"
        }
        binding.number2.setOnClickListener {
            binding.sonucText.text = binding.sonucText.text.toString() + "2"
        }
        binding.number3.setOnClickListener {
            binding.sonucText.text = binding.sonucText.text.toString() + "3"
        }
        binding.number4.setOnClickListener {
            binding.sonucText.text = binding.sonucText.text.toString() + "4"
        }
        binding.number5.setOnClickListener {
            binding.sonucText.text = binding.sonucText.text.toString() + "5"
        }
        binding.number6.setOnClickListener {
            binding.sonucText.text = binding.sonucText.text.toString() + "6"
        }
        binding.number7.setOnClickListener {
            binding.sonucText.text = binding.sonucText.text.toString() + "7"
        }
        binding.number8.setOnClickListener {
            binding.sonucText.text = binding.sonucText.text.toString() + "8"
        }
        binding.number9.setOnClickListener {
            binding.sonucText.text = binding.sonucText.text.toString() + "9"
        }

        binding.toplama.setOnClickListener {
            if (!binding.sonucText.text.endsWith('+')&& binding.sonucText.text != "" ) {
                binding.sonucText.text = binding.sonucText.text.toString() + "+"
            }

        }

    }

    private fun clearText() {
        binding.sonucText.text = ""
    }

}






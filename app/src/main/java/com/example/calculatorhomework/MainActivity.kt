package com.example.calculatorhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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
                appendToSonucText("0")
            }
        }
        binding.number1.setOnClickListener {
            appendToSonucText("1")
        }
        binding.number2.setOnClickListener {
            appendToSonucText("2")
        }
        binding.number3.setOnClickListener {
            appendToSonucText("3")
        }
        binding.number4.setOnClickListener {
            appendToSonucText("4")
        }
        binding.number5.setOnClickListener {
            appendToSonucText("5")
        }
        binding.number6.setOnClickListener {
            appendToSonucText("6")
        }
        binding.number7.setOnClickListener {
            appendToSonucText("7")
        }
        binding.number8.setOnClickListener {
            appendToSonucText("8")
        }
        binding.number9.setOnClickListener {
            appendToSonucText("9")
        }

        binding.toplama.setOnClickListener {
            if (!binding.sonucText.text.endsWith('+') && binding.sonucText.text != "") {
                appendToSonucText("+")
            }

        }

        binding.equals.setOnClickListener {
            if (binding.sonucText.text != ""
                && !binding.sonucText.text.endsWith('+')
                && !binding.sonucText.text.endsWith(
                    '=')) {
            }
            val sayilar = binding.sonucText.text.toString().split("+")

            var toplam = 0

            for (sayi in sayilar) {
                toplam += sayi.toInt()
            }
            appendToSonucText("=")
            binding.sonucText.text = toplam.toString()

        }

    }







    private fun appendToSonucText(a: String) {
        binding.sonucText.text = binding.sonucText.text.toString() + a
    }

    private fun clearText() {
        binding.sonucText.text = ""
    }
}









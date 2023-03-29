package com.barisgoktas.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.barisgoktas.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    var number1 : Int? = null
    var number2 : Int? = null
    var result : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun mySum (view: View) {
        number1 = binding.firstInput.text.toString().toIntOrNull()
        number2 = binding.secondInput.text.toString().toIntOrNull()

        if (number1 == null || number2 == null ) {

            binding.resultView.text = "Error!"

        } else {
            result = number1!! + number2!!
            binding.resultView.text = "Result: $result"
        }

    }

    fun mySub (view: View) {
        number1 = binding.firstInput.text.toString().toIntOrNull()
        number2 = binding.secondInput.text.toString().toIntOrNull()

        if (number1 == null || number2 == null ) {

            binding.resultView.text = "Error!"

        } else {
            result = number1!! - number2!!
            binding.resultView.text = "Result: $result"
        }
    }

    fun myMultiplication (view: View) {
        number1 = binding.firstInput.text.toString().toIntOrNull()
        number2 = binding.secondInput.text.toString().toIntOrNull()

        if (number1 == null || number2 == null ) {

            binding.resultView.text = "Error!"

        } else {
            result = number1!! * number2!!
            binding.resultView.text = "Result: $result"
        }
    }

    fun myDivision (view: View) {
        number1 = binding.firstInput.text.toString().toIntOrNull()
        number2 = binding.secondInput.text.toString().toIntOrNull()

        if (number1 == null || number2 == null ) {

            binding.resultView.text = "Error!"

        } else {
            result = number1!! / number2!!
            binding.resultView.text = "Result: $result"
        }
    }
}
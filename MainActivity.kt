package com.esranursevilmis.simplecalculatorkotlin

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.esranursevilmis.simplecalculatorkotlin.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    var number1: Double?=null
    var number2: Double?=null
    var result: Double?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }

    fun sum(view: View){
        number1= binding.number1Text.text.toString().toDoubleOrNull()
        number2= binding.number2Text.text.toString().toDoubleOrNull()

        if(number1!=null&&number2!=null){
            result=number1!!+number2!!
            binding.result.text="Result: ${result}"
        }
        else{
            binding.result.text="Enter number!"
        }
    }

    fun deduct(view: View){
        number1= binding.number1Text.text.toString().toDoubleOrNull()
        number2= binding.number2Text.text.toString().toDoubleOrNull()

        if(number1!=null&&number2!=null){
            result=number1!!-number2!!
            binding.result.text="Result: ${result}"
        }
        else{
            binding.result.text="Enter number!"
        }
    }

    fun multiply(view: View){
        number1= binding.number1Text.text.toString().toDoubleOrNull()
        number2= binding.number2Text.text.toString().toDoubleOrNull()

        if(number1!=null&&number2!=null){
            result=number1!!*number2!!
            binding.result.text="Result: ${result}"
        }
        else{
            binding.result.text="Enter number!"
        }
    }

    fun divide(view: View){
        number1= binding.number1Text.text.toString().toDoubleOrNull()
        number2= binding.number2Text.text.toString().toDoubleOrNull()

        if(number1!=null&&number2!=null){
            result=number1!!/number2!!
            binding.result.text="Result: ${result}"
        }
        else{
            binding.result.text="Enter number!"
        }
    }
}
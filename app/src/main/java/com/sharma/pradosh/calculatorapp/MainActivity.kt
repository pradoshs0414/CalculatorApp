package com.sharma.pradosh.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sharma.pradosh.calculatorapp.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnAC.setOnClickListener(){
            binding.inputText.text=""
            binding.outputText.text=""
        }
        binding.btnOpenBracket.setOnClickListener(){
            binding.inputText.append("(")
        }
        binding.btnCloseBracket.setOnClickListener(){
            binding.inputText.append(")")
        }
        binding.btnDot.setOnClickListener(){
            binding.inputText.append(".")
        }
        binding.btnMul.setOnClickListener(){
            binding.inputText.append("*")
        }
        binding.btnAdd.setOnClickListener(){
            binding.inputText.append("+")
        }
        binding.btnSub.setOnClickListener(){
            binding.inputText.append("-")
        }
        binding.btnDiv.setOnClickListener(){
            binding.inputText.append("/")
        }

        binding.btn0.setOnClickListener(){
            binding.inputText.append("0")
        }
        binding.btn1.setOnClickListener(){
            binding.inputText.append("1")
        }
        binding.btn2.setOnClickListener(){
            binding.inputText.append("2")
        }
        binding.btn3.setOnClickListener(){
            binding.inputText.append("3")
        }
        binding.btn4.setOnClickListener(){
            binding.inputText.append("4")
        }
        binding.btn5.setOnClickListener(){
            binding.inputText.append("5")
        }
        binding.btn6.setOnClickListener(){
            binding.inputText.append("6")
        }
        binding.btn7.setOnClickListener(){
            binding.inputText.append("7")
        }
        binding.btn8.setOnClickListener(){
            binding.inputText.append("8")
        }
        binding.btn9.setOnClickListener(){
            binding.inputText.append("9")
        }
        binding.btnEqual.setOnClickListener(){
            val expression= ExpressionBuilder(binding.inputText.text.toString()).build()
            val result = expression.evaluate()
            val longresult=result.toLong()
            if(result == longresult.toDouble()){
                binding.outputText.text=longresult.toString()
            }
            else{
                binding.outputText.text=result.toString()
            }

        }

    }
}
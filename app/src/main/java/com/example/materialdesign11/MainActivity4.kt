package com.example.materialdesign11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.materialdesign11.databinding.ActivityMain3Binding
import com.example.materialdesign11.databinding.ActivityMain4Binding

class MainActivity4 : AppCompatActivity() {
    private lateinit var binding: ActivityMain4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        title="Calculator"
        binding = ActivityMain4Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        binding.add.setOnClickListener(){
            val first=binding.first.text.toString().toDouble()
            val second=binding.second.text.toString().toDouble()

            binding.showresult.text=getMessage(first + second)
        }
        binding.subtraction.setOnClickListener(){

            val first=binding.first.text.toString().toDouble()
            val second=binding.second.text.toString().toDouble()
            binding.showresult.text=getMessage(first - second)

        }
        binding.mul.setOnClickListener(){
            val first=binding.first.text.toString().toDouble()
            val second=binding.second.text.toString().toDouble()

            binding.showresult.text=getMessage(first * second)
        }

        binding.div.setOnClickListener(){
            val first=binding.first.text.toString().toDouble()
            val second=binding.second.text.toString().toDouble()
            binding.showresult.text=getMessage(first / second)
        }
        binding.sqrt.setOnClickListener(){
        val first=binding.first.text.toString().toDouble()
//            val second=binding.second.text.toString().toDouble()
            binding.showresult.text=getMessage(Math.sqrt(first))
        }


        binding.next4thact.setOnClickListener(){
            val intent=Intent(this@MainActivity4,MainActivity5::class.java)
            startActivity(intent)
        }


    }

    private fun getMessage(data:Double) = "Result is : $data"



}
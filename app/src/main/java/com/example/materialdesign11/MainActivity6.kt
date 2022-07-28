package com.example.materialdesign11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.materialdesign11.databinding.ActivityMain5Binding
import com.example.materialdesign11.databinding.ActivityMain6Binding

class MainActivity6 : AppCompatActivity(),View.OnClickListener {
    private lateinit var binding: ActivityMain6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main6)
        binding=ActivityMain6Binding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        binding.btn1.setOnClickListener(this)
        binding.btn2.setOnClickListener(this)
        binding.btn3.setOnClickListener(this)
        binding.btn4.setOnClickListener(this)


    }
    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.btn1 -> {

            }
            R.id.btn2 -> {

            }
            R.id.btn3->{

            }
            R.id.btn4->{
                val intent=Intent(this@MainActivity6,MainActivity7::class.java)
                startActivity(intent)
            }
        }
    }
}
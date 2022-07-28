package com.example.materialdesign11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.materialdesign11.databinding.ActivityMain5Binding

class MainActivity5 : AppCompatActivity(){
    private lateinit var recyclerView: RecyclerView
    private lateinit var binding: ActivityMain5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        binding=ActivityMain5Binding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        binding.recyclerView.apply {
            layoutManager=LinearLayoutManager(this@MainActivity5)
        }

        binding.tableButton.setOnClickListener{

//        binding.tableButton.setOnClickListener(){
//        var sb:StringBuffer= StringBuffer()
//            var data=binding.edone.text.toString().toInt()
//            for(i in 1..10){
//                var home=data.toString() +"" + "X" +i +"="+data*i
//
//                binding.showtxt.text=home.toString()
//
//            }

            binding.matbtn.setOnClickListener(){
                val intent= Intent(this@MainActivity5,MainActivity6::class.java)
                startActivity(intent)
            }
        }
    }


}
package com.example.materialdesign11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.RadioButton
import android.widget.Toast
import com.example.materialdesign11.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    private lateinit var radioButton:RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        binding=ActivityMain2Binding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        // Spinner of country name, flag, and stdcode

        val languages = resources.getStringArray(R.array.Languages)

        if (binding.spinner != null) {
            val adapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item, languages)
            binding.spinner.adapter = adapter

            binding.spinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long) {
                    val spindata=languages[position]

                    if(spindata=="Pakistan")
                        binding.tv.text="+69"
                    when(spindata){
                        "India"->{
                            binding.iv.setImageResource(R.drawable.india)
                            binding.tv.text= "+ 91"
                        }
                        "Afghanistan"->{
                            binding.iv.setImageResource(R.drawable.afghanistan)
                            binding.tv.text= "+ 93"
                        }
                        "Turkey"->{
                            binding.iv.setImageResource(R.drawable.turkey)
                            binding.tv.text= "+ 94"
                        }
                        "USA"->{
                            binding.iv.setImageResource(R.drawable.usa)
                            binding.tv.text= "+ 1"
                        }
                        "Canada"->{
                            binding.iv.setImageResource(R.drawable.canada)
                            binding.tv.text= "+ 96"
                        }


                    }
//                    Toast.makeText(this@MainActivity2, getString(R.string.selected_item) + " " +
//                                "" + spindata, Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }

        //Next activity called for data transfer from this activity
            binding.nxtbutton.setOnClickListener(){
            val intent= Intent(this@MainActivity2,MainActivity3::class.java)
            val email=binding.emailedittext.text.toString()
            val pswd=binding.pswdedtxt.text.toString()

            // radiobutton logic
            val intSelectButton: Int = binding.radiogroup!!.checkedRadioButtonId
            radioButton = findViewById(intSelectButton)
            val radiodata=radioButton
            Toast.makeText(applicationContext, radiodata.text, Toast.LENGTH_SHORT).show()

            val contact=binding.contactnumber.text.toString()

            // Passing Data to another activity

            intent.putExtra("email",email)
            intent.putExtra("password",pswd)
            intent.putExtra("contact",contact)

            startActivity(intent)
        }
    }
}
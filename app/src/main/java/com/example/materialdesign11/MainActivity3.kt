package com.example.materialdesign11

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Toast
import com.example.materialdesign11.databinding.ActivityMain3Binding
import java.util.*

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        binding=ActivityMain3Binding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)


        // next activity
        binding.nextButton.setOnClickListener(){

            val intent=Intent(this@MainActivity3,MainActivity4::class.java)
            startActivity(intent)
        }

        // Using Intent to get data from prev activity

        val home=intent.getStringExtra("email")
       val house= intent.getStringExtra("password")
        val contact=intent.getStringExtra("contact")
        Toast.makeText(applicationContext,""+home,Toast.LENGTH_SHORT).show()
        Toast.makeText(applicationContext,""+house,Toast.LENGTH_SHORT).show()
        Toast.makeText(applicationContext,""+contact,Toast.LENGTH_SHORT).show()

        // MainActivity3 Functionality
        //Date Picker
        val today = Calendar.getInstance()
        binding.datePicker.init(today.get(Calendar.YEAR), today.get(Calendar.MONTH),
            today.get(Calendar.DAY_OF_MONTH)

        )
        { applicationContext, year, month, day ->
            val month = month + 1
//            val msg = "You Selected: $day/$month/$year"
//            Toast.makeText(applicationContext, msg, Toast.LENGTH_SHORT).show()

            binding.showdatetxt.text="You Selected: $day/$month/$year"

        }

        // TimePicker

        binding.timePicker.setOnTimeChangedListener { _, hour, minute -> var hour = hour
            var am_pm = ""
            // AM_PM decider logic
            when {hour == 0 -> {        // if to add 24 hrs format add hour+=1
                am_pm = "AM"
            }
                hour == 12 -> am_pm = "PM"
                hour > 12 -> { hour -= 12
                    am_pm = "PM"
                }
                else -> am_pm = "AM"
            }
            if (binding.showtime != null) {
                val hour = if (hour < 10) "0" + hour else hour
                val min = if (minute < 10) "0" + minute else minute
                // display format of time
                val msg = "Time is: $hour : $min $am_pm"
//                Toast.makeText(applicationContext,""+msg,Toast.LENGTH_SHORT).show()
                binding.showtime.text = msg
            }




    }
}
}
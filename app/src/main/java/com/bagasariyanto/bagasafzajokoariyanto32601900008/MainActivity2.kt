package com.bagasariyanto.bagasafzajokoariyanto32601900008

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    companion object{
        const val EXTRA_DATA = "extra_data"
    }

    private lateinit var btn2: Button
    private lateinit var text1: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        btn2 = findViewById(R.id.btn2)
        text1 = findViewById(R.id.text_student)

        btn2.setOnClickListener{
            val intentDestination = Intent(this@MainActivity2, MainActivity::class.java)
            startActivity(intentDestination)
        }

//        val student = if(Build.VERSION.SDK_INT>=33){
//            intent.getParcelableExtra(EXTRA_DATA, Student::class.java)
//
//        }else{
//            @Suppress("DEPRECATION")
//            intent.getParcelableExtra(EXTRA_DATA)
//        }
//
//        if(student!=null){
//            text1.text = student.name
//        }
    }
}
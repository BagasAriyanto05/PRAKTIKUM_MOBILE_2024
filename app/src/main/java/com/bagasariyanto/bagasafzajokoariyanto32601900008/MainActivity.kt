package com.bagasariyanto.bagasafzajokoariyanto32601900008

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btn1 : Button
    private lateinit var btnPhone: Button
    private lateinit var btnRecycleView: Button
    private lateinit var btnKeFragment: Button
    private lateinit var btnKeBottomNavigasi: Button
    private lateinit var btnKeRetrofit: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById(R.id.btn1)
        btnPhone = findViewById(R.id.btn_phone)
        btnRecycleView = findViewById(R.id.btn_recycleview)
        btnKeFragment = findViewById(R.id.btn_keFragment)
        btnKeBottomNavigasi = findViewById(R.id.btn_keBottomNavigasi)
        btnKeRetrofit = findViewById(R.id.btn_keRetrofit)

//        Explisite intent
        btn1.setOnClickListener{
            val intentDestination = Intent(this@MainActivity, MainActivity2::class.java)
            intentDestination.putExtra(MainActivity2.EXTRA_DATA, Mahasiswa("Joko", "12345"))
            startActivity(intentDestination)
        }

        btnPhone.setOnClickListener{
            val number = "12345"
            val intentImplisit = Intent(Intent.ACTION_DIAL, Uri.parse("tel: $number"))
            startActivity(intentImplisit)
        }

        btnRecycleView.setOnClickListener{
            val toRecycleView = Intent(this@MainActivity, RecycleActivity::class.java)
            startActivity(toRecycleView)
        }

        btnKeFragment.setOnClickListener{
            val toFragment = Intent(this@MainActivity, FragmentActivity::class.java)
            startActivity(toFragment)
        }

        btnKeBottomNavigasi.setOnClickListener{
            val toBottomNavigasi = Intent(this@MainActivity, BottomNavigasiActivity::class.java)
            startActivity(toBottomNavigasi)
        }

        btnKeRetrofit.setOnClickListener{
            val toBottomNavigasi = Intent(this@MainActivity, RetrofitActivity::class.java)
            startActivity(toBottomNavigasi)
        }
    }
}
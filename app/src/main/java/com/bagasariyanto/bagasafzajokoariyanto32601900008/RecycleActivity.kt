package com.bagasariyanto.bagasafzajokoariyanto32601900008

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecycleActivity : AppCompatActivity() {
    private lateinit var rvData: RecyclerView
    private val listMahasiswa = ArrayList<Mahasiswa>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle)

        rvData = findViewById(R.id.rc_data)
        rvData.setHasFixedSize(true)
        rvData.layoutManager = LinearLayoutManager(this)

        listMahasiswa.add(Mahasiswa("Bagas", "0987654321"))
        listMahasiswa.add(Mahasiswa("Afza", "0987654322"))
        listMahasiswa.add(Mahasiswa("Joko", "0987654323"))
        listMahasiswa.add(Mahasiswa("Ari", "0987654324"))
        listMahasiswa.add(Mahasiswa("Yanto", "0987654325"))

        val mahasiswaAdapter = MahasiswaAdapter(listMahasiswa)
        rvData.adapter = mahasiswaAdapter
    }
}
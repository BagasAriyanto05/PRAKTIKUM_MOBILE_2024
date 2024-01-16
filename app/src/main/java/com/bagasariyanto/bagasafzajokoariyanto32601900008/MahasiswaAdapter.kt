package com.bagasariyanto.bagasafzajokoariyanto32601900008

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MahasiswaAdapter(private val listData: ArrayList<Mahasiswa>): RecyclerView.Adapter<MahasiswaAdapter.DataViewHolder>() {
    class DataViewHolder(item: View): RecyclerView.ViewHolder(item){
        val rc_name: TextView = item.findViewById(R.id.rc_name)
        val rc_nim: TextView = item.findViewById(R.id.rc_nim)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.row_mahasiswa, parent, false)
        return DataViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listData.count()
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        val (name, nim) = listData[position]
        holder.rc_name.text = name
        holder.rc_nim.text = nim
    }
}
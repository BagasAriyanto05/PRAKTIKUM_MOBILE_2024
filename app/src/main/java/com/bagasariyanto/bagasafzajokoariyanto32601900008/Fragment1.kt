package com.bagasariyanto.bagasafzajokoariyanto32601900008

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bagasariyanto.bagasafzajokoariyanto32601900008.databinding.Fragment1Binding
import java.util.zip.Inflater

class Fragment1 : Fragment() {
    private lateinit var binding: Fragment1Binding
        override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
            binding = Fragment1Binding.inflate(inflater, container, false)
            return binding.root
    }
}
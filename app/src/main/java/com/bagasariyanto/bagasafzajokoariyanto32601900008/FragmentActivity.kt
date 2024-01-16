package com.bagasariyanto.bagasafzajokoariyanto32601900008

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bagasariyanto.bagasafzajokoariyanto32601900008.databinding.ActivityFragmentBinding
import com.bagasariyanto.bagasafzajokoariyanto32601900008.databinding.ActivityRecycleBinding

class FragmentActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        binding = ActivityFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mFragmentManager = supportFragmentManager
        val fragment1 = Fragment1()

        val fragment = mFragmentManager.findFragmentByTag(Fragment1::class.java.simpleName)
        if(fragment !is Fragment1){
            mFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container, fragment1, Fragment1::class.java.simpleName)
                .commit()
        }
    }
}
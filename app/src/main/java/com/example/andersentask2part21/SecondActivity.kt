package com.example.andersentask2part21

import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.andersentask2part21.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {


    lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras

        binding.tvSecAct.text = bundle!!.get("Key").toString()

//        vm.getData().observe(this, Observer {
//            binding.tvSecAct.text = it.toString()
//        })

    }
}
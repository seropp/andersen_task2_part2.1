package com.example.andersentask2part21

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.andersentask2part21.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var vm: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        vm = ViewModelProvider(this)[MainViewModel::class.java]

        vm.getData().observe(this, Observer {
            binding.tvFirstAct.text = it.toString()
        })

        binding.btnCounter.setOnClickListener {
            vm.countData()
        }

        binding.btnSwitch.setOnClickListener {


            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra("Key", vm.getData().value)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)




        }
    }

}
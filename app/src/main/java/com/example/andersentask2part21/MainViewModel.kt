package com.example.andersentask2part21

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var data = MutableLiveData<Int>(0)


    fun countData() {
        val count: Int = if (data.value != null) data.value!! else 0
        data.value = count + 1
    }

    fun getData(): LiveData<Int>{
        return data
    }
}
package com.tradehouse.lesson_6_4.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var count = 0
    var data = MutableLiveData<Int>()
    var data1 = MutableLiveData<String>()
    fun onIncrementInt() {
        count++
        data.value = count
        data1.value = "+"
    }

    fun onDecrement() {
        count--
        data.value = count
        data1.value = "-"
    }
}
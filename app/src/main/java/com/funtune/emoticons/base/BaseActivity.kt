package com.funtune.emoticons.base

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window

abstract class BaseActivity<T> : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE);
    }

    override fun onRestart() {
        super.onRestart()
    }


}
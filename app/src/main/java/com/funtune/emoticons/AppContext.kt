package com.funtune.emoticons

import android.app.Application

class AppContext : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this

        initBase()

    }


    private fun initBase() {

    }


    companion object {


        private var instance: AppContext? = null

        fun getContext(): AppContext {
            return instance!!
        }
    }

}
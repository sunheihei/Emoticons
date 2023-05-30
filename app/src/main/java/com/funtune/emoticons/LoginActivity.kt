package com.funtune.emoticons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.funtune.emoticons.base.BaseVMActivity
import com.funtune.emoticons.databinding.ActivityLoginBinding

class LoginActivity : BaseVMActivity<ActivityLoginBinding>() {
    override fun getViewBinding(): ActivityLoginBinding {
        return ActivityLoginBinding.inflate(layoutInflater)
    }

    override fun initView() {

    }
}
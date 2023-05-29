package com.funtune.emoticons.base

import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.viewbinding.ViewBinding
import com.funtune.emoticons.R
import com.funtune.emoticons.utils.StatusBarUtil
import com.musicgp.forfree.deep.utils.DarkModeUtils
import com.musicgp.forfree.deep.utils.VersionUtils

/**
 * https://stackoverflow.com/questions/63686289/how-to-use-abstraction-with-viewbinding-with-base-activity
 *
 * base activity
 */
abstract class BaseVMActivity<B : ViewBinding> : BaseActivity<Any?>() {

    lateinit var binding: B

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = getViewBinding()
        setContentView(binding.root)
//        setStatusBarColor()
        initView()
    }

    abstract fun getViewBinding(): B

    abstract fun initView()

    /**
     * 设置状态栏
     */
//    open fun setStatusBarColor() {
//        if (!DarkModeUtils.isDarkMode(this)) {
//            //设置标题栏暗色,状态栏默认为白色
//            if (VersionUtils.hasMarshmallow()) {
//                StatusBarUtil.setColor(
//                    this, ContextCompat.getColor(
//                        this,
//                        R.color.colorPrimary
//                    )
//                )
//                StatusBarUtil.setLightMode(this)
//            } else {
//                StatusBarUtil.setColor(
//                    this, ContextCompat.getColor(
//                        this,
//                        R.color.colorPrimary
//                    )
//                )
//            }
//        } else {
//            //设置标题栏暗色,状态栏默认为白色
//            if (VersionUtils.hasMarshmallow()) {
//                StatusBarUtil.setColor(
//                    this, ContextCompat.getColor(
//                        this,
//                        R.color.darkColorPrimary
//                    )
//                )
//                StatusBarUtil.setLightMode(this)
//            } else {
//                StatusBarUtil.setColor(
//                    this, ContextCompat.getColor(
//                        this,
//                        R.color.darkColorPrimary
//                    )
//                )
//            }
//        }
//
//    }


}
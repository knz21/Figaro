package com.knz21.figaro.view

import android.databinding.DataBindingUtil
import android.os.Bundle
import com.knz21.figaro.R
import com.knz21.figaro.databinding.ActivityMainBinding
import com.knz21.figaro.di.LifecycleComponent
import com.knz21.figaro.ui.main.MainViewModel
import com.knz21.figaro.view.base.BaseActivity

class MainActivity : BaseActivity() {
    private lateinit var viewModel: MainViewModel
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = viewModel
    }

    override fun setViewModel(lifecycleComponent: LifecycleComponent) {
        viewModel = lifecycleComponent.mainViewModel()
    }
}

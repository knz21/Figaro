package com.knz21.figaro.view.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.knz21.figaro.ComponentManager
import com.knz21.figaro.di.LifecycleComponent
import com.knz21.figaro.di.module.transition.AppCompatActivityModule
import com.knz21.figaro.di.module.transition.TransitionUtilModule
import com.knz21.figaro.infra.util.transition.ActivityTransitionUtil

abstract class BaseActivity : AppCompatActivity() {
    private lateinit var lifecycleComponent: LifecycleComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lifecycleComponent = ComponentManager.getComponent(this).lifecycleComponent(
                AppCompatActivityModule(this),
                TransitionUtilModule { ActivityTransitionUtil(this) }
        )
        setViewModel(lifecycleComponent)
    }

    abstract fun setViewModel(lifecycleComponent: LifecycleComponent)
}

package com.knz21.figaro.di

import com.knz21.figaro.di.module.transition.TransitionUtilModule
import com.knz21.figaro.ui.main.MainViewModel
import dagger.Subcomponent

@Lifecycle
@Subcomponent(modules = [TransitionUtilModule::class])
interface LifecycleComponent {

    fun mainViewModel(): MainViewModel
}
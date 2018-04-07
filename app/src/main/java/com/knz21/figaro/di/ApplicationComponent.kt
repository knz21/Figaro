package com.knz21.figaro.di

import com.knz21.figaro.Application
import com.knz21.figaro.di.module.ApiModule
import com.knz21.figaro.di.module.transition.AppCompatActivityModule
import com.knz21.figaro.di.module.transition.TransitionUtilModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApiModule::class])
interface ApplicationComponent {
    fun inject(application: Application)

    fun lifecycleComponent(
            appCompatActivityModule: AppCompatActivityModule,
            transitionUtilModule: TransitionUtilModule
    ): LifecycleComponent
}
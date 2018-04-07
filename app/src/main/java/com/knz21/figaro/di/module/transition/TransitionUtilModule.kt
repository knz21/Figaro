package com.knz21.figaro.di.module.transition

import com.knz21.figaro.di.Lifecycle
import com.knz21.figaro.infra.util.TransitionUtil
import dagger.Module
import dagger.Provides

@Module
class TransitionUtilModule(private val provide: () -> TransitionUtil) {

    @Provides
    @Lifecycle
    fun provideTransitionUtil(): TransitionUtil = provide()
}
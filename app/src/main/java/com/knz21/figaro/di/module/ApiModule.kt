package com.knz21.figaro.di.module

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApiModule(private val context: Context) {

    @Provides
    @Singleton
    fun provideContext(): Context = context
}
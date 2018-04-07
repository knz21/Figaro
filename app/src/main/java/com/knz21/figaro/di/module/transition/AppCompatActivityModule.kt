package com.knz21.figaro.di.module.transition

import android.support.v7.app.AppCompatActivity
import com.knz21.figaro.di.Lifecycle
import dagger.Module
import dagger.Provides

@Module
class AppCompatActivityModule(private val activity: AppCompatActivity) {

    @Provides
    @Lifecycle
    fun provideAppCompatActivity(): AppCompatActivity = activity
}
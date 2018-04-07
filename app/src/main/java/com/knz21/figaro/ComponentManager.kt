package com.knz21.figaro

import android.content.Context
import com.knz21.figaro.di.ApplicationComponent
import com.knz21.figaro.di.DaggerApplicationComponent
import com.knz21.figaro.di.module.ApiModule

class ComponentManager {
    companion object {
        private var component: ApplicationComponent? = null

        fun getComponent(context: Context): ApplicationComponent = component ?: DaggerApplicationComponent.builder()
                .apiModule(ApiModule(context.applicationContext))
                .build()
                .apply { component = this }
    }
}
package com.knz21.figaro

import android.app.Application

class Application : Application() {
    override fun onCreate() {
        super.onCreate()
        ComponentManager.getComponent(applicationContext).inject(this)
    }
}
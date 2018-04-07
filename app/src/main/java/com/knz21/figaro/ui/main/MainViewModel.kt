package com.knz21.figaro.ui.main

import android.databinding.BaseObservable
import android.view.View
import com.knz21.figaro.di.Lifecycle
import com.knz21.figaro.infra.util.TransitionUtil
import javax.inject.Inject

@Lifecycle
class MainViewModel @Inject constructor(
        private val transitionUtil: TransitionUtil
) : BaseObservable() {

    fun onClickText(v: View) {
        transitionUtil.finish()
    }
}
package com.knz21.figaro.infra.util

import android.content.Intent
import android.support.v4.app.DialogFragment

interface TransitionUtil {

    fun canTransition(intent: Intent): Boolean

    fun startActivityForResult(intent: Intent, requestCode: Int)

//    fun startActivityForResult(intentBuilder: IntentBuilder, requestCode: Int)

    fun startActivity(intent: Intent)

//    fun startActivity(intentBuilder: IntentBuilder)

    fun finish()

    fun finishWithResult(resultCode: Int)

    fun finishWithResult(resultCode: Int, data: Intent)

//    fun finishWithResult(resultCode: Int, builder: IntentBuilder)

    fun showDialog(fragment: DialogFragment, tag: String)

    fun showTopLevelDialog(fragment: DialogFragment, tag: String)

    fun dismiss()
}
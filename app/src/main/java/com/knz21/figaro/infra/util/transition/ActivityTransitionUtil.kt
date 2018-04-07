package com.knz21.figaro.infra.util.transition

import android.content.Intent
import android.support.v4.app.DialogFragment
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.knz21.figaro.infra.util.TransitionUtil

class ActivityTransitionUtil(val activity: AppCompatActivity) : TransitionUtil {
    override fun canTransition(intent: Intent): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun startActivityForResult(intent: Intent, requestCode: Int) {
        activity.startActivityForResult(intent, requestCode)
    }

    override fun startActivity(intent: Intent) {
        activity.startActivity(intent)
    }

    override fun finish() {
        Log.v("ssssss", "ffffff")
        activity.finish()
    }

    override fun finishWithResult(resultCode: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun finishWithResult(resultCode: Int, data: Intent) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showDialog(fragment: DialogFragment, tag: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showTopLevelDialog(fragment: DialogFragment, tag: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun dismiss() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

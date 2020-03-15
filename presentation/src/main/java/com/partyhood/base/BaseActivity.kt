package com.partyhood.base

import android.app.Activity
import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import com.carmabs.ema.android.ui.EmaToolbarFragmentActivity
import com.partyhood.inject.injectionActivityModule
import com.partyhood.model.ActivityResultHandlerModel
import com.partyhood.BuildConfig
import com.partyhood.R
import org.kodein.di.Kodein


/**
 *
 *
 * @author <a href="mailto:jorgevguerra@hotmail.com">Jorge Valiño Guerra</a>
 */

abstract class BaseActivity : EmaToolbarFragmentActivity() {


    private val resultHandler: HashMap<Int, ActivityResultHandlerModel> = HashMap()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (BuildConfig.PORTRAIT_ORIENTATION)
            requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        setupFabric()
    }

    private fun setupFabric() {
//        Fabric.with(this, Crashlytics())
    }

    override fun injectActivityModule(kodein: Kodein.MainBuilder): Kodein.Module = injectionActivityModule(this)

    override val layoutId: Int get() = R.layout.activity_base

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val remove = resultHandler[requestCode]?.implementation?.invoke(requestCode, parseResultCode(resultCode), data)?:false
        if (remove) removeActivityResultHandler(requestCode)
    }

    fun addActivityResultHandler(activityResultHandlerModel: ActivityResultHandlerModel) {
        resultHandler[activityResultHandlerModel.id] = activityResultHandlerModel
    }

    fun removeActivityResultHandler(id:Int) {
        resultHandler.remove(id)
    }

    private fun parseResultCode(code:Int):ActivityResultHandlerModel.Result{
        return when(code){
            Activity.RESULT_OK -> ActivityResultHandlerModel.Result.Success
            Activity.RESULT_CANCELED -> ActivityResultHandlerModel.Result.Fail
            else -> ActivityResultHandlerModel.Result.Other(code)
        }
    }
}
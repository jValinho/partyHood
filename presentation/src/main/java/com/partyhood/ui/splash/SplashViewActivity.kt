package com.partyhood.ui.splash

import android.os.Bundle
import com.partyhood.base.BaseActivity
import com.partyhood.domain.utils.STRING_EMPTY
import com.partyhood.R


/**
 *
 *
 * @author <a href="mailto:jorgevguerra@hotmail.com">Jorge Valiño Guerra</a>
 */

class SplashViewActivity : BaseActivity() {


    override fun provideFixedToolbarTitle(): String? {
        return "Hola"
    }

    override fun onCreateActivity(savedInstanceState: Bundle?) {
        super.onCreateActivity(savedInstanceState)
        hideToolbar()
    }

    override fun getNavGraph(): Int {
        return R.navigation.navigation_splash
    }

}
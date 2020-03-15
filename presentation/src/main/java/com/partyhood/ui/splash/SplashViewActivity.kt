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
    override val navGraph: Int get() = R.navigation.navigation_splash


    override fun provideFixedToolbarTitle(): String? {
        return "Hola"
    }

    override fun onCreateActivity(savedInstanceState: Bundle?) {
        super.onCreateActivity(savedInstanceState)
        hideToolbar()
    }

}
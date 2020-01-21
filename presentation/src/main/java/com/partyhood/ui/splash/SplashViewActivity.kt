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


    override fun getToolbarTitle(): String? {
        return STRING_EMPTY
    }

    override fun createActivity(savedInstanceState: Bundle?) {
        super.createActivity(savedInstanceState)
        hideToolbar()
    }

    override fun getNavGraph(): Int {
        return R.navigation.navigation_splash
    }

}
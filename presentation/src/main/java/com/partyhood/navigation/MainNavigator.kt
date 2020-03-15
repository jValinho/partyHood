package com.partyhood.navigation

import android.app.Activity
import androidx.navigation.NavController
import com.carmabs.ema.core.navigator.EmaBaseNavigator
import com.carmabs.ema.core.navigator.EmaNavigationState
import com.partyhood.R
import com.partyhood.base.BaseNavigator

/**
 *
 *
 *  * @author <a href="mailto:jorgevguerra@hotmail.com">Jorge Valiño Guerra</a>
 *
 */

class MainNavigator(override val navController: NavController, private val activity: Activity) : BaseNavigator<MainNavigator.Navigation>() {

    sealed class Navigation : EmaNavigationState {

        object FromSplashToHome : Navigation() {
            override fun navigateWith(navigator: EmaBaseNavigator<out EmaNavigationState>) {
                val nav = navigator as MainNavigator
                nav.fromSplashToHome()
            }
        }
    }

    private fun fromSplashToHome() {
        navigateWithAction(R.id.action_splashViewFragment_to_mainViewFragment)
    }



}
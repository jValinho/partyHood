package com.partyhood.navigation

import android.app.Activity
import androidx.navigation.NavController
import com.carmabs.ema.core.navigator.EmaBaseNavigator
import com.carmabs.ema.core.navigator.EmaNavigationState
import com.partyhood.base.BaseNavigator

/**
 *
 *
 *  * @author <a href="mailto:jorgevguerra@hotmail.com">Jorge Valiño Guerra</a>
 *
 */

class SplashNavigator(override val navController: NavController,private val activity: Activity) : BaseNavigator<SplashNavigator.Navigation>() {

    sealed class Navigation : EmaNavigationState {

        object LegalAdvice : Navigation() {
            override fun navigateWith(navigator: EmaBaseNavigator<out EmaNavigationState>) {
                val nav = navigator as SplashNavigator
//                nav.toLegalAdvice()
            }
        }
    }

    private fun toLoginFromSplash() {
//        navigateWithAction(R.id.action_splashViewFragment_to_homeViewActivity)
        activity.finish()
    }



}
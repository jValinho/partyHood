package com.partyhood.base

import com.carmabs.ema.android.navigation.EmaNavigator
import com.carmabs.ema.core.navigator.EmaBaseNavigator
import com.carmabs.ema.core.navigator.EmaNavigationState

/**
 *
 *
 *  * @author <a href="mailto:jorgevguerra@hotmail.com">Jorge Valiño Guerra</a>
 *
 */

abstract class BaseNavigator<NS : EmaNavigationState> : EmaNavigator<NS> {

     sealed class NavigationBase : EmaNavigationState {

         object ExpiredSession : NavigationBase() {
             override fun navigateWith(navigator: EmaBaseNavigator<out EmaNavigationState>) {
                 val nav = navigator as BaseNavigator
                 nav.toExpiredSession()
             }
         }
    }

    protected fun toExpiredSession() {
//        navigateWithAction(R.id.action_to_expiredSessionViewFragment)
    }

}
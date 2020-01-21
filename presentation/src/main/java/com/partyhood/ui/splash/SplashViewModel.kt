package com.partyhood.ui.splash

import com.partyhood.base.BaseViewModel
import com.partyhood.navigation.SplashNavigator




/**
 *
 *
 * @author <a href="mailto:jorgevguerra@hotmail.com">Jorge Valiño Guerra</a>
 */
 
class SplashViewModel : BaseViewModel<SplashState, SplashNavigator.Navigation>() {

    override fun createInitialViewState(): SplashState {
        return SplashState()
    }


}
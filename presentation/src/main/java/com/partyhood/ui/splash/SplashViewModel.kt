package com.partyhood.ui.splash

import com.partyhood.base.BaseViewModel
import com.partyhood.navigation.SplashNavigator

/**
 *
 *
 * @author <a href="mailto:jorgevguerra@hotmail.com">Jorge Valiño Guerra</a>
 */
 
class SplashViewModel : BaseViewModel<SplashState, SplashNavigator.Navigation>() {


    override val initialViewState: SplashState = SplashState()

    fun showSplashAndNavigate() {
        executeUseCase {
            getDelaySplashUseCase.execute(5000).await()
            delay(5000)
            navigate(SplashNavigator.Navigation.FromSplashToHome)
        }
    }


}
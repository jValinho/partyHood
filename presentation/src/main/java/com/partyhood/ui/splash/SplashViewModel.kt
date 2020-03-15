package com.partyhood.ui.splash

import com.partyhood.base.BaseViewModel
import com.partyhood.domain.usecases.GetDelaySplashUseCase
import com.partyhood.navigation.MainNavigator
import kotlinx.coroutines.delay


/**
 *
 *
 * @author <a href="mailto:jorgevguerra@hotmail.com">Jorge Valiño Guerra</a>
 */
 
class SplashViewModel(private val getDelaySplashUseCase: GetDelaySplashUseCase
) : BaseViewModel<SplashState, MainNavigator.Navigation>() {


    override fun onStartFirstTime(statePreloaded: Boolean) {

    }

    override val initialViewState: SplashState = SplashState()

    fun showSplashAndNavigate() {
        executeUseCase {

            getDelaySplashUseCase.execute(5000)
            delay(5000)
            navigate(MainNavigator.Navigation.FromSplashToHome)
        }
    }


}
package com.partyhood.ui.splash

import com.carmabs.ema.core.state.EmaExtraData
import com.partyhood.base.BaseFragment
import com.partyhood.navigation.MainNavigator
import com.partyhood.R
import org.kodein.di.generic.instance


/**
 *
 *
 * @author <a href="mailto:jorgevguerra@hotmail.com">Jorge Valiño Guerra</a>
 */

class SplashViewFragment : BaseFragment<SplashState, SplashViewModel, MainNavigator.Navigation>() {

    override val viewModelSeed: SplashViewModel by instance()

    override val navigator: MainNavigator by instance()

    private var vm: SplashViewModel? = null

    override val layoutId: Int get() = R.layout.fragment_splash


    override fun onInitialized(viewModel: SplashViewModel) {
        vm = viewModel
        showSplash()
    }

    private fun showSplash() {
        vm?.showSplashAndNavigate()
    }

    override fun onNormal(data: SplashState) {
    }

    override fun onAlternative(data: EmaExtraData) {

    }

    override fun onSingle(data: EmaExtraData) {

    }

    override fun onError(error: Throwable) {
    }

}
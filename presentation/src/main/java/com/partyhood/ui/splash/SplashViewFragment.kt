package com.partyhood.ui.splash

import com.carmabs.ema.core.state.EmaExtraData
import com.partyhood.base.BaseFragment
import com.partyhood.navigation.SplashNavigator
import com.partyhood.R
import org.kodein.di.generic.instance


/**
 *
 *
 * @author <a href="mailto:jorgevguerra@hotmail.com">Jorge Valiño Guerra</a>
 */

class SplashViewFragment : BaseFragment<SplashState, SplashViewModel, SplashNavigator.Navigation>() {


    override val viewModelSeed: SplashViewModel by instance()

    override val navigator: SplashNavigator by instance()

    override fun getFragmentLayout(): Int {
        return R.layout.fragment_splash
    }

    override fun onInitialized(viewModel: SplashViewModel) {
    }

    override fun onNormal(data: SplashState) {
    }

    override fun onLoading(data: EmaExtraData) {
    }

    override fun onSingleEvent(data: EmaExtraData) {
    }

    override fun onError(error: Throwable): Boolean {
        return false
    }

}
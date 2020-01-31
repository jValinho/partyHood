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

class HomeViewFragment : BaseFragment<HomeState, HomeViewModel, SplashNavigator.Navigation>() {


    override val viewModelSeed: HomeViewModel by instance()

    override val navigator: SplashNavigator by instance()

    override fun getFragmentLayout(): Int {
        return R.layout.fragment_home
    }

    override fun onInitialized(viewModel: HomeViewModel) {
    }

    override fun onNormal(data: HomeState) {
    }

    override fun onLoading(data: EmaExtraData) {
    }

    override fun onSingleEvent(data: EmaExtraData) {
    }

    override fun onError(error: Throwable): Boolean {
        return false
    }

}
package com.partyhood.ui.main.home

import com.partyhood.base.BaseViewModel
import com.partyhood.navigation.MainNavigator


/**
 *
 *
 * @author <a href="mailto:jorgevguerra@hotmail.com">Jorge Valiño Guerra</a>
 */
 
class HomeViewModel : BaseViewModel<HomeState, MainNavigator.Navigation>() {


    override fun onStartFirstTime(statePreloaded: Boolean) {
    }

    override val initialViewState: HomeState = HomeState()


}

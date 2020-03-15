package com.partyhood.ui.main

import com.partyhood.base.BaseViewModel
import com.partyhood.navigation.MainNavigator


/**
 *
 *
 * @author <a href="mailto:jorgevguerra@hotmail.com">Jorge Valiño Guerra</a>
 */
 
class MainViewModel : BaseViewModel<MainState, MainNavigator.Navigation>() {


    override fun onStartFirstTime(statePreloaded: Boolean) {

    }


    override val initialViewState: MainState = MainState()



}
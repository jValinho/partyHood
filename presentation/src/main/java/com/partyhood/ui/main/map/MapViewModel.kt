package com.partyhood.ui.main.map

import com.partyhood.base.BaseViewModel
import com.partyhood.navigation.MainNavigator


class MapViewModel : BaseViewModel<MapState, MainNavigator.Navigation>() {

    override fun onStartFirstTime(statePreloaded: Boolean) {

    }

    override fun onResume(firstTime: Boolean) {

    }

    override val initialViewState: MapState = MapState()

}
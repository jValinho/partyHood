package com.partyhood.ui.main.search

import com.carmabs.ema.android.viewmodel.EmaViewModel
import com.partyhood.base.BaseViewModel
import com.partyhood.navigation.MainNavigator


class SearchViewModel : BaseViewModel<SearchState, MainNavigator.Navigation>() {

    override fun onStartFirstTime(statePreloaded: Boolean) {

    }

    override val initialViewState: SearchState = SearchState()

}
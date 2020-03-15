package com.partyhood.ui.main.search

import com.carmabs.ema.android.navigation.EmaNavigator
import com.carmabs.ema.core.state.EmaExtraData
import com.partyhood.R
import com.partyhood.base.BaseFragment
import com.partyhood.navigation.MainNavigator
import org.kodein.di.generic.instance

class SearchViewFragment : BaseFragment<SearchState, SearchViewModel, MainNavigator.Navigation>() {

    override val viewModelSeed: SearchViewModel by instance()

    override val navigator: EmaNavigator<MainNavigator.Navigation> by instance<MainNavigator>()

    override fun onInitialized(viewModel: SearchViewModel) {

    }

    override fun onNormal(data: SearchState) {

    }

    override fun onAlternative(data: EmaExtraData) {

    }

    override fun onSingle(data: EmaExtraData) {

    }

    override fun onError(error: Throwable) {

    }

    override val layoutId: Int = R.layout.fragment_search

    companion object{
        fun newInstance():  SearchViewFragment = SearchViewFragment()
    }

}
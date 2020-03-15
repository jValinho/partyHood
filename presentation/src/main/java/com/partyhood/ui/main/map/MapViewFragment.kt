package com.partyhood.ui.main.map

import com.carmabs.ema.core.state.EmaExtraData
import com.partyhood.R
import com.partyhood.base.BaseFragment
import com.partyhood.navigation.MainNavigator
import org.kodein.di.generic.instance

class MapViewFragment : BaseFragment<MapState, MapViewModel, MainNavigator.Navigation>() {

    override val viewModelSeed: MapViewModel by instance()

    override val navigator: MainNavigator by instance()

    private var vm: MapViewModel? = null


    override fun onInitialized(viewModel: MapViewModel) {

    }
    override fun onNormal(data: MapState) {

    }

    override fun onAlternative(data: EmaExtraData) {
    }

    override fun onSingle(data: EmaExtraData) {
    }

    override fun onError(error: Throwable) {
    }


    override val layoutId: Int = R.layout.fragment_map

    companion object{
        fun newInstance():  MapViewFragment = MapViewFragment()
    }

}
package com.partyhood.ui.main

import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.carmabs.ema.core.state.EmaExtraData
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.partyhood.base.BaseFragment
import com.partyhood.navigation.MainNavigator
import com.partyhood.R
import com.partyhood.ui.main.home.HomeViewFragment
import com.partyhood.ui.main.map.MapViewFragment
import com.partyhood.ui.main.search.SearchViewFragment
import kotlinx.android.synthetic.main.activity_main.*
import org.kodein.di.generic.instance


/**
 *
 *
 * @author <a href="mailto:jorgevguerra@hotmail.com">Jorge Valiño Guerra</a>
 */

class MainViewFragment : BaseFragment<MainState, MainViewModel, MainNavigator.Navigation>() {

    override val viewModelSeed: MainViewModel by instance()

    override val navigator: MainNavigator by instance()

    private var vm: MainViewModel? = null

    override val layoutId: Int get() = R.layout.activity_main


    override fun onInitialized(viewModel: MainViewModel) {
        vm = viewModel
        bottomNavigationListener()
    }

    private fun bottomNavigationListener() {
        btv_main.setOnNavigationItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.action_index ->{
                    val fragment = HomeViewFragment.newInstance()
                    openFragment(fragment)
                    true
                }
                R.id.action_map ->{
                    val fragment = MapViewFragment.newInstance()
                    openFragment(fragment)
                    true
                }
                R.id.action_search ->{
                    val fragment = SearchViewFragment.newInstance()
                    openFragment(fragment)
                    true
                }
                else -> {
                    true
                }
            }
        }
    }

    override fun onNormal(data: MainState) {
        btv_main.selectedItemId = R.id.action_index
    }


    override fun onAlternative(data: EmaExtraData) {

    }

    override fun onSingle(data: EmaExtraData) {

    }


    private fun openFragment(fragment: Fragment) {
        val transaction = fragmentManager?.beginTransaction()
        transaction?.replace(R.id.fl_main_fragment, fragment)
        transaction?.addToBackStack(null)
        transaction?.commit()
    }


    override fun onError(error: Throwable) {
    }

}
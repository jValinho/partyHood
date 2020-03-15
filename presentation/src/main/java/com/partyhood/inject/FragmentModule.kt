package com.partyhood.inject

import androidx.fragment.app.Fragment
import com.partyhood.ui.main.home.HomeViewModel
import com.partyhood.ui.main.MainViewModel
import com.partyhood.ui.main.map.MapViewModel
import com.partyhood.ui.main.search.SearchViewModel
import com.partyhood.ui.splash.SplashViewModel
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider


/**
 *
 *
 * @author <a href="mailto:jorgevguerra@hotmail.com">Jorge Valiño Guerra</a>
 */

fun fragmentInjection(fragment: Fragment) = Kodein.Module(name = "FragmentModule") {


    //FRAGMENT//

    bind<Fragment>() with provider { fragment }


    //VIEW MODEL//

    bind<SplashViewModel>() with provider {
        SplashViewModel(instance())
    }

    bind<MainViewModel>() with provider {
        MainViewModel()
    }

    bind<HomeViewModel>() with provider {
        HomeViewModel()
    }

    bind<MapViewModel>() with provider {
        MapViewModel()
    }

    bind<SearchViewModel>() with provider {
        SearchViewModel()
    }




}
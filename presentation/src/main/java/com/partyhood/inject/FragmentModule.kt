package com.partyhood.inject

import androidx.fragment.app.Fragment
import com.partyhood.ui.splash.SplashViewModel
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.provider


/**
 *
 *
 * @author <a href="mailto:jorgevguerra@hotmail.com">Jorge Valiño Guerra</a>
 */

fun generateFragmentModule(fragment: Fragment) = Kodein.Module(name = "FragmentModule") {


    //FRAGMENT//

    bind<Fragment>() with provider { fragment }


    //VIEW MODEL//

    bind<SplashViewModel>() with provider {
        SplashViewModel()
    }




}
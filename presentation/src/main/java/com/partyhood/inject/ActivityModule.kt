package com.partyhood.inject

import androidx.fragment.app.FragmentManager
import androidx.navigation.NavController
import com.carmabs.ema.core.dialog.EmaDialogProvider
import com.partyhood.base.BaseActivity
import com.partyhood.dialog.simple.SimpleDialogProvider
import com.partyhood.navigation.MainNavigator
import com.partyhood.ui.utils.KODEIN_TAG_DIALOG_SIMPLE
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton


/**
 * Injection for activities
 *
 *
 * @author <a href="mailto:jorgevguerra@hotmail.com">Jorge Valiño Guerra</a>
 */

fun injectionActivityModule(activity: BaseActivity) = Kodein.Module(name = "ActivityModule") {

    //NAVIGATOR//

    bind<MainNavigator>() with singleton { MainNavigator(instance(), instance()) }


    //ACTIVITY//

    bind<BaseActivity>() with singleton { activity }


    //DIALOG//

    bind<FragmentManager>() with provider { activity.supportFragmentManager }

    bind<EmaDialogProvider>(tag = KODEIN_TAG_DIALOG_SIMPLE) with provider { SimpleDialogProvider(instance()) }


    //NAV CONTROLLER//

    bind<NavController>() with singleton { activity.navController }



}
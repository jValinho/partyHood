package com.partyhood.base

import com.carmabs.ema.android.viewmodel.EmaViewModel
import com.carmabs.ema.core.navigator.EmaNavigationState
import com.carmabs.ema.core.state.EmaState

/**
 *
 *
 * @author <a href="mailto:jorgevguerra@hotmail.com">Jorge Valiño Guerra</a>
 */

abstract class BaseViewModel<T, NS : EmaNavigationState> : EmaViewModel<T, NS>() {


    override fun onResume(firstTime: Boolean) {

    }

}
package com.partyhood.ui.splash

import com.carmabs.ema.core.state.EmaBaseState
import com.partyhood.domain.utils.STRING_EMPTY


/**
 *
 *
 * @author <a href="mailto:jorgevguerra@hotmail.com">Jorge Valiño Guerra</a>
 */

data class SplashState(val version:String = STRING_EMPTY) : EmaBaseState {
}
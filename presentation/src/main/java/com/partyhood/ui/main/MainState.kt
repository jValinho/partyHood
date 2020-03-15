package com.partyhood.ui.main

import com.carmabs.ema.core.state.EmaBaseState
import com.partyhood.domain.utils.STRING_EMPTY
import java.io.Serializable


/**
 *
 *
 * @author <a href="mailto:jorgevguerra@hotmail.com">Jorge Valiño Guerra</a>
 */

data class MainState(
    val default : Boolean = false
) : EmaBaseState {

}
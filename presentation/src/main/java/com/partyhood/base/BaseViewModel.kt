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


    override fun onStart(inputState: EmaState<T>?): Boolean {
        val firsTime = super.onStart(inputState)
        return firsTime
    }

    override fun onStartFirstTime(statePreloaded: Boolean) {
        // Override when is needed to launch first time options
    }
//
//    fun executeSessionUseCase(block: suspend CoroutineScope.() -> Unit,
//                              sessionExceptionBlock: (suspend CoroutineScope.(SessionException) -> Unit)? = null) {
//        executeUseCaseWithException(
//            block = block,
//            exceptionBlock = { e ->
//                if (e is SessionException) {
//                    notifyError(e)
//                    sessionExceptionBlock?.invoke(this, e)
//                }
//            },
//            handleCancellationManually = false)
//    }
}
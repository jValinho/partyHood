package com.partyhood.base

import android.content.Context
import android.view.inputmethod.InputMethodManager
import com.carmabs.ema.android.ui.EmaFragment
import com.carmabs.ema.core.dialog.EmaDialogProvider
import com.carmabs.ema.core.navigator.EmaNavigationState
import com.carmabs.ema.core.state.EmaBaseState
import com.carmabs.ema.core.state.EmaExtraData
import com.partyhood.inject.generateFragmentModule
import com.partyhood.ui.utils.KODEIN_TAG_DIALOG_SIMPLE
import org.kodein.di.Kodein
import org.kodein.di.generic.instance
import java.util.logging.Logger

/**
 *
 *
 * @author <a href="mailto:jorgevguerra@hotmail.com">Jorge Valiño Guerra</a>
 */

abstract class BaseFragment<S : EmaBaseState, VM : BaseViewModel<S, NS>, NS : EmaNavigationState> : EmaFragment<S, VM, NS>() {

    override fun injectFragmentModule(kodein: Kodein.MainBuilder): Kodein.Module = generateFragmentModule(this)

    override val fragmentViewModelScope: Boolean
        get() = true

    private val dialogProvider: EmaDialogProvider by instance(KODEIN_TAG_DIALOG_SIMPLE)

    protected val logger: Logger by instance()

    override fun onStateError(error: Throwable) {
//        logger.d("LDA ERROR:${error.message}")
//        when (error) {
//            is SessionException -> onSessionException(error)
//            else -> {
//                if (!onError(error))
//                    onInternalServerException(error)
//            }
//        }
    }

    override fun onStateAlternative(data: EmaExtraData) {
        onLoading(data)
    }

    override fun onStateNormal(data: S) {
        dialogProvider.hide()
        onNormal(data)
    }

    /**
     * We create this abstract function if we want to appy default behaviours in [onStateNormal],[onStateError],[onStateAlternative]
     * @param data
     */
    abstract fun onLoading(data: EmaExtraData)

    abstract fun onNormal(data: S)

    abstract fun onError(error: Throwable): Boolean

    override fun onNavigation(navigation: EmaNavigationState?) {
        super.onNavigation(navigation)
        context?.let {
            val hideKeyboard: InputMethodManager = it.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            view?.let { view ->
                hideKeyboard.hideSoftInputFromWindow(view.windowToken, 0)
            }
        }
    }
}
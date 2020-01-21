package com.partyhood.dialog.simple

import com.carmabs.ema.core.dialog.EmaDialogListener

/**
 * Listener to handle cancel click
 *
 *
 * @author <a href="mailto:jorgevguerra@hotmail.com">Jorge Valiño Guerra</a>
 */
interface SimpleDialogListener : EmaDialogListener {
    fun onCancelClicked()
    fun onConfirmClicked()
}
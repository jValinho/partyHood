package com.partyhood.dialog.simple

import androidx.fragment.app.FragmentManager
import com.carmabs.ema.android.ui.dialog.EmaBaseDialog
import com.carmabs.ema.android.ui.dialog.EmaBaseDialogProvider

/**
 * Simple dialog implementation
 *
 *
 * @author <a href="mailto:jorgevguerra@hotmail.com">Jorge Valiño Guerra</a>
 */

class SimpleDialogProvider constructor(fragmentManager: FragmentManager) : EmaBaseDialogProvider(fragmentManager) {
    override fun generateDialog(): EmaBaseDialog<*> = SimpleDialog()
}
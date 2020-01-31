package com.partyhood.dialog.simple

import android.graphics.drawable.Drawable
import android.text.SpannableString
import com.carmabs.ema.core.dialog.EmaDialogData
import com.partyhood.domain.utils.STRING_EMPTY
import com.partyhood.ui.utils.PROPORTION_DIALOG_WIDTH_DEFAULT

/**
 * Data for simple dialog data UI setup
 *
 *
 * @author <a href="mailto:jorgevguerra@hotmail.com">Jorge Valiño Guerra</a>
 */

data class SimpleDialogData(
        val title: String = STRING_EMPTY,
        val message: String = STRING_EMPTY,
        val accept: String = STRING_EMPTY,
        val cancel: String = STRING_EMPTY,
        val spannableMessage: SpannableString? = null,
        val dialogTitleGravity: Gravity = Gravity.CENTER,
        val dialogMessageGravity: Gravity = Gravity.CENTER,
        val showCross: Boolean = false,
        val image: Drawable? = null,
        override val proportionWidth: Float = PROPORTION_DIALOG_WIDTH_DEFAULT,
        override val proportionHeight: Float? = null) : EmaDialogData {

    enum class Gravity {
        LEFT,
        CENTER,
        RIGHT,
        JUSTIFIED
    }
}
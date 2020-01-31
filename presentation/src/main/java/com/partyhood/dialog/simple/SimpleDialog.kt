package com.partyhood.dialog.simple

import android.text.method.ScrollingMovementMethod
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import com.carmabs.ema.android.ui.dialog.EmaBaseDialog
import com.partyhood.R
import kotlinx.android.synthetic.main.dialog_simple.view.*

/**
 * Simple dialog
 *
 *
 * @author <a href="mailto:jorgevguerra@hotmail.com">Jorge Valiño Guerra</a>
*/

class SimpleDialog : EmaBaseDialog<SimpleDialogData>() {

    override fun getLayout(): Int {
        return R.layout.dialog_simple
    }

    override fun setupData(data: SimpleDialogData, view: View) {
            with(data) {

                (dialogListener as? SimpleDialogListener)?.let { listener ->
                    view.bDialogSimpleYes.setOnClickListener { listener.onConfirmClicked() }
                    view.bDialogSimpleNo.setOnClickListener { listener.onCancelClicked() }
                    view.ivDialogSimpleCross.setOnClickListener { listener.onCancelClicked() }
                }

                view.tvDialogSimpleTitle.apply {
                    text = title
                    gravity = assignGravity(dialogTitleGravity)

                }

                view.ivDialogSimpleCross.visibility = when {
                    (cancel.isEmpty() && accept.isEmpty()) -> View.VISIBLE
                    showCross -> View.VISIBLE
                    else -> View.GONE
                }

                view.tvDialogSimpleMessage.apply {
                    text = message
                    movementMethod = ScrollingMovementMethod()
                    gravity = assignGravity(dialogMessageGravity)
                }

                spannableMessage?.let{
                    view.tvDialogSimpleMessage.apply {
                        text = spannableMessage
                    }
                }


                view.bDialogSimpleYes.text = accept


                view.ivDialogSimple.visibility =
                        image?.let {
                            view.ivDialogSimple.setImageDrawable(it)
                            View.VISIBLE
                        } ?: View.GONE

                val lParams = view.bDialogSimpleYes.layoutParams as ConstraintLayout.LayoutParams

                if (cancel.isEmpty()) {
                    view.bDialogSimpleNo.visibility = View.GONE
                    view.bDialogSimpleYes.visibility = View.VISIBLE
                    lParams.startToStart = view.glDialogStart.id
                    lParams.endToStart = view.glDialogEnd.id
                } else {
                    view.bDialogSimpleNo.visibility = View.VISIBLE
                    view.bDialogSimpleYes.visibility = View.VISIBLE
                    lParams.startToEnd = view.bDialogSimpleNo.id
                    lParams.endToEnd = ConstraintLayout.LayoutParams.PARENT_ID
                }

                view.bDialogSimpleNo.text = cancel

                isCancelable = false
            }

        if (data.proportionHeight != null)
            view.tvDialogSimpleMessage.layoutParams.height = 0
        else
            view.tvDialogSimpleMessage.layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT
    }

    private fun assignGravity(gravity: SimpleDialogData.Gravity): Int {
        return when (gravity) {
            SimpleDialogData.Gravity.LEFT -> Gravity.START
            SimpleDialogData.Gravity.CENTER -> Gravity.CENTER
            SimpleDialogData.Gravity.RIGHT -> Gravity.END
            SimpleDialogData.Gravity.JUSTIFIED -> Gravity.FILL
        }
    }


}
package com.partyhood.model

import com.partyhood.domain.utils.INT_NEGATIVE
import com.partyhood.domain.utils.INT_ZERO


/**
 * Model to handle activity result feature
 *
 *
 * @author <a href="mailto:jorgevguerra@hotmail.com">Jorge Valiño Guerra</a>
 */

data class ActivityResultHandlerModel(
        val id: Int,
        val implementation: ((Int, Result, Any?) -> Boolean) //RETURN TRUE IF IT IS REMOVE AFTER CONSUMED
) {
    sealed class Result(val code: Int) {

        object Success : Result(INT_NEGATIVE)

        object Fail : Result(INT_ZERO)

        class Other(code: Int) : Result(code)
    }
}
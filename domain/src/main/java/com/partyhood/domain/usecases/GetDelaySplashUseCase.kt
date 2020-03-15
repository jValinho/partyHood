package com.partyhood.domain.usecases

import com.carmabs.ema.core.usecase.EmaUseCase


/**
 *
 *
 * @author <a href="mailto:jorgevguerra@hotmail.com">Jorge Valiño Guerra</a>
 */

class GetDelaySplashUseCase : EmaUseCase<Int, Int>(){


    override suspend fun useCaseFunction(input: Int): Int {
        return input
    }



}
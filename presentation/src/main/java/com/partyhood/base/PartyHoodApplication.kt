package com.partyhood.base

import com.carmabs.ema.android.base.EmaApplication
import com.partyhood.data.injection.generateDataModule
import com.partyhood.inject.generateAppModule
import org.kodein.di.Kodein


/**
 *
 * @author <a href="mailto:jorgevguerra@hotmail.com">Jorge Valiño Guerra</a>
 */

class PartyHoodApplication : EmaApplication() {

    override fun injectAppModule(kodein: Kodein.MainBuilder): Kodein.Module =
        setupAppModules(kodein)

    override val kodein: Kodein
        get() = super.kodein.apply { Kodein }

    private fun setupAppModules(kodein: Kodein.MainBuilder): Kodein.Module {
        kodein.import((generateDataModule()))
        return generateAppModule(this)
    }

    override fun onCreate() {
        super.onCreate()
        //Stetho.initializeWithDefaults(this)
    }
}
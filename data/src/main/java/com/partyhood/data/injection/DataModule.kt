package com.partyhood.data.injection

import com.carmabs.ema.core.concurrency.AsyncManager
import com.carmabs.ema.core.concurrency.DefaultAsyncManager
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.singleton


/**
 *
 *
 * @author <a href="mailto:jorgevguerra@hotmail.com">Jorge Valiño Guerra</a>
 */

fun generateDataModule() = Kodein.Module(name = "DataModule") {

//    bind<PartyHoodRepository>() with singleton { CacheApiPartyHoodRepository(
//        ApiPartyHoodRepository(
//            instance(),instance(),
//            instance(),instance(),
//            instance(),instance(),
//            instance(), instance(),
//            instance()) ) }

//    bind<VersionManager>() with singleton { AppVersionManager() }
//
    bind<AsyncManager>() with singleton { DefaultAsyncManager() }
//
//    bind<LocationManager>() with singleton { ContextLocationManager(instance()) }
//
//    bind<ConcurrencyManager>() with singleton { DefaultConcurrencyManager() }
//
//    bind<PreferencesManager>() with singleton { ContextPreferencesManager(instance()) }


}
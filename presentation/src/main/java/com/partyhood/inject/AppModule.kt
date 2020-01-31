package com.partyhood.inject

import android.app.Application
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton
import java.util.logging.Logger


/**
 * Injection for app
 *
 *
 * @author <a href="mailto:jorgevguerra@hotmail.com">Jorge Valiño Guerra</a>
 */

fun generateAppModule(app: Application) = Kodein.Module(name = "AppModule") {

//    bind<Logger>() with singleton { TimberLogger() }

    bind<Application>() with singleton { app }




    //USE CASES//

//    bind<RequestLocationAndGetFullAddressUseCase>() with provider { RequestLocationAndGetFullAddressUseCase(instance(), instance()) }


}

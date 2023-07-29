package di.modules

import domain.usescase.LoadHeroesUseCase
import org.koin.dsl.module

/**
 * - MANEJARÁ LOS USE'S CASES A SER INYECTADOS
 * */
val appModule = module {
    single { LoadHeroesUseCase() }
}
package domain.usescase

import domain.model.HeroeModel
import domain.model.entity

class LoadHeroesUseCase {

    fun loadHeros() : List <HeroeModel> {
        return List(25) {
           entity()
        }
    }
}
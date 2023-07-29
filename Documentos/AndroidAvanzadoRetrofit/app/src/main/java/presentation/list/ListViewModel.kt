package presentation.list

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import domain.model.HeroeModel
import domain.usescase.LoadHeroesUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * - RECIBE EL USECASE POR CONSTRUCTOR
 */
class ListViewModel(private val loadHeros : LoadHeroesUseCase) : ViewModel() {

    private val _data = MutableLiveData <List <HeroeModel>>()
    val data : MutableLiveData <List <HeroeModel>> get() = _data
    private val heroes : LoadHeroesUseCase = LoadHeroesUseCase()

    // INVOCACIÓN DE LAS CORROUTINES
    fun loadHeroes() {
        viewModelScope.launch {
            val result = withContext(Dispatchers.IO){
                loadHeros.loadHeros()
            }
            _data.value = result
        }
    }
}
package di.modules

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module
import presentation.list.ListViewModel

/**
 * - MANEJA LAS DEPENDENCIAS DE LA VISTA (VIEWMODELS)
 */
val presentationModule = module {
    viewModel { ListViewModel(get())}
    viewModelOf(::ListViewModel)
}
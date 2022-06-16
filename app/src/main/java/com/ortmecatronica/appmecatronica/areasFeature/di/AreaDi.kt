package com.ortmecatronica.appmecatronica.areasFeature.di

import com.ortmecatronica.appmecatronica.areasFeature.data.AreasRepositoryImpl
import com.ortmecatronica.appmecatronica.areasFeature.data.interfaces.AreaDataSource
import com.ortmecatronica.appmecatronica.areasFeature.framework.AreaDataSoruceImpl
import com.ortmecatronica.appmecatronica.areasFeature.ui.viewmodel.AreasViewModel
import com.ortmecatronica.appmecatronica.areasFeature.usecase.GetAreasUseCase
import com.ortmecatronica.appmecatronica.areasFeature.usecase.interfaces.AreasRepository
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.scope.get
import org.koin.dsl.module


val areaModule = module {
        // single instance of HelloRepository
        single<AreaDataSource> { AreaDataSoruceImpl() }
        single<AreasRepository> { AreasRepositoryImpl(get()) }
        single { GetAreasUseCase(get()) }
        viewModel { AreasViewModel(get())}
}





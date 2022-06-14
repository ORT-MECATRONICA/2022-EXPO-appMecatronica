package com.ortmecatronica.appmecatronica.areasFeature.usecase

import com.ortmecatronica.appmecatronica.areasFeature.domain.Area
import com.ortmecatronica.appmecatronica.areasFeature.usecase.interfaces.AreasRepository
import com.ortmecatronica.appmecatronica.core.utils.MyResult

class GetAreasUseCase constructor( private val repository: AreasRepository) {
    suspend fun getAreas() : MyResult<MutableList<Area>>{
        return repository.getAreas()
    }
}
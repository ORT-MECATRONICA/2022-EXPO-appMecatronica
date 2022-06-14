package com.ortmecatronica.appmecatronica.areasFeature.data

import com.ortmecatronica.appmecatronica.areasFeature.data.interfaces.AreaDataSource
import com.ortmecatronica.appmecatronica.areasFeature.domain.Area
import com.ortmecatronica.appmecatronica.areasFeature.usecase.interfaces.AreasRepository
import com.ortmecatronica.appmecatronica.core.utils.MyResult

class AreasRepositoryImpl constructor(private val dataSource: AreaDataSource) : AreasRepository {


    override suspend fun getAreas(): MyResult<MutableList<Area>> {
        return dataSource.getAreas()
    }

    override suspend fun createArea(area: Area): MyResult<Unit> {
        TODO("Not yet implemented")
    }
}
package com.ortmecatronica.appmecatronica.areasFeature.data.interfaces

import com.ortmecatronica.appmecatronica.areasFeature.domain.Area
import com.ortmecatronica.appmecatronica.core.utils.MyResult

interface AreaDataSource {

    suspend fun getAreas () : MyResult<MutableList<Area>>
    suspend fun createArea (area: Area) : MyResult<Unit>
}
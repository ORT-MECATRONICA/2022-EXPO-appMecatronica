package com.ortmecatronica.appmecatronica.areasFeature.usecase.interfaces

import com.ortmecatronica.appmecatronica.areasFeature.domain.Area
import com.ortmecatronica.appmecatronica.core.utils.MyResult

interface AreasRepository  {
    suspend fun getAreas () : MyResult<MutableList<Area>>
    suspend fun createArea (area: Area) : MyResult<Unit>
}
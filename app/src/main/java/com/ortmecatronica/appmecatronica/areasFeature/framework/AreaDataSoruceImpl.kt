package com.ortmecatronica.appmecatronica.areasFeature.framework

import com.ortmecatronica.appmecatronica.areasFeature.data.interfaces.AreaDataSource
import com.ortmecatronica.appmecatronica.areasFeature.domain.Area
import com.ortmecatronica.appmecatronica.core.utils.MyResult

class AreaDataSoruceImpl : AreaDataSource{

    override suspend fun getAreas(): MyResult<MutableList<Area>> {
        var areasList  = mutableListOf<Area>()

        areasList.add(Area("fgtyhn","robotica","descripcion de robotica", mutableListOf()))
        areasList.add(Area("fgtyhn","iot","descripcion de iot", mutableListOf()))
        areasList.add(Area("fgtyhn","desarrollo de software","descripcion de software", mutableListOf()))
        areasList.add(Area("fgtyhn","diseño","descripcion de diseño", mutableListOf()))
        areasList.add(Area("fgtyhn","electronica","descripcion de electronica", mutableListOf()))

        return MyResult.Success(areasList)
    }

    override suspend fun createArea(area: Area): MyResult<Unit> {
        TODO("Not yet implemented")
    }


}
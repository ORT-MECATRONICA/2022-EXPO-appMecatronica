package com.ortmecatronica.appmecatronica.areasFeature.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ortmecatronica.appmecatronica.areasFeature.usecase.GetAreasUseCase
import com.ortmecatronica.appmecatronica.core.utils.MyResult
import kotlinx.coroutines.launch
import kotlin.math.log

class AreasViewModel (
    private val getAreasUseCase: GetAreasUseCase,
        ) : ViewModel() {
            fun getAreas(){
                viewModelScope.launch {
                    val result = getAreasUseCase.getAreas()
                    when (result){
                        is MyResult.Success ->{
                            Log.d("TEST",result.data.toString())
                        }
                        is MyResult.Failure -> {
                            Log.d("TEST","No data")
                        }
                    }
                }
            }
}
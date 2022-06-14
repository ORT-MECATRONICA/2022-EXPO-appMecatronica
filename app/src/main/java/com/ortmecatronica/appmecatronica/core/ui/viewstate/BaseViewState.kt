package com.ortmecatronica.appmecatronica.core.ui.viewstate

class BaseViewState {

    sealed class BaseViewState {
        object Idle: BaseViewState()
        object Loading: BaseViewState()
        data class Failure(val exception: Exception): BaseViewState()
        data class Alert(val title: Int, val message: Int, val callback: (() -> Unit)? = null): BaseViewState()
    }
}
package com.wabadaba.schoolapi.api.misc

interface LoginProvider {
    fun onSuccess()
    fun onError(error: Throwable)
}